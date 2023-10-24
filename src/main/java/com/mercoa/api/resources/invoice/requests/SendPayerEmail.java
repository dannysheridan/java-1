/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoice.requests;

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
@JsonDeserialize(builder = SendPayerEmail.Builder.class)
public final class SendPayerEmail {
    private final Optional<Boolean> attachInvoice;

    private SendPayerEmail(Optional<Boolean> attachInvoice) {
        this.attachInvoice = attachInvoice;
    }

    /**
     * @return Whether to attach the invoice to the email
     */
    @JsonProperty("attachInvoice")
    public Optional<Boolean> getAttachInvoice() {
        return attachInvoice;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SendPayerEmail && equalTo((SendPayerEmail) other);
    }

    private boolean equalTo(SendPayerEmail other) {
        return attachInvoice.equals(other.attachInvoice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.attachInvoice);
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
        private Optional<Boolean> attachInvoice = Optional.empty();

        private Builder() {}

        public Builder from(SendPayerEmail other) {
            attachInvoice(other.getAttachInvoice());
            return this;
        }

        @JsonSetter(value = "attachInvoice", nulls = Nulls.SKIP)
        public Builder attachInvoice(Optional<Boolean> attachInvoice) {
            this.attachInvoice = attachInvoice;
            return this;
        }

        public Builder attachInvoice(Boolean attachInvoice) {
            this.attachInvoice = Optional.of(attachInvoice);
            return this;
        }

        public SendPayerEmail build() {
            return new SendPayerEmail(attachInvoice);
        }
    }
}
