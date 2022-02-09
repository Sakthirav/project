package testcases;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.libraryclass;
import pages.billingpage;
import seleniumresuableFunction.seleniumutility;

public class billingTC extends libraryclass {
	seleniumutility selenium;
	billingpage Bp;
	@BeforeTest
	public void openapp()
	{
		browserSetUp();
	}
	@Test
	public void billingdetailpage()
	{
		 Bp=new billingpage(driver);
		 Bp.login("sakthi","R","123@abc.com","abcd","coimbatore","india");
		Bp.click();
	}
	
	
	@AfterTest
	public void teardown() throws IOException
	{
		 selenium=new seleniumutility(driver);
			selenium.screenshot("C:\\Users\\sakthir\\git\\project\\project\\src\\test\\resources\\Screenshot\\Billpage.png");
	 tearDown();
	}	
}
