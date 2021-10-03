package com.gildedrose;

public class GildedRoseItemFactory {
    public static GildedRoseItem get(Item item) {
        if (item.name.equals("Aged Brie")) {
            return new AgedBrieItem(item);
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new BackstagePassesItem(item);
        } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new SulfurusItem(item);
        } else if (item.name.equals("Conjured Mana Cake")) {
            return new ConjuredItem(item);
        }else {
            return new GildedRoseItem(item);
        }
    }
}
