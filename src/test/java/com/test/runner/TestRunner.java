package com.test.runner;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFile",
        monochrome = true, dryRun = false,
        glue = "com.test.stepdefinition",
        plugin = {
                "html:target/cucumber-report",
                "json:target/cucumber.json",
                "pretty:target/cucumber-pretty.txt",
                "junit:target/cucumber-results.xml",
                "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
        })
public class TestRunner {

    @BeforeClass
    public static void setReportConfiguration() {

        ExtentProperties property = ExtentProperties.INSTANCE;
        property.setReportPath("./Reports/Reports.html");
    }

    @AfterClass
    public static void setConfiguration() {
        Reporter.loadXMLConfig("./ConfigFiles/extent-config.xml");
    }

}
