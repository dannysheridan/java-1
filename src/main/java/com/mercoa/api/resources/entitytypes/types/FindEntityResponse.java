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
@JsonDeserialize(builder = FindEntityResponse.Builder.class)
public final class FindEntityResponse {
    private final int count;

    private final boolean hasMore;

    private final List<EntityResponse> data;

    private final Map<String, Object> additionalProperties;

    private FindEntityResponse(
            int count, boolean hasMore, List<EntityResponse> data, Map<String, Object> additionalProperties) {
        this.count = count;
        this.hasMore = hasMore;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Total number of entities for the given filters. This value is not limited by the limit parameter. It is provided so that you can determine how many pages of results are available.
     */
    @JsonProperty("count")
    public int getCount() {
        return count;
    }

    /**
     * @return True if there are more entities available for the given filters.
     */
    @JsonProperty("hasMore")
    public boolean getHasMore() {
        return hasMore;
    }

    @JsonProperty("data")
    public List<EntityResponse> getData() {
        return data;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FindEntityResponse && equalTo((FindEntityResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FindEntityResponse other) {
        return count == other.count && hasMore == other.hasMore && data.equals(other.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.count, this.hasMore, this.data);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CountStage builder() {
        return new Builder();
    }

    public interface CountStage {
        HasMoreStage count(int count);

        Builder from(FindEntityResponse other);
    }

    public interface HasMoreStage {
        _FinalStage hasMore(boolean hasMore);
    }

    public interface _FinalStage {
        FindEntityResponse build();

        _FinalStage data(List<EntityResponse> data);

        _FinalStage addData(EntityResponse data);

        _FinalStage addAllData(List<EntityResponse> data);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CountStage, HasMoreStage, _FinalStage {
        private int count;

        private boolean hasMore;

        private List<EntityResponse> data = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(FindEntityResponse other) {
            count(other.getCount());
            hasMore(other.getHasMore());
            data(other.getData());
            return this;
        }

        /**
         * <p>Total number of entities for the given filters. This value is not limited by the limit parameter. It is provided so that you can determine how many pages of results are available.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("count")
        public HasMoreStage count(int count) {
            this.count = count;
            return this;
        }

        /**
         * <p>True if there are more entities available for the given filters.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("hasMore")
        public _FinalStage hasMore(boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        @Override
        public _FinalStage addAllData(List<EntityResponse> data) {
            this.data.addAll(data);
            return this;
        }

        @Override
        public _FinalStage addData(EntityResponse data) {
            this.data.add(data);
            return this;
        }

        @Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(List<EntityResponse> data) {
            this.data.clear();
            this.data.addAll(data);
            return this;
        }

        @Override
        public FindEntityResponse build() {
            return new FindEntityResponse(count, hasMore, data, additionalProperties);
        }
    }
}
