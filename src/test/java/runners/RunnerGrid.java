package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/html-reports/cucumber.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "./src/test/resources/features/grid_test_case.feature",
        glue = {"stepdefinitions"},
        tags = "@grid_chrome",
        dryRun = false

)
public class RunnerGrid {
}