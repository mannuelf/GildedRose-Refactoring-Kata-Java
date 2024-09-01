package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
    Item[] items = new Item[] {
        new Item("+5 Dexterity Vest", 10, 20), //
        new Item("Aged Brie", 2, 0), //
        new Item("Elixir of the Mongoose", 5, 7), //
        new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
        new Item("Sulfuras, Hand of Ragnaros", -1, 80),
        new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
        new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
        new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
        // this conjured item does not work properly yet
        new Item("Conjured Mana Cake", 3, 6) };

    GildedRose app = new GildedRose(items);

    @Test
    void item() {
        String expectedItemName = "Conjured Mana Cake";
        app.updateQuality();
        assertEquals(expectedItemName, app.items[8].name);
    }

    @Test
    void isAgedBrie() {
        String expectedItemName = "Aged Brie";
        assertEquals(true, app.isAgedBrie(expectedItemName));
    }

    @Test
    void isSulfuras() {
        String expectedItemName = "Sulfuras, Hand of Ragnaros";
        assertEquals(true, app.isSulfuras(expectedItemName));
    }

    @Test
    void isBackstagePasses() {
        String expectedItemName = "Backstage passes to a TAFKAL80ETC concert";
        assertEquals(true, app.isBackstagePasses(expectedItemName));
    }

    @Test
    void isConjuredManaCake() {
        String expectedItemName = "Conjured Mana Cake";
        assertEquals(true, app.isConjuredManaCake(expectedItemName));
    }
}
