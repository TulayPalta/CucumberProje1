package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.AutomationPracticePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutoStepDefinition {

    Faker faker = new Faker();

    AutomationPracticePage autoPracticePage = new AutomationPracticePage();
    @And("user sign in linkine tiklar")
    public void userSignInLinkineTiklar() {
        autoPracticePage.loginLink.click();
    }

    @And("user Create and account bölümüne email adresi girer")
    public void userCreateAndAccountBölümüneEmailAdresiGirer() {
        autoPracticePage.emailCreateLink.sendKeys(faker.internet().emailAddress());
    }

    @And("Create an Account butonuna basar")
    public void createAnAccountButonunaBasar() {
        autoPracticePage.createAccountButton.click();
    }

    @And("kullanici kisisel bilgilerini ve iletisim bilgilerini girer")
    public void kullaniciKisiselBilgileriniVeIletisimBilgileriniGirer() {
        autoPracticePage.genderButton.click();
        autoPracticePage.firstName1Box.sendKeys(faker.name().firstName());
        String name = autoPracticePage.firstName1Box.getText().toString();
        autoPracticePage.lastName1Box.sendKeys(faker.name().lastName());
        autoPracticePage.passwordBox.sendKeys(faker.internet().password());
        autoPracticePage.days.sendKeys("5");
        autoPracticePage.months.sendKeys("October");
        autoPracticePage.years.sendKeys("1980");
        autoPracticePage.addressBox.sendKeys(faker.address().fullAddress());
        autoPracticePage.cityBox.sendKeys(faker.address().city());
        autoPracticePage.idStateBox.sendKeys(faker.address().state());
        autoPracticePage.postcodeBox.sendKeys(faker.address().zipCode());
        autoPracticePage.phoneMobileBox.sendKeys(faker.phoneNumber().cellPhone());
        autoPracticePage.registerButton.click();
        assert autoPracticePage.myAccountText.isDisplayed();
        assert autoPracticePage.myAccountName.equals(name);

    }

    @And("kullanici Register butonuna basar")
    public void kullaniciRegisterButonunaBasar() {
    }

    @Then("kullanicinin hesap olusturuldugunu dogrulayin")
    public void kullanicininHesapOlusturuldugunuDogrulayin() {
    }

    @Then("hesap olustugunu dogrulayin")
    public void hesapOlustugunuDogrulayin() {
    }
}
