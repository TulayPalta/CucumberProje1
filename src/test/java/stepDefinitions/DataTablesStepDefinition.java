package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.Driver;

public class DataTablesStepDefinition {

    DataTablesPage dataTablesPage = new DataTablesPage();

    @When("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String searchUrl) {
        Driver.getDriver().get(searchUrl);
    }
    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataTablesPage.newButton.click();
    }

    @And("isim bolumune {string} girer")
    public void isimBolumuneGirer(String firstName) {
        dataTablesPage.firstName.sendKeys(firstName);
    }

    @And("soyisim bolumune {string} girer")
    public void soyisimBolumuneGirer(String lastName) {
        dataTablesPage.lastName.sendKeys(lastName);
    }

    @And("position bolumune {string} girer")
    public void positionBolumuneGirer(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @And("ofis bolumune {string} girer")
    public void ofisBolumuneGirer(String office) {
        dataTablesPage.office.sendKeys(office);

    }

    @And("extension bolumune {string} girer")
    public void extensionBolumuneGirer(String extension) {
        dataTablesPage.extension.sendKeys(extension);
    }

    @And("startdate bolumune {string}  girer")
    public void startdateBolumuneGirer(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);
    }

    @And("salary bolumune {string} girer")
    public void salaryBolumuneGirer(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        dataTablesPage.createButton.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        dataTablesPage.searchBox.sendKeys(firstName);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstName) {
        Assert.assertEquals(dataTablesPage.nameColumn.getText(), firstName);

    }


}
