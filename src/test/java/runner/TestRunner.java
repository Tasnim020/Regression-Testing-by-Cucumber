package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(   


features = "featurefiles/loginwithdata.feature",
glue = "stepDefinitions",
monochrome = true,
plugin = {"pretty","html:target/cucumber-report.html"},
dryRun = false
		
		
		
		

		)

public class TestRunner {

}
