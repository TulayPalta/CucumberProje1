@US003_UI @SmokeTests
Feature: US003 registerpage
  Background: Ortak Stepler
    Given Medunna anasayfasina gidilir
    Then Account menu butonu tiklanir
    And Registration sayfasina gidilir
  @US003_TC01
  Scenario Outline:
    Given New Password bolumune uc karakterli bir sifre "<invalidSifre>" girilir
    Then Your password is required to be at least four characters. yazisinin goruldugu test edilir
    Examples:
      | invalidSifre |
      | 123          |
      | T2c          |
      | Ab*          |
  @US003_TC02
  Scenario Outline:
    And New Password bolumune en az dort karakterli bir sifre "<validSifre>" girilir
    And Your password is required to be at least four characters. yazisinin gorunmedigi test edilir
    Examples:
      | validSifre |
      | wert       |
      | WERT       |
      | 4321       |
      | @#ba       |
      | Ab1$       |
  @US003_TC03
  Scenario Outline:
    Given New Password bolumune yedi karakterden az bir sifre "<yedidenAzSifre>" girilir
    Then Password strength seviyesinin bes olmadigi test edilir
    Examples: test data
      | yedidenAzSifre |
      |   eraydT    |
      |   34568a    |
      |   AY2HMk    |
      |   xbrydF    |
      |   tBayd1    |
      |   eAayd?    |
      |   brxm!2    |
      |   b?*B2!    |

  @US_003_TC_004,TC_005,TC_006,TC_007,TC_008
  Scenario Outline: Kullanici en az 7 karakterli icerisinde en az 1 kucuk harf, 1 rakam, 1 ozel karakter olan sifreleri
  girer
    And Kullanici New Password kisminda yeni "<password>" girer
    And Kullanici parolanin gucunu dogrular "<strength>"
    And Eb Kullanici sayfayi kapatir

    Examples: test data
      | password   | strength |
      | ebraydT    | 2        |
      | 345678a    | 2        |
      | AYDHTMk    | 2        |
      | ebraydF    | 2        |
      | ebrayd1    | 2        |
      | ebrayd?    | 2        |
      | ebraydxm!2 | 4        |
      | ebrkB2!    | 5        |

  @US_003_TC_009_NegativeTest
  Scenario Outline: TC_001 Kullanici kucuk harflerden olusan en az 7 karakterli bir sifre girer
    And Kullanici New Password kisminda yeni "<password>" girer
    And Kullanici parolanin gucunun degismedigini "<strength>"
    And Eb Kullanici sayfayi kapatir
    Examples: password data
      | password  | strength |
      | ebraydnys | 1        |

