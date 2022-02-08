package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class contactpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"primary-menu\"]/li[4]/a")
	WebElement Contact;
	public contactpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
		public void click() {
			Contact.click();
		}

	}

