package com.gildedrose;

public class GildedRoseItemFactory {
    public static GildedRoseItem get(GildedRoseItem item) {
        if (item.name.equals("Aged Brie")) {
            return new AgedBrieItem(item.name, item.sellIn, item.quality);
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new BackstagePassesItem(item.name, item.sellIn, item.quality);
        } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new SulfurusItem(item.name, item.sellIn, item.quality);
        } else {
            return new GildedRoseItem(item.name, item.sellIn, item.quality);
        }
    }
}
