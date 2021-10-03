package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Aged Brie")) {
                if (items[i].quality < 50) {
                    this.increaseQuality(items, i);
                }
            } else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality < 50) {
                    this.increaseQuality(items, i);

                    if (items[i].quality < 50) {
                        if (items[i].sellIn < 11) {
                            this.increaseQuality(items, i);
                        }
                        if (items[i].sellIn < 6) {
                            this.increaseQuality(items, i);
                        }
                    }
                }
            } else if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                // Do nothing
            } else {
                if (items[i].quality > 0) {
                    this.decreaseQuality(items, i);
                }
            }

            if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                // Do nothing
            } else {
                this.decreaseSellin(items, i);
            }

            if (items[i].sellIn < 0) {
                if (items[i].name.equals("Aged Brie")) {
                    if (items[i].quality < 50) {
                        this.increaseQuality(items, i);
                    }
                } else {
                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        items[i].quality = 0;
                    } else {
                        if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                            // Do nothing
                        } else {
                            if (items[i].quality > 0) {
                                this.decreaseQuality(items, i);
                            }
                        }
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
}
