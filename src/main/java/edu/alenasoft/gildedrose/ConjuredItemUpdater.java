package edu.alenasoft.gildedrose;

public class ConjuredItemUpdater implements Updater {

    // Los items “Conjured" (encantados) degradan su **Quality** dos veces mas rapido que los items normales.
    public void update(Item item) {
        item.quality -= 2;
        if (item.quality < 0) {
            item.quality = 0;
        }
        item.sellIn--;
    }

}