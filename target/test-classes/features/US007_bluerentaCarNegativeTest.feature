Feature: BlueRentaCar Negative Test

Scenario Outline: TC11 kullanici gecersiz bilgilerle giris yapar
  Given kullanici "rentacarURL" anasayfasina gider
  Then Login yazisina tiklar
  And "<gecersizEmail>" username girer  
  And "<gecersizPassword>" gecersiz password girer
  And Login butonuna basar
  Then sayfaya giris yapilamadigini kontrol eder
  And kullanici 3 saniye bekler
  And sayfayi kapatir
  Examples:
    | gecersizEmail | gecersizPassword |
    |a@gmail.com      |    12346|
    |b@gmail.com      |    13246|
    |c@gmail.com      |    78974|
    |d@gmail.com      |    78564|
    |e@gmail.com      |    41454|
