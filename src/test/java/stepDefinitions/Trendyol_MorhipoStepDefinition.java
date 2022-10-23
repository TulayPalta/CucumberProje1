package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import pages.GooglePage;
import pages.MorhipoPage;
import pages.TrendyolPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Trendyol_MorhipoStepDefinition {

    GooglePage googlePage = new GooglePage();
    TrendyolPage trendyolPage = new TrendyolPage();
    MorhipoPage morhipoPage = new MorhipoPage();

    String numberTrendyolScissors;
    String trendyolWebPage;

    String numberMorhipoScissors;
    String morhipoWebPage;

    @Given("kullanici google a gider")
    public void kullaniciGoogleAGider() {
        Driver.getDriver().get(ConfigReader.getProperty("googleURL"));
    }

    @Then("kullanici google da Trendyol u aratir")
    public void kullaniciGoogleDaTrendyolUAratir() {
        googlePage.googleSearch.sendKeys("Trendyol" + Keys.ENTER);
    }

    @Then("kullanici Trendyol a girer")
    public void kullaniciTrendyolAGirer() {
        googlePage.googleFirstRow.click();
        trendyolWebPage = Driver.getDriver().getWindowHandle();
    }

    @Then("kullanici Trendyol da makas aratir")
    public void kullaniciTrendyolDaMakasAratir() {
        trendyolPage.searchBox.sendKeys("makas" + Keys.ENTER);
    }

    @Then("kullanici toplam Trendyol daki makas sayisini alir")
    public void kullaniciToplamTrendyolDakiMakasSayisiniAlir() throws InterruptedException {
        String [] numberScissorsTrendyolText = trendyolPage.resultTextWE.getText().split(" ");
        numberTrendyolScissors= numberScissorsTrendyolText[3];
        System.out.println("Trendyol Makas sayisi : " + numberTrendyolScissors);
        Thread.sleep(1000);
    }

    @Then("kullanici yeni sekme acar")
    public void kullaniciYeniSekmeAcar() {
        Driver.tabHandle();
        Driver.getDriver().get(ConfigReader.getProperty("googleURL"));
    }

    @Then("kullanici google da Morhipo u aratir")
    public void kullaniciGoogleDaMorhipoUAratir() {
        googlePage.googleSearch.sendKeys("Morhipo" + Keys.ENTER);
    }

    @And("kullanici Morhipo ya girer")
    public void kullaniciMorhipoYaGirer() {
        googlePage.googleFirstRow.click();
        morhipoWebPage = Driver.getDriver().getWindowHandle();
    }

    @And("kullanici Morhipo da makas aratir")
    public void kullaniciMorhipoDaMakasAratir() {
        morhipoPage.searchBox.sendKeys("makas" + Keys.ENTER);
    }

    @And("kullanici toplam Morhipo daki makas sayisini alir")
    public void kullaniciToplamMorhipoDakiMakasSayisiniAlir() {
        numberMorhipoScissors = morhipoPage.resultTextWE.getText();

        System.out.println("Morhipo Makas sayisi : " + numberMorhipoScissors);
    }

    @And("kullanici makas sayisi fazla olan sayfayi kapatir")
    public void kullaniciMakasSayisiFazlaOlanSayfayiKapatir() {
        int nTrendyolScissors = Integer.parseInt(numberTrendyolScissors);
        int nMorhipoScissors = Integer.parseInt(numberMorhipoScissors);

        if (nTrendyolScissors > nMorhipoScissors) {
            Driver.getDriver().switchTo().window(trendyolWebPage).close();

        } else {
            Driver.getDriver().switchTo().window(morhipoWebPage).close();
        }

    }

    @And("kullanici makas sayisi az olan sayfayi kapatir")
    public void kullaniciMakasSayisiAzOlanSayfayiKapatir() throws AWTException {
       /*
       WINDOWS TA BU CALISIYOR
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);
        */
        Driver.quitDriver();
    }
}
