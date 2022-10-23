package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.message.ReusableMessage;
import org.openqa.selenium.WebElement;
import pages.TutorialPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TutorialStepDefinition {

    TutorialPage tutorialPage = new TutorialPage();

    @Given("kullanici websitesine Tutorial sitesine gider")
    public void kullaniciWebsitesineTutorialSitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("tutorialURL"));
    }

    @Then("kullanici Phone & PDA tiklar")
    public void kullaniciPhonePDATiklar() {
        tutorialPage.PhonePdaclick.click();
    }

    @Then("kullanici telefon markalarini alir")
    public void kullaniciTelefonMarkalariniAlir() {
       List<WebElement > telefonMarkalari = tutorialPage.telList;
    }

    @And("tum ogeler sepete eklenir")
    public void tumOgelerSepeteEklenir() {
        for (int i = 0; i < tutorialPage.addToCart.size(); i++) {

            tutorialPage.addToCart.get(i).click();
        }

    }

    @And("kullanici sepete tiklar")
    public void kullaniciSepeteTiklar() throws InterruptedException {
        tutorialPage.sepetButton.click();
        Thread.sleep(2000);
        tutorialPage.sepetButton2.click();
    }

    @And("sepetteki isimleri alir")
    public void sepettekiIsimleriAlir() {
        List<String> sepetList = new ArrayList<>();

        for (WebElement each: tutorialPage.sepetten) {
            sepetList.add(each.getText());
        }
        sepetList.forEach(System.out::println);
    }

    @And("sepetteki isimleri dogrular")
    public void sepettekiIsimleriDogrular() {


    }


}
