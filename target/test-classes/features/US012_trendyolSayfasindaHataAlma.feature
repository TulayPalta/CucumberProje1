@iste

Feature: US012 Trendyol Sayfasinda Hata Alma

Scenario: Parametre kullaniminda ConfigReader Kullanimi
Given kullanici "amazonURL" sayfasina gider
Then kullanici 3 saniye bekler
When url'nin "trendyol" icerdigini test eder
And sayfayi kapatir