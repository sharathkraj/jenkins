package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature_files/Ionic.feature", glue = "Step_definitions", 
                 plugin = {"json:test-output/Simpler-reports/Simpler.json",
                		   "html:test-output/Simpler-reports/Simpler.html",
                		   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                		 dryRun = false,
                  monochrome = true
                  
                   )

public class Runner_Class {

}
