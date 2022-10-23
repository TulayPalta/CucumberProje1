Feature: Parametre Kullanimi
  @US0031
  Scenario: Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "amazonURL" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'nin "amazon" icerdigini test eder
    And sayfayi kapatir

  @US0032
  Scenario: Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "facebookURL" sayfasina gider
    Then kullanici 2 saniye bekler
    When url'nin "facebook" icerdigini test eder
    And sayfayi kapatir

  @US0031
  Scenario: Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "bestbuyURL" sayfasina gider
    Then kullanici 4 saniye bekler
    When url'nin "bestbuy" icerdigini test eder
    And sayfayi kapatir

  @US0032
  Scenario: Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "hepsiburadaURL" sayfasina gider
    Then kullanici 2 saniye bekler
    When url'nin "hepsiburada" icerdigini test eder
    And sayfayi kapatir
