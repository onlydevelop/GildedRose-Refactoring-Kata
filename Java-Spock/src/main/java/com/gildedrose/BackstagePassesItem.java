package com.gildedrose;

public class BackstagePassesItem extends GildedRoseItem {
    public BackstagePassesItem(Item item) {
        super(item);
    }

    public BackstagePassesItem updateQuality() {
        if (this.isQualityWithinLimit()) {
            this.increaseQuality();
            if (this.isQualityWithinLimit()) {
                increaseQualityOnSellIn();
            }
        }
        this.decreaseSellin();
        if (this.isSellinNegative()) {
            this.quality = 0;
        }
        return this;
    }

    private void increaseQualityOnSellIn() {
        if (this.isSellInTenOrLess()) {
            this.increaseQuality();
        }
        if (this.isSellInFiveOrLess()) {
            this.increaseQuality();
        }
    }

    private boolean isSellInTenOrLess() {
        return this.sellIn < 11;
    }

    private boolean isSellInFiveOrLess() {
        return this.sellIn < 6;
    }
}
