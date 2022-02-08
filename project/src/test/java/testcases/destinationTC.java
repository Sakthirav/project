package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.libraryclass;
import pages.destinationpage;



public class destinationTC extends libraryclass {
	//seleniumutility selenium;
	destinationpage Dp;
	@BeforeTest
	public void openapp()
	{
		browserSetUp();
	}
	@Test
	public void destination()
	{
		 Dp=new destinationpage(driver);
		Dp.click();
	}
	
	@AfterTest
	public void close() {
		tearDown();
	}
}
