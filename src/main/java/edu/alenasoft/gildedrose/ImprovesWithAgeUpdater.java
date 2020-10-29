package edu.alenasoft.gildedrose;

public class ImprovesWithAgeUpdater implements Updater {

    // El item “Aged Brie" incrementa su **Quality** a medida que envejece.
    public void update(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
        item.sellIn--;
    }
}
