/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.paymentmethod.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.paymentmethodtypes.types.PaymentMethodType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GetAllPaymentMethodsRequest.Builder.class)
public final class GetAllPaymentMethodsRequest {
    private final Optional<PaymentMethodType> type;

    private final Map<String, Object> additionalProperties;

    private GetAllPaymentMethodsRequest(Optional<PaymentMethodType> type, Map<String, Object> additionalProperties) {
        this.type = type;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Type of payment method to filter
     */
    @JsonProperty("type")
    public Optional<PaymentMethodType> getType() {
        return type;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetAllPaymentMethodsRequest && equalTo((GetAllPaymentMethodsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetAllPaymentMethodsRequest other) {
        return type.equals(other.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.type);
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
        private Optional<PaymentMethodType> type = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GetAllPaymentMethodsRequest other) {
            type(other.getType());
            return this;
        }

        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public Builder type(Optional<PaymentMethodType> type) {
            this.type = type;
            return this;
        }

        public Builder type(PaymentMethodType type) {
            this.type = Optional.of(type);
            return this;
        }

        public GetAllPaymentMethodsRequest build() {
            return new GetAllPaymentMethodsRequest(type, additionalProperties);
        }
    }
}
