package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.TulayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US003StepDefs {
    TulayPage page =new TulayPage();
    Actions actions= new Actions(Driver.getDriver());
    SoftAssert softAssert=new SoftAssert();
    @Given("New Password bolumune uc karakterli bir sifre {string} girilir")
    public void newPasswordBolumuneUcKarakterliBirSifreGirilir(String invalidSifre) {
      actions.sendKeys(Keys.PAGE_DOWN).perform();
      ReusableMethods.jsclick(page.newPasswordBox);
      page.newPasswordBox.sendKeys(invalidSifre);
      actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
    }

    @Then("Your password is required to be at least four characters. yazisinin goruldugu test edilir")
    public void yourPasswordIsRequiredToBeAtLeastCharactersYazisininGorulduguTestEdilir() {
        Assert.assertEquals(ConfigReader.getProperty("invalidPasswordFeedback"), page.invalidPasswordFeedback.getText());
    }

    @And("New Password bolumune en az dort karakterli bir sifre {string} girilir")
    public void newPasswordBolumuneEnAzKarakterliBirSifreGirilir(String validSifre) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.jsclick(page.newPasswordBox);
        page.newPasswordBox.sendKeys(validSifre);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        ReusableMethods.waitFor(1);
    }

    @And("Your password is required to be at least four characters. yazisinin gorunmedigi test edilir")
    public void yourPasswordIsRequiredToBeAtLeastCharactersYazisininGorunmedigiTestEdilir() {
       Assert.assertTrue(Driver.getDriver().getPageSource().contains(ConfigReader.getProperty("ValidFeedBack")));
    }

    @Given("New Password bolumune yedi karakterden az bir sifre {string} girilir")
    public void newPasswordBolumuneKarakterdenAzBirSifreGirilir(String yedidenAzSifre) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.jsclick(page.newPasswordBox);
        page.newPasswordBox.sendKeys(yedidenAzSifre);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        ReusableMethods.waitFor(2);
    }

    @Then("Password strength seviyesinin bes olmadigi test edilir")
    public void passwordStrengthSeviyesininOlmadigiTestEdilir() {
       Assert.assertFalse(Driver.getDriver().getPageSource().contains(ConfigReader.getProperty("PasswordFifthColorCode")));
    }

    @Given("New Password bolumune guclu sifre {string} girilir")
    public void newPasswordBolumuneGucluSifreGirilir(String yediligucluSifre) throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.jsclick(page.newPasswordBox);
        page.newPasswordBox.sendKeys(yediligucluSifre);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
    }

    @Then("Kullanici New Password kisminda yeni {string} girer")
    public void kullanici_new_password_kisminda_yeni_girer(String password) {
        page.newPasswordSec.sendKeys(password);
        ReusableMethods.waitFor(2);

    }
    @Then("Kullanici parolanin gucunu dogrular {string}")
    public void kullanici_parolanin_gucunu_dogrular(String level) {
        if (2==Integer.parseInt(level)){
            softAssert.assertTrue(page.newPasswordSecondColor.isDisplayed());
        } else if (4==Integer.parseInt(level)){
            softAssert.assertTrue(page.newPasswordFourthColor.isDisplayed());
        }else if (5==Integer.parseInt(level)){
            softAssert.assertTrue(page.newPasswordFifthColor.isDisplayed());
        }
        softAssert.assertAll();
    }

    @Then("Kullanici parolanin gucunun degismedigini {string}")
    public void kullanici_parolanin_gucunun_degismedigini(String level) {
        if (1==Integer.parseInt(level)){
            Assert.assertTrue(page.newPasswordFirstColor.isDisplayed());
        }
    }
    @Then("Eb Kullanici sayfayi kapatir")
    public void eb_kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }

}


