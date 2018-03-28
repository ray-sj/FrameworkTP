package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import junit.framework.TestCase;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/features",
				plugin = {"pretty", "html:target/cucumber"},
				glue = "stepdefs",
				tags = {"@wip"})
public class RunAllTests extends TestCase{

}
