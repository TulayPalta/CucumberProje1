package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US003StepDefs {
    @Given("New Password bolumune {int} karakterli bir sifre {string} girilir")
    public void newPasswordBolumuneKarakterliBirSifreGirilir(int arg0, String arg1) {
    }

    @Then("Your password is required to be at least {int} characters. yazisinin goruldugu test edilir")
    public void yourPasswordIsRequiredToBeAtLeastCharactersYazisininGorulduguTestEdilir(int arg0) {
    }

    @And("New Password bolumune en az {int} karakterli bir sifre {string} girilir")
    public void newPasswordBolumuneEnAzKarakterliBirSifreGirilir(int arg0, String arg1) {
    }

    @And("Your password is required to be at least {int} characters. yazisinin gorunmedigi test edilir")
    public void yourPasswordIsRequiredToBeAtLeastCharactersYazisininGorunmedigiTestEdilir(int arg0) {
    }

    @Given("New Password bolumune {int} karakterden az bir sifre {string} girilir")
    public void newPasswordBolumuneKarakterdenAzBirSifreGirilir(int arg0, String arg1) {
    }

    @Then("Password strength seviyesinin {int} olmadigi test edilir")
    public void passwordStrengthSeviyesininOlmadigiTestEdilir(int arg0) {
    }

    @Given("New Password bolumune guclu sifre {string} girilir")
    public void newPasswordBolumuneGucluSifreGirilir(String arg0) {
    }

    @Then("Password strength seviyesinin {int} oldugu dogrulanir")
    public void passwordStrengthSeviyesininOlduguDogrulanir(int arg0) {
    }

    @Given("New Password bolumune {int} rakamli bir sifre {string} girilir")
    public void newPasswordBolumuneRakamliBirSifreGirilir(int arg0, String arg1) {
    }

    @Then("{int}RakamliSifre'nin Password strength seviyesi tespit edilir")
    public void rakamlisifreNinPasswordStrengthSeviyesiTespitEdilir(int arg0) {
    }

    @And("New Password bolumune {int} haneli rakam ve kucuk harfli sifre {string} girilir")
    public void newPasswordBolumuneHaneliRakamVeKucukHarfliSifreGirilir(int arg0, String arg1) {
    }

    @And("En an bir kucuk harf eklenince password strength seviyesinin degistigi dogrulanir")
    public void enAnBirKucukHarfEklenincePasswordStrengthSeviyesininDegistigiDogrulanir() {
    }
}
