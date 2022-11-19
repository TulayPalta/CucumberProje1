
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

    @FindBy(xpath = "(//input[@class='is-touched is-dirty av-valid form-control'])[1]")   public WebElement SSNValidFeedback;

    @FindBy(xpath = "//input[@name='firstName']")    public WebElement firstNameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")   public WebElement firstNameFeedback;

    @FindBy(xpath = "//input[@name='lastName']")      public WebElement lastNameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")     public WebElement lastNameFeedback;
}
