package net.runelite.client.plugins.storagetracker.costume;

import net.runelite.api.ItemID;
import net.runelite.client.plugins.storagetracker.TabPanel;
import net.runelite.client.plugins.storagetracker.costume.armourcase.ArmourCasePanel;
import net.runelite.client.plugins.storagetracker.costume.caperack.CapeRackPanel;
import net.runelite.client.plugins.storagetracker.costume.fancydressbox.FancyDressBoxPanel;
import net.runelite.client.plugins.storagetracker.costume.magicwardrobe.MagicWardrobePanel;
import net.runelite.client.plugins.storagetracker.costume.toybox.ToyBoxPanel;
import net.runelite.client.plugins.storagetracker.costume.treasurechest.TreasureChestPanel;

public enum CostumeTab {

    TREASURE_CHEST(new TreasureChestPanel(),"Treasure Chest", ItemID.MAHOGANY_TREASURE_CHEST),
    ARMOUR_CASE(new ArmourCasePanel(),"Armour Case",ItemID.MAHOGANY_ARMOUR_CASE),
    MAGIC_WARDROBE(new MagicWardrobePanel(),"Magic Wardrobe",ItemID.MAHOGANY_MAGIC_WARDROBE),
    CAPE_RACK(new CapeRackPanel(),"Cape Rack",ItemID.MAHOGANY_CAPE_RACK),
    TOY_BOX(new ToyBoxPanel(),"Toy Chest",ItemID.MAHOGANY_TOY_BOX),
    FANCY_DRESS_BOX(new FancyDressBoxPanel(),"Fancy Dress Box",ItemID.MAHOGANY_FANCY_DRESS_BOX);


    public static final CostumeTab[] TABS = {TREASURE_CHEST,ARMOUR_CASE,MAGIC_WARDROBE,CAPE_RACK,TOY_BOX,FANCY_DRESS_BOX};

    private final TabPanel panel;
    private final String name;
    private final int itemID;



    CostumeTab(TabPanel panel, String name, int itemID){
        this.panel = panel;
        this.name = name;
        this.itemID = itemID;
    }
}
