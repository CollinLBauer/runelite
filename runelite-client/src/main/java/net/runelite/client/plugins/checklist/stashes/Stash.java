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
import net.runelite.api.NullObjectID;
import net.runelite.api.ItemID;
import net.runelite.api.coords.WorldPoint;

@Getter
public enum Stash {

    /* Beginner stashes */
    Beg01 (
        NullObjectID.NULL_34736,
        0,
        0, // bush
        "Gypsy Aris' Tent", // Varrock Square
        new int[] {ItemID.GOLD_RING, ItemID.GOLD_NECKLACE},
        new WorldPoint(3206,3422,0)
        ),

    Beg02 (
        NullObjectID.NULL_34737,
        0,
        0, // bush
        "Iffie Nitter in Varrock", // Varrock Square
        new int[] {ItemID.CHEFS_HAT, ItemID.RED_CAPE},
        new WorldPoint(3209,3416,0)
    ),

    Beg03 (
        NullObjectID.NULL_34738,
        0,
        0, // bush
        "Bob's Brilliant Axes in Lumbridge",
        new int[] {ItemID.LEATHER_BOOTS, ItemID.BRONZE_AXE},
        new WorldPoint(3233, 3200, 0)
    ),


    /* Easy stashes */
    Eas01 (
        NullObjectID.NULL_28958,
        1,
        2, // hole
        "Near a shed in Lumbridge Swamp", // shed to Zanaris
        new int[] {ItemID.BRONZE_DAGGER, ItemID.IRON_FULL_HELM, ItemID.GOLD_RING},
        new WorldPoint(3201, 3171, 0)
    ),

    Eas02 (
        NullObjectID.NULL_28959,
        1,
        1, // crate
        "On the bridge to the Misthalin's Wizard's Tower",
        new int[] {ItemID.IRON_MED_HELM, ItemID.EMERALD_RING, ItemID.WHITE_APRON},
        new WorldPoint(3115, 3194, 1)
    ),

    Eas03 (
        NullObjectID.NULL_28960,
        1,
        2, // hole
        "Draynor Village market", // behind Fortunado
        new int[] {ItemID.STUDDED_CHAPS, ItemID.IRON_KITESHIELD, ItemID.STEEL_LONGSWORD},
        new WorldPoint(3083, 3254, 0)
    ),

    Eas04 (
        NullObjectID.NULL_28961,
        1,
        3, // rocks
        "Limestone mine", // East of Varrock
        new int[] {ItemID.BRONZE_PLATELEGS, ItemID.STEEL_PICKAXE, ItemID.STEEL_MED_HELM},
        new WorldPoint(3373, 3498, 0)
    ),

    Eas05 (
        NullObjectID.NULL_28962,
        1,
        0, // bush
        "Outside the Legends' Guild gates",
        new int[] {ItemID.IRON_PLATELEGS, ItemID.EMERALD_AMULET, ItemID.OAK_LONGBOW},
        new WorldPoint(2735, 3350, 0)
    ),

    Eas06 (
        NullObjectID.NULL_28963,
        1,
        2, // hole
        "Mudskipper Point",
        new int[] {ItemID.BLACK_CAPE, ItemID.LEATHER_CHAPS, ItemID.STEEL_MACE},
        new WorldPoint(2988, 3111, 0)
    ),

    Eas07 (
        NullObjectID.NULL_28964,
        1,
        1, // crate
        "Near the Entrana ferry in Port Sarim",
        new int[] {ItemID.COIF, ItemID.STEEL_PLATESKIRT, ItemID.SAPPHIRE_NECKLACE},
        new WorldPoint(3050, 3237, 1)
    ),

    Eas08 (
        NullObjectID.NULL_28965,
        1,
        3, // rocks
        "Al Kharid scorpion mine",
        new int[] {ItemID.DESERT_SHIRT, ItemID.LEATHER_GLOVES, ItemID.LEATHER_BOOTS},
        new WorldPoint(3303, 3289, 0)
    ),

    Eas09 (
        // unknown
        0,
        1,
        3, //rocks,
        "Draynor Manor by the fountain",
        new int[] {ItemID.IRON_PLATEBODY, ItemID.STUDDED_CHAPS, ItemID.BRONZE_FULL_HELM}
    ),

    Eas10 (
        // unknown
        0,
        1,
        2, // hole
        "Wheat field near the Lumbridge windmill",
        new int[] {ItemID.BLUE_ROBE_TOP, ItemID.TURQUOISE_ROBE_BOTTOMS, ItemID.OAK_SHORTBOW}
    ),

    Eas11 (
        // unknown
        0,
        1,
        0, // bush
        "Crossroads north of Draynor Village",
        new int[] {ItemID.IRON_CHAINBODY, ItemID.SAPPHIRE_RING, ItemID.LONGBOW}
    ),

    Eas12 (
        // unknown
        0,
        1,
        3, // rocks
        "Rimmington mine",
        new int[] {ItemID.GOLD_NECKLACE, ItemID.GOLD_RING, ItemID.BRONZE_SPEAR}
    ),

    Eas13 (
        // unknown
        0,
        1,
        1, // crate
        "Varrock Palace Library",
        new int[] {ItemID.GREEN_ROBE_TOP, ItemID.HAM_ROBE, ItemID.IRON_WARHAMMER}
    ),

    Eas14 (
        // unknown
        0,
        1,
        1, // crate
        "Upstairs in the Ardougne windmill",
        new int[] {ItemID.BLUE_ROBE_TOP, ItemID.HAM_ROBE, ItemID.TIARA}
    ),

    Eas15 (
        // unknown
        0,
        1,
        0, // bush
        "Outside the Falador Party Room",
        new int[] {ItemID.STEEL_FULL_HELM, ItemID.STEEL_PLATEBODY, ItemID.IRON_PLATESKIRT}
    ),

    Eas16 (
        // unknown
        0,
        1,
        3, // rocks
        "Taverly Stone Circle",
        new int[] {ItemID.BLUE_WIZARD_HAT, ItemID.BRONZE_2H_SWORD}
    ),

    Eas17 (
        // unknown
        0,
        1,
        0, // bush
        "Catherby beehive field",
        new int[] {ItemID.DESERT_SHIRT, ItemID.GREEN_ROBE_BOTTOMS, ItemID.STEEL_AXE}
    ),

    Eas18 (
        // unknown
        0,
        1,
        0, // bush
        "Near the parrots in Ardougne Zoo",
        new int[] {ItemID.STUDDED_BODY, ItemID.BRONZE_PLATELEGS, ItemID.STAFF}
    ),

    Eas19 (
        // unknown
        0,
        1,
        3, // rocks
        "Road junction north of Rimmington",
        new int[] {ItemID.GREEN_HAT, ItemID.CREAM_ROBE_TOP, ItemID.LEATHER_CHAPS}
    ),

    Eas20 (
        // unknown
        0,
        1,
        2, // hole
        "Outside of the Fishing Guild",
        new int[] {ItemID.EMERALD_RING, ItemID.SAPPHIRE_AMULET, ItemID.BRONZE_CHAINBODY}
    ),

    Eas21 (
        // 2756, 3399, 0
        NullObjectID.NULL_28978,
        1,
        2, // hole
        "Outside Keep Le Faye", // north of Legends' Guild
        new int[] {ItemID.COIF, ItemID.IRON_PLATEBODY, ItemID.LEATHER_GLOVES}
    ),

    Eas22 (
        // 2735, 3534, 0
        NullObjectID.NULL_28979,
        1,
        3, // rocks
        "South of Sinclair Mansion",
        new int[] {ItemID.LEATHER_COWL, ItemID.BLUE_WIZARD_ROBE, ItemID.IRON_SCIMITAR}
    ),

    Eas23 (
        // unknown
        0,
        1,
        0, // bush
        "Outside the Digsite Exam Centre",
        new int[] {ItemID.WHITE_APRON, ItemID.GREEN_BOOTS, ItemID.LEATHER_GLOVES}
    ),

    Eas24 (
        // 3298, 3490, 0
        NullObjectID.NULL_28981,
        1,
        0, // bush
        "Near the Sawmill Operator's booth", // Varrock lumber yard
        new int[] {ItemID.HARDLEATHER_BODY, ItemID.LEATHER_CHAPS, ItemID.BRONZE_AXE}
    ),

    Eas25 (
        // unknown
        0,
        1,
        1, // crate
        "Mubariz's room at the Dual Arena",
        new int[] {ItemID.IRON_CHAINBODY, ItemID.LEATHER_CHAPS, ItemID.COIF}
    ),

    Eas26 (
        // unknown
        0,
        1,
        0, // bush
        "Outside Varrock Palace courtyard",
        new int[] {ItemID.BLACK_AXE, ItemID.COIF, ItemID.RUBY_RING}
    ),

    Eas27 (
        // unknown
        0,
        1,
        0, // bush
        "Near Herquin's shop in Falador", // gem store
        new int[] {ItemID.MITHRIL_PICKAXE, ItemID.BLACK_PLATEBODY, ItemID.IRON_KITESHIELD}
    ),

    Eas28 (
        // unknown
        0,
        1,
        0, // bush
        "South of the Grand Exchange",
        new int[] {ItemID.PINK_SKIRT, ItemID.PINK_ROBE_TOP}
    ),

    Eas29 (
        // unknown
        0,
        1,
        1, // crate
        "Aubury's shop in Varrock",
        new int[] {ItemID.AIR_TIARA, ItemID.STAFF_OF_WATER}
    ),


    /* Medium stashes */
    Med01 (
        // 3491, 3489, 0
        NullObjectID.NULL_28987,
        2,
        3, // rocks
        "Center of Canifis",
        new int[] {ItemID.MITHRIL_PLATELEGS, ItemID.GREEN_ROBE_TOP, ItemID.IRON_2H_SWORD}
    ),

    Med02 (
        // 2603, 3091, 0
        28994,
        2,
        3, // rocks
        "In front of Yanille bank",
        new int[] {}
    ),

    Med03 (
        // 2825, 3441, 0
        NullObjectID.NULL_28998,
        2,
        -1,
        "Inside Catherby ranging store",
        new int[] {}
    ),

    Med04 (
        // 2807, 3437, 0
        NullObjectID.NULL_29001,
        2,
        0, // bush
        "In front of Catherby bank",
        new int[] {ItemID.MAPLE_LONGBOW, ItemID.GREEN_DHIDE_CHAPS, ItemID.IRON_MED_HELM}
    ),

    Med05 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med06 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med07 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med08 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med09 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med10 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med11 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med12 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med13 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med14 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med15 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med16 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med17 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med18 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med19 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med20 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med21 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med22 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),

    Med23 (
        // unknown
        0,
        2,
        -1,
        "",
        new int[] {}
    ),


    /* Hard stashes */
    Har01 (
        // unknown
        0,
        3,
        -1,
        "",
        new int[] {}
    ),

    Har02 (
        // unknown
        0,
        3,
        -1,
        "",
        new int[] {}
    ),

    Har03 (
        // unknown
        0,
        3,
        -1,
        "",
        new int[] {}
    ),

    Har04 (
        // unknown
        0,
        3,
        -1,
        "",
        new int[] {}
    ),

    Har05 (
        // unknown
        0,
        3,
        -1,
        "",
        new int[] {}
    ),

    Har06 (
        // unknown
        0,
        3,
        -1,
        "",
        new int[] {}
    ),

    Har07 (
        // unknown
        0,
        3,
        -1,
        "",
        new int[] {}
    ),

    Har08 (
        // unknown
        0,
        3,
        -1,
        "",
        new int[] {}
    ),

    Har09 (
        // unknown
        0,
        3,
        -1,
        "",
        new int[] {}
    ),

    Har10 (
        // unknown
        0,
        3,
        -1,
        "",
        new int[] {}
    ),

    Har11 (
        // unknown
        0,
        3,
        -1,
        "",
        new int[] {}
    ),

    Har12 (
        // unknown
        0,
        3,
        -1,
        "",
        new int[] {}
    ),

    Har13 (
        // unknown
        0,
        3,
        -1,
        "",
        new int[] {}
    ),

    Har14 (
        // unknown
        0,
        3,
        -1,
        "",
        new int[] {}
    ),

    Har15 (
        // unknown
        0,
        3,
        -1,
        "",
        new int[] {}
    ),


    /* Elite stashes */
    Eli01 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),

    Eli02 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),

    Eli03 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),

    Eli04 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),

    Eli05 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),

    Eli06 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),

    Eli07 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),

    Eli08 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),

    Eli09 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),

    Eli10 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),

    Eli11 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),

    Eli12 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),

    Eli13 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),

    Eli14 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),

    Eli15 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),

    Eli16 (
        // unknown
        0,
        4,
        -1,
        "",
        new int[] {}
    ),


    /* Master stashes */
    Mas01 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas02 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas03 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas04 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas05 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas06 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas07 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas08 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas09 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas10 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas11 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas12 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas13 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas14 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas15 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas16 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas17 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas18 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas19 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas20 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    ),

    Mas21 (
        // unknown
        0,
        5,
        -1,
        "",
        new int[] {}
    );


    /* STASH arrays */
    public static final Stash[] STASHES_BEGINNER  = {Beg01, Beg02, Beg03};

    public static final Stash[] STASHES_EASY      = {Eas01, Eas02, Eas03, Eas04, Eas05, Eas06, Eas07, Eas08, Eas09,
        Eas10, Eas11, Eas12, Eas13, Eas14, Eas15, Eas16, Eas17, Eas18, Eas19, Eas20, Eas21, Eas22, Eas23, Eas24,
        Eas25, Eas26, Eas27, Eas28, Eas29};

    public static final Stash[] STASHES_MEDIUM    = {Med01, Med02, Med03, Med04, Med05, Med06, Med07, Med08, Med09,
        Med10, Med11, Med12, Med13, Med14, Med15, Med16, Med17, Med18, Med19, Med20, Med21, Med22, Med23};

    public static final Stash[] STASHES_HARD      = {Har01, Har02, Har03, Har04, Har05, Har06, Har07, Har08, Har09,
        Har10, Har11, Har12, Har13, Har14, Har15};

    public static final Stash[] STASHES_ELITE     = {Eli01, Eli02, Eli03, Eli04, Eli05, Eli06, Eli07, Eli08, Eli09,
        Eli10, Eli11, Eli12, Eli13, Eli14, Eli15, Eli16};

    public static final Stash[] STASHES_MASTER    = {Mas01, Mas02, Mas03, Mas04, Mas05, Mas06, Mas07, Mas08, Mas09,
        Mas10, Mas11, Mas12, Mas13, Mas14, Mas15, Mas16, Mas17, Mas18, Mas19, Mas20, Mas21};


    /* STASH variables */

    private final int stashID;
    private final WorldPoint[] worldPoints;
    private final int tier;                 // 0 = beginner, 1 = easy, and so on
    private final int type;                 // 0 = bush, 1 = crate, 2 = hole, 3 = rocks
    private final String description;       // as described in Watson's house
    private final int[] storedItems;

    
    Stash(int stashID, int tier, int type, String description, int[] storedItems, WorldPoint... worldPoints){
        this.stashID = stashID;
        this.tier = tier;
        this.type = type;
        this.description = description;
        this.storedItems = storedItems;
        this.worldPoints = worldPoints;
    }
    
    /* Notes...
     * - commented numbers are in-game co-ordinates

    private final int stashID;          // game object ID
    private final int tier;             // beginner = 0, easy = 1, and so on
    private final String type;          // bush, crate, hole, rocks
    private final String location;   // as described in Watson's house
    private final int[] storedItems;

    /* Notes...
     * - commented numbers are in-game co-ordinates
     * - order is based on noticeboard in Watson's house
     *   (order still needs to be verified)

     * - descriptions still need to be verified
     */
}