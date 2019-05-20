package net.runelite.client.plugins.checklist;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.ItemID;

@RequiredArgsConstructor
@Getter
public enum Tab
{
    OVERVIEW("Overview", ItemID.OLD_NOTES),
    STASH("STASH units", ItemID.STASH_UNITS_EASY),
    KUDOS("Kudos", ItemID.RUNE_DISPLAY_CASE),
    FOSSIL("Fossil Island",ItemID.UNIDENTIFIED_LARGE_FOSSIL),
    COSTUME("Costume Room",ItemID.MAHOGANY_FANCY_DRESS_BOX);

    public static final Tab[] TABS = {OVERVIEW,STASH,KUDOS,FOSSIL,COSTUME};

    private final String name;
    private final int itemID;
}
