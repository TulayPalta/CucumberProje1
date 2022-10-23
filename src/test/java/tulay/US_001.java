package tulay;
/*
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TulayPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.IOException;
import java.time.Duration;

public class US_001 extends TestBaseReport {
        TulayPage tulayPage;
        Actions actions = new Actions(Driver.getDriver());

        //--------------------------------------------------------------------
        @Test
        public void test001() {
            tulayPage = new TulayPage();
            extentTest=extentReports.createTest("URL","Web Otomasyon Raporlama");

            //Belirtilen URL' e gidilir
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            extentTest.info("belirtilen URL'e gidildi");

            //Anasayfanın göründüğü doğrulanır
            Assert.assertTrue(tulayPage.anaSayfaInfoMailLink.isDisplayed());
            extentTest.pass("Sayfaya basarili sekilde girildi");

            //Register'a tıklanır
            tulayPage.anaSayfaRegisterLink.click();
            extentTest.info("'Register' butonuna tıklandı");

            //Açılan pencerede "Become a vendor"a tıklanır
            tulayPage.becomeAVendorLink.click();
            extentTest.info("'Become a vendor' butonuna tıklandı");

            //Vendor Registration yazısının göründüğü test edilir
            Assert.assertTrue(tulayPage.vendorRegText.isDisplayed());
            extentTest.pass("(\"Vendor Registration\") yazısının görünür olduğu doğrulandı");
        }

        //--------------------------------------------------------------------
        @Test
        public void test002() {
            tulayPage = new TulayPage();
            extentTest=extentReports.createTest("URL","Web Otomasyon Raporlama");
            //Belirtilen URL' e gidilir
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            extentTest.info("belirtilen URL'e gidildi");

            //Register'a tıklanır
            tulayPage.anaSayfaRegisterLink.click();
            extentTest.info("'Register' butonuna tıklandı");

            //Açılan pencerede "Become a vendor"a tıklanır
            tulayPage.becomeAVendorLink.click();
            extentTest.info("'Become a vendor' butonuna tıklandı");

            //Açılan sayfada 'Email' bölümünün göründüğü test edilir
            Assert.assertTrue(tulayPage.vendorRegEmailText.isDisplayed());
            extentTest.pass("Email yazısı görüldü");

            //Açılan sayfada 'Password' bölümünün göründüğü test edilir
            Assert.assertTrue(tulayPage.vendorRegPasswordText.isDisplayed());
            extentTest.pass("Password yazısı görüldü");

            //Açılan sayfada 'Confirm Password' bölümünün göründüğü test edilir
            Assert.assertTrue(tulayPage.vendorRegConfirmPasswordText.isDisplayed());
            extentTest.pass("Confirm Password yazısı görüldü, test başarıyla tamamlandı");
        }


        //--------------------------------------------------------------------
        @Test
        public void test003() throws InterruptedException {
            tulayPage = new TulayPage();
            extentTest=extentReports.createTest("URL","Web Otomasyon Raporlama");
            //Belirtilen URL' e gidilir
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            extentTest.info("belirtilen URL'e gidildi");

            //Register'a tıklanır
            tulayPage.anaSayfaRegisterLink.click();
            extentTest.info("'Register' butonuna tıklandı");

            //Açılan pencerede "Become a vendor"a tıklanır
            tulayPage.becomeAVendorLink.click();
            extentTest.info("'Become a vendor' butonuna tıklandı");

            //Mail girmeden geçerli bir "Password" girilir
            tulayPage.vendorRegPasswordBox.sendKeys("Zeynep425*");
            extentTest.info("'Geçerli bir password' girildi");

            //Aynı şifre tekrar "Confirm Password"e girilir
            tulayPage.vendorRegConfirmPasswordBox.sendKeys("Zeynep425*");
            extentTest.info("'Aynı şifre confirm password'e tekrar girildi");

            //Register'a tıklanır
            //Thread.sleep(2000);
            //actions.sendKeys(Keys.PAGE_DOWN);
            //Thread.sleep(2000);
            //alloverCommercePage.vendorRegisterButton.click();
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].scrollIntoView(true);", tulayPage.vendorRegisterButton);
            jse.executeScript("arguments[0].click();", tulayPage.vendorRegisterButton);
            Thread.sleep(2000);
            extentTest.info("'Register' butonuna tıklandı");

            //"Vendor Registration" yazısının göründüğü test edilir
            Assert.assertTrue(tulayPage.vendorRegMailUniceUyariText.isDisplayed());
            extentTest.pass("'Vendor Registration' yazısı başarıyla görüldü");
        }

        //--------------------------------------------------------------------
        @Test
        public void test004() throws InterruptedException {
            tulayPage = new TulayPage();
            extentTest=extentReports.createTest("URL","Web Otomasyon Raporlama");
            //Belirtilen URL' e gidilir
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            extentTest.info("belirtilen URL'e gidildi");

            //Register'a tıklanır
            tulayPage.anaSayfaRegisterLink.click();
            extentTest.info("'Register' butonuna tıklandı");

            //Açılan pencerede "Become a vendor"a tıklanır
            tulayPage.becomeAVendorLink.click();
            extentTest.info("'Become a vendor' butonuna tıklandı");

            //Kullanıcı geçersiz bir adres girer
            tulayPage.vendorRegEmailBox.sendKeys("leyla@");
            tulayPage.vendorRegPasswordBox.sendKeys(" ");
            Thread.sleep(3000);
            extentTest.info("Geçersiz bir email girildi");

            //"Please provide a valid email address."  yazısının geldiğini doğrular
            String expectedEmailUyari = "Please provide a valid email address";
            Assert.assertTrue(tulayPage.vendorRegMailUyariText.getText().contains(expectedEmailUyari));
            extentTest.pass("'Please provide a valid email address.' yazısı başarıyla görüldü");

        }

        //--------------------------------------------------------------------
        @Test
        public void test005() throws InterruptedException {
            tulayPage = new TulayPage();
            extentTest=extentReports.createTest("URL","Web Otomasyon Raporlama");
            //Belirtilen URL' e gidilir
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            extentTest.info("belirtilen URL'e gidildi");

            //Register'a tıklanır
            tulayPage.anaSayfaRegisterLink.click();
            extentTest.info("'Register' butonuna tıklandı");

            //Açılan pencerede "Become a vendor"a tıklanır
            tulayPage.becomeAVendorLink.click();
            extentTest.info("'Become a vendor' butonuna tıklandı");

            //Daha önce girilen geçerli email adresi tekrar girilir
            tulayPage.vendorRegEmailBox.sendKeys("paltatulay28@gmail.com");
            Thread.sleep(2000);
            extentTest.info("Geçerli bir email girildi");

            //Daha önce girilen Verification code'u girilir
            tulayPage.vendorRegCodeBox.sendKeys("718824");
            Thread.sleep(2000);
            extentTest.info("Verification code'u girildi");

            //Geçerli bir "Password" girilir
            tulayPage.vendorRegPasswordBox.clear();
            tulayPage.vendorRegPasswordBox.sendKeys("Zeynep425*");
            Thread.sleep(2000);
            extentTest.info("'Geçerli bir password' girildi");

            //Aynı şifre tekrar "Confirm Password"e girilir
            tulayPage.vendorRegConfirmPasswordBox.sendKeys("Zeynep425*");
            Thread.sleep(2000);
            extentTest.info("'Aynı şifre confirm password'e tekrar girildi");

            //Register'a tıklanır
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].scrollIntoView(true);", tulayPage.vendorRegisterButton);
            jse.executeScript("arguments[0].click();", tulayPage.vendorRegisterButton);
            extentTest.info("'Register' butonuna tıklandı");

            //"This Email already exists" yazısının göründüğü test edilir
            Assert.assertTrue(tulayPage.vendorRegMailUniceUyariText.isDisplayed());
            extentTest.pass("'This Email already exists' yazısı başarıyla görüldü");

        }
        //--------------------------------------------------------------------
        @Test
        public void test006() throws IOException, InterruptedException {
            tulayPage = new TulayPage();
            extentTest=extentReports.createTest("URL","Web Otomasyon Raporlama");
            //Belirtilen URL' e gidilir
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            extentTest.info("belirtilen URL'e gidildi");

            //Register'a tıklanır
            tulayPage.anaSayfaRegisterLink.click();
            extentTest.info("'Register' butonuna tıklandı");

            //Açılan pencerede "Become a vendor"a tıklanır
            tulayPage.becomeAVendorLink.click();
            extentTest.info("'Become a vendor' butonuna tıklandı");

            //Pasword'e Strong bir pasword girilir
            tulayPage.vendorRegPasswordBox.sendKeys("Ze5*");
            extentTest.info("'Strong şartlarına uygun bir password' girildi");

            //Aynı şifre tekrar "Confirm Password"e girilir
            tulayPage.vendorRegConfirmPasswordBox.sendKeys("Ze5*");
            Thread.sleep(3000);
            //ReusableMethods.getScreenshot("IsPasswordStrong");
            extentTest.info("'Strong şartlarına uygun aynı password Confirm Passworde' girildi");

            //Uyarı yazısında 'Strong' yazısının göründüğü doğrulanır
            extentTest.fail("'Strong' yazısı görülemedi");
            Assert.assertTrue(tulayPage.vendorRegPasswordUyariText.getText().contains("Strong"));

        }

        //--------------------------------------------------------------------
        @Test
        public void test007() throws InterruptedException {
            tulayPage = new TulayPage();
            extentTest=extentReports.createTest("URL","Web Otomasyon Raporlama");
            //Belirtilen URL'e gidilir
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            extentTest.info("belirtilen URL'e gidildi");

            //Register'a tıklanır
            tulayPage.anaSayfaRegisterLink.click();
            extentTest.info("'Register' butonuna tıklandı");

            //Açılan pencerede "Become a vendor"a tıklanır
            tulayPage.becomeAVendorLink.click();
            extentTest.info("'Become a vendor' butonuna tıklandı");

            //Bir email adresi girilir
            tulayPage.vendorRegEmailBox.sendKeys("paltatulay28@gmail.com");
            Thread.sleep(2000);
            extentTest.info("Bir email girildi");

            //Bir Verification code'u girilir
            tulayPage.vendorRegCodeBox.sendKeys("718824");
            Thread.sleep(2000);
            extentTest.info("Verification code'u girildi");

            //Bir password girilir
            tulayPage.vendorRegPasswordBox.clear();
            tulayPage.vendorRegPasswordBox.sendKeys("Zeynep425*");
            extentTest.info("'Geçerli bir password' girildi");

            //Farklı bir password "Confirm Password"e girilir
            tulayPage.vendorRegConfirmPasswordBox.sendKeys("Zeynep");
            Thread.sleep(2000);
            extentTest.info("'Farklı bir password' girildi");

            //Register'a tıklanır
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].scrollIntoView(true);", tulayPage.vendorRegisterButton);
            jse.executeScript("arguments[0].click();", tulayPage.vendorRegisterButton);
            extentTest.info("'Register' butonuna tıklandı");

            //"Password and Confirm-password are not same." yazısının göründüğü test edilir
            Assert.assertTrue(tulayPage.vendorRegPasswordUyari2Text.isDisplayed());
            extentTest.pass("'Password and Confirm-password are not same.' yazısı başarıyla görüldü");

        }
        //--------------------------------------------------------------------
        @Test
        public void test008() throws InterruptedException {
            tulayPage = new TulayPage();
            extentTest=extentReports.createTest("URL","Web Otomasyon Raporlama");
            //Belirtilen URL' e gidilir
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            extentTest.info("belirtilen URL'e gidildi");

            //Register'a tıklanır
            tulayPage.anaSayfaRegisterLink.click();
            extentTest.info("'Register' butonuna tıklandı");

            //Açılan pencerede "Become a vendor"a tıklanır
            tulayPage.becomeAVendorLink.click();
            extentTest.info("'Become a vendor' butonuna tıklandı");

            //Geçerli bir Email adresi girilir
            Driver.getDriver().get("https://www.fakemail.net/");
            String fakeMail= tulayPage.fakeEmailBox.getText();
            Driver.getDriver().navigate().back();
            tulayPage.vendorRegEmailBox.sendKeys(fakeMail);
            extentTest.info("Geçerli bir email girildi");

            //Verification code'u istenir
            tulayPage.vendorRegCodeBox.click();
            tulayPage.vendorRegPasswordBox.sendKeys(" ");
            WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
            wait.until(ExpectedConditions.visibilityOf(tulayPage.vendorRegCodeUyariText));
            extentTest.info("Geçerli verification code'u mail hesabından alındı");

            //Verification code'u email hesabından alınır ve sitedeki kod bölümüne girilir
            Driver.getDriver().navigate().forward();
            tulayPage.fakeEmailGelen.click();
            String verCode= tulayPage.fakeEmailGelenCod.getText().replaceAll("\\D", "");
            Driver.getDriver().navigate().back();
            tulayPage.vendorRegCodeBox.sendKeys(verCode);
            extentTest.info("Geçerli verification code'u girildi");

            //Geçerli bir "Password" girilir
            tulayPage.vendorRegPasswordBox.clear();
            tulayPage.vendorRegPasswordBox.sendKeys("Zeynep425*");
            extentTest.info("'Geçerli bir password' girildi");

            //Aynı şifre tekrar "Confirm Password"e girilir
            tulayPage.vendorRegConfirmPasswordBox.sendKeys("Zeynep425*");
            extentTest.info("'Confirm Password' girildi");

            //Register'a tıklanır
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].scrollIntoView(true);", tulayPage.vendorRegisterButton);
            jse.executeScript("arguments[0].click();", tulayPage.vendorRegisterButton);
            extentTest.info("'Register' butonuna tıklandı");

            //Welcome to Allover Commerce! Yazısının göründüğü test edilir
            Assert.assertTrue(tulayPage.vendorRegOnayText.isDisplayed());
            extentTest.pass("'Welcome to Allover Commerce!' yazısı başarıyla görüldü");

        }
    }

 */