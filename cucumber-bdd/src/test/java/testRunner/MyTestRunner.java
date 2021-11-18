package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="\\src\\test\\java\\features\\first.feature",
		glue="stepDefinitions")
public class MyTestRunner extends AbstractTestNGCucumberTests{

}
