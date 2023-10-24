/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.commons.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PhoneNumber.Builder.class)
public final class PhoneNumber {
    private final String countryCode;

    private final String number;

    private PhoneNumber(String countryCode, String number) {
        this.countryCode = countryCode;
        this.number = number;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PhoneNumber && equalTo((PhoneNumber) other);
    }

    private boolean equalTo(PhoneNumber other) {
        return countryCode.equals(other.countryCode) && number.equals(other.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.countryCode, this.number);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CountryCodeStage builder() {
        return new Builder();
    }

    public interface CountryCodeStage {
        NumberStage countryCode(String countryCode);

        Builder from(PhoneNumber other);
    }

    public interface NumberStage {
        _FinalStage number(String number);
    }

    public interface _FinalStage {
        PhoneNumber build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CountryCodeStage, NumberStage, _FinalStage {
        private String countryCode;

        private String number;

        private Builder() {}

        @Override
        public Builder from(PhoneNumber other) {
            countryCode(other.getCountryCode());
            number(other.getNumber());
            return this;
        }

        @Override
        @JsonSetter("countryCode")
        public NumberStage countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        @Override
        @JsonSetter("number")
        public _FinalStage number(String number) {
            this.number = number;
            return this;
        }

        @Override
        public PhoneNumber build() {
            return new PhoneNumber(countryCode, number);
        }
    }
}
