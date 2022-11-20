package stepDefinitions;

import io.cucumber.java.en.*;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TulayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US001StepDefs {
    TulayPage page=new TulayPage();
    Actions actions= new Actions(Driver.getDriver());

    @Given("Medunna anasayfasina gidilir")
    public void medunnaAnasayfasinaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @Then("Account menu butonu tiklanir")
    public void accountMenuButonuTiklanir() {
        ReusableMethods.jsclick(page.accountMenu);
    }

    @And("Registration sayfasina gidilir")
    public void registrationSayfasinaGidilir() {
        ReusableMethods.jsclick(page.register);
    }
    @Given("Gecerli {string} girilir")
    public void gecerliGirilir(String arg0) {
        ReusableMethods.jsclick(page.ssnBox);
        page.ssnBox.sendKeys(ConfigReader.getProperty("validSSN"));
    }
    @Then("First Name buttonuna tiklanir")
    public void firstNameButtonunaTiklanir() {
        ReusableMethods.jsclick(page.firstNameBox);
    }

    @And("Gecerli bir SSN numarasinin girildigi dogrulanir")
    public void gecerliBirSSNNumarasininGirildigiDogrulanir() {
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertNotEquals(ConfigReader.getProperty("SSNInvalidFeedBack"),page.SSNFeedback.getText());
    }

    @Given("Gecersiz bir {string} girilir")
    public void gecersizBirGirilir(String SSN) {
        ReusableMethods.jsclick(page.ssnBox);
        page.ssnBox.sendKeys(SSN);
    }

    @Then("First Name buttonuna tiklanır")
    public void firstNameButtonunaTiklanır() {
        ReusableMethods.jsclick(page.firstNameBox);
    }

    @And("Your SSN is invalid mesajinin goruldugu test edilir")
    public void yourSSNIsInvalidMesajininGorulduguTestEdilir() {
        Assert.assertEquals(ConfigReader.getProperty("SSNInvalidFeedBack"),page.SSNFeedback.getText());
    }

    @Given("SSN butonuna tiklanir")
    public void ssnButonunaTiklanir() {
        ReusableMethods.jsclick(page.ssnBox);
    }

    @And("Your SSN is required. mesajinin goruldugu test edilir")
    public void yourSSNIsRequiredMesajininGorulduguTestEdilir() {
        Assert.assertEquals(ConfigReader.getProperty("SSNRequiredFeedBack"),page.SSNRequiredFeedback.getText());
    }

    @Given("Gecerli bir {string} girilir")
    public void gecerliBirGirilir(String FirstName) {
        ReusableMethods.jsclick(page.firstNameBox);
        page.firstNameBox.sendKeys(FirstName);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
    }

    @Given("Last Name kutusuna gecerli bir {string} girilir")
    public void lastNameKutusunaGecerliBirGirilir(String lastName) {
        ReusableMethods.jsclick(page.lastNameBox);
        page.lastNameBox.sendKeys(lastName);
    }
    @Then("LastName buttonuna tiklanir")
    public void lastnameButtonunaTiklanir() {
        ReusableMethods.jsclick(page.lastNameBox);
    }

    @And("Your FirstName is required. mesajinin gorulmedigi dogrulanir.")
    public void yourFirstNameIsRequiredMesajininGorulmedigiDogrulanir() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(ConfigReader.getProperty("ValidFeedBack")));
    }

    @Then("Last Name buttonuna tiklanir")
    public void lastNameButtonunaTiklanir() {
        ReusableMethods.jsclick(page.lastNameBox);
    }

    @And("Your FirstName is required. mesajinin goruldugu test edilir")
    public void yourFirstNameIsRequiredMesajininGorulduguTestEdilir() {
        Assert.assertEquals(ConfigReader.getProperty("FirstNameRequiredFeedBack"),page.firstNameRequiredFeedback.getText());
    }


    @And("Your LastName is required. mesajinin gorulmedigi dogrulanir")
    public void yourLastNameIsRequiredMesajininGorulmedigiDogrulanir() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(ConfigReader.getProperty("ValidFeedBack")));
    }

    @And("Your LastName is required. mesajinin goruldugu test edilir")
    public void yourLastNameIsRequiredMesajininGorulduguTestEdilir() {
        Assert.assertEquals(ConfigReader.getProperty("LastNameRequiredFeedBack"),page.lastNameRequiredFeedback.getText());
    }


}
