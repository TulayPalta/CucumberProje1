package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialPage {

    public TutorialPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='Phones & PDAs']")
    public WebElement PhonePdaclick;

    @FindBy (xpath = "//h4")
    public List<WebElement> telList;

    @FindBy (xpath = "//*[text()='Add to Cart']")
    public List<WebElement> addToCart;

    @FindBy (xpath = "//*[@id='cart-total']")
    public WebElement sepetButton;

    @FindBy (xpath = "(//*[@class='fa fa-shopping-cart'])[3]")
    public WebElement sepetButton2;

    @FindBy (xpath = "(//*[@class='table table-bordered'])[2]//tbody//td[2]")
    public List<WebElement> sepetten;


}
