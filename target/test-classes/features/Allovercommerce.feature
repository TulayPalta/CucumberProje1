
    @US_001
    Feature: Allovercommerce Proje US_001

        @US_001_TC_001
        Scenario: TC_001_Test_Cases
        Given Belirtilen URL' e gidilir
        Then Anasayfanın göründüğü doğrulanır
        And Register'a tıklanır
        And Açılan pencerede "Become a vendor"a tıklanır
        And Vendor Registration yazısının göründüğü test edilir


        @US_001_TC_002
        Scenario: TC_002_Test_Cases
        Given Belirtilen URL' e gidilir
        Then Register'a tıklanır
        And Açılan pencerede "Become a vendor"a tıklanır
        And Açılan sayfada 'Email' bölümünün göründüğü test edilir
        And Açılan sayfada 'Password' bölümünün göründüğü test edilir
        And Açılan sayfada 'Confirm Password' bölümünün göründüğü test edilir