package com.gildedrose;

public class GildedRoseItem extends Item {
    public String name;
    public int sellIn;
    public int quality;

    public GildedRoseItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
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
