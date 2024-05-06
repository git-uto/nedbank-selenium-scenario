package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
        glue = {"hooks", "stepdefinitions"},
        monochrome = true,
        publish = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}
