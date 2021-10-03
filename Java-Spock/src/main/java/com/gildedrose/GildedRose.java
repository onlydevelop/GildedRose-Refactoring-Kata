package com.gildedrose;

class GildedRose {
    GildedRoseItem[] items;

    public GildedRose(GildedRoseItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            items[i] = GildedRoseItemFactory.get(items[i]).updateQuality();
        }
    }
}
