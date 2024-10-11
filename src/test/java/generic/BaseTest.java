package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseTest {
	public final String DEFAULT_URL="https://online.actitime.com/abc/login.do";
	public final String DEFAULT_BROWSER ="edge";
	public final String DEFAULT_ITO="9";
	public final String DEFAULT_ETO="10";
	public final String XL_PATH="./data/input.xlsx";
	public WebDriver driver;
	public WebDriverWait wait;
	
	@Parameters({"appURL","browser","ITO","ETO"})
	@BeforeMethod
	public void preCondition(@Optional(DEFAULT_URL) String appURL,@Optional(DEFAULT_BROWSER)String browser,@Optional(DEFAULT_ITO) String ITO,@Optional(DEFAULT_ETO) String ETO)
	{
		long longITO =Long.parseLong(ITO);
		long longETO =Long.parseLong(ETO);
		driver = new ChromeDriver();
		driver.get(appURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(longITO));
		wait = new WebDriverWait(driver,Duration.ofSeconds(longETO));
	}
	
	@AfterMethod
	public void postCondition()
	{
		//driver.close();
		
	}

}
