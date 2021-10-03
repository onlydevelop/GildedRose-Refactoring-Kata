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

    public void updateQuality() {
        if (name.equals("Aged Brie")) {
            if (this.isQualityWithinLimit()) {
                this.increaseQuality();
            }
            this.decreaseSellin();
            if (isSellinNegative()) {
                if (this.isQualityWithinLimit()) {
                    this.increaseQuality();
                }
            }
        } else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (this.isQualityWithinLimit()) {
                this.increaseQuality();

                if (this.isQualityWithinLimit()) {
                    if (this.isSellInTenOrLess()) {
                        this.increaseQuality();
                    }
                    if (this.isSellInFiveOrLess()) {
                        this.increaseQuality();
                    }
                }
            }
            this.decreaseSellin();
            if (this.isSellinNegative()) {
                quality = 0;
            }
        } else if (name.equals("Sulfuras, Hand of Ragnaros")) {
            // Do nothing
        } else {
            if (this.isQualityPositive()) {
                this.decreaseQuality();
            }
            this.decreaseSellin();
            if (this.isSellinNegative()) {
                if (isQualityPositive()) {
                    this.decreaseQuality();
                }
            }
        }
    }

    private void increaseQuality() {
        quality = quality + 1;
    }

    private void decreaseQuality() {
        quality = quality - 1;
    }

    private void decreaseSellin() {
        sellIn = sellIn - 1;
    }

    private boolean isQualityWithinLimit() {
        int MAX_QUAILTY = 50;
        return quality < MAX_QUAILTY;
    }

    private boolean isSellinNegative() {
        return sellIn < 0;
    }

    private boolean isQualityPositive() {
        return quality > 0;
    }

    private boolean isSellInTenOrLess() {
        return sellIn < 11;
    }

    private boolean isSellInFiveOrLess() {
        return sellIn < 6;
    }
}
