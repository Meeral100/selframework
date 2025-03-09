package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLogin extends BaseTest{
	@Test(priority=1)
	public void testValidLogin()
	{
		String un = Excel.getCellData(XL_PATH, "ValidLogin", 1, 0);
		String pwd = Excel.getCellData(XL_PATH, "ValidLogin", 1, 1);
		
		System.out.println("Total number of rows are "+Excel.getTotalRowCount(XL_PATH, "ValidLogin"));
		//1.Enter valid user name
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername(un);
		
		//2.Enter valid password
		loginPage.setPassword(pwd);
		
		//3.Click Login button
		loginPage.clickLoginButton();
		
		//4.Home Page should be displayed
		EnterTimeTrackPage ettPage = new EnterTimeTrackPage(driver);
		boolean result = ettPage.verifyHomePageIsDisplayed(wait);
		Assert.assertEquals(result, true);
		
		//scenario is complete
		//new comment
		//3rd line
		//4TH COMMENT -FINAL;
		
	}  
	
	
	
}
