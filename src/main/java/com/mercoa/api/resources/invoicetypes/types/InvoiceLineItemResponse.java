/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.paymentmethodtypes.types.CurrencyCode;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = InvoiceLineItemResponse.Builder.class)
public final class InvoiceLineItemResponse {
    private final String id;

    private final Optional<Double> amount;

    private final Optional<CurrencyCode> currency;

    private final Optional<String> description;

    private final Optional<String> name;

    private final Optional<Integer> quantity;

    private final Optional<Double> unitPrice;

    private final Optional<OffsetDateTime> serviceStartDate;

    private final Optional<OffsetDateTime> serviceEndDate;

    private final Optional<Map<String, String>> metadata;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private InvoiceLineItemResponse(
            String id,
            Optional<Double> amount,
            Optional<CurrencyCode> currency,
            Optional<String> description,
            Optional<String> name,
            Optional<Integer> quantity,
            Optional<Double> unitPrice,
            Optional<OffsetDateTime> serviceStartDate,
            Optional<OffsetDateTime> serviceEndDate,
            Optional<Map<String, String>> metadata,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
        this.description = description;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.serviceStartDate = serviceStartDate;
        this.serviceEndDate = serviceEndDate;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return Total amount of line item in major units.
     */
    @JsonProperty("amount")
    public Optional<Double> getAmount() {
        return amount;
    }

    @JsonProperty("currency")
    public Optional<CurrencyCode> getCurrency() {
        return currency;
    }

    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("quantity")
    public Optional<Integer> getQuantity() {
        return quantity;
    }

    /**
     * @return Unit price of line item in major units.
     */
    @JsonProperty("unitPrice")
    public Optional<Double> getUnitPrice() {
        return unitPrice;
    }

    @JsonProperty("serviceStartDate")
    public Optional<OffsetDateTime> getServiceStartDate() {
        return serviceStartDate;
    }

    @JsonProperty("serviceEndDate")
    public Optional<OffsetDateTime> getServiceEndDate() {
        return serviceEndDate;
    }

    @JsonProperty("metadata")
    public Optional<Map<String, String>> getMetadata() {
        return metadata;
    }

    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof InvoiceLineItemResponse && equalTo((InvoiceLineItemResponse) other);
    }

    private boolean equalTo(InvoiceLineItemResponse other) {
        return id.equals(other.id)
                && amount.equals(other.amount)
                && currency.equals(other.currency)
                && description.equals(other.description)
                && name.equals(other.name)
                && quantity.equals(other.quantity)
                && unitPrice.equals(other.unitPrice)
                && serviceStartDate.equals(other.serviceStartDate)
                && serviceEndDate.equals(other.serviceEndDate)
                && metadata.equals(other.metadata)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.amount,
                this.currency,
                this.description,
                this.name,
                this.quantity,
                this.unitPrice,
                this.serviceStartDate,
                this.serviceEndDate,
                this.metadata,
                this.createdAt,
                this.updatedAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        CreatedAtStage id(String id);

        Builder from(InvoiceLineItemResponse other);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        InvoiceLineItemResponse build();

        _FinalStage amount(Optional<Double> amount);

        _FinalStage amount(Double amount);

        _FinalStage currency(Optional<CurrencyCode> currency);

        _FinalStage currency(CurrencyCode currency);

        _FinalStage description(Optional<String> description);

        _FinalStage description(String description);

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage quantity(Optional<Integer> quantity);

        _FinalStage quantity(Integer quantity);

        _FinalStage unitPrice(Optional<Double> unitPrice);

        _FinalStage unitPrice(Double unitPrice);

        _FinalStage serviceStartDate(Optional<OffsetDateTime> serviceStartDate);

        _FinalStage serviceStartDate(OffsetDateTime serviceStartDate);

        _FinalStage serviceEndDate(Optional<OffsetDateTime> serviceEndDate);

        _FinalStage serviceEndDate(OffsetDateTime serviceEndDate);

        _FinalStage metadata(Optional<Map<String, String>> metadata);

        _FinalStage metadata(Map<String, String> metadata);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private String id;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<Map<String, String>> metadata = Optional.empty();

        private Optional<OffsetDateTime> serviceEndDate = Optional.empty();

        private Optional<OffsetDateTime> serviceStartDate = Optional.empty();

        private Optional<Double> unitPrice = Optional.empty();

        private Optional<Integer> quantity = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<CurrencyCode> currency = Optional.empty();

        private Optional<Double> amount = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(InvoiceLineItemResponse other) {
            id(other.getId());
            amount(other.getAmount());
            currency(other.getCurrency());
            description(other.getDescription());
            name(other.getName());
            quantity(other.getQuantity());
            unitPrice(other.getUnitPrice());
            serviceStartDate(other.getServiceStartDate());
            serviceEndDate(other.getServiceEndDate());
            metadata(other.getMetadata());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        @Override
        @JsonSetter("id")
        public CreatedAtStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @Override
        public _FinalStage metadata(Map<String, String> metadata) {
            this.metadata = Optional.of(metadata);
            return this;
        }

        @Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<Map<String, String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        @Override
        public _FinalStage serviceEndDate(OffsetDateTime serviceEndDate) {
            this.serviceEndDate = Optional.of(serviceEndDate);
            return this;
        }

        @Override
        @JsonSetter(value = "serviceEndDate", nulls = Nulls.SKIP)
        public _FinalStage serviceEndDate(Optional<OffsetDateTime> serviceEndDate) {
            this.serviceEndDate = serviceEndDate;
            return this;
        }

        @Override
        public _FinalStage serviceStartDate(OffsetDateTime serviceStartDate) {
            this.serviceStartDate = Optional.of(serviceStartDate);
            return this;
        }

        @Override
        @JsonSetter(value = "serviceStartDate", nulls = Nulls.SKIP)
        public _FinalStage serviceStartDate(Optional<OffsetDateTime> serviceStartDate) {
            this.serviceStartDate = serviceStartDate;
            return this;
        }

        /**
         * <p>Unit price of line item in major units.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage unitPrice(Double unitPrice) {
            this.unitPrice = Optional.of(unitPrice);
            return this;
        }

        @Override
        @JsonSetter(value = "unitPrice", nulls = Nulls.SKIP)
        public _FinalStage unitPrice(Optional<Double> unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        @Override
        public _FinalStage quantity(Integer quantity) {
            this.quantity = Optional.of(quantity);
            return this;
        }

        @Override
        @JsonSetter(value = "quantity", nulls = Nulls.SKIP)
        public _FinalStage quantity(Optional<Integer> quantity) {
            this.quantity = quantity;
            return this;
        }

        @Override
        public _FinalStage name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
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
        public _FinalStage currency(CurrencyCode currency) {
            this.currency = Optional.of(currency);
            return this;
        }

        @Override
        @JsonSetter(value = "currency", nulls = Nulls.SKIP)
        public _FinalStage currency(Optional<CurrencyCode> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * <p>Total amount of line item in major units.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage amount(Double amount) {
            this.amount = Optional.of(amount);
            return this;
        }

        @Override
        @JsonSetter(value = "amount", nulls = Nulls.SKIP)
        public _FinalStage amount(Optional<Double> amount) {
            this.amount = amount;
            return this;
        }

        @Override
        public InvoiceLineItemResponse build() {
            return new InvoiceLineItemResponse(
                    id,
                    amount,
                    currency,
                    description,
                    name,
                    quantity,
                    unitPrice,
                    serviceStartDate,
                    serviceEndDate,
                    metadata,
                    createdAt,
                    updatedAt);
        }
    }
}
