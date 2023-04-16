package testRunner;



import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(plugin = {"pretty","json:target/cucumber-reports/Cucumber.json", "html:target/reports/login.html"}, // reporting purpose
monochrome = false, // console output
 // tags from feature file
features = {"src/test/java/features"}, // location of feature files
glue ={"stepdefinitions","appHooks"}) // location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}
}
