package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * Created by chitrang on 15/09/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/resources",glue= {"StepDefinitions"})

public class TestRunner {




}
