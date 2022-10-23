package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Practice_TC_07Steps {
    AutomationExercisePage automationExercisePage = new AutomationExercisePage();
    @Given("Tarayiciyi baslatarak {string} url'sine gidin")
    public void tarayiciyiBaslatarakUrlSineGidin(String searchUrl) {
        Driver.getDriver().get(searchUrl);

    }

    @Then("Ana sayfanin basariyla gorunur oldugunu dogrulayin")
    public void anaSayfaninBasariylaGorunurOldugunuDogrulayin() {
        String homeUrl ="https://automationexercise.com/";
        Assert.assertEquals("home url eşit değil",homeUrl,Driver.getDriver().getCurrentUrl());
    }

    @Then("Test Case buttonu na tiklayin")
    public void testCaseButtonuNaTiklayin() {
        automationExercisePage.testCaseLink.click();
    }

    @And("Kullanicinin test case sayfasina basariyla yönlendirildigini dogrulayin")
    public void kullanicininTestCaseSayfasinaBasariylaYönlendirildiginiDogrulayin() {
        Assert.assertTrue(automationExercisePage.testCaseTitle.isDisplayed());
    }

    @And("Ilgili sayfanin ekran goruntusunu alin")
    public void ılgiliSayfaninEkranGoruntusunuAlin() {
        try {
            ReusableMethods.getScreenshot("Automation Page");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
