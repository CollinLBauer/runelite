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

import lombok.Getter;
import net.runelite.api.ItemID;
import net.runelite.client.plugins.storagetracker.costume.CostumePanel;
import net.runelite.client.plugins.storagetracker.fossil.FossilPanel;
import net.runelite.client.plugins.storagetracker.leprechaun.LeprechaunPanel;
import net.runelite.client.plugins.storagetracker.overview.OverviewPanel;
import net.runelite.client.plugins.storagetracker.stash.StashPanel;

@Getter
public enum Tab {

    OVERVIEW(new OverviewPanel(),"Overview", ItemID.OLD_NOTES),
    LEPRECHAUN(new LeprechaunPanel(),"Tool Leprechaun", ItemID.MAGIC_SECATEURS),
    COSTUME(new CostumePanel(), "Costume Room", ItemID.MAHOGANY_ARMOUR_CASE),
    STASH(new StashPanel(),"STASH units", ItemID.STASH_UNITS_EASY),
    FOSSIL(new FossilPanel(),"Fossil Island", ItemID.UNIDENTIFIED_RARE_FOSSIL);


    public static final Tab[] TABS = {OVERVIEW,LEPRECHAUN,STASH,COSTUME,FOSSIL};

    private final TabPanel panel;
    private final String name;
    private final int itemID;

    Tab(TabPanel panel, String name, int itemID){
        this.panel = panel;
        this.name = name;
        this.itemID = itemID;
    }
}
