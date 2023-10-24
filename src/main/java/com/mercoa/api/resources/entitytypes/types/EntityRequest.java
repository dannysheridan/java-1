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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EntityRequest.Builder.class)
public final class EntityRequest {
    private final Optional<String> foreignId;

    private final Optional<String> emailTo;

    private final Optional<List<String>> emailToAlias;

    private final Optional<Boolean> ownedByOrg;

    private final AccountType accountType;

    private final ProfileRequest profile;

    private final boolean isPayor;

    private final boolean isPayee;

    private final Optional<String> logo;

    private EntityRequest(
            Optional<String> foreignId,
            Optional<String> emailTo,
            Optional<List<String>> emailToAlias,
            Optional<Boolean> ownedByOrg,
            AccountType accountType,
            ProfileRequest profile,
            boolean isPayor,
            boolean isPayee,
            Optional<String> logo) {
        this.foreignId = foreignId;
        this.emailTo = emailTo;
        this.emailToAlias = emailToAlias;
        this.ownedByOrg = ownedByOrg;
        this.accountType = accountType;
        this.profile = profile;
        this.isPayor = isPayor;
        this.isPayee = isPayee;
        this.logo = logo;
    }

    /**
     * @return The ID used to identify this entity in your system. This ID must be unique across all entities in your system.
     */
    @JsonProperty("foreignId")
    public Optional<String> getForeignId() {
        return foreignId;
    }

    /**
     * @return Sets the email address to which to send invoices to be added to the Invoice Inbox. Only provide the local-part/username of the email address, do not include the @domain.com
     */
    @JsonProperty("emailTo")
    public Optional<String> getEmailTo() {
        return emailTo;
    }

    /**
     * @return Email inbox alias addresses. Used when forwarding emails to the emailTo address from an alias. Include the full email address.
     */
    @JsonProperty("emailToAlias")
    public Optional<List<String>> getEmailToAlias() {
        return emailToAlias;
    }

    /**
     * @return If this entity has a direct relationship with your organization, set this to true. Otherwise, set to false.
     */
    @JsonProperty("ownedByOrg")
    public Optional<Boolean> getOwnedByOrg() {
        return ownedByOrg;
    }

    @JsonProperty("accountType")
    public AccountType getAccountType() {
        return accountType;
    }

    @JsonProperty("profile")
    public ProfileRequest getProfile() {
        return profile;
    }

    /**
     * @return If this entity will be paying invoices, set this to true.
     */
    @JsonProperty("isPayor")
    public boolean getIsPayor() {
        return isPayor;
    }

    /**
     * @return If this entity will be receiving payments, set this to true.
     */
    @JsonProperty("isPayee")
    public boolean getIsPayee() {
        return isPayee;
    }

    /**
     * @return Base64 encoded PNG image data for the entity logo.
     */
    @JsonProperty("logo")
    public Optional<String> getLogo() {
        return logo;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityRequest && equalTo((EntityRequest) other);
    }

    private boolean equalTo(EntityRequest other) {
        return foreignId.equals(other.foreignId)
                && emailTo.equals(other.emailTo)
                && emailToAlias.equals(other.emailToAlias)
                && ownedByOrg.equals(other.ownedByOrg)
                && accountType.equals(other.accountType)
                && profile.equals(other.profile)
                && isPayor == other.isPayor
                && isPayee == other.isPayee
                && logo.equals(other.logo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.foreignId,
                this.emailTo,
                this.emailToAlias,
                this.ownedByOrg,
                this.accountType,
                this.profile,
                this.isPayor,
                this.isPayee,
                this.logo);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AccountTypeStage builder() {
        return new Builder();
    }

    public interface AccountTypeStage {
        ProfileStage accountType(AccountType accountType);

        Builder from(EntityRequest other);
    }

    public interface ProfileStage {
        IsPayorStage profile(ProfileRequest profile);
    }

    public interface IsPayorStage {
        IsPayeeStage isPayor(boolean isPayor);
    }

    public interface IsPayeeStage {
        _FinalStage isPayee(boolean isPayee);
    }

    public interface _FinalStage {
        EntityRequest build();

        _FinalStage foreignId(Optional<String> foreignId);

        _FinalStage foreignId(String foreignId);

        _FinalStage emailTo(Optional<String> emailTo);

        _FinalStage emailTo(String emailTo);

        _FinalStage emailToAlias(Optional<List<String>> emailToAlias);

        _FinalStage emailToAlias(List<String> emailToAlias);

        _FinalStage ownedByOrg(Optional<Boolean> ownedByOrg);

        _FinalStage ownedByOrg(Boolean ownedByOrg);

        _FinalStage logo(Optional<String> logo);

        _FinalStage logo(String logo);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements AccountTypeStage, ProfileStage, IsPayorStage, IsPayeeStage, _FinalStage {
        private AccountType accountType;

        private ProfileRequest profile;

        private boolean isPayor;

        private boolean isPayee;

        private Optional<String> logo = Optional.empty();

        private Optional<Boolean> ownedByOrg = Optional.empty();

        private Optional<List<String>> emailToAlias = Optional.empty();

        private Optional<String> emailTo = Optional.empty();

        private Optional<String> foreignId = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(EntityRequest other) {
            foreignId(other.getForeignId());
            emailTo(other.getEmailTo());
            emailToAlias(other.getEmailToAlias());
            ownedByOrg(other.getOwnedByOrg());
            accountType(other.getAccountType());
            profile(other.getProfile());
            isPayor(other.getIsPayor());
            isPayee(other.getIsPayee());
            logo(other.getLogo());
            return this;
        }

        @Override
        @JsonSetter("accountType")
        public ProfileStage accountType(AccountType accountType) {
            this.accountType = accountType;
            return this;
        }

        @Override
        @JsonSetter("profile")
        public IsPayorStage profile(ProfileRequest profile) {
            this.profile = profile;
            return this;
        }

        /**
         * <p>If this entity will be paying invoices, set this to true.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("isPayor")
        public IsPayeeStage isPayor(boolean isPayor) {
            this.isPayor = isPayor;
            return this;
        }

        /**
         * <p>If this entity will be receiving payments, set this to true.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("isPayee")
        public _FinalStage isPayee(boolean isPayee) {
            this.isPayee = isPayee;
            return this;
        }

        /**
         * <p>Base64 encoded PNG image data for the entity logo.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage logo(String logo) {
            this.logo = Optional.of(logo);
            return this;
        }

        @Override
        @JsonSetter(value = "logo", nulls = Nulls.SKIP)
        public _FinalStage logo(Optional<String> logo) {
            this.logo = logo;
            return this;
        }

        /**
         * <p>If this entity has a direct relationship with your organization, set this to true. Otherwise, set to false.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage ownedByOrg(Boolean ownedByOrg) {
            this.ownedByOrg = Optional.of(ownedByOrg);
            return this;
        }

        @Override
        @JsonSetter(value = "ownedByOrg", nulls = Nulls.SKIP)
        public _FinalStage ownedByOrg(Optional<Boolean> ownedByOrg) {
            this.ownedByOrg = ownedByOrg;
            return this;
        }

        /**
         * <p>Email inbox alias addresses. Used when forwarding emails to the emailTo address from an alias. Include the full email address.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage emailToAlias(List<String> emailToAlias) {
            this.emailToAlias = Optional.of(emailToAlias);
            return this;
        }

        @Override
        @JsonSetter(value = "emailToAlias", nulls = Nulls.SKIP)
        public _FinalStage emailToAlias(Optional<List<String>> emailToAlias) {
            this.emailToAlias = emailToAlias;
            return this;
        }

        /**
         * <p>Sets the email address to which to send invoices to be added to the Invoice Inbox. Only provide the local-part/username of the email address, do not include the @domain.com</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage emailTo(String emailTo) {
            this.emailTo = Optional.of(emailTo);
            return this;
        }

        @Override
        @JsonSetter(value = "emailTo", nulls = Nulls.SKIP)
        public _FinalStage emailTo(Optional<String> emailTo) {
            this.emailTo = emailTo;
            return this;
        }

        /**
         * <p>The ID used to identify this entity in your system. This ID must be unique across all entities in your system.</p>
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
        public EntityRequest build() {
            return new EntityRequest(
                    foreignId, emailTo, emailToAlias, ownedByOrg, accountType, profile, isPayor, isPayee, logo);
        }
    }
}
