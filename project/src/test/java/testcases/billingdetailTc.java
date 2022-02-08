package testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.libraryclass;
import seleniumresuableFunction.seleniumutility;

public class billingdetailTc extends libraryclass{
	seleniumutility selenium;
	pages.billingdetailpage Bp;
	@BeforeTest
	public void openapp()
	{
		browserSetUp();
	}
	@Test
	public void billingdetailpage()
	{
		 Bp=new pages.billingdetailpage(driver);
		 Bp.login("sakthi","R","123@abc.com","abcd","coimbatore","india");
		Bp.click();
	}
	
	
	@AfterTest
	public void teardown() throws IOException
	{
	 selenium=new seleniumutility(driver);
	 selenium.screenshot("C:\\Users\\sakthir\\git\\project\\project\\src\\test\\resources\\screenshot\\BillDetail.png");
	}
	public void close() {
		tearDown();
	}
}
