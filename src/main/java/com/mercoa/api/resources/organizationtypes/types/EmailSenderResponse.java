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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EmailSenderResponse.Builder.class)
public final class EmailSenderResponse {
    private final EmailSenderProvider provider;

    private final String fromEmail;

    private final String fromName;

    private final boolean hasApiKey;

    private final Map<String, Object> additionalProperties;

    private EmailSenderResponse(
            EmailSenderProvider provider,
            String fromEmail,
            String fromName,
            boolean hasApiKey,
            Map<String, Object> additionalProperties) {
        this.provider = provider;
        this.fromEmail = fromEmail;
        this.fromName = fromName;
        this.hasApiKey = hasApiKey;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("provider")
    public EmailSenderProvider getProvider() {
        return provider;
    }

    @JsonProperty("fromEmail")
    public String getFromEmail() {
        return fromEmail;
    }

    @JsonProperty("fromName")
    public String getFromName() {
        return fromName;
    }

    @JsonProperty("hasApiKey")
    public boolean getHasApiKey() {
        return hasApiKey;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EmailSenderResponse && equalTo((EmailSenderResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EmailSenderResponse other) {
        return provider.equals(other.provider)
                && fromEmail.equals(other.fromEmail)
                && fromName.equals(other.fromName)
                && hasApiKey == other.hasApiKey;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.provider, this.fromEmail, this.fromName, this.hasApiKey);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ProviderStage builder() {
        return new Builder();
    }

    public interface ProviderStage {
        FromEmailStage provider(EmailSenderProvider provider);

        Builder from(EmailSenderResponse other);
    }

    public interface FromEmailStage {
        FromNameStage fromEmail(String fromEmail);
    }

    public interface FromNameStage {
        HasApiKeyStage fromName(String fromName);
    }

    public interface HasApiKeyStage {
        _FinalStage hasApiKey(boolean hasApiKey);
    }

    public interface _FinalStage {
        EmailSenderResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements ProviderStage, FromEmailStage, FromNameStage, HasApiKeyStage, _FinalStage {
        private EmailSenderProvider provider;

        private String fromEmail;

        private String fromName;

        private boolean hasApiKey;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(EmailSenderResponse other) {
            provider(other.getProvider());
            fromEmail(other.getFromEmail());
            fromName(other.getFromName());
            hasApiKey(other.getHasApiKey());
            return this;
        }

        @Override
        @JsonSetter("provider")
        public FromEmailStage provider(EmailSenderProvider provider) {
            this.provider = provider;
            return this;
        }

        @Override
        @JsonSetter("fromEmail")
        public FromNameStage fromEmail(String fromEmail) {
            this.fromEmail = fromEmail;
            return this;
        }

        @Override
        @JsonSetter("fromName")
        public HasApiKeyStage fromName(String fromName) {
            this.fromName = fromName;
            return this;
        }

        @Override
        @JsonSetter("hasApiKey")
        public _FinalStage hasApiKey(boolean hasApiKey) {
            this.hasApiKey = hasApiKey;
            return this;
        }

        @Override
        public EmailSenderResponse build() {
            return new EmailSenderResponse(provider, fromEmail, fromName, hasApiKey, additionalProperties);
        }
    }
}
