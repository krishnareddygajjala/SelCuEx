package com.automatedtest.sample.infrastructure.driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class TearDown {

	private WebDriver driver;

	public TearDown() {
		this.driver = Setup.driver;
	}

	// adding screenshot for every step
	@AfterStep
	public void addScreenshotAfterStep(Scenario scenario) {
		saveScreenshotsForScenario(scenario);
	}

	// adding screenshot for failed step and quit the driver
	@After
	public void quitDriver(Scenario scenario) {
		if (scenario.isFailed()) {
			saveScreenshotsForScenario(scenario);
		}
		this.driver.quit();
	}

	private void saveScreenshotsForScenario(final Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}

//	public byte[] getByteScreenshot() throws IOException {
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		byte[] fileContent = FileUtils.readFileToByteArray(src);
//		return fileContent;
//	}
//
//	public byte[] getByteScreenshot1() {
//		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	}
}
