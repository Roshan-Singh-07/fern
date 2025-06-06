/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.examples.resources.types.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.seed.examples.core.ObjectMappers;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = CastMember.Deserializer.class)
public final class CastMember {
    private final Object value;

    private final int type;

    private CastMember(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    @SuppressWarnings("unchecked")
    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((Actor) this.value);
        } else if (this.type == 1) {
            return visitor.visit((Actress) this.value);
        } else if (this.type == 2) {
            return visitor.visit((StuntDouble) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CastMember && equalTo((CastMember) other);
    }

    private boolean equalTo(CastMember other) {
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

    public static CastMember of(Actor value) {
        return new CastMember(value, 0);
    }

    public static CastMember of(Actress value) {
        return new CastMember(value, 1);
    }

    public static CastMember of(StuntDouble value) {
        return new CastMember(value, 2);
    }

    public interface Visitor<T> {
        T visit(Actor value);

        T visit(Actress value);

        T visit(StuntDouble value);
    }

    static final class Deserializer extends StdDeserializer<CastMember> {
        Deserializer() {
            super(CastMember.class);
        }

        @java.lang.Override
        public CastMember deserialize(JsonParser p, DeserializationContext context) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, Actor.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, Actress.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, StuntDouble.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
