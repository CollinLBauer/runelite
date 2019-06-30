package net.runelite.client.plugins.storagetracker.leprechaun;

import net.runelite.api.ItemID;
import net.runelite.client.game.AsyncBufferedImage;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.storagetracker.PanelEntry;
import net.runelite.client.plugins.storagetracker.TabPanel;

import javax.swing.*;
import java.awt.*;

public class LeprechaunPanel extends TabPanel {




    public LeprechaunPanel(){
        buildEntries();
        for (PanelEntry entry : entries){
            addEntry(entry);
        }

        update();
    }

    private void buildEntries(){
        entries = new PanelEntry[12];
        entries[0] = new LeprechaunEntry(ItemID.RAKE, "Farming rake", 100);
        entries[1] = new LeprechaunEntry(ItemID.SEED_DIBBER, "Seed dibber", 100);
        entries[2] = new LeprechaunEntry(ItemID.SPADE, "Spade", 100);
        entries[3] = new LeprechaunEntry(ItemID.SECATEURS, "Secateurs", 100);
        entries[4] = new LeprechaunEntry(ItemID.WATERING_CAN, "Watering can", 1);
        entries[5] = new LeprechaunEntry(ItemID.GARDENING_TROWEL, "Gardening trowel", 100);
        entries[6] = new LeprechaunEntry(ItemID.PLANT_CURE, "Plant cure", 1000);
        entries[7] = new BottomlessEntry(ItemID.BOTTOMLESS_COMPOST_BUCKET, "Bottomless bucket", 1);
        entries[8] = new LeprechaunEntry(ItemID.BUCKET, "Empty buckets", 1000);
        entries[9] = new LeprechaunEntry(ItemID.COMPOST, "Normal Compost", 1000);
        entries[10] = new LeprechaunEntry(ItemID.SUPERCOMPOST, "Supercompost", 1000);
        entries[11] = new LeprechaunEntry(ItemID.ULTRACOMPOST, "Ultracompost", 1000);

    }

    @Override
    protected void addEntry(PanelEntry entry){
        JPanel item = new JPanel(new BorderLayout());



        //AsyncBufferedImage icon = itemManager.getImage(entry.getItemID());
    }

    @Override
    public void update(){
        // get actual quantities
        // get secateurs type
        // get bottomless compost type and quantity
        super.update();
    }
}
