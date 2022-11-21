  @US001_UI @SmokeTests
  Feature: US001 registerPage
  Background: Ortak Stepler
    Given Medunna anasayfasina gidilir
    Then Account menu butonu tiklanir
    And Registration sayfasina gidilir
  @US001_TC01
  Scenario:
    Given Gecerli "<SSN>" girilir
    Then First Name buttonuna tiklanir
    And Gecerli bir SSN numarasinin girildigi dogrulanir
  @US001_TC02
  Scenario Outline:
    Given Gecersiz bir "<ssn>" girilir
    Then First Name buttonuna tiklanir
    And Your SSN is invalid mesajinin goruldugu test edilir
    Examples:
      | ssn       |  | ssn          |
      | 123344567 |  | 123-34-472   |
      | 906125436 |  | 111-11111    |
      | 867112348 |  | 90612-536    |
      | 123344567 |  | 867-11-23486 |
      | 906125436 |  | 123-34-78998 |
      | 867112348 |  | 123-34471    |
  @US001_TC03
  Scenario:
    Given SSN butonuna tiklanir
    Then First Name buttonuna tiklanir
    And Your SSN is required. mesajinin goruldugu test edilir
  @US001_TC04
  Scenario Outline:
    Given Gecerli bir "<FirstName>" girilir
    Then LastName buttonuna tiklanir
    And Your FirstName is required. mesajinin gorulmedigi dogrulanir.
    Examples: Data text First Name
      |FirstName|
      |Ali|
      |1.ahmet|
      |charlos|
      |Leyla  |
  @US001_TC05
  Scenario:
    Given First Name buttonuna tiklanir
    Then Last Name buttonuna tiklanir
    And Your FirstName is required. mesajinin goruldugu test edilir
  @US001_TC06
  Scenario Outline:
    Given Last Name kutusuna gecerli bir "<LastName>" girilir
    Then First Name buttonuna tiklanir
    And Your LastName is required. mesajinin gorulmedigi dogrulanir
    Examples:
      | LastName |
      | Aliyev |
      | Kaya5|
      | heser1!|
      | jkl981|
  @US001_TC07
  Scenario:
    Given Last Name buttonuna tiklanir
    Then First Name buttonuna tiklanir
    And Your LastName is required. mesajinin goruldugu test edilir