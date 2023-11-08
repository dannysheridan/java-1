/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.paymentmethodtypes.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CheckRequest.Builder.class)
public final class CheckRequest implements IPaymentMethodBaseRequest {
    private final Optional<Boolean> defaultSource;

    private final Optional<Boolean> defaultDestination;

    private final String payToTheOrderOf;

    private final String addressLine1;

    private final Optional<String> addressLine2;

    private final String city;

    private final String stateOrProvince;

    private final String postalCode;

    private final String country;

    private final Map<String, Object> additionalProperties;

    private CheckRequest(
            Optional<Boolean> defaultSource,
            Optional<Boolean> defaultDestination,
            String payToTheOrderOf,
            String addressLine1,
            Optional<String> addressLine2,
            String city,
            String stateOrProvince,
            String postalCode,
            String country,
            Map<String, Object> additionalProperties) {
        this.defaultSource = defaultSource;
        this.defaultDestination = defaultDestination;
        this.payToTheOrderOf = payToTheOrderOf;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.stateOrProvince = stateOrProvince;
        this.postalCode = postalCode;
        this.country = country;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If true, this payment method will be set as the default source. Only one payment method can be set as the default source. If another payment method is already set as the default source, it will be unset.
     */
    @JsonProperty("defaultSource")
    @Override
    public Optional<Boolean> getDefaultSource() {
        return defaultSource;
    }

    /**
     * @return If true, this payment method will be set as the default destination. Only one payment method can be set as the default destination. If another payment method is already set as the default destination, it will be unset.
     */
    @JsonProperty("defaultDestination")
    @Override
    public Optional<Boolean> getDefaultDestination() {
        return defaultDestination;
    }

    @JsonProperty("payToTheOrderOf")
    public String getPayToTheOrderOf() {
        return payToTheOrderOf;
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
    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CheckRequest && equalTo((CheckRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CheckRequest other) {
        return defaultSource.equals(other.defaultSource)
                && defaultDestination.equals(other.defaultDestination)
                && payToTheOrderOf.equals(other.payToTheOrderOf)
                && addressLine1.equals(other.addressLine1)
                && addressLine2.equals(other.addressLine2)
                && city.equals(other.city)
                && stateOrProvince.equals(other.stateOrProvince)
                && postalCode.equals(other.postalCode)
                && country.equals(other.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.defaultSource,
                this.defaultDestination,
                this.payToTheOrderOf,
                this.addressLine1,
                this.addressLine2,
                this.city,
                this.stateOrProvince,
                this.postalCode,
                this.country);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static PayToTheOrderOfStage builder() {
        return new Builder();
    }

    public interface PayToTheOrderOfStage {
        AddressLine1Stage payToTheOrderOf(String payToTheOrderOf);

        Builder from(CheckRequest other);
    }

    public interface AddressLine1Stage {
        CityStage addressLine1(String addressLine1);
    }

    public interface CityStage {
        StateOrProvinceStage city(String city);
    }

    public interface StateOrProvinceStage {
        PostalCodeStage stateOrProvince(String stateOrProvince);
    }

    public interface PostalCodeStage {
        CountryStage postalCode(String postalCode);
    }

    public interface CountryStage {
        _FinalStage country(String country);
    }

    public interface _FinalStage {
        CheckRequest build();

        _FinalStage defaultSource(Optional<Boolean> defaultSource);

        _FinalStage defaultSource(Boolean defaultSource);

        _FinalStage defaultDestination(Optional<Boolean> defaultDestination);

        _FinalStage defaultDestination(Boolean defaultDestination);

        _FinalStage addressLine2(Optional<String> addressLine2);

        _FinalStage addressLine2(String addressLine2);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements PayToTheOrderOfStage,
                    AddressLine1Stage,
                    CityStage,
                    StateOrProvinceStage,
                    PostalCodeStage,
                    CountryStage,
                    _FinalStage {
        private String payToTheOrderOf;

        private String addressLine1;

        private String city;

        private String stateOrProvince;

        private String postalCode;

        private String country;

        private Optional<String> addressLine2 = Optional.empty();

        private Optional<Boolean> defaultDestination = Optional.empty();

        private Optional<Boolean> defaultSource = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(CheckRequest other) {
            defaultSource(other.getDefaultSource());
            defaultDestination(other.getDefaultDestination());
            payToTheOrderOf(other.getPayToTheOrderOf());
            addressLine1(other.getAddressLine1());
            addressLine2(other.getAddressLine2());
            city(other.getCity());
            stateOrProvince(other.getStateOrProvince());
            postalCode(other.getPostalCode());
            country(other.getCountry());
            return this;
        }

        @Override
        @JsonSetter("payToTheOrderOf")
        public AddressLine1Stage payToTheOrderOf(String payToTheOrderOf) {
            this.payToTheOrderOf = payToTheOrderOf;
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
        public CountryStage postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        @Override
        @JsonSetter("country")
        public _FinalStage country(String country) {
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

        /**
         * <p>If true, this payment method will be set as the default destination. Only one payment method can be set as the default destination. If another payment method is already set as the default destination, it will be unset.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage defaultDestination(Boolean defaultDestination) {
            this.defaultDestination = Optional.of(defaultDestination);
            return this;
        }

        @Override
        @JsonSetter(value = "defaultDestination", nulls = Nulls.SKIP)
        public _FinalStage defaultDestination(Optional<Boolean> defaultDestination) {
            this.defaultDestination = defaultDestination;
            return this;
        }

        /**
         * <p>If true, this payment method will be set as the default source. Only one payment method can be set as the default source. If another payment method is already set as the default source, it will be unset.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage defaultSource(Boolean defaultSource) {
            this.defaultSource = Optional.of(defaultSource);
            return this;
        }

        @Override
        @JsonSetter(value = "defaultSource", nulls = Nulls.SKIP)
        public _FinalStage defaultSource(Optional<Boolean> defaultSource) {
            this.defaultSource = defaultSource;
            return this;
        }

        @Override
        public CheckRequest build() {
            return new CheckRequest(
                    defaultSource,
                    defaultDestination,
                    payToTheOrderOf,
                    addressLine1,
                    addressLine2,
                    city,
                    stateOrProvince,
                    postalCode,
                    country,
                    additionalProperties);
        }
    }
}
