package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerOkuAppPage {

    public HerOkuAppPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@onclick='addElement()']")
    public WebElement addElement;

 //   @FindBy(xpath = "//*[text()='Delete']")
    @FindBy(xpath = "//*[@id='elements']")
    public WebElement deleteElement;
}
