package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentaCarPage {

    public BlueRentaCarPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement loginButton;

    @FindBy (xpath = "//input[@id='formBasicEmail']")
    public WebElement emailTextBox;

    @FindBy (xpath = "//input[@id='formBasicPassword']")
    public WebElement passwordTextBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginSubmit;

    @FindBy (id = "dropdown-basic-button")
    public WebElement kullaniciProfilIsmi;
}
