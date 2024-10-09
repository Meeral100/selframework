package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPage {    
	//tesng.xml and default url both are fb.com and we are identifying 
	@FindBy(id="username")
	private WebElement unTB;
	
	public DemoPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
}
