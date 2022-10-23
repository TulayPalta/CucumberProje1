Feature: Class Work

  Scenario Outline:
    When kullanici "https://editor.datatables.net/" adresine gider
    Then  new butonuna basar
    And kullanici 1 saniye bekler
    And isim bolumune "<firstname>" girer
    And kullanici 1 saniye bekler
    And soyisim bolumune "<lastname>" girer
    And kullanici 1 saniye bekler
    And position bolumune "<positiongirer>" girer
    And kullanici 1 saniye bekler
    And ofis bolumune "<ofisbilgisi>" girer
    And kullanici 1 saniye bekler
    And extension bolumune "<extension>" girer
    And kullanici 1 saniye bekler
    And startdate bolumune "<Startdate>"  girer
    And kullanici 1 saniye bekler
    And salary bolumune "<Salary>" girer
    And kullanici 1 saniye bekler
    And Create tusuna basar
    And kullanici 1 saniye bekler
    When kullanici "<firstname>" ile arama yapar
    And kullanici 1 saniye bekler
    Then isim bolumunde "<firstname>" oldugunu dogrular
    Examples:
      | firstname | lastname | positiongirer | ofisbilgisi | extension | Startdate | Salary |
      | ALi        | Veli      | Qa       | Google   | Senior    | 2022-02-22  | 15000  |
      | Ahmet      | Mehmet    | Qa       | Google   | Junior    | 2021-01-15  | 10500  |
      | Hasan      | Duman     | Dev      | Amazon   | Junior    | 2020-12-11 | 25000  |
      | Akin       | Alkan     | Dev      | Amazon   | Senior    | 2008-04-05 | 50000  |
      | Orhan      | Duman     | PO       | WallMart | Senior    | 2006-06-06   | 30000  |


    #5 farkli kullanici bilgisi girer