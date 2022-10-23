package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.TulayPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AllovercommerceUS001StepDef {
    TulayPage tulayPage = new TulayPage();

    @And("Belirtilen URL' e gidilir")
    public void belirtilenURLEGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverURL"));
    }

    @And("Anasayfanın göründüğü doğrulanır")
    public void anasayfanınGöründüğüDoğrulanır() {
        Assert.assertTrue(tulayPage.anaSayfaInfoMailLink.isDisplayed());
    }

    @And("Register'a tıklanır")
    public void registerATıklanır() {
        tulayPage.anaSayfaRegisterLink.click();
    }

    @And("Açılan pencerede {string}a tıklanır")
    public void açılanPenceredeATıklanır(String arg0) {
        tulayPage.becomeAVendorLink.click();
    }

    @And("Vendor Registration yazısının göründüğü test edilir")
    public void vendorRegistrationYazısınınGöründüğüTestEdilir() {
        Assert.assertTrue(tulayPage.vendorRegText.isDisplayed());
    }

}
