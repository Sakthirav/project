package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.libraryclass;
import pages.datapackagepage;

public class datapackageTC extends libraryclass{
	datapackagepage  dp;
	@BeforeTest
	public void openapp()
	{
		browserSetUp();
	}
	@Test
	public void datapackagepage ()
	{
		 dp=new datapackagepage (driver);
		dp.click();
	}
	
	@AfterTest
	public void close() {
		tearDown();
	}
}
