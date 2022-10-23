@auto
Feature: US014 Kullanici Giris Testi

  Scenario: TC01 Kullanici sitede hesap olusturur

    Given kullanici "autoURL" anasayfasina gider
    And user sign in linkine tiklar
    And user Create and account bölümüne email adresi girer
    And Create an Account butonuna basar
    And kullanici kisisel bilgilerini ve iletisim bilgilerini girer
    And kullanici Register butonuna basar
    Then kullanicinin hesap olusturuldugunu dogrulayin
    Then hesap olustugunu dogrulayin
    And sayfayi kapatir