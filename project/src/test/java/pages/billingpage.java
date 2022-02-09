package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class billingpage {
	WebDriver driver;
    @FindBy(xpath="//*[@id=\"wp_travel_engine_booking_setting[place_order][booking][fname]\"]")
	WebElement Firstname;
	@FindBy(xpath="//*[@id=\"wp_travel_engine_booking_setting[place_order][booking][lname]\"]")
	WebElement Lastname;
	@FindBy(xpath="//*[@id=\"wp_travel_engine_booking_setting[place_order][booking][email]\"]")
	WebElement Email;
	@FindBy(xpath="//*[@id=\"wp_travel_engine_booking_setting[place_order][booking][address]\"]")
	WebElement Address;
	@FindBy(xpath="//*[@id=\"wp_travel_engine_booking_setting[place_order][booking][city]\"]")
	WebElement City;
	@FindBy(xpath="//*[@id=\"wp_travel_engine_booking_setting[place_order][booking][country]\"]")
	WebElement  Country;
	@FindBy(xpath="//*[@id=\"wp-travel-engine-new-checkout-form\"]/div[7]/div[1]/label")
	WebElement paymentmethod;
	@FindBy(xpath="//*[@id=\"wp_travel_engine_booking_setting[terms_conditions]\"]")
	WebElement paymentmethod1;
	@FindBy(xpath="//*[@id=\"wp-travel-engine-new-checkout-form\"]/div[9]/input")
	WebElement checkbox;
	@FindBy(id="wp_travel_engine_nw_bkg_submit")
	WebElement Booknow;
	public billingpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
	public void login(String fname, String lname, String email, String address, String city, String country) {
		Firstname.sendKeys(fname);
		Lastname.sendKeys(lname);
		Email.sendKeys(email);
		Address.sendKeys(address);
		City.sendKeys(city);
		Country.sendKeys(country);
		}
	public void click() {
		paymentmethod.click();
		paymentmethod1.click();
		checkbox.click();
		Booknow.click();
}
	
}
