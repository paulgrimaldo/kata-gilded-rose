package edu.alenasoft.gildedrose;

public class CommonUpdater implements Updater {

    // Una vez que la cantidad de días para vender el item ha llegado al punto mínimo (cero días),
    // el **Quality** se degrada el doble de rápido.
    public void update(Item item) {

        if (canLowerQuality(item)) {
            item.quality--;
            if (pastExpirationDate(item)) {
                item.quality--;
            }
        }

        item.sellIn--;

    }

    private boolean pastExpirationDate(Item item) {
        return item.sellIn <= 0;
    }

    private boolean canLowerQuality(Item item) {
        return item.quality > 0;
    }

}
