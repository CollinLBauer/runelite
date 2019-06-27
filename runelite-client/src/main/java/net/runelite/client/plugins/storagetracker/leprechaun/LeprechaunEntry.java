package net.runelite.client.plugins.storagetracker.leprechaun;

import net.runelite.client.plugins.storagetracker.PanelEntry;


public class LeprechaunEntry extends PanelEntry {

    // type
    private int amount; //
    private int max;

    LeprechaunEntry(int type, String name, int max){
        super(type, name);
        amount = 0; //default; update should read actual value
        this.max = max;

    }

    public void setAmount(int x) {
        amount = x;
    }

    public int getAmount() {
        return amount;
    }

    public int getMax() {
        return max;
    }
}
