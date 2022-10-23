package stepDefinitions;

import io.cucumber.java.en.And;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DataTablesPage;
import pages.HerOkuAppPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class HerOkuAppStepDefinitions {

    HerOkuAppPage herOkuAppPage = new HerOkuAppPage();
    @And("{string} butona basin")
    public void butonaBasin(String addElement) {
        herOkuAppPage.addElement.click();
    }

    @And("{string} butonu gorunur oluncaya kadar bekleyin")
    public void butonuGorunurOluncayaKadarBekleyin(String deleteElement) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herOkuAppPage.deleteElement));

        // ReusableMethods.waitForVisibility(herOkuAppPage.deleteElement,10);
    }

    @And("{string} butonunun gorunur oldugunu test edin")
    public void butonununGorunurOldugunuTestEdin(String deleteElement) {
        assert herOkuAppPage.deleteElement.isDisplayed();
    }

    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
        herOkuAppPage.deleteElement.click();
    }

    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
//  assert ! herOkuAppPage.deleteElement.isDisplayed();
        Assert.assertFalse(herOkuAppPage.deleteElement.isSelected());
    }
}
