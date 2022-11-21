@US003_UI @SmokeTests
Feature: US002 registerpage

  Background: Ortak Stepler
    Given Medunna anasayfasina gidilir
    Then Account menu butonu tiklanir
    And Registration sayfasina gidilir

  @US003_TC01
  Scenario Outline: US003_TC01
    Given New Password bolumune uc karakterli bir sifre "<invalidSifre>" girilir
    Then Your password is required to be at least four characters. yazisinin goruldugu test edilir
    Examples:
      | invalidSifre |
      |123|
      |T2c|
      |Ab*|


  @US003_TC02
  Scenario Outline: US003_TC02
    And New Password bolumune en az dort karakterli bir sifre "<validSifre>" girilir
    And Your password is required to be at least four characters. yazisinin gorunmedigi test edilir
    Examples:
      | validSifre |
      | wert |
      | WERT |
      | 4321 |
      | @#ba |
      | Ab1$ |


  @US003_TC03
  Scenario: US003_TC03
    Given New Password bolumune yedi karakterden az bir sifre "<7denAzSifre>" girilir
    Then Password strength seviyesinin bes olmadigi test edilir


  @US003_TC04
  Scenario: US003_TC04
    Given New Password bolumune guclu sifre "<7ligucluSifre>" girilir
    Then Password strength seviyesinin 5 oldugu dogrulanir


  @US003_TC05
  Scenario: US003_TC05
    Given New Password bolumune 7 rakamli bir sifre "<7RakamliSifre>" girilir
    Then 7RakamliSifre'nin Password strength seviyesi tespit edilir
    And New Password bolumune 7 haneli rakam ve kucuk harfli sifre "<7liRakKucHarfliSifre>" girilir
    And En an bir kucuk harf eklenince password strength seviyesinin degistigi dogrulanir