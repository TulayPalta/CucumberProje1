Feature: US016  Class Work 8
  Scenario: Explicityly Wait

    Given kullanici "demoqaURL" anasayfasina gider
    Then kullanici Will enable bes seconds butonunun enable olmasini bekler
    And kullanici Will enable bes seconds butonunun enable oldugunu test eder