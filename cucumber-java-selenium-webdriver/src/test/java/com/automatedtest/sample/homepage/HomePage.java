package com.automatedtest.sample.homepage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automatedtest.sample.basepage.BasePage;

public class HomePage extends BasePage {

	private static final String HOME_PAGE_URL = "https://www.google.";

	@FindBy(xpath = "//img[@class='lnXdpd']")
	private WebElement logo;

	@FindBy(css = "input[name=q]")
	private WebElement searchInput;

	HomePage() {
		PageFactory.initElements(driver, this);
	}

	void goToHomePage(String country) {
		driver.get(HOME_PAGE_URL + country);
		wait.forLoading(5);
	}

	void checkLogoDisplay() {
		wait.forElementToBeDisplayed(5, this.logo, "Logo");
	}

	String getTitle() {
		return driver.getTitle();
	}

	void checkSearchBarDisplay() {
		wait.forElementToBeDisplayed(10, this.searchInput, "Search Bar");
	}

	void searchFor(String searchValue) {
		this.searchInput.sendKeys(searchValue);
		this.searchInput.sendKeys(Keys.ENTER);
	}
}
