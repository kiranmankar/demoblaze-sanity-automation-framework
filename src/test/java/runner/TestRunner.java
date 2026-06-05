package runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Listeners(listeners.TestListeners.class)

@CucumberOptions(

        features = "src/test/resources/features",

        glue = {
                "stepdefinitions",
                "hooks"
        },

        plugin = {
        		"pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        },

        monochrome = true
)


public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {

        return super.scenarios();
    }
}
