package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLogin extends BaseTest{
	@Test(priority=1)
	public void testValidLogin()
	{
		//1.Enter valid user name
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername("meeralnissa123@gmail.com");
		
		//2.Enter valid password
		loginPage.setPassword("Actitime");
		
		//3.Click Login button
		loginPage.clickLoginButton();
		
		//4.Home Page should be displayed
		EnterTimeTrackPage ettPage = new EnterTimeTrackPage(driver);
		boolean result = ettPage.verifyHomePageIsDisplayed(wait);
		Assert.assertEquals(result, true);
	}
	
	
}
