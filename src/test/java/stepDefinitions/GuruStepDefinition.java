package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {

    GuruPage guru = new GuruPage();
    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String title) {
        int index = 0;
        for (int i = 0; i < guru.titles.size(); i++) {
            if (guru.titles.get(i).getText().equals(title)) {
                System.out.println(guru.titles.get(i).getText());
                index = i + 1;
                List<WebElement> columnElement =
                        Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+index+"]"));
                columnElement.forEach(t-> System.out.println(t.getText()));

//                for (WebElement w:columnElement) {
//                    System.out.println(w.getText());
//                }
            }
        }
    }
}
