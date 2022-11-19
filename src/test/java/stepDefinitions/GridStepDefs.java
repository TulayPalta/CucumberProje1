package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridStepDefs {
    WebDriver driver;
    @Given("user is on the application_url {string}")
    public void user_is_on_the_application_url(String url) throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://192.168.1.27:4444"), new ChromeOptions());
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {

    }
    @Then("close the remote driver")
    public void close_the_remote_driver() {

    }


}
