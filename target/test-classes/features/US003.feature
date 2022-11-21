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
  @US003_TC04
  Scenario Outline:
    Given New Password bolumune guclu sifre "<yediligucluSifre>" girilir
    Then Password strength seviyesinin 5 oldugu dogrulanir
    Examples: test data
      | yediligucluSifre |
      |   eAayd?2    |
      |   b?*B2!3    |
      |   bAY2s!3    |

  @US003_TC05
  Scenario:
    Given New Password bolumune 7 rakamli bir sifre "<7RakamliSifre>" girilir
    Then 7RakamliSifre'nin Password strength seviyesi tespit edilir
    And New Password bolumune 7 haneli rakam ve kucuk harfli sifre "<7liRakKucHarfliSifre>" girilir
    And En an bir kucuk harf eklenince password strength seviyesinin degistigi dogrulanir