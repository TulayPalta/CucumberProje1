package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage {

    public DataTablesPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='dt-button buttons-create']")
    public WebElement  newButton;

    @FindBy(css = "#DTE_Field_first_name")
    public WebElement firstName;

    @FindBy(css = "#DTE_Field_last_name")
    public WebElement lastName;

    @FindBy(css = "#DTE_Field_position")
    public WebElement position;

    @FindBy(css = "#DTE_Field_office")
    public WebElement office;

    @FindBy(css = "#DTE_Field_extn")
    public WebElement extension;

    @FindBy(css = "#DTE_Field_start_date")
    public WebElement startDate;

    @FindBy(css = "#DTE_Field_salary")
    public WebElement salary;

    @FindBy (xpath = "//*[text()='Create']")
    public WebElement createButton;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement nameColumn;

}
