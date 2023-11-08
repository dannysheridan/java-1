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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EntityUserResponse.Builder.class)
public final class EntityUserResponse {
    private final String id;

    private final Optional<String> foreignId;

    private final Optional<String> email;

    private final Optional<String> name;

    private final List<String> roles;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Map<String, Object> additionalProperties;

    private EntityUserResponse(
            String id,
            Optional<String> foreignId,
            Optional<String> email,
            Optional<String> name,
            List<String> roles,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.foreignId = foreignId;
        this.email = email;
        this.name = name;
        this.roles = roles;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return The ID used to identify this user in your system.
     */
    @JsonProperty("foreignId")
    public Optional<String> getForeignId() {
        return foreignId;
    }

    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("roles")
    public List<String> getRoles() {
        return roles;
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
        return other instanceof EntityUserResponse && equalTo((EntityUserResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityUserResponse other) {
        return id.equals(other.id)
                && foreignId.equals(other.foreignId)
                && email.equals(other.email)
                && name.equals(other.name)
                && roles.equals(other.roles)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.foreignId, this.email, this.name, this.roles, this.createdAt, this.updatedAt);
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

        Builder from(EntityUserResponse other);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        EntityUserResponse build();

        _FinalStage foreignId(Optional<String> foreignId);

        _FinalStage foreignId(String foreignId);

        _FinalStage email(Optional<String> email);

        _FinalStage email(String email);

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage roles(List<String> roles);

        _FinalStage addRoles(String roles);

        _FinalStage addAllRoles(List<String> roles);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private String id;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private List<String> roles = new ArrayList<>();

        private Optional<String> name = Optional.empty();

        private Optional<String> email = Optional.empty();

        private Optional<String> foreignId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(EntityUserResponse other) {
            id(other.getId());
            foreignId(other.getForeignId());
            email(other.getEmail());
            name(other.getName());
            roles(other.getRoles());
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
        public _FinalStage addAllRoles(List<String> roles) {
            this.roles.addAll(roles);
            return this;
        }

        @Override
        public _FinalStage addRoles(String roles) {
            this.roles.add(roles);
            return this;
        }

        @Override
        @JsonSetter(value = "roles", nulls = Nulls.SKIP)
        public _FinalStage roles(List<String> roles) {
            this.roles.clear();
            this.roles.addAll(roles);
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

        /**
         * <p>The ID used to identify this user in your system.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage foreignId(String foreignId) {
            this.foreignId = Optional.of(foreignId);
            return this;
        }

        @Override
        @JsonSetter(value = "foreignId", nulls = Nulls.SKIP)
        public _FinalStage foreignId(Optional<String> foreignId) {
            this.foreignId = foreignId;
            return this;
        }

        @Override
        public EntityUserResponse build() {
            return new EntityUserResponse(
                    id, foreignId, email, name, roles, createdAt, updatedAt, additionalProperties);
        }
    }
}
