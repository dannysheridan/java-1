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
@JsonDeserialize(builder = BankLookupResponse.Builder.class)
public final class BankLookupResponse {
    private final String bankName;

    private final BankAddress bankAddress;

    private final Map<String, Object> additionalProperties;

    private BankLookupResponse(String bankName, BankAddress bankAddress, Map<String, Object> additionalProperties) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("bankName")
    public String getBankName() {
        return bankName;
    }

    @JsonProperty("bankAddress")
    public BankAddress getBankAddress() {
        return bankAddress;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BankLookupResponse && equalTo((BankLookupResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BankLookupResponse other) {
        return bankName.equals(other.bankName) && bankAddress.equals(other.bankAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.bankName, this.bankAddress);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static BankNameStage builder() {
        return new Builder();
    }

    public interface BankNameStage {
        BankAddressStage bankName(String bankName);

        Builder from(BankLookupResponse other);
    }

    public interface BankAddressStage {
        _FinalStage bankAddress(BankAddress bankAddress);
    }

    public interface _FinalStage {
        BankLookupResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements BankNameStage, BankAddressStage, _FinalStage {
        private String bankName;

        private BankAddress bankAddress;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(BankLookupResponse other) {
            bankName(other.getBankName());
            bankAddress(other.getBankAddress());
            return this;
        }

        @Override
        @JsonSetter("bankName")
        public BankAddressStage bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        @Override
        @JsonSetter("bankAddress")
        public _FinalStage bankAddress(BankAddress bankAddress) {
            this.bankAddress = bankAddress;
            return this;
        }

        @Override
        public BankLookupResponse build() {
            return new BankLookupResponse(bankName, bankAddress, additionalProperties);
        }
    }
}
