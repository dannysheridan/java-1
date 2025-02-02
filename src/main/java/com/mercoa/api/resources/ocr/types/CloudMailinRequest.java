/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.ocr.types;

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
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CloudMailinRequest.Builder.class)
public final class CloudMailinRequest {
    private final Object headers;

    private final CloudMailinEnvelope envelope;

    private final String plain;

    private final Optional<String> html;

    private final Optional<String> replyPlain;

    private final List<CloudMailinAttachment> attachments;

    private final Map<String, Object> additionalProperties;

    private CloudMailinRequest(
            Object headers,
            CloudMailinEnvelope envelope,
            String plain,
            Optional<String> html,
            Optional<String> replyPlain,
            List<CloudMailinAttachment> attachments,
            Map<String, Object> additionalProperties) {
        this.headers = headers;
        this.envelope = envelope;
        this.plain = plain;
        this.html = html;
        this.replyPlain = replyPlain;
        this.attachments = attachments;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("headers")
    public Object getHeaders() {
        return headers;
    }

    @JsonProperty("envelope")
    public CloudMailinEnvelope getEnvelope() {
        return envelope;
    }

    @JsonProperty("plain")
    public String getPlain() {
        return plain;
    }

    @JsonProperty("html")
    public Optional<String> getHtml() {
        return html;
    }

    @JsonProperty("reply_plain")
    public Optional<String> getReplyPlain() {
        return replyPlain;
    }

    @JsonProperty("attachments")
    public List<CloudMailinAttachment> getAttachments() {
        return attachments;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CloudMailinRequest && equalTo((CloudMailinRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CloudMailinRequest other) {
        return headers.equals(other.headers)
                && envelope.equals(other.envelope)
                && plain.equals(other.plain)
                && html.equals(other.html)
                && replyPlain.equals(other.replyPlain)
                && attachments.equals(other.attachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.headers, this.envelope, this.plain, this.html, this.replyPlain, this.attachments);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static HeadersStage builder() {
        return new Builder();
    }

    public interface HeadersStage {
        EnvelopeStage headers(Object headers);

        Builder from(CloudMailinRequest other);
    }

    public interface EnvelopeStage {
        PlainStage envelope(CloudMailinEnvelope envelope);
    }

    public interface PlainStage {
        _FinalStage plain(String plain);
    }

    public interface _FinalStage {
        CloudMailinRequest build();

        _FinalStage html(Optional<String> html);

        _FinalStage html(String html);

        _FinalStage replyPlain(Optional<String> replyPlain);

        _FinalStage replyPlain(String replyPlain);

        _FinalStage attachments(List<CloudMailinAttachment> attachments);

        _FinalStage addAttachments(CloudMailinAttachment attachments);

        _FinalStage addAllAttachments(List<CloudMailinAttachment> attachments);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements HeadersStage, EnvelopeStage, PlainStage, _FinalStage {
        private Object headers;

        private CloudMailinEnvelope envelope;

        private String plain;

        private List<CloudMailinAttachment> attachments = new ArrayList<>();

        private Optional<String> replyPlain = Optional.empty();

        private Optional<String> html = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(CloudMailinRequest other) {
            headers(other.getHeaders());
            envelope(other.getEnvelope());
            plain(other.getPlain());
            html(other.getHtml());
            replyPlain(other.getReplyPlain());
            attachments(other.getAttachments());
            return this;
        }

        @Override
        @JsonSetter("headers")
        public EnvelopeStage headers(Object headers) {
            this.headers = headers;
            return this;
        }

        @Override
        @JsonSetter("envelope")
        public PlainStage envelope(CloudMailinEnvelope envelope) {
            this.envelope = envelope;
            return this;
        }

        @Override
        @JsonSetter("plain")
        public _FinalStage plain(String plain) {
            this.plain = plain;
            return this;
        }

        @Override
        public _FinalStage addAllAttachments(List<CloudMailinAttachment> attachments) {
            this.attachments.addAll(attachments);
            return this;
        }

        @Override
        public _FinalStage addAttachments(CloudMailinAttachment attachments) {
            this.attachments.add(attachments);
            return this;
        }

        @Override
        @JsonSetter(value = "attachments", nulls = Nulls.SKIP)
        public _FinalStage attachments(List<CloudMailinAttachment> attachments) {
            this.attachments.clear();
            this.attachments.addAll(attachments);
            return this;
        }

        @Override
        public _FinalStage replyPlain(String replyPlain) {
            this.replyPlain = Optional.of(replyPlain);
            return this;
        }

        @Override
        @JsonSetter(value = "reply_plain", nulls = Nulls.SKIP)
        public _FinalStage replyPlain(Optional<String> replyPlain) {
            this.replyPlain = replyPlain;
            return this;
        }

        @Override
        public _FinalStage html(String html) {
            this.html = Optional.of(html);
            return this;
        }

        @Override
        @JsonSetter(value = "html", nulls = Nulls.SKIP)
        public _FinalStage html(Optional<String> html) {
            this.html = html;
            return this;
        }

        @Override
        public CloudMailinRequest build() {
            return new CloudMailinRequest(
                    headers, envelope, plain, html, replyPlain, attachments, additionalProperties);
        }
    }
}
