package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectionpackagepage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"wp-travel-trip-wrapper\"]/div[2]/div/div/div[2]/div/div[6]/div/div[3]/a")
	WebElement ViewDetails;
	public selectionpackagepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
	public void click() {
		
		ViewDetails.click();
	}
}
