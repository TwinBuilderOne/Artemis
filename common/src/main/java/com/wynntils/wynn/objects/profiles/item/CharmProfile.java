/*
 * Copyright © Wynntils 2023.
 * This file is released under AGPLv3. See LICENSE for full license details.
 */
package com.wynntils.wynn.objects.profiles.item;

public class CharmProfile {
    private final String displayName;
    private final GearTier tier;

    private final String type;

    public CharmProfile(String displayName, GearTier tier, String type) {
        this.displayName = displayName;
        this.tier = tier;
        this.type = type;
    }

    public String getDisplayName() {
        return displayName;
    }

    public GearTier getTier() {
        return tier;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "CharmProfile{" + "displayName='" + displayName + "', tier=" + tier + ", type=" + type + '}';
    }
}