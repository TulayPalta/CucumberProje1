Feature: Trendyol Search


  Scenario: US001 kullanici Trendyol sitesinde makas aratir

    Given kullanici google a gider
    Then kullanici google da Trendyol u aratir
    Then kullanici Trendyol a girer
    Then kullanici Trendyol da makas aratir
    Then kullanici toplam Trendyol daki makas sayisini alir
    Then kullanici yeni sekme acar
    Then kullanici google a gider
    Then kullanici google da Morhipo u aratir
    And kullanici Morhipo ya girer
    And kullanici Morhipo da makas aratir
    And kullanici toplam Morhipo daki makas sayisini alir
    And kullanici makas sayisi fazla olan sayfayi kapatir
    And kullanici makas sayisi az olan sayfayi kapatir