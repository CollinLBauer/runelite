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

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.components.materialtabs.MaterialTab;
import net.runelite.client.ui.components.materialtabs.MaterialTabGroup;

public class ChecklistPanel extends PluginPanel{

    private final ChecklistConfig config;

    /* This is the panel the tabs' respective panels will be displayed on. */
    private final JPanel display = new JPanel();
    private final Map<Tab, MaterialTab> uiTabs = new HashMap<>();
    private final MaterialTabGroup tabGroup = new MaterialTabGroup(display);

    ChecklistPanel(ChecklistConfig config){
        super(false);

        this.config = config;

        setLayout(new BorderLayout());
        setBackground(new Color(56, 0, 56)); // This color is just so I know it works.

        display.setBorder(new EmptyBorder(10, 10, 8, 10));

        tabGroup.setLayout(new GridLayout(0, 6, 7, 7));
        tabGroup.setBorder(new EmptyBorder(10, 10, 0, 10));

        add(tabGroup,BorderLayout.NORTH);
        add(display,BorderLayout.CENTER);

        /*
        for (Tab tab : Tab.TABS){
            addTab(tab);
        }
        */
    }

    private void addTab(Tab tab, TabContentPanel tabContentPanel){
        JPanel wrapped = new JPanel(new BorderLayout());
        //wrapped.add(tabContentPanel, BorderLayout.NORTH);
        wrapped.setBackground(ColorScheme.DARK_GRAY_COLOR);
    }
}
