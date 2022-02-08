package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class billingdetailpage {
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"open-booking-modal\"]")
	WebElement Firstname;
	@FindBy(xpath="//*[@id=\"open-booking-modal\"]")
	WebElement Lastname;
	@FindBy(xpath="//*[@id=\"open-booking-modal\"]")
	WebElement Email;
	@FindBy(xpath="//*[@id=\"open-booking-modal\"]")
	WebElement Address;
	@FindBy(xpath="//*[@id=\"open-booking-modal\"]")
	WebElement City;
	@FindBy(xpath="//*[@id=\"open-booking-modal\"]")
	WebElement Country;
	@FindBy(xpath="//*[@id=\"wp-travel-engine-new-checkout-form\"]/div[7]/div[2]/label")
	WebElement paymentmethod;
	@FindBy(xpath="//*[@id=\"wp_travel_engine_booking_setting[terms_conditions]\"]")
	WebElement checkbox;
	@FindBy(xpath="//*[@id=\"wp-travel-engine-new-checkout-form\"]/div[9]/input")
	WebElement Booknow;
	public billingdetailpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
	public void login(String Fname,String Lname,String email,String address,String city,String country)
	{
		Firstname.sendKeys(Fname);
		Lastname.sendKeys(Lname);
		Firstname.sendKeys(email);
		Lastname.sendKeys(address);
		Firstname.sendKeys(city);
		Lastname.sendKeys(country);
	
	}
	public void click() {
		paymentmethod.click();
		checkbox.click();
		Booknow.click();
}
}
