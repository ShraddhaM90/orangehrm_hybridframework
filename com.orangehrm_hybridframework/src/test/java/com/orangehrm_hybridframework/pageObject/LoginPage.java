package com.orangehrm_hybridframework.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	// Object Repository
	// Page layer

	@FindBy(name = "txtUsername")
	WebElement text_user;

	@FindBy(name = "txtPassword")
	WebElement text_pass;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	WebDriver driver;

	// init all WebElement on Login page

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	// Actions
	public void setUsername(String username) {
		text_user.clear();
		text_user.sendKeys(username);

	}

	public void setPassword(String password) {
		text_pass.clear();
		text_pass.sendKeys(password);
	}

	public DashboardPage clickOnLoginBtn() {
		loginBtn.click();
		if (driver.getPageSource().contains("Dashboard")) {
			Assert.assertTrue(true);
			return new DashboardPage(driver);
		} else {
			Assert.assertTrue(false, "Login failed");
			return null;

		}

	}

}
