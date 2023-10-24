/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.commons.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderDirection {
    ASC("ASC"),

    DESC("DESC");

    private final String value;

    OrderDirection(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
