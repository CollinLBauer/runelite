package net.runelite.client.plugins.storagetracker;

public abstract class PanelEntry {

    /**
     * From ItemID API
     * Used to reference item names and icons
     */
    protected int itemID;
    protected final String name;

    public PanelEntry(int itemID, String name){
        this.itemID = itemID;
        this.name = name;

    }


    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
}
