Feature: US011  Class Work 4

  Scenario Outline: TC01 Kullanici sutun basligi ile liste alabilmeli
    Given kullanici "guruURL" anasayfasina gider
    And "<istenenBaslik>" sutunundaki tum degerleri yazdirir
    Examples:
      | istenenBaslik |
      | Company|
      | Group |
      | Prev Close (Rs) |
      | Current Price (Rs) |
      | % Change |