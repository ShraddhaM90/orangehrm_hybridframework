package com.orangehrm_hybridframework.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orandehrm_hybridframework.testBase.TestBase;
import com.orangehrm_hybridframework.pageObject.DashboardPage;
import com.orangehrm_hybridframework.pageObject.LoginPage;


public class Login_TC01 extends TestBase{
	
	
	@Test
	
	public void loginTC_001() {
		try {
			LoginPage lp = new LoginPage(driver);
			lp.setUsername("Admin");
			lp.setPassword("admin123");
			DashboardPage dp = lp.clickOnLoginBtn();
		
		} catch(Exception e) {
			
		}
	}
			
			
			
			
			
			
			@Test
			
			public void loginTC_002() {
				try {
					LoginPage lp = new LoginPage(driver);
					lp.setUsername("Admin#");
					lp.setPassword("admin123");
					lp.clickOnLoginBtn();
					if(driver.getPageSource().contains("Dashboard")) {
						Assert.assertTrue(true);
					}else {
						Assert.assertTrue(false,"Login failed");
					
					}
					
				} catch(Exception e) {
					e.printStackTrace();
			
					
		}
	}

}
