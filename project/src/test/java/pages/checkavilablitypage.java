package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class checkavilablitypage {
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"open-booking-modal\"]")
	WebElement Checkavailability;
	public checkavilablitypage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
	public void click() {
		Checkavailability.click();
}
}
