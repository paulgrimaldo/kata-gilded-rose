package edu.alenasoft.gildedrose;

public class BackstagePassesUpdater implements Updater {

    // El item “Backstage passes", como el “Aged Brie", incrementa su **Quality** a medida que se acerca a su valor de **sellIn**:
    // el **Quality** se duplica cuando hay 10 días o menos, se triplica cuando hay 5 días o menos,
    // y se anula cuando se pasó la fecha de venta.
    public void update(Item item) {
        if (isAfterTheConcert(item)) {
            item.quality = 0;
        } else if (item.quality < 50) {
            Integer qualityIncrease = qualityIncreaseBy(item.sellIn);
            item.quality += qualityIncrease;
        }
        item.sellIn--;
    }

    private Integer qualityIncreaseBy(Integer remainingDaysBeforeConcert) {
        if (remainingDaysBeforeConcert <= 5) {
            return 3;
        } else if (remainingDaysBeforeConcert <= 10) {
            return 2;
        } else {
            return 1;
        }
    }

    private boolean isAfterTheConcert(Item item) {
        return item.sellIn <= 0;
    }

}
