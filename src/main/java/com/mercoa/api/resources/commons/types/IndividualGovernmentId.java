/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.commons.types;

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
@JsonDeserialize(builder = IndividualGovernmentId.Builder.class)
public final class IndividualGovernmentId {
    private final Optional<Ssn> ssn;

    private final Optional<Itin> itin;

    private IndividualGovernmentId(Optional<Ssn> ssn, Optional<Itin> itin) {
        this.ssn = ssn;
        this.itin = itin;
    }

    @JsonProperty("ssn")
    public Optional<Ssn> getSsn() {
        return ssn;
    }

    @JsonProperty("itin")
    public Optional<Itin> getItin() {
        return itin;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof IndividualGovernmentId && equalTo((IndividualGovernmentId) other);
    }

    private boolean equalTo(IndividualGovernmentId other) {
        return ssn.equals(other.ssn) && itin.equals(other.itin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ssn, this.itin);
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
        private Optional<Ssn> ssn = Optional.empty();

        private Optional<Itin> itin = Optional.empty();

        private Builder() {}

        public Builder from(IndividualGovernmentId other) {
            ssn(other.getSsn());
            itin(other.getItin());
            return this;
        }

        @JsonSetter(value = "ssn", nulls = Nulls.SKIP)
        public Builder ssn(Optional<Ssn> ssn) {
            this.ssn = ssn;
            return this;
        }

        public Builder ssn(Ssn ssn) {
            this.ssn = Optional.of(ssn);
            return this;
        }

        @JsonSetter(value = "itin", nulls = Nulls.SKIP)
        public Builder itin(Optional<Itin> itin) {
            this.itin = itin;
            return this;
        }

        public Builder itin(Itin itin) {
            this.itin = Optional.of(itin);
            return this;
        }

        public IndividualGovernmentId build() {
            return new IndividualGovernmentId(ssn, itin);
        }
    }
}
