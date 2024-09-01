package com.gildedrose;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    String name;
    int sellIn;
    int quality;

    @BeforeEach
    void setUp() {
        this.name = "foo";
        this.sellIn = 4;
        this.quality = 10;
    }

    @Test
    void item() {
        Item item = new Item(this.name, this.sellIn, this.quality);
        assertEquals(this.name, item.name);
        assertEquals(this.sellIn, item.sellIn);
        assertEquals(this.quality, item.quality);
    }

    @Test
    void callToString() {
        Item item = new Item(this.name, this.sellIn, this.quality);
        assertEquals(this.name + ", " + this.sellIn + ", " + this.quality, item.toString());
    }
}
