package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		WebDriverWait w = new WebDriverWait(driver,40);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"open-booking-modal\"]")));
		driver.findElement(By.xpath("//*[@id=\"open-booking-modal\"]")).click();
		 cp=new checkavilablitypage(driver);
		cp.click();
	}
	
	@AfterTest
	public void close() {
		tearDown();
	}
}
