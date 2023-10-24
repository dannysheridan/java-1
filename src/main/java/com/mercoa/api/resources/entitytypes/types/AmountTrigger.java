/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entitytypes.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.paymentmethodtypes.types.CurrencyCode;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AmountTrigger.Builder.class)
public final class AmountTrigger {
    private final double amount;

    private final CurrencyCode currency;

    private AmountTrigger(double amount, CurrencyCode currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @JsonProperty("amount")
    public double getAmount() {
        return amount;
    }

    @JsonProperty("currency")
    public CurrencyCode getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AmountTrigger && equalTo((AmountTrigger) other);
    }

    private boolean equalTo(AmountTrigger other) {
        return amount == other.amount && currency.equals(other.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.amount, this.currency);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AmountStage builder() {
        return new Builder();
    }

    public interface AmountStage {
        CurrencyStage amount(double amount);

        Builder from(AmountTrigger other);
    }

    public interface CurrencyStage {
        _FinalStage currency(CurrencyCode currency);
    }

    public interface _FinalStage {
        AmountTrigger build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AmountStage, CurrencyStage, _FinalStage {
        private double amount;

        private CurrencyCode currency;

        private Builder() {}

        @Override
        public Builder from(AmountTrigger other) {
            amount(other.getAmount());
            currency(other.getCurrency());
            return this;
        }

        @Override
        @JsonSetter("amount")
        public CurrencyStage amount(double amount) {
            this.amount = amount;
            return this;
        }

        @Override
        @JsonSetter("currency")
        public _FinalStage currency(CurrencyCode currency) {
            this.currency = currency;
            return this;
        }

        @Override
        public AmountTrigger build() {
            return new AmountTrigger(amount, currency);
        }
    }
}
