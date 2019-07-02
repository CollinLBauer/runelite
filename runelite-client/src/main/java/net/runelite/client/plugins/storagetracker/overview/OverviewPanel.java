package net.runelite.client.plugins.storagetracker.overview;

import net.runelite.client.plugins.storagetracker.PanelEntry;
import net.runelite.client.plugins.storagetracker.TabPanel;
import javax.swing.*;
import java.awt.*;

public class OverviewPanel extends TabPanel {

    @Override
    protected void addEntry(PanelEntry entry){
        JPanel item = new JPanel(new BorderLayout());

        //AsyncBufferedImage icon = itemManager.getImage(entry.getItemID());
    }

}
