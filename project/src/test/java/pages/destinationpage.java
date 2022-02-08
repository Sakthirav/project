package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class destinationpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"primary-menu\"]/li[3]/a")
	WebElement Destination;
	@FindBy(xpath="//*[@id=\"wp-travel-trip-wrapper\"]/div/div/div[2]/div[2]/a/img")
	WebElement Bangalure;
	public destinationpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
	public void click() {
		Destination.click();
		Bangalure.click();
	}
	
}
