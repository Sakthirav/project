package testcases;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseclass.libraryclass;
import pages.triptypepage;
import seleniumresuableFunction.seleniumutility;

public class triptypeTC extends libraryclass {
	seleniumutility selenium;
	triptypepage TT;
	@BeforeTest
	public void openapp()
	{
		browserSetUp();
	}
	@Test
	public void Triptype()
	{
	
	   TT=new triptypepage(driver);
	   TT.click();
	}
	
	@AfterTest
	public void close() {
		tearDown();
	}
}
