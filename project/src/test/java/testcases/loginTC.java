package testcases;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseclass.libraryclass;
import pages.loginpage;

public class loginTC extends libraryclass{
	//seleniumutility selenium;
	loginpage lp;
	@BeforeTest
	public void openapp()
	{
		browserSetUp();
		
			}
	@Test
	public void login()
	{
		 lp=new loginpage(driver);
		lp.login("Admin_travel","travel_admin@@");
		lp.submit();
	}
	
	@AfterTest
	
	public void close() {
		tearDown();
	}
}
