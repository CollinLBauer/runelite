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
import net.runelite.api.NullObjectID;
import net.runelite.api.ItemID;
import net.runelite.api.coords.WorldPoint;

@Getter
public enum Stash {

    /* Beginner stash */
    Beg01 (
        NullObjectID.NULL_34736,
        ClueTier.BEGINNER,
        StashType.BUSH,
        "Gypsy Aris' Tent", // Varrock Square
        new int[] {ItemID.GOLD_RING, ItemID.GOLD_NECKLACE},
        new WorldPoint(3206,3422,0)
        ),

    Beg02 (
        NullObjectID.NULL_34737,
        ClueTier.BEGINNER,
        StashType.BUSH,
        "Iffie Nitter in Varrock", // Varrock Square
        new int[] {ItemID.CHEFS_HAT, ItemID.RED_CAPE},
        new WorldPoint(3209,3416,0)
    ),

    Beg03 (
        NullObjectID.NULL_34738,
        ClueTier.BEGINNER,
        StashType.BUSH,
        "Bob's Brilliant Axes in Lumbridge",
        new int[] {ItemID.LEATHER_BOOTS, ItemID.BRONZE_AXE},
        new WorldPoint(3233, 3200, 0)
    ),


    /* Easy stash */
    Eas01 (
        NullObjectID.NULL_28958,
        ClueTier.EASY,
        StashType.HOLE,
        "Near a shed in Lumbridge Swamp", // shed to Zanaris
        new int[] {ItemID.BRONZE_DAGGER, ItemID.IRON_FULL_HELM, ItemID.GOLD_RING},
        new WorldPoint(3201, 3171, 0)
    ),

    Eas02 (
        NullObjectID.NULL_28959,
        ClueTier.EASY,
        StashType.CRATE,
        "On the bridge to the Misthalin's Wizard's Tower",
        new int[] {ItemID.IRON_MED_HELM, ItemID.EMERALD_RING, ItemID.WHITE_APRON},
        new WorldPoint(3115, 3194, 1)
    ),

    Eas03 (
        NullObjectID.NULL_28960,
        ClueTier.EASY,
        StashType.HOLE,
        "Draynor Village market", // behind Fortunado
        new int[] {ItemID.STUDDED_CHAPS, ItemID.IRON_KITESHIELD, ItemID.STEEL_LONGSWORD},
        new WorldPoint(3083, 3254, 0)
    ),

    Eas04 (
        NullObjectID.NULL_28961,
        ClueTier.EASY,
        StashType.ROCKS,
        "Limestone mine", // East of Varrock
        new int[] {ItemID.BRONZE_PLATELEGS, ItemID.STEEL_PICKAXE, ItemID.STEEL_MED_HELM},
        new WorldPoint(3373, 3498, 0)
    ),

    Eas05 (
        NullObjectID.NULL_28962,
        ClueTier.EASY,
        StashType.BUSH,
        "Outside the Legends' Guild gates",
        new int[] {ItemID.IRON_PLATELEGS, ItemID.EMERALD_AMULET, ItemID.OAK_LONGBOW},
        new WorldPoint(2735, 3350, 0)
    ),

    Eas06 (
        NullObjectID.NULL_28963,
        ClueTier.EASY,
        StashType.HOLE,
        "Mudskipper Point",
        new int[] {ItemID.BLACK_CAPE, ItemID.LEATHER_CHAPS, ItemID.STEEL_MACE},
        new WorldPoint(2988, 3111, 0)
    ),

    Eas07 (
        NullObjectID.NULL_28964,
        ClueTier.EASY,
        StashType.CRATE,
        "Near the Entrana ferry in Port Sarim",
        new int[] {ItemID.COIF, ItemID.STEEL_PLATESKIRT, ItemID.SAPPHIRE_NECKLACE},
        new WorldPoint(3050, 3237, 1)
    ),

    Eas08 (
        NullObjectID.NULL_28965,
        ClueTier.EASY,
        StashType.ROCKS,
        "Al Kharid scorpion mine",
        new int[] {ItemID.DESERT_SHIRT, ItemID.LEATHER_GLOVES, ItemID.LEATHER_BOOTS},
        new WorldPoint(3303, 3289, 0)
    ),

    Eas09 (
        NullObjectID.NULL_28966,
        ClueTier.EASY,
        3, //rocks,
        "Draynor Manor by the fountain",
        new int[] {ItemID.IRON_PLATEBODY, ItemID.STUDDED_CHAPS, ItemID.BRONZE_FULL_HELM},
        new WorldPoint(3089, 3331, 0)
    ),

    Eas10 (
        NullObjectID.NULL_28967,
        ClueTier.EASY,
        StashType.HOLE,
        "Wheat field near the Lumbridge windmill",
        new int[] {ItemID.BLUE_ROBE_TOP, ItemID.TURQUOISE_ROBE_BOTTOMS, ItemID.OAK_SHORTBOW},
        new WorldPoint(3163, 3297, 0)
    ),

    Eas11 (
        NullObjectID.NULL_28968,
        ClueTier.EASY,
        StashType.BUSH,
        "Crossroads north of Draynor Village",
        new int[] {ItemID.IRON_CHAINBODY, ItemID.SAPPHIRE_RING, ItemID.LONGBOW},
        new WorldPoint(3111, 3289, 0)
    ),

    Eas12 (
        NullObjectID.NULL_28969,
        ClueTier.EASY,
        StashType.ROCKS,
        "Rimmington mine",
        new int[] {ItemID.GOLD_NECKLACE, ItemID.GOLD_RING, ItemID.BRONZE_SPEAR},
        new WorldPoint(2976, 3239, 0)
    ),

    Eas13 (
        NullObjectID.NULL_28970,
        ClueTier.EASY,
        StashType.CRATE,
        "Varrock Palace Library",
        new int[] {ItemID.GREEN_ROBE_TOP, ItemID.HAM_ROBE, ItemID.IRON_WARHAMMER},
        new WorldPoint(3214, 3490, 0)
    ),

    Eas14 (
        NullObjectID.NULL_28971,
        ClueTier.EASY,
        StashType.CRATE,
        "Upstairs in the Ardougne windmill",
        new int[] {ItemID.BLUE_ROBE_TOP, ItemID.HAM_ROBE, ItemID.TIARA},
        new WorldPoint(2635, 3386, 2)
    ),

    Eas15 (
        NullObjectID.NULL_28972,
        ClueTier.EASY,
        StashType.BUSH,
        "Outside the Falador Party Room",
        new int[] {ItemID.STEEL_FULL_HELM, ItemID.STEEL_PLATEBODY, ItemID.IRON_PLATESKIRT},
        new WorldPoint(3043, 3371, 0)
    ),

    Eas16 (
        NullObjectID.NULL_28973,
        ClueTier.EASY,
        StashType.ROCKS,
        "Taverly Stone Circle",
        new int[] {ItemID.BLUE_WIZARD_HAT, ItemID.BRONZE_2H_SWORD},
        new WorldPoint(2924, 3477, 0)
    ),

    Eas17 (
        NullObjectID.NULL_28974,
        ClueTier.EASY,
        StashType.BUSH,
        "Catherby beehive field",
        new int[] {ItemID.DESERT_SHIRT, ItemID.GREEN_ROBE_BOTTOMS, ItemID.STEEL_AXE},
        new WorldPoint(2764, 3438, 0)
    ),

    Eas18 (
        NullObjectID.NULL_28975,
        ClueTier.EASY,
        StashType.BUSH,
        "Near the parrots in Ardougne Zoo",
        new int[] {ItemID.STUDDED_BODY, ItemID.BRONZE_PLATELEGS, ItemID.STAFF},
        new WorldPoint(2608, 3284, 0)
    ),

    Eas19 (
        NullObjectID.NULL_28976,
        ClueTier.EASY,
        StashType.ROCKS,
        "Road junction north of Rimmington",
        new int[] {ItemID.GREEN_HAT, ItemID.CREAM_ROBE_TOP, ItemID.LEATHER_CHAPS},
        new WorldPoint(2981, 3278, 0)
    ),

    Eas20 (
        NullObjectID.NULL_28977,
        ClueTier.EASY,
        StashType.HOLE,
        "Outside of the Fishing Guild",
        new int[] {ItemID.EMERALD_RING, ItemID.SAPPHIRE_AMULET, ItemID.BRONZE_CHAINBODY},
        new WorldPoint(2608, 3393, 0)
    ),

    Eas21 (
        NullObjectID.NULL_28978,
        ClueTier.EASY,
        StashType.HOLE,
        "Outside Keep Le Faye", // north of Legends' Guild
        new int[] {ItemID.COIF, ItemID.IRON_PLATEBODY, ItemID.LEATHER_GLOVES},
        new WorldPoint(2756, 3399, 0)
    ),

    Eas22 (
        NullObjectID.NULL_28979,
        ClueTier.EASY,
        StashType.ROCKS,
        "South of Sinclair Mansion",
        new int[] {ItemID.LEATHER_COWL, ItemID.BLUE_WIZARD_ROBE, ItemID.IRON_SCIMITAR},
        new WorldPoint(2735, 3534, 0)
    ),

    Eas23 (
        NullObjectID.NULL_28980,
        ClueTier.EASY,
        StashType.BUSH,
        "Outside the Digsite Exam Centre",
        new int[] {ItemID.WHITE_APRON, ItemID.GREEN_BOOTS, ItemID.LEATHER_GLOVES},
        new WorldPoint(3353, 3343, 0)
    ),

    Eas24 (
        NullObjectID.NULL_28981,
        ClueTier.EASY,
        StashType.BUSH,
        "Near the Sawmill Operator's booth", // Varrock lumber yard
        new int[] {ItemID.HARDLEATHER_BODY, ItemID.LEATHER_CHAPS, ItemID.BRONZE_AXE},
        new WorldPoint(3298, 3490, 0)
    ),

    Eas25 (
        NullObjectID.NULL_28982,
        ClueTier.EASY,
        StashType.CRATE,
        "Mubariz's room at the Dual Arena",
        new int[] {ItemID.IRON_CHAINBODY, ItemID.LEATHER_CHAPS, ItemID.COIF},
        new WorldPoint(3316, 3242, 0)
    ),

    Eas26 (
        NullObjectID.NULL_28983,
        ClueTier.EASY,
        StashType.BUSH,
        "Outside Varrock Palace courtyard",
        new int[] {ItemID.BLACK_AXE, ItemID.COIF, ItemID.RUBY_RING},
        new WorldPoint(3211, 3456, 0)
    ),

    Eas27 (
        NullObjectID.NULL_28984,
        ClueTier.EASY,
        StashType.BUSH,
        "Near Herquin's shop in Falador", // gem store
        new int[] {ItemID.MITHRIL_PICKAXE, ItemID.BLACK_PLATEBODY, ItemID.IRON_KITESHIELD},
        new WorldPoint(2941, 3339, 0)
    ),

    Eas28 (
        NullObjectID.NULL_28985,
        ClueTier.EASY,
        StashType.BUSH,
        "South of the Grand Exchange",
        new int[] {ItemID.PINK_SKIRT, ItemID.PINK_ROBE_TOP},
        new WorldPoint(3159, 3464, 0)
    ),

    Eas29 (
        NullObjectID.NULL_28986,
        ClueTier.EASY,
        StashType.CRATE,
        "Aubury's shop in Varrock",
        new int[] {ItemID.AIR_TIARA, ItemID.STAFF_OF_WATER},
        new WorldPoint(3252, 3404, 0)
    ),


    /* Medium stash */
    Med01 (
        NullObjectID.NULL_28987,
        ClueTier.MEDIUM,
        StashType.ROCKS,
        "Center of Canifis",
        new int[] {ItemID.MITHRIL_PLATELEGS, ItemID.GREEN_ROBE_TOP, ItemID.IRON_2H_SWORD}
    ),

    Med02 (
        NullObjectID.NULL_28988,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "Masoleum off the Morytania Coast",
        new int[] {},
        new WorldPoint(3500, 3575, 0)
    ),

    Med03 (
        NullObjectID.NULL_28989,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "Ease of the Barbarian Village bridge",
        new int[] {},
        new WorldPoint(3110, 3422, 0)
    ),

    Med04 (
        NullObjectID.NULL_28990,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "South of the shrine in Tai Bwo Wannai Village",
        new int[] {},
        new WorldPoint(2802, 3081, 0)
    ),

    Med05 (
        NullObjectID.NULL_28991,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "Castle Wars Bank",
        new int[] {},
        new WorldPoint(2444, 3093, 0)
    ),

    Med06 (
        NullObjectID.NULL_28992,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "Barbarian Outpost obstacle course",
        new int[] {},
        new WorldPoint(2541, 3550, 0)

    ),

    Med07 (
        NullObjectID.NULL_28993,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "Gnome Stronghold balancing rope",
        new int[] {},
        new WorldPoint(2473, 3418, 2)
    ),

    Med08 (
        NullObjectID.NULL_28994,
        ClueTier.MEDIUM,
        StashType.ROCKS,
        "Outside Yanille bank",
        new int[] {},
        new WorldPoint(2603, 3091, 0)
    ),

    Med09 (
        NullObjectID.NULL_28995,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "Observatory",
        new int[] {},
        new WorldPoint(2439, 3166, 0)
    ),

    Med10 (
        NullObjectID.NULL_28996,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "Ogre cage in King Lathas' training camp",
        new int[] {},
        new WorldPoint(2533, 3377, 0)
    ),

    Med11 (
        NullObjectID.NULL_28997,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "Digsite",
        new int[] {},
        new WorldPoint(3370, 3420, 0)
    ),

    Med12 (
        NullObjectID.NULL_28998,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "Hickerton's Archery Emporium", // Catherby
        new int[] {},
        new WorldPoint(2825, 3441, 0)
    ),

    Med13 (
        NullObjectID.NULL_28999,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "Shantay Pass",
        new int[] {},
        new WorldPoint(3308, 3125, 0)
    ),

    Med14 (
        NullObjectID.NULL_29000,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "Lumbridge Swamp Caves",
        new int[] {},
        new WorldPoint(3222, 9584, 0), new WorldPoint(3167, 9570, 0)
    ),

    Med15 (
        NullObjectID.NULL_29001,
        ClueTier.MEDIUM,
        StashType.BUSH,
        "Outside Catherby Bank",
        new int[] {ItemID.MAPLE_LONGBOW, ItemID.GREEN_DHIDE_CHAPS, ItemID.IRON_MED_HELM},
        new WorldPoint(2807, 3437, 0)
    ),

    Med16 (
        NullObjectID.NULL_29002,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "Outside the Seers' Village courthouse",
        new int[] {},
        new WorldPoint(2731, 3475, 0)
    ),

    Med17 (
        NullObjectID.NULL_29003,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "Outside Harry's Fishing Shop in Catherby",
        new int[] {},
        new WorldPoint(2837, 3436, 0)
    ),

    Med18 (
        NullObjectID.NULL_29004,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "TzHaar weapons store",
        new int[] {},
        new WorldPoint(2479, 5146, 0)
    ),

    Med19 (
        NullObjectID.NULL_29005,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "North of Evil Dave's house in Edgeville",
        new int[] {},
        new WorldPoint(3077, 3503, 0)
    ),

    Med20 (
        NullObjectID.NULL_29006,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "West of Shayzien combat ring",
        new int[] {},
        new WorldPoint(1534, 3591, 0)
    ),

    Med21 (
        NullObjectID.NULL_29007,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "Entrance of the Arceuus ibrary",
        new int[] {},
        new WorldPoint(1642, 3809, 0)
    ),

    Med22 (
        NullObjectID.NULL_29008,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "Outside Draynor Village jail",
        new int[] {},
        new WorldPoint(3130, 3250, 0)
    ),

    Med23 (
        NullObjectID.NULL_34647,
        ClueTier.MEDIUM,
        StashType.UNKNOWN,
        "North of Mount Karuulm",
        new int[] {},
        new WorldPoint(1308, 3840, 0)
    ),


    /* Hard stash */
    Har01 (
        NullObjectID.NULL_29009,
        ClueTier.HARD,
        StashType.UNKNOWN,
        "Chaos Temple in the south-eastern Wilderness",
        new int[] {},
        new WorldPoint(3245, 3609, 0)

    ),

    Har02 (
        NullObjectID.NULL_29010,
        ClueTier.HARD,
        StashType.UNKNOWN,
        "Fishing Guild bank",
        new int[] {},
        new WorldPoint(2593, 3409, 0)
    ),

    Har03 (
        NullObjectID.NULL_29011,
        ClueTier.HARD,
        StashType.UNKNOWN,
        "Top floor of the Lighthouse",
        new int[] {},
        new WorldPoint(2512, 3640, 2)
    ),

    Har04 (
        NullObjectID.NULL_29012,
        ClueTier.HARD,
        StashType.UNKNOWN,
        "Outside the great pyramid of Sophamen",
        new int[] {},
        new WorldPoint(3291, 2780, 0)
    ),

    Har05 (
        NullObjectID.NULL_29013,
        ClueTier.HARD,
        StashType.UNKNOWN,
        "Noterazzo's shop in the Wilderness", // bandit camp
        new int[] {},
        new WorldPoint(3027, 3699, 0)
    ),

    Har06 (
        NullObjectID.NULL_29014,
        ClueTier.HARD,
        StashType.UNKNOWN,
        "West side of the Karamja banana plantation",
        new int[] {},
        new WorldPoint(2909, 3169, 0)
    ),

    Har07 (
        NullObjectID.NULL_29015,
        ClueTier.HARD,
        StashType.UNKNOWN,
        "Mountain Camp goat enclosure", // north of Fremennik slayer cave
        new int[] {}
    ),

    Har08 (
        NullObjectID.NULL_29016,
        ClueTier.HARD,
        StashType.UNKNOWN,
        "Gnome Glider on White Wolf Mountain",
        new int[] {},
        new WorldPoint(2810, 3677, 0)
    ),

    Har09 (
        NullObjectID.NULL_29017,
        ClueTier.HARD,
        StashType.UNKNOWN,
        "Shilo Village Bank",
        new int[] {},
        new WorldPoint(2853, 2952, 0)
    ),

    Har10 (
        NullObjectID.NULL_29018,
        ClueTier.HARD,
        StashType.UNKNOWN,
        "Inside the Digsite Exam Centre",
        new int[] {},
        new WorldPoint(3356, 3333, 0)
    ),

    Har11 (
        NullObjectID.NULL_29019,
        ClueTier.HARD,
        StashType.UNKNOWN,
        "North-east corner of the Kharazi Jungle",
        new int[] {},
        new WorldPoint(2952, 2932, 0)
    ),

    Har12 (
        NullObjectID.NULL_29020,
        ClueTier.HARD,
        StashType.UNKNOWN,
        "Volcano in the north-eastern Wilderness",
        new int[] {},
        new WorldPoint(3368, 3930, 0)
    ),

    Har13 (
        NullObjectID.NULL_29021,
        ClueTier.HARD,
        StashType.UNKNOWN,
        "In the middle of Jiggig", // ogre burial grounds
        new int[] {},
        new WorldPoint(2478, 3048, 0)
    ),

    Har14 (
        NullObjectID.NULL_29022,
        ClueTier.HARD,
        StashType.UNKNOWN,
        "Agility Pyramid",
        new int[] {},
        new WorldPoint(3357, 2830, 0)
    ),

    Har15 (
        NullObjectID.NULL_29023,
        ClueTier.HARD,
        StashType.UNKNOWN,
        "Hosidius Mess",
        new int[] {},
        new WorldPoint(1648, 3631, 0)
    ),


    /* Elite stash */
    Eli01 (
        NullObjectID.NULL_29024,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "Chapel in West Ardougne",
        new int[] {},
        new WorldPoint(2527, 3294, 0)
    ),

    Eli02 (
        NullObjectID.NULL_29025,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "Near a runite rock in the Fremennik Isles",
        new int[] {},
        new WorldPoint(2374, 3847, 0)
    ),

    Eli03 (
        NullObjectID.NULL_29026,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "Near a ladder in the Wilderness Lava Maze",
        new int[] {},
        new WorldPoint(3069, 3862, 0)
    ),

    Eli04 (
        NullObjectID.NULL_29027,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "Entrance of the cave of Damis", // shadow dungeon in Kandarin
        new int[] {},
        new WorldPoint(2629, 5070, 0)
    ),

    Eli05 (
        NullObjectID.NULL_29028,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "Warrior's Guild bank",
        new int[] {},
        new WorldPoint(2844, 3537, 0)
    ),

    Eli06 (
        NullObjectID.NULL_29029,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "South-east corner of the Monastery", // Edgeville
        new int[] {},
        new WorldPoint(3056, 3482, 0)
    ),

    Eli07 (
        NullObjectID.NULL_29030,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "South-east corner of the Fishing Platform",
        new int[] {},
        new WorldPoint(2787, 3277, 1)
    ),

    Eli08 (
        NullObjectID.NULL_29031,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "Outside the Slayer Tower gargoyle room",
        new int[] {},
        new WorldPoint(3423, 3534, 2)
    ),

    Eli09 (
        NullObjectID.NULL_29032,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "On Top of Trollheim Mountain",
        new int[] {},
        new WorldPoint(2886, 3676, 0)
    ),

    Eli10 (
        NullObjectID.NULL_29033,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "Fountain of Heroes", // basement of Heroes' Guild
        new int[] {},
        new WorldPoint(2916, 9891, 0)
    ),

    Eli11 (
        NullObjectID.NULL_29034,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "Entrance of the cavern under the whirlpool", // ancient cavern
        new int[] {},
        new WorldPoint(1764, 5367, 1), new WorldPoint(1636, 5367, 1)
    ),

    Eli12 (
        NullObjectID.NULL_29035,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "Half-way down Trollweiss Mountain",
        new int[] {},
        new WorldPoint(2782, 3787, 0)
    ),

    Eli13 (
        NullObjectID.NULL_29036,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "Shayzien War Tent",
        new int[] {},
        new WorldPoint(1550, 3541, 0)
    ),

    Eli14 (
        NullObjectID.NULL_29037,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "Outside the Legends' Guild door",
        new int[] {},
        new WorldPoint(2727, 3371, 0)
    ),

    Eli15 (
        NullObjectID.NULL_29038,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "Near the gem stall in Ardougne Market",
        new int[] {},
        new WorldPoint(2672, 3302, 0)
    ),

    Eli16 (
        NullObjectID.NULL_29039,
        ClueTier.ELITE,
        StashType.UNKNOWN,
        "Outside the bar by the Fight Arena", // Khazard area
        new int[] {},
        new WorldPoint(2571, 3150, 0)
    ),


    /* Master stash */
    Mas01 (
        NullObjectID.NULL_29040,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "South-east corner of Lava Dragon Isle",
        new int[] {},
        new WorldPoint(3228, 3830, 0)
    ),

    Mas02 (
        NullObjectID.NULL_29041,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "Near the pier in Zul-Andra",
        new int[] {},
        new WorldPoint(2203, 3059, 0)
    ),

    Mas03 (
        NullObjectID.NULL_29042,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "Barrows Chest",
        new int[] {},
        new WorldPoint(3547, 9690, 0)
    ),

    Mas04 (
        NullObjectID.NULL_29043,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "Well of Voyage", // underground pass
        new int[] {},
        new WorldPoint(2006, 4709, 1)
    ),

    Mas05 (
        NullObjectID.NULL_29044,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "Northern wall of Castle Drakan",
        new int[] {},
        new WorldPoint(3559, 3385, 1)
    ),

    Mas06 (
        NullObjectID.NULL_29045,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "7th Chamber of Jalsavrah", // plunder pyramid in Sophanem
        new int[] {},
        new WorldPoint(1951, 4431, 0)
    ),

    Mas07 (
        NullObjectID.NULL_29046,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "Soul Altar",
        new int[] {},
        new WorldPoint(1810, 3855, 0)
    ),

    Mas08 (
        NullObjectID.NULL_29047,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "Warriors' Guild bank",
        new int[] {},
        new WorldPoint(2845, 3545, 0)
    ),

    Mas09 (
        NullObjectID.NULL_29048,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "Entrana Chapel",
        new int[] {},
        new WorldPoint(2851, 3355, 0)
    ),

    Mas10 (
        NullObjectID.NULL_29049,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "TzHaar gem store",
        new int[] {},
        new WorldPoint(2466, 5150, 0)
    ),

    Mas11 (
        NullObjectID.NULL_29050,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "Tent in Lord Iorweth's encampment", // Southeast of Priffindas
        new int[] {},
        new WorldPoint(2198, 3257, 0)
    ),

    Mas12 (
        NullObjectID.NULL_29051,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "Outside Mudknuckles' hut", // Goblin Village
        new int[] {},
        new WorldPoint(2959, 3502, 0)
    ),

    Mas13 (
        NullObjectID.NULL_29052,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "Centre of the Catacombs of Kourend",
        new int[] {},
        new WorldPoint(1661, 10045, 0)
    ),

    Mas14 (
        NullObjectID.NULL_29053,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "King Black Dragon's lair",
        new int[] {},
        new WorldPoint(2286, 4680, 0)
    ),

    Mas15 (
        NullObjectID.NULL_29054,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "Outside K'ril Tsutsaroth's room", // Zamorak General, GWD
        new int[] {},
        new WorldPoint(2931, 5337, 2)
    ),

    Mas16 (
        NullObjectID.NULL_29055,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "By the bear cage in Varrock Palace gardens",
        new int[] {},
        new WorldPoint(3232, 3494, 0)
    ),

    Mas17 (
        NullObjectID.NULL_29056,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "Outside the Wilderness axe hut", // level 54 Wilderness
        new int[] {},
        new WorldPoint(3232, 3494, 0)
    ),

    Mas18 (
        NullObjectID.NULL_29057,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "Top floor of the Yanille Watchtower",
        new int[] {},
        new WorldPoint(3186, 3958, 0)
    ),

    Mas19 (
        NullObjectID.NULL_29058,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "Death Altar",
        new int[] {},
        new WorldPoint(2210, 4842, 0)
    ),

    Mas20 (
        NullObjectID.NULL_29059,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "Behind Miss Schism in Draynor Village",
        new int[] {},
        new WorldPoint(3095, 3254, 0)
    ),

    Mas21 (
        NullObjectID.NULL_29060,
        ClueTier.MASTER,
        StashType.UNKNOWN,
        "North-western corner of the Enchanted Valley",
        new int[] {},
        new WorldPoint(3022, 4517, 0)
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
    private final int tier;                 // see ClueTier.java
    private final int type;                 // see StashType.java
    private final String description;       // as described in Watson's house
    private final int[] storedItems;
    private final WorldPoint[] worldPoints;
    
    Stash(int stashID, int tier, int type, String description, int[] storedItems, WorldPoint... worldPoints){
        this.stashID = stashID;
        this.tier = tier;
        this.type = type;
        this.description = description;
        this.storedItems = storedItems;
        this.worldPoints = worldPoints;
    }
}