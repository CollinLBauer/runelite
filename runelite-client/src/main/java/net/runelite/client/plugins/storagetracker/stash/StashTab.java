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
package net.runelite.client.plugins.storagetracker.stash;

import lombok.Getter;
import net.runelite.api.ItemID;

@Getter
public enum StashTab {

    BEGINNER("Beginner", ItemID.CLUE_SCROLL_BEGINNER),
    EASY("Easy", ItemID.CLUE_BOTTLE_EASY),
    MEDIUM("Medium", ItemID.CLUE_SCROLL_MEDIUM),
    HARD("Hard", ItemID.CLUE_SCROLL_HARD),
    ELITE("Elite", ItemID.CLUE_SCROLL_ELITE),
    MASTER("Master", ItemID.CLUE_SCROLL_MASTER);

    public static final StashTab[] STASH_TABS = {BEGINNER,EASY,MEDIUM,HARD,ELITE,MASTER};

    private final String name;
    private final int itemID;

    StashTab(String name, int itemID){
        this.name = name;
        this.itemID = itemID;
    }
}
