package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.DemoPage;

public class Test1 extends BaseTest {
	@Test(priority = 1)
	public void test1()
	{
		String un=Excel.getCellData(XL_PATH,"TestSheet",1,0);
		Reporter.log(un,true);
		Reporter.log("test1....",true);
		DemoPage d=new DemoPage(driver);
		d.setUserName(un);
				
	}


}
