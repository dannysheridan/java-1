/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.organizationtypes.types;

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
@JsonDeserialize(builder = IndividualOnboardingOptions.Builder.class)
public final class IndividualOnboardingOptions {
    private final OnboardingOption email;

    private final OnboardingOption name;

    private final OnboardingOption dateOfBirth;

    private final OnboardingOption ssnLast4;

    private final OnboardingOption address;

    private final OnboardingOption phone;

    private final Map<String, Object> additionalProperties;

    private IndividualOnboardingOptions(
            OnboardingOption email,
            OnboardingOption name,
            OnboardingOption dateOfBirth,
            OnboardingOption ssnLast4,
            OnboardingOption address,
            OnboardingOption phone,
            Map<String, Object> additionalProperties) {
        this.email = email;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.ssnLast4 = ssnLast4;
        this.address = address;
        this.phone = phone;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("email")
    public OnboardingOption getEmail() {
        return email;
    }

    @JsonProperty("name")
    public OnboardingOption getName() {
        return name;
    }

    @JsonProperty("dateOfBirth")
    public OnboardingOption getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("ssnLast4")
    public OnboardingOption getSsnLast4() {
        return ssnLast4;
    }

    @JsonProperty("address")
    public OnboardingOption getAddress() {
        return address;
    }

    @JsonProperty("phone")
    public OnboardingOption getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof IndividualOnboardingOptions && equalTo((IndividualOnboardingOptions) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(IndividualOnboardingOptions other) {
        return email.equals(other.email)
                && name.equals(other.name)
                && dateOfBirth.equals(other.dateOfBirth)
                && ssnLast4.equals(other.ssnLast4)
                && address.equals(other.address)
                && phone.equals(other.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.email, this.name, this.dateOfBirth, this.ssnLast4, this.address, this.phone);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EmailStage builder() {
        return new Builder();
    }

    public interface EmailStage {
        NameStage email(OnboardingOption email);

        Builder from(IndividualOnboardingOptions other);
    }

    public interface NameStage {
        DateOfBirthStage name(OnboardingOption name);
    }

    public interface DateOfBirthStage {
        SsnLast4Stage dateOfBirth(OnboardingOption dateOfBirth);
    }

    public interface SsnLast4Stage {
        AddressStage ssnLast4(OnboardingOption ssnLast4);
    }

    public interface AddressStage {
        PhoneStage address(OnboardingOption address);
    }

    public interface PhoneStage {
        _FinalStage phone(OnboardingOption phone);
    }

    public interface _FinalStage {
        IndividualOnboardingOptions build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements EmailStage, NameStage, DateOfBirthStage, SsnLast4Stage, AddressStage, PhoneStage, _FinalStage {
        private OnboardingOption email;

        private OnboardingOption name;

        private OnboardingOption dateOfBirth;

        private OnboardingOption ssnLast4;

        private OnboardingOption address;

        private OnboardingOption phone;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(IndividualOnboardingOptions other) {
            email(other.getEmail());
            name(other.getName());
            dateOfBirth(other.getDateOfBirth());
            ssnLast4(other.getSsnLast4());
            address(other.getAddress());
            phone(other.getPhone());
            return this;
        }

        @Override
        @JsonSetter("email")
        public NameStage email(OnboardingOption email) {
            this.email = email;
            return this;
        }

        @Override
        @JsonSetter("name")
        public DateOfBirthStage name(OnboardingOption name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("dateOfBirth")
        public SsnLast4Stage dateOfBirth(OnboardingOption dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        @Override
        @JsonSetter("ssnLast4")
        public AddressStage ssnLast4(OnboardingOption ssnLast4) {
            this.ssnLast4 = ssnLast4;
            return this;
        }

        @Override
        @JsonSetter("address")
        public PhoneStage address(OnboardingOption address) {
            this.address = address;
            return this;
        }

        @Override
        @JsonSetter("phone")
        public _FinalStage phone(OnboardingOption phone) {
            this.phone = phone;
            return this;
        }

        @Override
        public IndividualOnboardingOptions build() {
            return new IndividualOnboardingOptions(
                    email, name, dateOfBirth, ssnLast4, address, phone, additionalProperties);
        }
    }
}
