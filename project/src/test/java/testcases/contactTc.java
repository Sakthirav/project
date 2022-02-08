package testcases;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseclass.libraryclass;
import pages.contactpage;
public class contactTc extends libraryclass{
		contactpage Cp;
		@BeforeTest
		public void openapp()
		{
			browserSetUp();
				}
		@Test
		public void contact()
		{
			 Cp=new contactpage(driver);
			Cp.click();
		}
				@AfterTest
		/*public void teardown() throws IOException
		{
		 selenium=new seleniumutility(driver);
		 selenium.screenshot("C:\\Users\\sakthir\\git\\project\\project\\src\\test\\resources\\screenshot\\login.png");
		 //closeapp();
		}*/
		public void close() {
			tearDown();
		}
}
