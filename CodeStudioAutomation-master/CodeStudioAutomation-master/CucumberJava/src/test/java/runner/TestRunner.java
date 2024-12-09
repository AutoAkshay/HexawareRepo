package runner;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",glue = "stepdef",tags = "@ScenarioOutline")
public class TestRunner extends AbstractTestNGCucumberTests{

}
