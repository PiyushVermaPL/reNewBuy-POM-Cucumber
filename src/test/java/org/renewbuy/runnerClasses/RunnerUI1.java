package org.renewbuy.runnerClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/***
 * @author verma.piyush
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\org\\renewbuy\\featureFiles\\displayNewCarInsurance1.feature",
        glue={"org.renewbuy.stepDefinitions"}
        ,dryRun = false
        ,monochrome = true
        ,plugin = {"pretty", "html:test-output/report.html", "json:json_output/cucumberReport.json", "junit:junit_xml/cucumber.xml" }
		,strict = true
        ,tags = {"@NewCarInsurance"}
)
public class RunnerUI1 {
}
