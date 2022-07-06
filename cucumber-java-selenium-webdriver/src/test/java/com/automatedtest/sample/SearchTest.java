package com.automatedtest.sample;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/com/automatedtest/sample/Search.feature" }, strict = true, 
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty","json:target/reports/cucumber_json_reports/search.json", "html:target/reports/search-html"}, 
 		glue = {"com.automatedtest.sample.infrastructure.driver", "com.automatedtest.sample.homepage",
				"com.automatedtest.sample.searchresultpage" })
public class SearchTest {
}

//"rerun:target/failedrerun.txt"
// "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
// plugin = {"pretty","json:target/cucumber_json_reports/search.json", "html:target/search-html"},
// ,"json:target/cucumber/cucumber1.json"