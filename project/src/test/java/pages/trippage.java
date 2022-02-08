package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class trippage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"primary-menu\"]/li[5]/a")
	WebElement Trips;
	public trippage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
	public void click() {
		Trips.click();
}
}
