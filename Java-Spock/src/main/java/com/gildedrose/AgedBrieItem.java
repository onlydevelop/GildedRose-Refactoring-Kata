package com.gildedrose;

public class AgedBrieItem extends GildedRoseItem {
    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public AgedBrieItem updateQuality() {
        if (name.equals("Aged Brie")) {
            if (isQualityWithinLimit()) {
                increaseQuality();
            }
            this.decreaseSellin();
            if (isSellinNegative()) {
                if (this.isQualityWithinLimit()) {
                    this.increaseQuality();
                }
            }
        }
        return this;
    }
}
