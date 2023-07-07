/*
 * Copyright © Wynntils 2022.
 * This file is released under AGPLv3. See LICENSE for full license details.
 */
package com.wynntils.models.content.event;

import com.wynntils.core.text.StyledText;
import net.minecraftforge.eventbus.api.Event;

public class ContentTrackerUpdatedEvent extends Event {
    private final String type;
    private final String name;
    private final StyledText task;

    public ContentTrackerUpdatedEvent(String type, String name, StyledText task) {
        this.type = type;
        this.name = name;
        this.task = task;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public StyledText getTask() {
        return task;
    }
}