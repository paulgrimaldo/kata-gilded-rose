- Se eliminó los números mágicos 
- Se encontró anidación de if
- Se separó la clase GildedRose de la lógica de ejecución cumpliendo el principio de simple responsabilidad
- Se remplazó la iteración for por for each para simplificar el uso de cada item
- Para quitar la gran cantidad de ifs, reducir el código del método largo updateQuality() 
  y separar funcionalidades se implemento el patrón factory en UpdaterFactory.
- Se agregó la interfaz Updater
- Se agregarón las clases BackstagePassesUpdater, CommonUpdater, ConjuredItemUpdater, ImprovesWithAgeUpdater, LegendaryUpdater
  y la interfáz Updater fue implementada fue implementada en ellos.  
- Se agregó la funcionalidad a los métodos Updater() de cada clase emplementada
- Se corrigió la calidad esperada en los siguientes test:
    * testConjuredQualityWhenSellInZero() 
    * testConjuredAlternativeQualityWhenSellInZero() 