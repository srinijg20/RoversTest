package myRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features/Test.feature", glue = {
		"stepDefinitions" }, plugin = "json:json_output/cucumber.json", dryRun = false, strict = true, tags = {
				"@Srini" }, monochrome = true)
public class Testrunner {
}
