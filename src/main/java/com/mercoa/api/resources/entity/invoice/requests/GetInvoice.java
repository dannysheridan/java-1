/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.invoice.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GetInvoice.Builder.class)
public final class GetInvoice {
    private final Optional<Boolean> includeFees;

    private GetInvoice(Optional<Boolean> includeFees) {
        this.includeFees = includeFees;
    }

    /**
     * @return If true, will include fees as part of the response.
     */
    @JsonProperty("includeFees")
    public Optional<Boolean> getIncludeFees() {
        return includeFees;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetInvoice && equalTo((GetInvoice) other);
    }

    private boolean equalTo(GetInvoice other) {
        return includeFees.equals(other.includeFees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.includeFees);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<Boolean> includeFees = Optional.empty();

        private Builder() {}

        public Builder from(GetInvoice other) {
            includeFees(other.getIncludeFees());
            return this;
        }

        @JsonSetter(value = "includeFees", nulls = Nulls.SKIP)
        public Builder includeFees(Optional<Boolean> includeFees) {
            this.includeFees = includeFees;
            return this;
        }

        public Builder includeFees(Boolean includeFees) {
            this.includeFees = Optional.of(includeFees);
            return this;
        }

        public GetInvoice build() {
            return new GetInvoice(includeFees);
        }
    }
}
