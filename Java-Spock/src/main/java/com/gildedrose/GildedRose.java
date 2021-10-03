package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Aged Brie")) {
                if (this.isQualityWithinLimit(items, i)) {
                    this.increaseQuality(items, i);
                }
                this.decreaseSellin(items, i);
                if (isSellinNegative(items, i)) {
                    if (this.isQualityWithinLimit(items, i)) {
                        this.increaseQuality(items, i);
                    }
                }
            } else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (this.isQualityWithinLimit(items, i)) {
                    this.increaseQuality(items, i);

                    if (this.isQualityWithinLimit(items, i)) {
                        if (this.isSellInTenOrLess(items, i)) {
                            this.increaseQuality(items, i);
                        }
                        if (this.isSellInFiveOrLess(items, i)) {
                            this.increaseQuality(items, i);
                        }
                    }
                }
                this.decreaseSellin(items, i);
                if (this.isSellinNegative(items, i)) {
                    items[i].quality = 0;
                }
            } else if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                // Do nothing
            } else {
                if (this.isQualityPositive(items, i)) {
                    this.decreaseQuality(items, i);
                }
                this.decreaseSellin(items, i);
                if (this.isSellinNegative(items, i)) {
                    if (isQualityPositive(items, i)) {
                        this.decreaseQuality(items, i);
                    }
                }
            }
        }
    }

    public void increaseQuality(Item[] items, int i) {
        items[i].quality = items[i].quality + 1;
    }

    public void decreaseQuality(Item[] items, int i) {
        items[i].quality = items[i].quality - 1;
    }

    public void decreaseSellin(Item[] items, int i) {
        items[i].sellIn = items[i].sellIn - 1;
    }

    public boolean isQualityWithinLimit(Item[] items, int i) {
        int MAX_QUAILTY = 50;
        return items[i].quality < MAX_QUAILTY;
    }

    public boolean isSellinNegative(Item[] items, int i) {
        return items[i].sellIn < 0;
    }

    public boolean isQualityPositive(Item[] items, int i) {
        return items[i].quality > 0;
    }

    private boolean isSellInTenOrLess(Item[] items, int i) {
        return items[i].sellIn < 11;
    }

    private boolean isSellInFiveOrLess(Item[] items, int i) {
        return items[i].sellIn < 6;
    }
}
