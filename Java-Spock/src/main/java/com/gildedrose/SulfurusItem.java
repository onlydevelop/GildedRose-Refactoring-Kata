package com.gildedrose;

public class SulfurusItem extends GildedRoseItem {
    public String name;
    public int sellIn;
    public int quality;

    public SulfurusItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public SulfurusItem updateQuality() {
        // Do nothing
        return this;
    }
}
