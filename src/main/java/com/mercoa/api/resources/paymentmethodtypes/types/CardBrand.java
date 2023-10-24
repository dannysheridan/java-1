/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.paymentmethodtypes.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CardBrand {
    AMERICAN_EXPRESS("AmericanExpress"),

    DISCOVER("Discover"),

    MASTERCARD("Mastercard"),

    VISA("Visa");

    private final String value;

    CardBrand(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
