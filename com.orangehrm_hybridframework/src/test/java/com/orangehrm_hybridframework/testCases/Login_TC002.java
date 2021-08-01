package com.orangehrm_hybridframework.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orandehrm_hybridframework.testBase.TestBase;
import com.orangehrm_hybridframework.pageObject.LoginPage;

public class Login_TC002 extends TestBase {
	
	//@Test
	
	//public void login_TC002() {
		
		//LoginPage login = new LoginPage(driver);
		//String uname = excelDataProvider.getStringCellData("login", 1, 0);
		//String upass = excelDataProvider.getStringCellData("login", 1, 1);
		//login.setUsername(uname);
		//login.setPassword(upass);
		//login.setUsername(excelDataProvider.getStringCellData(0, 1, 0));
		//login.setPassword(excelDataProvider.getStringCellData(0, 1, 1));
		//login.clickOnLoginBtn();
		
	//}

//}

      @Test(dataProvider="getData")
      
      public void loginTC002(String uname, String upass) {
    	  
    	  LoginPage login = new LoginPage(driver);
    	  login.setUsername(uname);
    	  login.setPassword(upass);
    	  login.clickOnLoginBtn();
      }
      
      @DataProvider
      public Object getData() {
    	  Object[][] data = excelDataProvider.getCelData("Sheet1");
    	  return data;
      }
   }
       
      
       
      
      