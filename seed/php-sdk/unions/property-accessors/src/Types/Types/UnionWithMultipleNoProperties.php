<?php

namespace Seed\Types\Types;

use Seed\Core\Json\JsonSerializableType;
use Exception;
use Seed\Core\Json\JsonDecoder;

class UnionWithMultipleNoProperties extends JsonSerializableType
{
    /**
     * @var (
     *    'foo'
     *   |'empty1'
     *   |'empty2'
     *   |'_unknown'
     * ) $type
     */
    private readonly string $type;

    /**
     * @var (
     *    Foo
     *   |null
     *   |mixed
     * ) $value
     */
    private readonly mixed $value;

    /**
     * @param array{
     *   type: (
     *    'foo'
     *   |'empty1'
     *   |'empty2'
     *   |'_unknown'
     * ),
     *   value: (
     *    Foo
     *   |null
     *   |mixed
     * ),
     * } $values
     */
    private function __construct(
        array $values,
    ) {
        $this->type = $values['type'];
        $this->value = $values['value'];
    }

    /**
     * @return (
     *    'foo'
     *   |'empty1'
     *   |'empty2'
     *   |'_unknown'
     * )
     */
    public function getType(): string
    {
        return $this->type;
    }

    /**
     * @return (
     *    Foo
     *   |null
     *   |mixed
     * )
     */
    public function getValue(): mixed
    {
        return $this->value;
    }

    /**
     * @param Foo $foo
     * @return UnionWithMultipleNoProperties
     */
    public static function foo(Foo $foo): UnionWithMultipleNoProperties
    {
        return new UnionWithMultipleNoProperties([
            'type' => 'foo',
            'value' => $foo,
        ]);
    }

    /**
     * @return UnionWithMultipleNoProperties
     */
    public static function empty1(): UnionWithMultipleNoProperties
    {
        return new UnionWithMultipleNoProperties([
            'type' => 'empty1',
            'value' => null,
        ]);
    }

    /**
     * @return UnionWithMultipleNoProperties
     */
    public static function empty2(): UnionWithMultipleNoProperties
    {
        return new UnionWithMultipleNoProperties([
            'type' => 'empty2',
            'value' => null,
        ]);
    }

    /**
     * @return bool
     */
    public function isFoo(): bool
    {
        return $this->value instanceof Foo && $this->type === 'foo';
    }

    /**
     * @return Foo
     */
    public function asFoo(): Foo
    {
        if (!($this->value instanceof Foo && $this->type === 'foo')) {
            throw new Exception(
                "Expected foo; got " . $this->type . " with value of type " . get_debug_type($this->value),
            );
        }

        return $this->value;
    }

    /**
     * @return bool
     */
    public function isEmpty1(): bool
    {
        return is_null($this->value) && $this->type === 'empty1';
    }

    /**
     * @return bool
     */
    public function isEmpty2(): bool
    {
        return is_null($this->value) && $this->type === 'empty2';
    }

    /**
     * @return string
     */
    public function __toString(): string
    {
        return $this->toJson();
    }

    /**
     * @return array<mixed>
     */
    public function jsonSerialize(): array
    {
        $result = [];
        $result['type'] = $this->type;

        $base = parent::jsonSerialize();
        $result = array_merge($base, $result);

        switch ($this->type) {
            case 'foo':
                $value = $this->asFoo()->jsonSerialize();
                $result = array_merge($value, $result);
                break;
            case 'empty1':
                $result['empty1'] = [];
                break;
            case 'empty2':
                $result['empty2'] = [];
                break;
            case '_unknown':
            default:
                if (is_null($this->value)) {
                    break;
                }
                if ($this->value instanceof JsonSerializableType) {
                    $value = $this->value->jsonSerialize();
                    $result = array_merge($value, $result);
                } elseif (is_array($this->value)) {
                    $result = array_merge($this->value, $result);
                }
        }

        return $result;
    }

    /**
     * @param string $json
     */
    public static function fromJson(string $json): static
    {
        $decodedJson = JsonDecoder::decode($json);
        if (!is_array($decodedJson)) {
            throw new Exception("Unexpected non-array decoded type: " . gettype($decodedJson));
        }
        return self::jsonDeserialize($decodedJson);
    }

    /**
     * @param array<string, mixed> $data
     */
    public static function jsonDeserialize(array $data): static
    {
        $args = [];
        if (!array_key_exists('type', $data)) {
            throw new Exception(
                "JSON data is missing property 'type'",
            );
        }
        $type = $data['type'];
        if (!(is_string($type))) {
            throw new Exception(
                "Expected property 'type' in JSON data to be string, instead received " . get_debug_type($data['type']),
            );
        }

        $args['type'] = $type;
        switch ($type) {
            case 'foo':
                $args['value'] = Foo::jsonDeserialize($data);
                break;
            case 'empty1':
                $args['value'] = null;
                break;
            case 'empty2':
                $args['value'] = null;
                break;
            case '_unknown':
            default:
                $args['type'] = '_unknown';
                $args['value'] = $data;
        }

        // @phpstan-ignore-next-line
        return new static($args);
    }
}
