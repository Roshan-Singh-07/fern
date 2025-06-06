/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.pagination.model.complex;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seed.pagination.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = SingleFilterSearchRequest.Builder.class)
public final class SingleFilterSearchRequest {
    private final Optional<String> field;

    private final Optional<SingleFilterSearchRequestOperator> operator;

    private final Optional<String> value;

    private SingleFilterSearchRequest(
            Optional<String> field, Optional<SingleFilterSearchRequestOperator> operator, Optional<String> value) {
        this.field = field;
        this.operator = operator;
        this.value = value;
    }

    @JsonProperty("field")
    public Optional<String> getField() {
        return field;
    }

    @JsonProperty("operator")
    public Optional<SingleFilterSearchRequestOperator> getOperator() {
        return operator;
    }

    @JsonProperty("value")
    public Optional<String> getValue() {
        return value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SingleFilterSearchRequest && equalTo((SingleFilterSearchRequest) other);
    }

    private boolean equalTo(SingleFilterSearchRequest other) {
        return field.equals(other.field) && operator.equals(other.operator) && value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.field, this.operator, this.value);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> field = Optional.empty();

        private Optional<SingleFilterSearchRequestOperator> operator = Optional.empty();

        private Optional<String> value = Optional.empty();

        private Builder() {}

        public Builder from(SingleFilterSearchRequest other) {
            field(other.getField());
            operator(other.getOperator());
            value(other.getValue());
            return this;
        }

        @JsonSetter(value = "field", nulls = Nulls.SKIP)
        public Builder field(Optional<String> field) {
            this.field = field;
            return this;
        }

        public Builder field(String field) {
            this.field = Optional.ofNullable(field);
            return this;
        }

        @JsonSetter(value = "operator", nulls = Nulls.SKIP)
        public Builder operator(Optional<SingleFilterSearchRequestOperator> operator) {
            this.operator = operator;
            return this;
        }

        public Builder operator(SingleFilterSearchRequestOperator operator) {
            this.operator = Optional.ofNullable(operator);
            return this;
        }

        @JsonSetter(value = "value", nulls = Nulls.SKIP)
        public Builder value(Optional<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(String value) {
            this.value = Optional.ofNullable(value);
            return this;
        }

        public SingleFilterSearchRequest build() {
            return new SingleFilterSearchRequest(field, operator, value);
        }
    }
}
