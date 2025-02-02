/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.organizationtypes.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = MetadataSchema.Builder.class)
public final class MetadataSchema {
    private final String key;

    private final String displayName;

    private final Optional<String> description;

    private final MetadataType type;

    private final Optional<Boolean> allowMultiple;

    private final Optional<MetadataShowConditions> showConditions;

    private final Map<String, Object> additionalProperties;

    private MetadataSchema(
            String key,
            String displayName,
            Optional<String> description,
            MetadataType type,
            Optional<Boolean> allowMultiple,
            Optional<MetadataShowConditions> showConditions,
            Map<String, Object> additionalProperties) {
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.type = type;
        this.allowMultiple = allowMultiple;
        this.showConditions = showConditions;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    @JsonProperty("type")
    public MetadataType getType() {
        return type;
    }

    /**
     * @return Whether or not multiple values are allowed for this field. Defaults to false. If true, the value will be a list of the specified type.
     */
    @JsonProperty("allowMultiple")
    public Optional<Boolean> getAllowMultiple() {
        return allowMultiple;
    }

    /**
     * @return A list of conditional rules that determine whether or not this field should be shown. The field will only be shown if all of the conditions are met. If no conditions are specified, the field will always be shown.
     */
    @JsonProperty("showConditions")
    public Optional<MetadataShowConditions> getShowConditions() {
        return showConditions;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MetadataSchema && equalTo((MetadataSchema) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(MetadataSchema other) {
        return key.equals(other.key)
                && displayName.equals(other.displayName)
                && description.equals(other.description)
                && type.equals(other.type)
                && allowMultiple.equals(other.allowMultiple)
                && showConditions.equals(other.showConditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.key, this.displayName, this.description, this.type, this.allowMultiple, this.showConditions);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static KeyStage builder() {
        return new Builder();
    }

    public interface KeyStage {
        DisplayNameStage key(String key);

        Builder from(MetadataSchema other);
    }

    public interface DisplayNameStage {
        TypeStage displayName(String displayName);
    }

    public interface TypeStage {
        _FinalStage type(MetadataType type);
    }

    public interface _FinalStage {
        MetadataSchema build();

        _FinalStage description(Optional<String> description);

        _FinalStage description(String description);

        _FinalStage allowMultiple(Optional<Boolean> allowMultiple);

        _FinalStage allowMultiple(Boolean allowMultiple);

        _FinalStage showConditions(Optional<MetadataShowConditions> showConditions);

        _FinalStage showConditions(MetadataShowConditions showConditions);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements KeyStage, DisplayNameStage, TypeStage, _FinalStage {
        private String key;

        private String displayName;

        private MetadataType type;

        private Optional<MetadataShowConditions> showConditions = Optional.empty();

        private Optional<Boolean> allowMultiple = Optional.empty();

        private Optional<String> description = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(MetadataSchema other) {
            key(other.getKey());
            displayName(other.getDisplayName());
            description(other.getDescription());
            type(other.getType());
            allowMultiple(other.getAllowMultiple());
            showConditions(other.getShowConditions());
            return this;
        }

        @Override
        @JsonSetter("key")
        public DisplayNameStage key(String key) {
            this.key = key;
            return this;
        }

        @Override
        @JsonSetter("displayName")
        public TypeStage displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        @Override
        @JsonSetter("type")
        public _FinalStage type(MetadataType type) {
            this.type = type;
            return this;
        }

        /**
         * <p>A list of conditional rules that determine whether or not this field should be shown. The field will only be shown if all of the conditions are met. If no conditions are specified, the field will always be shown.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage showConditions(MetadataShowConditions showConditions) {
            this.showConditions = Optional.of(showConditions);
            return this;
        }

        @Override
        @JsonSetter(value = "showConditions", nulls = Nulls.SKIP)
        public _FinalStage showConditions(Optional<MetadataShowConditions> showConditions) {
            this.showConditions = showConditions;
            return this;
        }

        /**
         * <p>Whether or not multiple values are allowed for this field. Defaults to false. If true, the value will be a list of the specified type.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage allowMultiple(Boolean allowMultiple) {
            this.allowMultiple = Optional.of(allowMultiple);
            return this;
        }

        @Override
        @JsonSetter(value = "allowMultiple", nulls = Nulls.SKIP)
        public _FinalStage allowMultiple(Optional<Boolean> allowMultiple) {
            this.allowMultiple = allowMultiple;
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
        public MetadataSchema build() {
            return new MetadataSchema(
                    key, displayName, description, type, allowMultiple, showConditions, additionalProperties);
        }
    }
}
