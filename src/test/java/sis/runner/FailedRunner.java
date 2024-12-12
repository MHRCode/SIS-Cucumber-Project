package sis.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "@target/failed.txt", 
		glue = "sis.steps"
//plugin = { "rerun:target/failed.txt" }

)

public class FailedRunner {

}