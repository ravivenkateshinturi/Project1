package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/Welcome/eclipse-workspace/OrangeHRM/Features/LoginHRM1.feature",
glue= {"stepDefinitions"},
monochrome=true,
tags= {"@date"},
plugin= {"pretty","html:target/OrangeHrmReport"})
//plugin= {"json:target/cucumber.json"})

public class TestRunnerForOrangeHrm {
	



}
