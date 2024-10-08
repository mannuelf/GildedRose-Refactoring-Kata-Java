package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GildedRoseTest {
    Item[] items = new Item[]{
        new Item("+5 Dexterity Vest", 10, 20),
        new Item("Aged Brie", 2, 0),
        new Item("Elixir of the Mongoose", 5, 7),
        new Item("Sulfuras, Hand of Ragnaros", 0, 80),
        new Item("Sulfuras, Hand of Ragnaros", -1, 80),
        new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
        new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
        new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
        new Item("Conjured Mana Cake", 3, 6)
    };

    GildedRose app = new GildedRose(items);

    @Test
    void item() {
        String expectedItemName = "Elixir of the Mongoose";
        app.updateQuality();
        assertTrue(app.isElixirOfMongoose(expectedItemName));
    }

    @Test
    void isAgedBrie() {
        String expectedItemName = "Aged Brie";
        assertTrue(app.isAgedBrie(expectedItemName));
    }

    @Test
    void isSulfuras() {
        String expectedItemName = "Sulfuras, Hand of Ragnaros";
        assertTrue(app.isSulfuras(expectedItemName));
    }

    @Test
    void isBackstagePasses() {
        String expectedItemName = "Backstage passes to a TAFKAL80ETC concert";
        assertTrue(app.isBackstagePasses(expectedItemName));
    }

    @Test
    void isConjuredManaCake() {
        String expectedItemName = "Conjured Mana Cake";
        assertTrue(app.isConjuredManaCake(expectedItemName));
    }

    @Test
    void isElixirOfMongoose() {
        String expectedItemName = "Elixir of the Mongoose";
        assertTrue(app.isElixirOfMongoose(expectedItemName));
    }

    @Test
    void isDexterityVest() {
        String expectedItemName = "+5 Dexterity Vest";
        assertTrue(app.isDexterityVest(expectedItemName));
    }

    @Test
    void hasItems() {
        assertTrue(app.hasItems(app.items));
    }
}
