package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoPage {

    public DemoPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[text()='Click me'])[1]")
    public WebElement testClick1;

    @FindBy(xpath = "(//*[text()='Click me'])[2]")
    public WebElement testClick2;

    @FindBy (css = "#enableAfter")
    public WebElement willEnable;

}
