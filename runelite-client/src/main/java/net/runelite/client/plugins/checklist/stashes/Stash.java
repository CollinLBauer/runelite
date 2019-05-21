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
package net.runelite.client.plugins.checklist.stashes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.ItemID;

@RequiredArgsConstructor
@Getter
public enum Stash {

    /* Beginner stashes */
    Beg01 (
        34736,
        0,
        "bush",
        "Gypsy Aris' Tent",
        new int[] {ItemID.GOLD_RING, ItemID.GOLD_NECKLACE}
        ),

    Beg02 (
        34737,
        0,
        "bush",
        "Iffie Nitter's Shop in Varrock",
        new int[] {ItemID.CHEFS_HAT, ItemID.RED_CAPE}
    ),

    Beg03 (
        34738,
        0,
        "bush",
        "Bob's Brilliant Axes in Lumbridge",
        new int[] {ItemID.LEATHER_BOOTS, ItemID.BRONZE_AXE}
    ),


    /* Easy stashes */
    Eas01 (
        28958,
        1,
        "hole",
        "Outside the shack that leads to Zanaris in Lumbridge Swamp",
        new int[] {ItemID.BRONZE_DAGGER, ItemID.IRON_FULL_HELM,ItemID.GOLD_RING}
    );

    /* Medium stashes */

    /* Hard stashes */

    /* Elite stashes */

    /* Master stashes */


    /* STASH arrays */
    public static final Stash[] STASHES_BEGINNER  = {Beg01, Beg02, Beg03};
    public static final Stash[] STASHES_EASY      = {

    };
    public static final Stash[] STASHES_MEDIUM    = {

    };
    public static final Stash[] STASHES_HARD      = {

    };
    public static final Stash[] STASHES_ELITE     = {

    };
    public static final Stash[] STASHES_MASTER    = {};

    
    /* STASH variables */
    private final int stashID;          // game object ID; each STASH ID is unique
    private final int tier;             // beginner = 0, easy = 1, and so on
    private final String type;          // bush, crate, hole, rocks
    private final String description;   // as described in Watson's house
    private final int[] storedItems;
}

