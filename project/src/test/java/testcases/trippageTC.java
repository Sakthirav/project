package testcases;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseclass.libraryclass;
import pages.trippage;



public class trippageTC extends libraryclass {
	//seleniumutility selenium;
	trippage Tp;
	@BeforeTest
	public void openapp()
	{
		browserSetUp();
	}
	@Test
	public void trippage()
	{
		 Tp=new trippage(driver);
		Tp.click();
	}
	
	@AfterTest
	public void close() {
		tearDown();
	}
}
