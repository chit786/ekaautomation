package runner;

import cucumber.api.CucumberOptions;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;



/**
 * Created by chitrang on 15/09/16.
 */
//@RunWith(Cucumber.class)
//@CucumberOptions(format = {"pretty", "html:target/html"},features = "src/cucumber/resources",glue= {"StepDefinitions"})
@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
        screenShotLocation = "failImages/",
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        outputFolder = "target")
@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
        features = { "src/cucumber/resources" },
        glue = { "StepDefinitions" },
        tags = {"@home"}
        )
public class TestRunner {

}
