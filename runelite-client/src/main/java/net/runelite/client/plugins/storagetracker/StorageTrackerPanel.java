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
package net.runelite.client.plugins.storagetracker;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.annotation.Nullable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import net.runelite.client.game.AsyncBufferedImage;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.components.materialtabs.MaterialTab;
import net.runelite.client.ui.components.materialtabs.MaterialTabGroup;

public class StorageTrackerPanel extends PluginPanel {

    private final ItemManager itemManager;
    private final StorageTrackerConfig config;

    /* This is the panel the tabs' respective panels will be displayed on. */
    private final JPanel display = new JPanel();
    private final Map<Tab, MaterialTab> uiTabs = new HashMap<>();
    private final MaterialTabGroup tabGroup = new MaterialTabGroup(display);

    private boolean active;

    @Nullable
    private TabPanel activeTabPanel = null;

    StorageTrackerPanel(ItemManager itemManager, StorageTrackerConfig config){
        super(false);

        this.itemManager = itemManager;
        this.config = config;

        setLayout(new BorderLayout());
        setBackground(new Color(56, 0, 56)); // This color is just so I know it works.

        display.setBorder(new EmptyBorder(10, 10, 8, 10));

        tabGroup.setLayout(new GridLayout(0, 6, 7, 7));
        tabGroup.setBorder(new EmptyBorder(10, 10, 0, 10));

        add(tabGroup,BorderLayout.NORTH);
        add(display,BorderLayout.CENTER);

        // quick band-aid to see if tabs work
        for (Tab tab : Tab.TABS){
            addTab(tab);
        }
}

    private void addTab(Tab tab) {

        JPanel wrapped = new JPanel(new BorderLayout());
        wrapped.add(tab.getPanel(), BorderLayout.NORTH);
        wrapped.setBackground(ColorScheme.DARK_GRAY_COLOR);

        JScrollPane scroller = new JScrollPane(wrapped);
        scroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroller.getVerticalScrollBar().setPreferredSize(new Dimension(16, 0));
        scroller.getVerticalScrollBar().setBorder(new EmptyBorder(0, 9, 0, 0));
        scroller.setBackground(ColorScheme.DARK_GRAY_COLOR);

        // Use a placeholder icon until the async image gets loaded
        MaterialTab materialTab = new MaterialTab(new ImageIcon(), tabGroup, scroller);
        materialTab.setPreferredSize(new Dimension(30, 27));
        materialTab.setName(tab.getName());
        materialTab.setToolTipText(tab.getName());

        AsyncBufferedImage icon = itemManager.getImage(tab.getItemID());

        Runnable resize = () -> {
            BufferedImage subIcon = icon.getSubimage(0, 0, 32, 32);
            materialTab.setIcon(new ImageIcon(subIcon.getScaledInstance(24, 24, Image.SCALE_SMOOTH)));
        };

        icon.onChanged(resize);
        resize.run();

        materialTab.setOnSelectEvent(() -> {
            config.setActiveTab(tab);
            activeTabPanel = tab.getPanel();

            tab.getPanel().update();
            return true;
        });

        uiTabs.put(tab, materialTab);
        tabGroup.addTab(materialTab);

        if (config.activeTab() == tab) {
            tabGroup.select(materialTab);
        }
    }
}
