/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.banklookup.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = BankAddress.Builder.class)
public final class BankAddress {
    private final String address;

    private final String city;

    private final String state;

    private final String postalCode;

    private final String postalCodeExtension;

    private final Map<String, Object> additionalProperties;

    private BankAddress(
            String address,
            String city,
            String state,
            String postalCode,
            String postalCodeExtension,
            Map<String, Object> additionalProperties) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.postalCodeExtension = postalCodeExtension;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCodeExtension")
    public String getPostalCodeExtension() {
        return postalCodeExtension;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BankAddress && equalTo((BankAddress) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BankAddress other) {
        return address.equals(other.address)
                && city.equals(other.city)
                && state.equals(other.state)
                && postalCode.equals(other.postalCode)
                && postalCodeExtension.equals(other.postalCodeExtension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.address, this.city, this.state, this.postalCode, this.postalCodeExtension);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AddressStage builder() {
        return new Builder();
    }

    public interface AddressStage {
        CityStage address(String address);

        Builder from(BankAddress other);
    }

    public interface CityStage {
        StateStage city(String city);
    }

    public interface StateStage {
        PostalCodeStage state(String state);
    }

    public interface PostalCodeStage {
        PostalCodeExtensionStage postalCode(String postalCode);
    }

    public interface PostalCodeExtensionStage {
        _FinalStage postalCodeExtension(String postalCodeExtension);
    }

    public interface _FinalStage {
        BankAddress build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements AddressStage, CityStage, StateStage, PostalCodeStage, PostalCodeExtensionStage, _FinalStage {
        private String address;

        private String city;

        private String state;

        private String postalCode;

        private String postalCodeExtension;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(BankAddress other) {
            address(other.getAddress());
            city(other.getCity());
            state(other.getState());
            postalCode(other.getPostalCode());
            postalCodeExtension(other.getPostalCodeExtension());
            return this;
        }

        @Override
        @JsonSetter("address")
        public CityStage address(String address) {
            this.address = address;
            return this;
        }

        @Override
        @JsonSetter("city")
        public StateStage city(String city) {
            this.city = city;
            return this;
        }

        @Override
        @JsonSetter("state")
        public PostalCodeStage state(String state) {
            this.state = state;
            return this;
        }

        @Override
        @JsonSetter("postalCode")
        public PostalCodeExtensionStage postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        @Override
        @JsonSetter("postalCodeExtension")
        public _FinalStage postalCodeExtension(String postalCodeExtension) {
            this.postalCodeExtension = postalCodeExtension;
            return this;
        }

        @Override
        public BankAddress build() {
            return new BankAddress(address, city, state, postalCode, postalCodeExtension, additionalProperties);
        }
    }
}
