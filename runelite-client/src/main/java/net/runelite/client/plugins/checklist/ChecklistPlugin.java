/*
 * Copyright (c) 2019, Collin Bauer <https://github.com/CollinLBauer>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.checklist;

import javax.inject.Inject;

import com.google.inject.Provides;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;

import java.awt.image.BufferedImage;

@PluginDescriptor(
    name = "Checklist",
    description = "Keeps track of certain non-repeatable tasks not otherwise tracked in-game",
    tags = {"list", "collection", "stash", "clue", "log", "fossil", "kudos", "poh", "house"},
    loadWhenOutdated = true,
    enabledByDefault = false
)

public class ChecklistPlugin extends Plugin {


    @Inject
    private ClientToolbar clientToolbar;

    @Inject
    private ChecklistConfig config;

    private ChecklistPanel panel;
    private NavigationButton navButton;

    @Provides
    ChecklistConfig provideConfig(ConfigManager configManager)
    {
        return configManager.getConfig(ChecklistConfig.class);
    }

    @Override
    protected void startUp(){
        //borrowing  code from NotesPlugin for example
        panel = new ChecklistPanel(config);


        final BufferedImage icon = ImageUtil.getResourceStreamFromClass(getClass(), "checklist_icon.png");

        navButton = NavigationButton.builder()
            .tooltip("Checklist")
            .icon(icon)
            .priority(7)
            .panel(panel)
            .build();

        clientToolbar.addNavigation(navButton);
    }

    @Override
    protected void shutDown(){
        clientToolbar.removeNavigation(navButton);
    }
}
