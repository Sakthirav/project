package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.libraryclass;
import pages.contactinfopage;
public class contactinfoTC extends libraryclass {
	contactinfopage CIp;
	@BeforeTest
	public void openapp()
	{
		browserSetUp();
		}
	@Test
	public void contactinfo()
	{
		 CIp=new contactinfopage(driver);
		CIp.contact("sakthi","123@abcd.com","hi", "hello");
		CIp.click();
	}
	@AfterTest
	public void close() {
		tearDown();
	}
}
