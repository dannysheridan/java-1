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
@JsonDeserialize(builder = Address.Builder.class)
public final class Address {
    private final String addressLine1;

    private final Optional<String> addressLine2;

    private final String city;

    private final String stateOrProvince;

    private final String postalCode;

    private final Optional<String> country;

    private Address(
            String addressLine1,
            Optional<String> addressLine2,
            String city,
            String stateOrProvince,
            String postalCode,
            Optional<String> country) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.stateOrProvince = stateOrProvince;
        this.postalCode = postalCode;
        this.country = country;
    }

    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    @JsonProperty("addressLine2")
    public Optional<String> getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("stateOrProvince")
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("country")
    public Optional<String> getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Address && equalTo((Address) other);
    }

    private boolean equalTo(Address other) {
        return addressLine1.equals(other.addressLine1)
                && addressLine2.equals(other.addressLine2)
                && city.equals(other.city)
                && stateOrProvince.equals(other.stateOrProvince)
                && postalCode.equals(other.postalCode)
                && country.equals(other.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.addressLine1, this.addressLine2, this.city, this.stateOrProvince, this.postalCode, this.country);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AddressLine1Stage builder() {
        return new Builder();
    }

    public interface AddressLine1Stage {
        CityStage addressLine1(String addressLine1);

        Builder from(Address other);
    }

    public interface CityStage {
        StateOrProvinceStage city(String city);
    }

    public interface StateOrProvinceStage {
        PostalCodeStage stateOrProvince(String stateOrProvince);
    }

    public interface PostalCodeStage {
        _FinalStage postalCode(String postalCode);
    }

    public interface _FinalStage {
        Address build();

        _FinalStage addressLine2(Optional<String> addressLine2);

        _FinalStage addressLine2(String addressLine2);

        _FinalStage country(Optional<String> country);

        _FinalStage country(String country);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements AddressLine1Stage, CityStage, StateOrProvinceStage, PostalCodeStage, _FinalStage {
        private String addressLine1;

        private String city;

        private String stateOrProvince;

        private String postalCode;

        private Optional<String> country = Optional.empty();

        private Optional<String> addressLine2 = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(Address other) {
            addressLine1(other.getAddressLine1());
            addressLine2(other.getAddressLine2());
            city(other.getCity());
            stateOrProvince(other.getStateOrProvince());
            postalCode(other.getPostalCode());
            country(other.getCountry());
            return this;
        }

        @Override
        @JsonSetter("addressLine1")
        public CityStage addressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        @Override
        @JsonSetter("city")
        public StateOrProvinceStage city(String city) {
            this.city = city;
            return this;
        }

        @Override
        @JsonSetter("stateOrProvince")
        public PostalCodeStage stateOrProvince(String stateOrProvince) {
            this.stateOrProvince = stateOrProvince;
            return this;
        }

        @Override
        @JsonSetter("postalCode")
        public _FinalStage postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        @Override
        public _FinalStage country(String country) {
            this.country = Optional.of(country);
            return this;
        }

        @Override
        @JsonSetter(value = "country", nulls = Nulls.SKIP)
        public _FinalStage country(Optional<String> country) {
            this.country = country;
            return this;
        }

        @Override
        public _FinalStage addressLine2(String addressLine2) {
            this.addressLine2 = Optional.of(addressLine2);
            return this;
        }

        @Override
        @JsonSetter(value = "addressLine2", nulls = Nulls.SKIP)
        public _FinalStage addressLine2(Optional<String> addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        @Override
        public Address build() {
            return new Address(addressLine1, addressLine2, city, stateOrProvince, postalCode, country);
        }
    }
}
