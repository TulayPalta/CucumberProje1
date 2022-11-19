package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class US001 {
    @Given("Medunna anasayfasina gidilir")
    public void medunnaAnasayfasinaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @Then("Account menu butonu tiklanir")
    public void accountMenuButonuTiklanir() {
    }

    @And("Registration sayfasina gidilir")
    public void registrationSayfasinaGidilir() {
    }

    @Given("Gecerli {string} girilir")
    public void gecerliGirilir(String arg0) {
    }

    @Then("First Name buttonuna tiklanir")
    public void firstNameButtonunaTiklanir() {
    }

    @And("Gecerli bir SSN numarasinin girildigi dogrulanir")
    public void gecerliBirSSNNumarasininGirildigiDogrulanir() {
    }

    @Given("Gecersiz bir {string} girilir")
    public void gecersizBirGirilir(String arg0) {
    }

    @Then("First Name buttonuna tiklanır")
    public void firstNameButtonunaTiklanır() {
    }

    @And("Your SSN is invalid mesajinin goruldugu test edilir")
    public void yourSSNIsInvalidMesajininGorulduguTestEdilir() {
    }

    @Given("SSN butonuna tiklanir")
    public void ssnButonunaTiklanir() {
    }

    @And("Your SSN is required. mesajinin goruldugu test edilir")
    public void yourSSNIsRequiredMesajininGorulduguTestEdilir() {
    }

    @Given("Gecerli bir {string} girilir")
    public void gecerliBirGirilir(String arg0) {
    }

    @Then("LastName buttonuna tiklanir")
    public void lastnameButtonunaTiklanir() {
    }

    @And("Your FirstName is required. mesajinin gorulmedigi dogrulanir.")
    public void yourFirstNameIsRequiredMesajininGorulmedigiDogrulanir() {
    }

    @Then("Last Name buttonuna tiklanir")
    public void lastNameButtonunaTiklanir() {
    }

    @And("Your FirstName is required. mesajinin goruldugu test edilir")
    public void yourFirstNameIsRequiredMesajininGorulduguTestEdilir() {
    }

    @Then("FirstName buttonuna tiklanir")
    public void firstnameButtonunaTiklanir() {
    }

    @And("Your LastName is required. mesajinin gorulmedigi dogrulanir")
    public void yourLastNameIsRequiredMesajininGorulmedigiDogrulanir() {
    }

    @And("Your LastName is required. mesajinin goruldugu test edilir")
    public void yourLastNameIsRequiredMesajininGorulduguTestEdilir() {
    }
}
