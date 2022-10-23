package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPracticePage {

    public AutomationPracticePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".login")
    public WebElement loginLink;

    @FindBy(css = "#email_create")
    public WebElement emailCreateLink;

    @FindBy (xpath = "//*[@class='icon-user left']")
    public WebElement createAccountButton;

    @FindBy (css = "#id_gender1")
    public WebElement genderButton;

    @FindBy (css = "#customer_firstname")
    public WebElement firstName1Box;

    @FindBy (css = "#customer_lastname")
    public WebElement lastName1Box;

    @FindBy (css = "#passwd")
    public WebElement passwordBox;

    @FindBy (css ="#days")
    public WebElement days;

    @FindBy (css ="#months")
    public WebElement months;

    @FindBy (css ="#years")
    public WebElement years;

    @FindBy (css =".form-control#firstname")
    public WebElement firstname2Box;

    @FindBy (css = ".form-control#lastname")
    public WebElement lastname2Box;

    @FindBy(css = ".form-control#address1")
    public WebElement addressBox;

    @FindBy (css = ".form-control#city")
    public WebElement cityBox;

    @FindBy (css = ".form-control#id_state")
    public WebElement idStateBox;

    @FindBy (css = ".form-control#postcode")
    public WebElement postcodeBox;

    @FindBy (css = ".form-control#phone_mobile")
    public WebElement phoneMobileBox;

    @FindBy (xpath = "//*[text()='Register']")
    public WebElement registerButton;

    @FindBy (css = ".navigation_page")
    public WebElement myAccountText;

    @FindBy (css = ".account")
    public WebElement myAccountName;
}
