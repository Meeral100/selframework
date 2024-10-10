package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class InvalidLogin extends BaseTest{
	
	@Test(priority=2)
	
	public void testInvalidLogin()
	{
		String un = Excel.getCellData(XL_PATH, "InvalidLogin", 1, 0);
		String pwd = Excel.getCellData(XL_PATH, "InvalidLogin", 1, 1);
		
		
		//1.Enter invalid user name
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername(un);
		
		//2.Enter invalid password
		loginPage.setPassword(pwd);
		
		//3.Click Login button
		loginPage.clickLoginButton();
		
		//4.Error message should be displayed
		boolean result = loginPage.verifyErrMsgDisplayed(wait);
		Assert.assertTrue(result);
		
	}

}
