Feature: USA006 Scenario Outline Kullanimi

  # Scenario Outline: ile Frame Workumuza hibrit(behavior and data) ozelligi kazandirmis oluyoruz
  Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi
    Given kullanici "<searchUrl>" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'nin "<searchWord>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | searchUrl | searchWord |
      | amazonURL| amazon |
      | facebookURL| facebook |
      | googleURL| google |
      | bestbuyURL| bestbuy |
      | hepsiburadaURL | hepsiburada |
      | rentacarURL| bluerentalcars |
      | tutorialURL| tutorialsninja |
      | trendyolURL| trendyol |
      | morhipoURL | morhipo |




