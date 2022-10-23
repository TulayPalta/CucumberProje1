package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {

    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon anasayfasina gider")
    public void kullaniciAmazonAnasayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("Nutella" + Keys.ENTER);
    }

    @And("sonuclarin Nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String expectedWord="Nutella";
        String actualWord=amazonPage.searchResultWE.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Selenium icin arama yapar")
    public void kullaniciSeleniumIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("Selenium" + Keys.ENTER);
    }

    @And("sonuclarin Selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        String expectedWord="Selenium";
        String actualWord=amazonPage.searchResultWE.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));
    }

    @Then("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("iphone" + Keys.ENTER);
    }

    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String expectedWord="iphone";
        String actualWord=amazonPage.searchResultWE.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));
    }

    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String searchWord) {
        amazonPage.searchBox.sendKeys(searchWord,Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String searchWord) {
        Assert.assertTrue(amazonPage.searchResultWE.getText().contains(searchWord));
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String searchUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(searchUrl));
    }

    @When("url'nin {string} icerdigini test eder")
    public void urlNinIcerdiginiTestEder(String searchUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(searchUrl));
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int waiting) {
        try {
            Thread.sleep(waiting*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @And("sonuclarin \"<istenenKelimeKontrol>' icerdigini test eder")
    public void sonuclarinIstenenKelimeKontrolIcerdiginiTestEder(String searcWordCheck) throws Throwable {
        Assert.assertTrue(amazonPage.searchResultWE.getText().contains(searcWordCheck));
    }

    @And("sayfalari kapatir")
    public void sayfalariKapatir() {
        Driver.quitDriver();
    }
}
