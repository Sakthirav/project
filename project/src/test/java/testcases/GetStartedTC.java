package testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.libraryclass;
import pages.GetStartedpage;

public class GetStartedTC extends libraryclass {
	//seleniumutility selenium;
	GetStartedpage Gp;
	@BeforeMethod
	public void openapp()
	{
		browserSetUp();
	}
	@Test
	public void GetStart()
	{
		Gp=new GetStartedpage(driver);
		Gp.click();
	}
	
	@AfterMethod
	public void close() {
		tearDown();
	}
}
