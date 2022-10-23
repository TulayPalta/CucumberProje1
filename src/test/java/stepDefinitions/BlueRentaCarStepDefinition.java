package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BlueRentaCarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class BlueRentaCarStepDefinition {
    BlueRentaCarPage blueRentaCarPage = new BlueRentaCarPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String searchUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(searchUrl));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        blueRentaCarPage.loginButton.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        blueRentaCarPage.emailTextBox.sendKeys(ConfigReader.getProperty("rentacarWrongUserName"));
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        blueRentaCarPage.passwordTextBox.sendKeys(ConfigReader.getProperty("rentacarWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(blueRentaCarPage.loginButton.isDisplayed());
    }


    @And("{string} username girer")
    public void usernameGirer(String arg0) {
    }

    @And("{string} gecersiz password girer")
    public void gecersizPasswordGirer(String arg0) {
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
    }
}
