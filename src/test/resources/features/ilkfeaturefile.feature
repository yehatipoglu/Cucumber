@google_search
Feature: ilke feature file

  Background: google_sayfasina_git
    Given kullanici google gider

  @iphone
  Scenario:TC_01_google_iphone_arama

  Given kullanici google gider
  When kullanici iphone için arama yapar
  Then sonuclarda iphone oldugunu dogrular
  Then close the application

   @tesla
  Scenario: TC02_google_tesla_arama
  Given kullanici google gider
  When kullanici tesla için arama yapar
  Then sonuclarda tesla oldugunu dogrular
  Then close the application

  # 1.Her feature file, Feature: kelimesi ile baslamak zorundadır.
  # 2.Her bir file da, yalnız bir Feature: kullanılabilir.
  # 3.Senaryo(TEST CASE) olusturmak için Scenario kelimesi kullanılır.
  # 4.Birden fazla senaryo kullanılabilir.
  # 5.Her bir adim Given,When,And,Then,But * kelimelerinden biriyle başlamalıdır.
  # 6.Given -> Genelde ilk satırlarda, pre condition stepleri için kullanılır.
  #7.Then -> Genelde son satırlarda, verification stepleri için kullanılır.
  #8. And,When -> Genelde ara adımlarda bağlar olarak kullanılır.
  # NOTE: Teknik olarak istenilen kelime istenilen stepde kullanılabilir,
  #       ama anlam karmaşası olmaması için bu adimlar takip edilir.
  #9. Belirli scenarioları çalıştırmak icin cucumber tags ler kullanılır
  #tag ler feature, scenario,scerio outline,examples kelimeleri ile birlitke kullanılabilir.
  #10. Background: Her bir scenario kelimesinden ONCE tek bir sefer çalısır.
  #11. dryRun=false -> dryRun yokmus gibi normal sekilde çalısır.Yanı tum adımları tek tek browserda açar.
  #     dryRun=true -> Yeni bir STEP(adım) eklendiginde sadece tanimlanmamıs step definitionsları olusturmak icin kullanılır.
  #     bunun kullanilma sebebi zamandan tasarrufdur.

  #github için deneme update olup olmadıgını kontrol?