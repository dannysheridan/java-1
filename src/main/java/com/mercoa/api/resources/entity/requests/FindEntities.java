/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.entitytypes.types.EntityStatus;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = FindEntities.Builder.class)
public final class FindEntities {
    private final Optional<Boolean> ownedByOrg;

    private final Optional<String> foreignId;

    private final Optional<EntityStatus> status;

    private final Optional<Boolean> isPayee;

    private final Optional<Boolean> isPayor;

    private final Optional<String> name;

    private final Optional<Integer> limit;

    private final Optional<String> startingAfter;

    private FindEntities(
            Optional<Boolean> ownedByOrg,
            Optional<String> foreignId,
            Optional<EntityStatus> status,
            Optional<Boolean> isPayee,
            Optional<Boolean> isPayor,
            Optional<String> name,
            Optional<Integer> limit,
            Optional<String> startingAfter) {
        this.ownedByOrg = ownedByOrg;
        this.foreignId = foreignId;
        this.status = status;
        this.isPayee = isPayee;
        this.isPayor = isPayor;
        this.name = name;
        this.limit = limit;
        this.startingAfter = startingAfter;
    }

    /**
     * @return If true, only entities with a direct relationship to the requesting organization will be returned. If false or not provided, all entities will be returned.
     */
    @JsonProperty("ownedByOrg")
    public Optional<Boolean> getOwnedByOrg() {
        return ownedByOrg;
    }

    /**
     * @return ID used to identify this entity in your system
     */
    @JsonProperty("foreignId")
    public Optional<String> getForeignId() {
        return foreignId;
    }

    @JsonProperty("status")
    public Optional<EntityStatus> getStatus() {
        return status;
    }

    /**
     * @return If true, entities that are marked as payees will be returned.
     * If false or not provided, entities that are marked as payees will not be returned.
     */
    @JsonProperty("isPayee")
    public Optional<Boolean> getIsPayee() {
        return isPayee;
    }

    /**
     * @return If true or not provided, entities that are marked as payors will be returned.
     * If false, entities that are marked as payors will not be returned.
     */
    @JsonProperty("isPayor")
    public Optional<Boolean> getIsPayor() {
        return isPayor;
    }

    /**
     * @return Filter entities by name. Partial matches are supported.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return Number of entities to return. Limit can range between 1 and 100, and the default is 10.
     */
    @JsonProperty("limit")
    public Optional<Integer> getLimit() {
        return limit;
    }

    /**
     * @return The ID of the entity to start after. If not provided, the first page of entities will be returned.
     */
    @JsonProperty("startingAfter")
    public Optional<String> getStartingAfter() {
        return startingAfter;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FindEntities && equalTo((FindEntities) other);
    }

    private boolean equalTo(FindEntities other) {
        return ownedByOrg.equals(other.ownedByOrg)
                && foreignId.equals(other.foreignId)
                && status.equals(other.status)
                && isPayee.equals(other.isPayee)
                && isPayor.equals(other.isPayor)
                && name.equals(other.name)
                && limit.equals(other.limit)
                && startingAfter.equals(other.startingAfter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.ownedByOrg,
                this.foreignId,
                this.status,
                this.isPayee,
                this.isPayor,
                this.name,
                this.limit,
                this.startingAfter);
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
        private Optional<Boolean> ownedByOrg = Optional.empty();

        private Optional<String> foreignId = Optional.empty();

        private Optional<EntityStatus> status = Optional.empty();

        private Optional<Boolean> isPayee = Optional.empty();

        private Optional<Boolean> isPayor = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<Integer> limit = Optional.empty();

        private Optional<String> startingAfter = Optional.empty();

        private Builder() {}

        public Builder from(FindEntities other) {
            ownedByOrg(other.getOwnedByOrg());
            foreignId(other.getForeignId());
            status(other.getStatus());
            isPayee(other.getIsPayee());
            isPayor(other.getIsPayor());
            name(other.getName());
            limit(other.getLimit());
            startingAfter(other.getStartingAfter());
            return this;
        }

        @JsonSetter(value = "ownedByOrg", nulls = Nulls.SKIP)
        public Builder ownedByOrg(Optional<Boolean> ownedByOrg) {
            this.ownedByOrg = ownedByOrg;
            return this;
        }

        public Builder ownedByOrg(Boolean ownedByOrg) {
            this.ownedByOrg = Optional.of(ownedByOrg);
            return this;
        }

        @JsonSetter(value = "foreignId", nulls = Nulls.SKIP)
        public Builder foreignId(Optional<String> foreignId) {
            this.foreignId = foreignId;
            return this;
        }

        public Builder foreignId(String foreignId) {
            this.foreignId = Optional.of(foreignId);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<EntityStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(EntityStatus status) {
            this.status = Optional.of(status);
            return this;
        }

        @JsonSetter(value = "isPayee", nulls = Nulls.SKIP)
        public Builder isPayee(Optional<Boolean> isPayee) {
            this.isPayee = isPayee;
            return this;
        }

        public Builder isPayee(Boolean isPayee) {
            this.isPayee = Optional.of(isPayee);
            return this;
        }

        @JsonSetter(value = "isPayor", nulls = Nulls.SKIP)
        public Builder isPayor(Optional<Boolean> isPayor) {
            this.isPayor = isPayor;
            return this;
        }

        public Builder isPayor(Boolean isPayor) {
            this.isPayor = Optional.of(isPayor);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @JsonSetter(value = "limit", nulls = Nulls.SKIP)
        public Builder limit(Optional<Integer> limit) {
            this.limit = limit;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = Optional.of(limit);
            return this;
        }

        @JsonSetter(value = "startingAfter", nulls = Nulls.SKIP)
        public Builder startingAfter(Optional<String> startingAfter) {
            this.startingAfter = startingAfter;
            return this;
        }

        public Builder startingAfter(String startingAfter) {
            this.startingAfter = Optional.of(startingAfter);
            return this;
        }

        public FindEntities build() {
            return new FindEntities(ownedByOrg, foreignId, status, isPayee, isPayor, name, limit, startingAfter);
        }
    }
}
