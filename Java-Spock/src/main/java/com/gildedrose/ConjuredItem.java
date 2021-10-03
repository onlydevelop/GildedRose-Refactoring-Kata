package com.gildedrose;

public class ConjuredItem extends GildedRoseItem {
    public ConjuredItem(Item item) {
        super(item);
    }

    public ConjuredItem updateQuality() {
        if (this.isQualityPositive()) {
            doubleDecreaseQuality();
        }
        this.decreaseSellin();
        if (this.isSellinNegative() && isQualityPositive()) {
            this.doubleDecreaseQuality();
        }
        return this;
    }

    private void doubleDecreaseQuality() {
        this.decreaseQuality();
        this.decreaseQuality();
    }
}
