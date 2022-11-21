
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TulayPage {
    public TulayPage() {PageFactory.initElements(Driver.getDriver(), this);  }
    @FindBy(id = "account-menu")   public WebElement accountMenu;
    @FindBy(xpath = "//*[text()='Register']")   public WebElement register;
    @FindBy(xpath = "//input[@name='ssn']")   public WebElement ssnBox;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")   public WebElement SSNFeedback;

    @FindBy(xpath = "//*[.='Your SSN is required.']")   public WebElement SSNRequiredFeedback;
    @FindBy(xpath = "//*[.='Your FirstName is required.']")   public WebElement firstNameRequiredFeedback;

    @FindBy(xpath = "//*[.='Your LastName is required.']")   public WebElement lastNameRequiredFeedback;

    @FindBy(xpath = "(//input[@class='is-touched is-dirty av-valid form-control'])[1]")   public WebElement SSNValidFeedback;
    @FindBy(xpath = "//input[@name='firstName']")    public WebElement firstNameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")   public WebElement firstNameFeedback;

    @FindBy(xpath = "//input[@name='lastName']")      public WebElement lastNameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")     public WebElement lastNameFeedback;

    @FindBy(xpath = "//input[@name='username']")    public WebElement userNameBox;
    @FindBy(xpath = "//*[.='Your username is required.']")   public WebElement userNameRequiredFeedback;

    @FindBy(xpath = "//input[@name='email']")    public WebElement emailBox;

    @FindBy(xpath = "//*[.='Your email is required.']")   public WebElement emailRequiredFeedback;

    @FindBy(xpath = "//*[@id=\"register-form\"]/div[5]/div")   public WebElement emailInvalidFeedback;

    @FindBy(xpath = "//*[@id='firstPassword']")   public WebElement newPasswordBox;


    @FindBy(xpath = "//*[.='Your password is required to be at least 4 characters.']")
    public WebElement invalidPasswordFeedback;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement newPasswordFirstColor;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    public WebElement newPasswordSecondColor;

    @FindBy(xpath = "//li[@style='background-color: rgb(153, 255, 0);']")
    public WebElement newPasswordFourthColor;

    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);']")
    public WebElement newPasswordFifthColor;
    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement newPasswordSec;
    @FindBy(xpath = "//input[@placeholder='Confirm the new password']")
    public WebElement confirmationPasswordRegisterPage;

    @FindBy(xpath = "//div[text()='The password and its confirmation do not match!']")
    public WebElement invalidPasswordConfirmationMessageRegisterPage;

    @FindBy(id = "register-submit")
    public WebElement buttonRegisterPage;

    @FindBy(xpath = "//*[text()='Registration saved!']")
    public WebElement successMessageToastContainerRegisterPage;


}
