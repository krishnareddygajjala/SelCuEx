package com.automatedtest.sample;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src/test/resources/com/automatedtest/sample/Home_page.feature" }, strict = true, 
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty","json:target/reports/cucumber_json_reports/home-page.json", "html:target/reports/home-page-html"},
				glue = {"com.automatedtest.sample.infrastructure.driver", "com.automatedtest.sample.homepage" },
				monochrome = true,
				dryRun = false)
public class HomePageTest {
}

//	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
// ,"pretty","json:target/cucumber_json_reports/home-page.json", "html:target/home-page-html"

//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json"})
//@Category(Example.class)
//public class RunCukesTest {
//
//}