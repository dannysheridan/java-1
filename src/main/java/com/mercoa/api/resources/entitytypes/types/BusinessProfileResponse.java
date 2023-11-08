/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entitytypes.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.commons.types.Address;
import com.mercoa.api.resources.commons.types.PhoneNumber;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = BusinessProfileResponse.Builder.class)
public final class BusinessProfileResponse {
    private final Optional<String> email;

    private final String legalBusinessName;

    private final Optional<BusinessType> businessType;

    private final Optional<PhoneNumber> phone;

    private final Optional<String> doingBusinessAs;

    private final Optional<String> website;

    private final Optional<String> description;

    private final Optional<Address> address;

    private final Optional<Boolean> ownersProvided;

    private final boolean taxIdProvided;

    private final Map<String, Object> additionalProperties;

    private BusinessProfileResponse(
            Optional<String> email,
            String legalBusinessName,
            Optional<BusinessType> businessType,
            Optional<PhoneNumber> phone,
            Optional<String> doingBusinessAs,
            Optional<String> website,
            Optional<String> description,
            Optional<Address> address,
            Optional<Boolean> ownersProvided,
            boolean taxIdProvided,
            Map<String, Object> additionalProperties) {
        this.email = email;
        this.legalBusinessName = legalBusinessName;
        this.businessType = businessType;
        this.phone = phone;
        this.doingBusinessAs = doingBusinessAs;
        this.website = website;
        this.description = description;
        this.address = address;
        this.ownersProvided = ownersProvided;
        this.taxIdProvided = taxIdProvided;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    @JsonProperty("legalBusinessName")
    public String getLegalBusinessName() {
        return legalBusinessName;
    }

    @JsonProperty("businessType")
    public Optional<BusinessType> getBusinessType() {
        return businessType;
    }

    @JsonProperty("phone")
    public Optional<PhoneNumber> getPhone() {
        return phone;
    }

    @JsonProperty("doingBusinessAs")
    public Optional<String> getDoingBusinessAs() {
        return doingBusinessAs;
    }

    @JsonProperty("website")
    public Optional<String> getWebsite() {
        return website;
    }

    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    @JsonProperty("address")
    public Optional<Address> getAddress() {
        return address;
    }

    /**
     * @return True if all representatives have been provided for this business.
     */
    @JsonProperty("ownersProvided")
    public Optional<Boolean> getOwnersProvided() {
        return ownersProvided;
    }

    @JsonProperty("taxIDProvided")
    public boolean getTaxIdProvided() {
        return taxIdProvided;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BusinessProfileResponse && equalTo((BusinessProfileResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BusinessProfileResponse other) {
        return email.equals(other.email)
                && legalBusinessName.equals(other.legalBusinessName)
                && businessType.equals(other.businessType)
                && phone.equals(other.phone)
                && doingBusinessAs.equals(other.doingBusinessAs)
                && website.equals(other.website)
                && description.equals(other.description)
                && address.equals(other.address)
                && ownersProvided.equals(other.ownersProvided)
                && taxIdProvided == other.taxIdProvided;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.email,
                this.legalBusinessName,
                this.businessType,
                this.phone,
                this.doingBusinessAs,
                this.website,
                this.description,
                this.address,
                this.ownersProvided,
                this.taxIdProvided);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LegalBusinessNameStage builder() {
        return new Builder();
    }

    public interface LegalBusinessNameStage {
        TaxIdProvidedStage legalBusinessName(String legalBusinessName);

        Builder from(BusinessProfileResponse other);
    }

    public interface TaxIdProvidedStage {
        _FinalStage taxIdProvided(boolean taxIdProvided);
    }

    public interface _FinalStage {
        BusinessProfileResponse build();

        _FinalStage email(Optional<String> email);

        _FinalStage email(String email);

        _FinalStage businessType(Optional<BusinessType> businessType);

        _FinalStage businessType(BusinessType businessType);

        _FinalStage phone(Optional<PhoneNumber> phone);

        _FinalStage phone(PhoneNumber phone);

        _FinalStage doingBusinessAs(Optional<String> doingBusinessAs);

        _FinalStage doingBusinessAs(String doingBusinessAs);

        _FinalStage website(Optional<String> website);

        _FinalStage website(String website);

        _FinalStage description(Optional<String> description);

        _FinalStage description(String description);

        _FinalStage address(Optional<Address> address);

        _FinalStage address(Address address);

        _FinalStage ownersProvided(Optional<Boolean> ownersProvided);

        _FinalStage ownersProvided(Boolean ownersProvided);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LegalBusinessNameStage, TaxIdProvidedStage, _FinalStage {
        private String legalBusinessName;

        private boolean taxIdProvided;

        private Optional<Boolean> ownersProvided = Optional.empty();

        private Optional<Address> address = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> website = Optional.empty();

        private Optional<String> doingBusinessAs = Optional.empty();

        private Optional<PhoneNumber> phone = Optional.empty();

        private Optional<BusinessType> businessType = Optional.empty();

        private Optional<String> email = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(BusinessProfileResponse other) {
            email(other.getEmail());
            legalBusinessName(other.getLegalBusinessName());
            businessType(other.getBusinessType());
            phone(other.getPhone());
            doingBusinessAs(other.getDoingBusinessAs());
            website(other.getWebsite());
            description(other.getDescription());
            address(other.getAddress());
            ownersProvided(other.getOwnersProvided());
            taxIdProvided(other.getTaxIdProvided());
            return this;
        }

        @Override
        @JsonSetter("legalBusinessName")
        public TaxIdProvidedStage legalBusinessName(String legalBusinessName) {
            this.legalBusinessName = legalBusinessName;
            return this;
        }

        @Override
        @JsonSetter("taxIDProvided")
        public _FinalStage taxIdProvided(boolean taxIdProvided) {
            this.taxIdProvided = taxIdProvided;
            return this;
        }

        /**
         * <p>True if all representatives have been provided for this business.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage ownersProvided(Boolean ownersProvided) {
            this.ownersProvided = Optional.of(ownersProvided);
            return this;
        }

        @Override
        @JsonSetter(value = "ownersProvided", nulls = Nulls.SKIP)
        public _FinalStage ownersProvided(Optional<Boolean> ownersProvided) {
            this.ownersProvided = ownersProvided;
            return this;
        }

        @Override
        public _FinalStage address(Address address) {
            this.address = Optional.of(address);
            return this;
        }

        @Override
        @JsonSetter(value = "address", nulls = Nulls.SKIP)
        public _FinalStage address(Optional<Address> address) {
            this.address = address;
            return this;
        }

        @Override
        public _FinalStage description(String description) {
            this.description = Optional.of(description);
            return this;
        }

        @Override
        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public _FinalStage description(Optional<String> description) {
            this.description = description;
            return this;
        }

        @Override
        public _FinalStage website(String website) {
            this.website = Optional.of(website);
            return this;
        }

        @Override
        @JsonSetter(value = "website", nulls = Nulls.SKIP)
        public _FinalStage website(Optional<String> website) {
            this.website = website;
            return this;
        }

        @Override
        public _FinalStage doingBusinessAs(String doingBusinessAs) {
            this.doingBusinessAs = Optional.of(doingBusinessAs);
            return this;
        }

        @Override
        @JsonSetter(value = "doingBusinessAs", nulls = Nulls.SKIP)
        public _FinalStage doingBusinessAs(Optional<String> doingBusinessAs) {
            this.doingBusinessAs = doingBusinessAs;
            return this;
        }

        @Override
        public _FinalStage phone(PhoneNumber phone) {
            this.phone = Optional.of(phone);
            return this;
        }

        @Override
        @JsonSetter(value = "phone", nulls = Nulls.SKIP)
        public _FinalStage phone(Optional<PhoneNumber> phone) {
            this.phone = phone;
            return this;
        }

        @Override
        public _FinalStage businessType(BusinessType businessType) {
            this.businessType = Optional.of(businessType);
            return this;
        }

        @Override
        @JsonSetter(value = "businessType", nulls = Nulls.SKIP)
        public _FinalStage businessType(Optional<BusinessType> businessType) {
            this.businessType = businessType;
            return this;
        }

        @Override
        public _FinalStage email(String email) {
            this.email = Optional.of(email);
            return this;
        }

        @Override
        @JsonSetter(value = "email", nulls = Nulls.SKIP)
        public _FinalStage email(Optional<String> email) {
            this.email = email;
            return this;
        }

        @Override
        public BusinessProfileResponse build() {
            return new BusinessProfileResponse(
                    email,
                    legalBusinessName,
                    businessType,
                    phone,
                    doingBusinessAs,
                    website,
                    description,
                    address,
                    ownersProvided,
                    taxIdProvided,
                    additionalProperties);
        }
    }
}
