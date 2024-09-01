package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public boolean isAgedBrie(String itemName) {
        if(itemName.isEmpty()) return false;
        return itemName.equals("Aged Brie");
    }

    public boolean isSulfuras(String itemName) {
        if(itemName.isEmpty()) return false;
        return itemName.equals("Sulfuras, Hand of Ragnaros");
    }

    public boolean isBackstagePasses(String itemName) {
        if(itemName.isEmpty()) return false;
        return itemName.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    public boolean isConjuredManaCake(String itemName) {
        if(itemName.isEmpty()) return false;
        return itemName.equals("Conjured Mana Cake");
    }

    public boolean isElixirOfMongoose(String itemName) {
        if(itemName.isEmpty()) return false;
        return itemName.equals("Elixir of the Mongoose");
    }

    public boolean isDexterityVest(String itemName) {
        if(itemName.isEmpty()) return false;
        return itemName.equals("+5 Dexterity Vest");
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!isAgedBrie(items[i].name) && !isBackstagePasses(items[i].name)) {
                if (items[i].quality > 0) {
                    if (!isSulfuras(items[i].name)) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (isBackstagePasses(items[i].name)) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!isSulfuras(items[i].name)) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!isAgedBrie(items[i].name)) {
                    if (!isBackstagePasses(items[i].name)) {
                        if (items[i].quality > 0) {
                            if (!isSulfuras(items[i].name)) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
}
