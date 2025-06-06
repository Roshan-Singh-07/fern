/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.fileUpload.resources.service.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seed.fileUpload.core.ObjectMappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = JustFileWithQueryParamsRequest.Builder.class)
public final class JustFileWithQueryParamsRequest {
    private final List<String> listOfStrings;

    private final Optional<List<String>> optionalListOfStrings;

    private final Optional<String> maybeString;

    private final int integer;

    private final Optional<Integer> maybeInteger;

    private final Map<String, Object> additionalProperties;

    private JustFileWithQueryParamsRequest(
            List<String> listOfStrings,
            Optional<List<String>> optionalListOfStrings,
            Optional<String> maybeString,
            int integer,
            Optional<Integer> maybeInteger,
            Map<String, Object> additionalProperties) {
        this.listOfStrings = listOfStrings;
        this.optionalListOfStrings = optionalListOfStrings;
        this.maybeString = maybeString;
        this.integer = integer;
        this.maybeInteger = maybeInteger;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("listOfStrings")
    public List<String> getListOfStrings() {
        return listOfStrings;
    }

    @JsonProperty("optionalListOfStrings")
    public Optional<List<String>> getOptionalListOfStrings() {
        return optionalListOfStrings;
    }

    @JsonProperty("maybeString")
    public Optional<String> getMaybeString() {
        return maybeString;
    }

    @JsonProperty("integer")
    public int getInteger() {
        return integer;
    }

    @JsonProperty("maybeInteger")
    public Optional<Integer> getMaybeInteger() {
        return maybeInteger;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof JustFileWithQueryParamsRequest && equalTo((JustFileWithQueryParamsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(JustFileWithQueryParamsRequest other) {
        return listOfStrings.equals(other.listOfStrings)
                && optionalListOfStrings.equals(other.optionalListOfStrings)
                && maybeString.equals(other.maybeString)
                && integer == other.integer
                && maybeInteger.equals(other.maybeInteger);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.listOfStrings, this.optionalListOfStrings, this.maybeString, this.integer, this.maybeInteger);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IntegerStage builder() {
        return new Builder();
    }

    public interface IntegerStage {
        _FinalStage integer(int integer);

        Builder from(JustFileWithQueryParamsRequest other);
    }

    public interface _FinalStage {
        JustFileWithQueryParamsRequest build();

        _FinalStage listOfStrings(List<String> listOfStrings);

        _FinalStage addListOfStrings(String listOfStrings);

        _FinalStage addAllListOfStrings(List<String> listOfStrings);

        _FinalStage listOfStrings(String listOfStrings);

        _FinalStage optionalListOfStrings(Optional<List<String>> optionalListOfStrings);

        _FinalStage optionalListOfStrings(List<String> optionalListOfStrings);

        _FinalStage optionalListOfStrings(String optionalListOfStrings);

        _FinalStage maybeString(Optional<String> maybeString);

        _FinalStage maybeString(String maybeString);

        _FinalStage maybeInteger(Optional<Integer> maybeInteger);

        _FinalStage maybeInteger(Integer maybeInteger);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IntegerStage, _FinalStage {
        private int integer;

        private Optional<Integer> maybeInteger = Optional.empty();

        private Optional<String> maybeString = Optional.empty();

        private Optional<List<String>> optionalListOfStrings = Optional.empty();

        private List<String> listOfStrings = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(JustFileWithQueryParamsRequest other) {
            listOfStrings(other.getListOfStrings());
            optionalListOfStrings(other.getOptionalListOfStrings());
            maybeString(other.getMaybeString());
            integer(other.getInteger());
            maybeInteger(other.getMaybeInteger());
            return this;
        }

        @java.lang.Override
        @JsonSetter("integer")
        public _FinalStage integer(int integer) {
            this.integer = integer;
            return this;
        }

        @java.lang.Override
        public _FinalStage maybeInteger(Integer maybeInteger) {
            this.maybeInteger = Optional.ofNullable(maybeInteger);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "maybeInteger", nulls = Nulls.SKIP)
        public _FinalStage maybeInteger(Optional<Integer> maybeInteger) {
            this.maybeInteger = maybeInteger;
            return this;
        }

        @java.lang.Override
        public _FinalStage maybeString(String maybeString) {
            this.maybeString = Optional.ofNullable(maybeString);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "maybeString", nulls = Nulls.SKIP)
        public _FinalStage maybeString(Optional<String> maybeString) {
            this.maybeString = maybeString;
            return this;
        }

        @java.lang.Override
        public _FinalStage optionalListOfStrings(String optionalListOfStrings) {
            this.optionalListOfStrings = Optional.of(Collections.singletonList(optionalListOfStrings));
            return this;
        }

        @java.lang.Override
        public _FinalStage optionalListOfStrings(List<String> optionalListOfStrings) {
            this.optionalListOfStrings = Optional.ofNullable(optionalListOfStrings);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "optionalListOfStrings", nulls = Nulls.SKIP)
        public _FinalStage optionalListOfStrings(Optional<List<String>> optionalListOfStrings) {
            this.optionalListOfStrings = optionalListOfStrings;
            return this;
        }

        @java.lang.Override
        public _FinalStage listOfStrings(String listOfStrings) {
            this.listOfStrings = Collections.singletonList(listOfStrings);
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllListOfStrings(List<String> listOfStrings) {
            this.listOfStrings.addAll(listOfStrings);
            return this;
        }

        @java.lang.Override
        public _FinalStage addListOfStrings(String listOfStrings) {
            this.listOfStrings.add(listOfStrings);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "listOfStrings", nulls = Nulls.SKIP)
        public _FinalStage listOfStrings(List<String> listOfStrings) {
            this.listOfStrings.clear();
            this.listOfStrings.addAll(listOfStrings);
            return this;
        }

        @java.lang.Override
        public JustFileWithQueryParamsRequest build() {
            return new JustFileWithQueryParamsRequest(
                    listOfStrings, optionalListOfStrings, maybeString, integer, maybeInteger, additionalProperties);
        }
    }
}
