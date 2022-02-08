package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class triptypepage {
	WebDriver driver;
	@FindBy(xpath="//*[@id='primary-menu']/li[2]/a")
	WebElement Triptype;
	@FindBy(xpath="//*[@id='wp-travel-trip-wrapper']/div/div/div[2]/div[2]/div/div/a")
	WebElement Apartments;
	public triptypepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
	public void click() {
		Triptype.click();
		Apartments.click();
	}
}
