package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseclass.libraryclass;
import pages.checkavilablitypage;
public class checkavailabilityTC extends libraryclass {
	checkavilablitypage cp;
	@BeforeTest
	public void openapp()
	{
		browserSetUp();
	}
	@Test
	public void checkavailabilitypage()
	{
		 cp=new checkavilablitypage(driver);
		cp.click();
	}
	
	@AfterTest
	public void close() {
		tearDown();
	}
}
