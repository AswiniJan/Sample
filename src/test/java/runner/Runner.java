package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\dprab\\Downloads\\Apr_Cucumber\\Apr_Cucumber\\src\\test\\java\\feature\\Task.feature",
		glue = "stepdefinition",
		tags = "@first_One",
		dryRun = false,
		publish = true)
public class Runner {

}
