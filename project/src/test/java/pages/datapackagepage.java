package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class datapackagepage {
	WebDriver driver;
	//WebDriverWait w = new WebDriverWait(driver,40);
	//w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"open-booking-modal\"]")));
	@FindBy(xpath="//*[@id=\"wte-booking-datetime-content\"]/div/div/div[2]/div[2]/div/div[2]/div/span[18]")
	WebElement date;
	@FindBy(xpath="//*[@id=\"wte-booking-packages-content\"]/div/div[2]/div/div[2]/div[2]/button[2]")
	WebElement trippackage;
	@FindBy(xpath="//*[@id=\"wteProcessNext\"]")
	WebElement checkout;
	
	public datapackagepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
	public void click() {
		date.click();
		trippackage.click();
		checkout.click();
}
}
