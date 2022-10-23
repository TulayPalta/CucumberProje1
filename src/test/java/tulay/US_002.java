package tulay;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pages.TulayPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
/*
public class US_002 extends TestBaseReport {
    TulayPage tulayPage;
    Actions actions = new Actions(Driver.getDriver());

    //--------------------------------------------------------------------
    @Test
    public void test001() {
        tulayPage = new TulayPage();
        extentTest = extentReports.createTest("URL", "Web Otomasyon Raporlama");

        //Belirtilen URL' e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("belirtilen URL'e gidildi");

        //Sign in 'e tiklanir
        tulayPage.anaSayfaSignInLink.click();
        extentTest.info("'Sign in' linkine tıklandı");

        //Gecerli bir mail girilir
        tulayPage.signInUsernameBox.sendKeys("paltatulay28@gmail.com");
        extentTest.info("Geçerli bir email girildi");

        //Gecerli bir password girilir
        tulayPage.signInPasswordBox.sendKeys("Zeynep425*");
        extentTest.info("'Geçerli bir password' girildi");

        //Sign in 'e tiklanir
        tulayPage.signInOnayButton.click();
        extentTest.info("'Sign in' butonuna tıklandı");

        //My Account yazısının göründüğü test edilir
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", tulayPage.myAccountLink);
        jse.executeScript("arguments[0].click();", tulayPage.myAccountLink);
        Assert.assertTrue(tulayPage.myAccountLink.isDisplayed());
        extentTest.pass("'My Account!' yazısı başarıyla görüldü");

        //Sign Out 'a tıklanır
        jse.executeScript("arguments[0].scrollIntoView(true);", tulayPage.myAccountSignOutLink);
        jse.executeScript("arguments[0].click();", tulayPage.myAccountSignOutLink);
        //Log Out 'a tıklanır
        tulayPage.mailYaniLogOutLink.click();

    }

    //--------------------------------------------------------------------

    @Test
    public void test002() {
        tulayPage = new TulayPage();
        extentTest = extentReports.createTest("URL", "Web Otomasyon Raporlama");

        //Belirtilen URL' e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("belirtilen URL'e gidildi");

        //Sign in 'e tiklanir
        tulayPage.anaSayfaSignInLink.click();
        extentTest.info("'Sign in' linkine tıklandı");

        //Gecerli bir mail girilir
        tulayPage.signInUsernameBox.sendKeys("paltatulay28@gmail.com");
        extentTest.info("Geçerli bir email girildi");

        //Gecerli bir password girilir
        tulayPage.signInPasswordBox.sendKeys("Zeynep425*");
        extentTest.info("'Geçerli bir password' girildi");

        //Sign in 'e tiklanir
        tulayPage.signInOnayButton.click();
        extentTest.info("'Sign in' butonuna tıklandı");

        //My Account linkine tıklanır
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", tulayPage.myAccountLink);
        jse.executeScript("arguments[0].click();", tulayPage.myAccountLink);
        tulayPage.myAccountLink.click();
        extentTest.info("'My Account' linkine tıklandı");

        //Orders, Downloads, addresses, account details,whislist ve Logout butonlarının göründüğü test edilir
        Assert.assertTrue(tulayPage.sekilliOrdersLink.isDisplayed());
        Assert.assertTrue(tulayPage.sekilliDownloadsLink.isDisplayed());
        Assert.assertTrue(tulayPage.sekilliAddressesLink.isDisplayed());
        Assert.assertTrue(tulayPage.sekilliAccountDetailsLink.isDisplayed());
        Assert.assertTrue(tulayPage.sekilliwhislistLink.isDisplayed());
        Assert.assertTrue(tulayPage.sekilliLogoutLink.isDisplayed());
        extentTest.pass("'Orders, Downloads, addresses, account details,whislist ve Logout butonları' başarıyla görüldü");

    }

    @Test
    public void test003() {
        tulayPage = new TulayPage();
        extentTest = extentReports.createTest("URL", "Web Otomasyon Raporlama");

        //Belirtilen URL' e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("belirtilen URL'e gidildi");

        //Sign in 'e tiklanir
        tulayPage.anaSayfaSignInLink.click();
        extentTest.info("'Sign in' linkine tıklandı");

        //Gecerli bir mail girilir
        tulayPage.signInUsernameBox.sendKeys("paltatulay28@gmail.com");
        extentTest.info("Geçerli bir email girildi");

        //Gecerli bir password girilir
        tulayPage.signInPasswordBox.sendKeys("Zeynep425*");
        extentTest.info("'Geçerli bir password' girildi");

        //Sign in 'e tiklanir
        tulayPage.signInOnayButton.click();
        extentTest.info("'Sign in' butonuna tıklandı");

        //My Account linkine tıklanır
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", tulayPage.myAccountLink);
        jse.executeScript("arguments[0].click();", tulayPage.myAccountLink);
        tulayPage.myAccountLink.click();
        extentTest.info("'My Account' linkine tıklandı");

        //Dashboard altında; Store manager, orders, downloads, addresses , account details, appointments,
        //wishlist, Support tickets, followings ve log out  butonlarının göründüğü test edilir
        extentTest.pass("'Store manager, orders, downloads, addresses , account details" +
                "'wishlist, Support tickets, followings ve Logout butonları' başarıyla görüldü");
        extentTest.fail("'Appointments' linki görülemedi");

        List<WebElement> linkList = tulayPage.dashboardAltindakiLinkler;
        List<String> linkListString = new ArrayList<>();
        for (WebElement w:linkList) {
            linkListString.add(w.getText());
        }
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(linkListString.contains("Appointments"));

        }

 */
