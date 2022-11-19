@US001_UI @SmokeTest
Feature: US001 registerpage

  Background:
    Given Medunna anasayfasina gidilir
    Then Account menu butonu tiklanir
    And Registration sayfasina gidilir

  @US001_TC01
  Scenario Outline: US001_TC01
    Given Gecerli "<SSN>" girilir
    Then First Name buttonuna tiklanir
    And Gecerli bir SSN numarasinin girildigi dogrulanir
    Examples:
      | SSN |
      | 123-34-4567 |
      | 906-12-5436 |
      | 867-11-2348 |
      | 123-34-4567 |
      | 806-12-5436 |
      | 867-11-2348 |

  @US001_TC02
  Scenario Outline: US001_TC02_Negative_Scenario
    Given Gecersiz bir "<ssn>" girilir
    Then First Name buttonuna tiklanır
    And Your SSN is invalid mesajinin goruldugu test edilir
    Examples:
      | SSN       |  | SSN          |
      | 123344567 |  | 123-34-472   |
      | 906125436 |  | 111-11111    |
      | 867112348 |  | 90612-536    |
      | 123344567 |  | 867-11-23486 |
      | 906125436 |  | 123-34-78998 |
      | 867112348 |  | 123-34471    |


  @US001_TC03
  Scenario: US001_TC03
    Given SSN butonuna tiklanir
    Then First Name buttonuna tiklanir
    And Your SSN is required. mesajinin goruldugu test edilir


  @US001_TC04
  Scenario Outline: US001_TC04_Negative_Scenario
    Given Gecerli bir "FirstName" girilir
    Then LastName buttonuna tiklanir
    And Your FirstName is required. mesajinin gorulmedigi dogrulanir.
    Examples: Data text Fisrt Name
      |First Name|
      |Ali|
      |1.ahmet|
      |charlos|
      |Leyla  |

  @US001_TC05
  Scenario: US001_TC05
    Given First Name buttonuna tiklanir
    Then Last Name buttonuna tiklanir
    And Your FirstName is required. mesajinin goruldugu test edilir


  @US001_TC06
  Scenario Outline: US001_TC06_Negative_Scenario
    Given Gecerli bir "LastName" girilir
    Then FirstName buttonuna tiklanir
    And Your LastName is required. mesajinin gorulmedigi dogrulanir
    Examples:
      | LastName |
      | Aliyev |
      | Kaya5|
      | heser1!|
      | jkl981|

  @US001_TC07
  Scenario: US001_TC07
    Given Last Name buttonuna tiklanir
    Then First Name buttonuna tiklanir
    And Your LastName is required. mesajinin goruldugu test edilir