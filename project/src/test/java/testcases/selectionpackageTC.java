package testcases;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseclass.libraryclass;
import pages.selectionpackagepage;
public class selectionpackageTC extends libraryclass{
	selectionpackagepage sp;
	@BeforeTest
	public void openapp()
	{
		browserSetUp();
	}
	@Test
	public void packagepage()
	{
		 sp=new selectionpackagepage(driver);
			sp.click();
	}
	
	@AfterTest
	public void close() {
		tearDown();
	}
}
