
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TulayPage {
    public TulayPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    /* todo isimlendirme yaparken dikkat edeceğimiz noktalar
    Link :  Tıklandığında başka bir sayfa ya da pencere açılan Web elementleri
    Text :  Sadece bir yazı içeren Web elementleri
    Box  :  İçine veri yazılabilen Web elementleri
    Button: Tıklanılabilen Web elementleri
    RadioButton: Onaylanılabilen (tick atılabilen) Web elementleri
    UyariYazisi: Yaptığımız bir işlem sonucu gelen uyarılar ya da bilgilendirme yazıları
    registiration'unun kısaltması reg
     */

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement anaSayfaRegisterLink;

    @FindBy(xpath = "//a[@href='mailto:info@allovercommerce.com']")
    public WebElement anaSayfaInfoMailLink;

    @FindBy(xpath = "//*[text()='Become a Vendor']")
    public WebElement becomeAVendorLink;

    @FindBy(xpath = "//h2[text()='Vendor Registration']")
    public WebElement vendorRegText;

    @FindBy(xpath = "(//*[text()='Email'])[1]")
    public WebElement vendorRegEmailText;

    @FindBy(xpath = "(//*[text()='Password'])[1]")
    public WebElement vendorRegPasswordText;

    @FindBy(xpath = "(//*[text()='Confirm Password'])[1]")
    public WebElement vendorRegConfirmPasswordText;

    @FindBy(xpath = "//input[@id='user_email']")
    public WebElement vendorRegEmailBox;

    @FindBy(xpath = "//span[@id='email']")
    public WebElement fakeEmailBox;

    @FindBy(xpath = "(//*[text()='Allover Commerce '])[1]")
    public WebElement fakeEmailGelen;

    @FindBy(xpath = "//span[@id='predmet']")
    public WebElement fakeEmailGelenCod;

    @FindBy(xpath = "//input[@name='wcfm_email_verified_input']")
    public WebElement vendorRegCodeBox;

    @FindBy(xpath = "//div[@class='wcfm-message email_verification_message wcfm-success']")
    public WebElement vendorRegCodeUyariText;

    @FindBy(xpath = "//input[@id='passoword']")
    public WebElement vendorRegPasswordBox;

    @FindBy(xpath = "//input[@id='confirm_pwd']")
    public WebElement vendorRegConfirmPasswordBox;

    @FindBy(xpath = "//*[@id='wcfm_membership_register_button']")
    public WebElement vendorRegisterButton;

    @FindBy(xpath = "//*[@class='wcfm-message email_verification_message wcfm-error']")
    public WebElement vendorRegMailUyariText;

    @FindBy(xpath = "//*[text()='Welcome to Allover Commerce!']")
    public WebElement vendorRegOnayText;

    @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']")
    public WebElement vendorRegMailUniceUyariText;

    @FindBy(xpath = "//*[@id='password_strength']")
    public WebElement vendorRegPasswordUyariText;

    @FindBy(xpath = "//*[text()='Password and Confirm-password are not same.']")
    public WebElement vendorRegPasswordUyari2Text;

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement anaSayfaSignInLink;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement signInUsernameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement signInPasswordBox;

    @FindBy(xpath = "(//*[text()='Sign In'])[2]")
    public WebElement signInOnayButton;

    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    public WebElement myAccountLink;

    @FindBy(xpath = "(//*[text()='Orders'])[2]")
    public WebElement sekilliOrdersLink;

    @FindBy(xpath = "(//*[text()='Downloads'])[2]")
    public WebElement sekilliDownloadsLink;

    @FindBy(xpath = "(//*[text()='Addresses'])[2]")
    public WebElement sekilliAddressesLink;

    @FindBy(xpath = "(//*[text()='Account details'])[2]")
    public WebElement sekilliAccountDetailsLink;

    @FindBy(xpath = "(//*[text()='Wishlist'])[3]")
    public WebElement sekilliwhislistLink;

    @FindBy(xpath = "(//*[text()='Logout'])[2]")
    public WebElement sekilliLogoutLink;

    @FindBy(xpath = "//*[text()='Log out']")
    public WebElement mailYaniLogOutLink;

    @FindBy(xpath = "//*[text()='Sign Out']")
    public WebElement myAccountSignOutLink;

    @FindBy(xpath = "//a[text()='Store Manager']")
    public WebElement storeManagerLink;

    @FindBy(xpath = "//a[text()='Orders']")
    public WebElement ordersLink;

    @FindBy(xpath = "//a[text()='Downloads']")
    public WebElement downloadsLink;

    @FindBy(xpath = "//a[text()='Addresses']")
    public WebElement addressesLink;

    @FindBy(xpath = "//a[text()='Account details']")
    public WebElement accountDetailsLink;

    @FindBy(xpath = "(//a[text()='Wishlist'])[1]")
    public WebElement wishlistLink;

    @FindBy(xpath = "//a[text()='Support Tickets']")
    public WebElement supportTicketsLink;

    @FindBy(xpath = "//a[text()='Followings']")
    public WebElement followingsLink;

    @FindBy(xpath = "(//*[text()='Logout'])[1]")
    public WebElement logoutLink;

    @FindBy(partialLinkText = "woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link")
    public List<WebElement> dashboardAltindakiLinkler;


}
