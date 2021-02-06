package org.renewbuy.runnerClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/***
 * @author verma.piyush
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\org\\renewbuy\\featureFiles\\compareHealthInsurance.feature",
        glue={"org.renewbuy.stepDefinitions"}
        ,dryRun = false
        ,monochrome = true
        ,plugin = {"pretty", "html:test-output/report.html", "json:json_output/cucumberReport.json", "junit:junit_xml/cucumber.xml" }
        ,strict = true
        ,tags = {"@CompareHealthInsurance"}
)
public class RunnerUI2 {
}
