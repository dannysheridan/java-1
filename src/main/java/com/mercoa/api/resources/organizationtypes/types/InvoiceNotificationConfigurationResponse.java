/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.organizationtypes.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.entitytypes.types.NotificationType;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = InvoiceNotificationConfigurationResponse.Builder.class)
public final class InvoiceNotificationConfigurationResponse implements IInvoiceNotificationConfigurationRequest {
    private final String url;

    private final NotificationType type;

    private InvoiceNotificationConfigurationResponse(String url, NotificationType type) {
        this.url = url;
        this.type = type;
    }

    @JsonProperty("url")
    @Override
    public String getUrl() {
        return url;
    }

    @JsonProperty("type")
    public NotificationType getType() {
        return type;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof InvoiceNotificationConfigurationResponse
                && equalTo((InvoiceNotificationConfigurationResponse) other);
    }

    private boolean equalTo(InvoiceNotificationConfigurationResponse other) {
        return url.equals(other.url) && type.equals(other.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.url, this.type);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UrlStage builder() {
        return new Builder();
    }

    public interface UrlStage {
        TypeStage url(String url);

        Builder from(InvoiceNotificationConfigurationResponse other);
    }

    public interface TypeStage {
        _FinalStage type(NotificationType type);
    }

    public interface _FinalStage {
        InvoiceNotificationConfigurationResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UrlStage, TypeStage, _FinalStage {
        private String url;

        private NotificationType type;

        private Builder() {}

        @Override
        public Builder from(InvoiceNotificationConfigurationResponse other) {
            url(other.getUrl());
            type(other.getType());
            return this;
        }

        @Override
        @JsonSetter("url")
        public TypeStage url(String url) {
            this.url = url;
            return this;
        }

        @Override
        @JsonSetter("type")
        public _FinalStage type(NotificationType type) {
            this.type = type;
            return this;
        }

        @Override
        public InvoiceNotificationConfigurationResponse build() {
            return new InvoiceNotificationConfigurationResponse(url, type);
        }
    }
}
