package com.gildedrose;

public class GildedRoseItem extends Item {
    public GildedRoseItem(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    public GildedRoseItem updateQuality() {
        if (this.isQualityPositive()) {
            this.decreaseQuality();
        }
        this.decreaseSellin();
        if (this.isSellinNegative()) {
            if (isQualityPositive()) {
                this.decreaseQuality();
            }
        }
        return this;
    }

    void increaseQuality() {
        this.quality = this.quality + 1;
    }

    void decreaseQuality() {
        this.quality = this.quality - 1;
    }

    void decreaseSellin() {
        this.sellIn = this.sellIn - 1;
    }

    boolean isQualityWithinLimit() {
        int MAX_QUAILTY = 50;
        return this.quality < MAX_QUAILTY;
    }

    boolean isSellinNegative() {
        return this.sellIn < 0;
    }

    boolean isQualityPositive() {
        return this.quality > 0;
    }
}
