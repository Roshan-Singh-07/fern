/**
 * This file was auto-generated by Fern from our API Definition.
 */

package resources.nullable.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import core.ObjectMappers;
import java.io.IOException;
import java.lang.Double;
import java.lang.Float;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    using = WeirdNumber.Deserializer.class
)
public final class WeirdNumber {
  private final Object value;

  private final int type;

  private WeirdNumber(Object value, int type) {
    this.value = value;
    this.type = type;
  }

  @JsonValue
  public Object get() {
    return this.value;
  }

  @SuppressWarnings("unchecked")
  public <T> T visit(Visitor<T> visitor) {
    if(this.type == 0) {
      return visitor.visit((int) this.value);
    } else if(this.type == 1) {
      return visitor.visit((Optional<Float>) this.value);
    } else if(this.type == 2) {
      return visitor.visit((Optional<String>) this.value);
    } else if(this.type == 3) {
      return visitor.visit((double) this.value);
    }
    throw new IllegalStateException("Failed to visit value. This should never happen.");
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WeirdNumber && equalTo((WeirdNumber) other);
  }

  private boolean equalTo(WeirdNumber other) {
    return value.equals(other.value);
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.value);
  }

  @java.lang.Override
  public String toString() {
    return this.value.toString();
  }

  public static WeirdNumber of(int value) {
    return new WeirdNumber(value, 0);
  }

  public static WeirdNumber of(Optional<Float> value) {
    return new WeirdNumber(value, 1);
  }

  public static WeirdNumber of(Optional<String> value) {
    return new WeirdNumber(value, 2);
  }

  public static WeirdNumber of(double value) {
    return new WeirdNumber(value, 3);
  }

  public interface Visitor<T> {
    T visit(int value);

    T visit(Optional<Float> value);

    T visit(Optional<String> value);

    T visit(double value);
  }

  static final class Deserializer extends StdDeserializer<WeirdNumber> {
    Deserializer() {
      super(WeirdNumber.class);
    }

    @java.lang.Override
    public WeirdNumber deserialize(JsonParser p, DeserializationContext context) throws
        IOException {
      Object value = p.readValueAs(Object.class);
      if (value instanceof Integer) {
        return of((Integer) value);
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, new TypeReference<Optional<Float>>() {}));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, new TypeReference<Optional<String>>() {}));
      } catch(IllegalArgumentException e) {
      }
      if (value instanceof Double) {
        return of((Double) value);
      }
      throw new JsonParseException(p, "Failed to deserialize");
    }
  }
}
