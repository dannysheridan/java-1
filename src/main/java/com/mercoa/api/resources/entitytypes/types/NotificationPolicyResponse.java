/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entitytypes.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = NotificationPolicyResponse.Builder.class)
public final class NotificationPolicyResponse {
    private final List<String> additionalRoles;

    private final NotificationType type;

    private NotificationPolicyResponse(List<String> additionalRoles, NotificationType type) {
        this.additionalRoles = additionalRoles;
        this.type = type;
    }

    /**
     * @return List of user roles that should receive notifications in addition to the default users for this notification type
     */
    @JsonProperty("additionalRoles")
    public List<String> getAdditionalRoles() {
        return additionalRoles;
    }

    @JsonProperty("type")
    public NotificationType getType() {
        return type;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NotificationPolicyResponse && equalTo((NotificationPolicyResponse) other);
    }

    private boolean equalTo(NotificationPolicyResponse other) {
        return additionalRoles.equals(other.additionalRoles) && type.equals(other.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.additionalRoles, this.type);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        _FinalStage type(NotificationType type);

        Builder from(NotificationPolicyResponse other);
    }

    public interface _FinalStage {
        NotificationPolicyResponse build();

        _FinalStage additionalRoles(List<String> additionalRoles);

        _FinalStage addAdditionalRoles(String additionalRoles);

        _FinalStage addAllAdditionalRoles(List<String> additionalRoles);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TypeStage, _FinalStage {
        private NotificationType type;

        private List<String> additionalRoles = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(NotificationPolicyResponse other) {
            additionalRoles(other.getAdditionalRoles());
            type(other.getType());
            return this;
        }

        @Override
        @JsonSetter("type")
        public _FinalStage type(NotificationType type) {
            this.type = type;
            return this;
        }

        /**
         * <p>List of user roles that should receive notifications in addition to the default users for this notification type</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage addAllAdditionalRoles(List<String> additionalRoles) {
            this.additionalRoles.addAll(additionalRoles);
            return this;
        }

        /**
         * <p>List of user roles that should receive notifications in addition to the default users for this notification type</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage addAdditionalRoles(String additionalRoles) {
            this.additionalRoles.add(additionalRoles);
            return this;
        }

        @Override
        @JsonSetter(value = "additionalRoles", nulls = Nulls.SKIP)
        public _FinalStage additionalRoles(List<String> additionalRoles) {
            this.additionalRoles.clear();
            this.additionalRoles.addAll(additionalRoles);
            return this;
        }

        @Override
        public NotificationPolicyResponse build() {
            return new NotificationPolicyResponse(additionalRoles, type);
        }
    }
}
