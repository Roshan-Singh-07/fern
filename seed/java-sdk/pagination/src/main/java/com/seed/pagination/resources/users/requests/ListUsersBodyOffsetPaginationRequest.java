/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.pagination.resources.users.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seed.pagination.core.ObjectMappers;
import com.seed.pagination.resources.users.types.WithPage;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ListUsersBodyOffsetPaginationRequest.Builder.class)
public final class ListUsersBodyOffsetPaginationRequest {
    private final Optional<WithPage> pagination;

    private final Map<String, Object> additionalProperties;

    private ListUsersBodyOffsetPaginationRequest(
            Optional<WithPage> pagination, Map<String, Object> additionalProperties) {
        this.pagination = pagination;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The object that contains the offset used for pagination
     * in order to fetch the next page of results.
     */
    @JsonProperty("pagination")
    public Optional<WithPage> getPagination() {
        return pagination;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ListUsersBodyOffsetPaginationRequest
                && equalTo((ListUsersBodyOffsetPaginationRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ListUsersBodyOffsetPaginationRequest other) {
        return pagination.equals(other.pagination);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.pagination);
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
        private Optional<WithPage> pagination = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ListUsersBodyOffsetPaginationRequest other) {
            pagination(other.getPagination());
            return this;
        }

        /**
         * <p>The object that contains the offset used for pagination
         * in order to fetch the next page of results.</p>
         */
        @JsonSetter(value = "pagination", nulls = Nulls.SKIP)
        public Builder pagination(Optional<WithPage> pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder pagination(WithPage pagination) {
            this.pagination = Optional.ofNullable(pagination);
            return this;
        }

        public ListUsersBodyOffsetPaginationRequest build() {
            return new ListUsersBodyOffsetPaginationRequest(pagination, additionalProperties);
        }
    }
}
