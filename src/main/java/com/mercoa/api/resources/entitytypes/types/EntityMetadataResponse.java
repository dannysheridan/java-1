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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EntityMetadataResponse.Builder.class)
public final class EntityMetadataResponse {
    private final String key;

    private final List<String> value;

    private final Map<String, Object> additionalProperties;

    private EntityMetadataResponse(String key, List<String> value, Map<String, Object> additionalProperties) {
        this.key = key;
        this.value = value;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("value")
    public List<String> getValue() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityMetadataResponse && equalTo((EntityMetadataResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityMetadataResponse other) {
        return key.equals(other.key) && value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.key, this.value);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static KeyStage builder() {
        return new Builder();
    }

    public interface KeyStage {
        _FinalStage key(String key);

        Builder from(EntityMetadataResponse other);
    }

    public interface _FinalStage {
        EntityMetadataResponse build();

        _FinalStage value(List<String> value);

        _FinalStage addValue(String value);

        _FinalStage addAllValue(List<String> value);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements KeyStage, _FinalStage {
        private String key;

        private List<String> value = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(EntityMetadataResponse other) {
            key(other.getKey());
            value(other.getValue());
            return this;
        }

        @Override
        @JsonSetter("key")
        public _FinalStage key(String key) {
            this.key = key;
            return this;
        }

        @Override
        public _FinalStage addAllValue(List<String> value) {
            this.value.addAll(value);
            return this;
        }

        @Override
        public _FinalStage addValue(String value) {
            this.value.add(value);
            return this;
        }

        @Override
        @JsonSetter(value = "value", nulls = Nulls.SKIP)
        public _FinalStage value(List<String> value) {
            this.value.clear();
            this.value.addAll(value);
            return this;
        }

        @Override
        public EntityMetadataResponse build() {
            return new EntityMetadataResponse(key, value, additionalProperties);
        }
    }
}
