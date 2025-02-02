/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entitytypes.types;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

public interface IEntityResponse {
    String getId();

    String getName();

    String getEmail();

    Optional<String> getForeignId();

    Optional<String> getEmailTo();

    Optional<List<String>> getEmailToAlias();

    boolean getIsCustomer();

    AccountType getAccountType();

    ProfileResponse getProfile();

    EntityStatus getStatus();

    boolean getAcceptedTos();

    boolean getIsPayor();

    boolean getIsPayee();

    boolean getOwnedByOrg();

    OffsetDateTime getCreatedAt();

    OffsetDateTime getUpdatedAt();
}
