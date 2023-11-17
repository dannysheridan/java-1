/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.entitytypes.types.EntityOnboardingLinkType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GenerateOnboardingLink.Builder.class)
public final class GenerateOnboardingLink {
    private final EntityOnboardingLinkType type;

    private final Optional<String> expiresIn;

    private final Optional<String> connectedEntityId;

    private final Map<String, Object> additionalProperties;

    private GenerateOnboardingLink(
            EntityOnboardingLinkType type,
            Optional<String> expiresIn,
            Optional<String> connectedEntityId,
            Map<String, Object> additionalProperties) {
        this.type = type;
        this.expiresIn = expiresIn;
        this.connectedEntityId = connectedEntityId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The type of onboarding link to generate. If not provided, the default is payee. The onboarding options are determined by your organization's onboarding configuration.
     */
    @JsonProperty("type")
    public EntityOnboardingLinkType getType() {
        return type;
    }

    /**
     * @return Expressed in seconds or a string describing a time span. The default is 24h.
     */
    @JsonProperty("expiresIn")
    public Optional<String> getExpiresIn() {
        return expiresIn;
    }

    /**
     * @return The ID of the entity to connect to. If onboarding a payee, this should be the payor entity ID. If onboarding a payor, this should be the payee entity ID. If no connected entity ID is provided, the onboarding link will be for a standalone entity.
     */
    @JsonProperty("connectedEntityId")
    public Optional<String> getConnectedEntityId() {
        return connectedEntityId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GenerateOnboardingLink && equalTo((GenerateOnboardingLink) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GenerateOnboardingLink other) {
        return type.equals(other.type)
                && expiresIn.equals(other.expiresIn)
                && connectedEntityId.equals(other.connectedEntityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.type, this.expiresIn, this.connectedEntityId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        _FinalStage type(EntityOnboardingLinkType type);

        Builder from(GenerateOnboardingLink other);
    }

    public interface _FinalStage {
        GenerateOnboardingLink build();

        _FinalStage expiresIn(Optional<String> expiresIn);

        _FinalStage expiresIn(String expiresIn);

        _FinalStage connectedEntityId(Optional<String> connectedEntityId);

        _FinalStage connectedEntityId(String connectedEntityId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TypeStage, _FinalStage {
        private EntityOnboardingLinkType type;

        private Optional<String> connectedEntityId = Optional.empty();

        private Optional<String> expiresIn = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(GenerateOnboardingLink other) {
            type(other.getType());
            expiresIn(other.getExpiresIn());
            connectedEntityId(other.getConnectedEntityId());
            return this;
        }

        /**
         * <p>The type of onboarding link to generate. If not provided, the default is payee. The onboarding options are determined by your organization's onboarding configuration.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("type")
        public _FinalStage type(EntityOnboardingLinkType type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The ID of the entity to connect to. If onboarding a payee, this should be the payor entity ID. If onboarding a payor, this should be the payee entity ID. If no connected entity ID is provided, the onboarding link will be for a standalone entity.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage connectedEntityId(String connectedEntityId) {
            this.connectedEntityId = Optional.of(connectedEntityId);
            return this;
        }

        @Override
        @JsonSetter(value = "connectedEntityId", nulls = Nulls.SKIP)
        public _FinalStage connectedEntityId(Optional<String> connectedEntityId) {
            this.connectedEntityId = connectedEntityId;
            return this;
        }

        /**
         * <p>Expressed in seconds or a string describing a time span. The default is 24h.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage expiresIn(String expiresIn) {
            this.expiresIn = Optional.of(expiresIn);
            return this;
        }

        @Override
        @JsonSetter(value = "expiresIn", nulls = Nulls.SKIP)
        public _FinalStage expiresIn(Optional<String> expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        @Override
        public GenerateOnboardingLink build() {
            return new GenerateOnboardingLink(type, expiresIn, connectedEntityId, additionalProperties);
        }
    }
}
