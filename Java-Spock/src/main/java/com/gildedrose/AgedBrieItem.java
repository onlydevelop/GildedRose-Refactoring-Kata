package com.gildedrose;

public class AgedBrieItem extends GildedRoseItem {
    public AgedBrieItem(Item item) {
        super(item);
    }

    public AgedBrieItem updateQuality() {
        if (isQualityWithinLimit()) {
            increaseQuality();
        }
        this.decreaseSellin();
        if (isSellinNegative()) {
            if (this.isQualityWithinLimit()) {
                this.increaseQuality();
            }
        }
        return this;
    }
}
