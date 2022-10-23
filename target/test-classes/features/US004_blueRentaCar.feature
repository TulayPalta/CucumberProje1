Feature: US004 Class Work

  @gp5
  Scenario: TC01 Kullanici gecerli bilgilerle giris yapar
    Given kullanici "rentacarURL" anasayfasina gider
    And kullanici 2 saniye bekler
    Then Login yazisina tiklar
    And kullanici 2 saniye bekler
    And gecersiz username girer
    And kullanici 4 saniye bekler
    And gecersiz password girer
    And kullanici 4 saniye bekler
    And Login yazisina tiklar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir
