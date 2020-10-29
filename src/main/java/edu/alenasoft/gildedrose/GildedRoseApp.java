package edu.alenasoft.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRoseApp {

    public static void main(String[] args) {

        System.out.println("GildedRoseApp Start..");

        List<Item> items = new ArrayList<>();
        items.add(new Item("+5 Dexterity Vest", 10, 20)); // chaleco
        items.add(new Item("Aged Brie", 2, 0)); // Queso
        items.add(new Item("Elixir of the Mongoose", 5, 7)); // Elixir
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80)); // Arma
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)); // Passes
        items.add(new Item("Conjured Mana Cake", 3, 6)); // Pastel

        GildedRose.items = items;
        GildedRose.updateQuality();
    }
}

