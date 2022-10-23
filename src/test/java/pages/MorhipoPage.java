package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MorhipoPage {

    public MorhipoPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = "#pw-search-input")
    public WebElement searchBox;

    @FindBy (xpath = "//*[@id='total-product-count']")
    public WebElement resultTextWE;

}
