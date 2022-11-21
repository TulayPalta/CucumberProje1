@US002_UI @SmokeTests
Feature: US002 registerPage
  Background: Ortak Stepler
    Given Medunna anasayfasina gidilir
    Then Account menu butonu tiklanir
    And Registration sayfasina gidilir
  @US002_TC01
  Scenario Outline:
    Given Username bolumune gecerli bir "<Username>" girilir
    Then First Name buttonuna tiklanir
    And Your username is required. mesajinin gorulmedigi dogrulanir
    Examples:
      |Username|
      |Ali|
      |1.ahmet|
      |charlos|
      |Leyla  |
  @US002_TC02
  Scenario:
    Given Username buttonuna tiklanir
    Then First Name buttonuna tiklanir
    And Your username is required. mesajinin goruldugu test edilir
  @US002_TC03
  Scenario Outline:
    Given Email bolumune Gecerli bir Email "<validEmail>" girilir
    Then First Name buttonuna tiklanir
    And Your email is required. mesajinin gorulmedigi dogrulanir
    Examples:
      |validEmail|
      |AliKaya2@hotmail.com|
      |1.ahmet@gmail.com|
      |charlos@hotmail.com|
      |Leyla@gmail.com |
  @US002_TC04
  Scenario Outline:
    Given Email bolumune Gecersiz bir Email "<invalidEmail>" girilir
    Then First Name buttonuna tiklanir
    And This field is invalid mesajinin goruldugu test edilir
    Examples:
      |invalidEmail|
      |Ali@gmailcom|
      |1.ahmetgmail.com|
      |charlos.hotmail.com|
      |Leyla@gmail@.com |
  @US002_TC05
  Scenario:
    And Email buttonuna tiklanir
    Then First Name buttonuna tiklanir
    And Your email is required. mesajinin goruldugu test edilir