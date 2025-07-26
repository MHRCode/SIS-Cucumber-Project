package sis.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features", 

		glue = "sis.steps",

		dryRun = false,
		
		monochrome = true,

		tags = "@regression",

		plugin = {
				// prints the Gherkin scenario(s) steps to the console
				"pretty",
				// creates and saves the basic html report in the target folder
				"html:target/cucumber-default-report.html",
				// stores all executed steps in a json file
				"json:target/cucumber-report.json",
	            "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"// Enables Allure reporting

		}
)

public class TestRunner {}