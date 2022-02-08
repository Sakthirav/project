package stepdefinition;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.libraryclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GetStartedpage;
import pages.billingpage;
import pages.checkavilablitypage;
import pages.contactinfopage;
import pages.contactpage;
import pages.datapackagepage;
import pages.destinationpage;
import pages.loginpage;
import pages.selectionpackagepage;
import pages.trippage;
import pages.triptypepage;
import seleniumresuableFunction.seleniumutility;


public class loginstep extends libraryclass {
	seleniumutility selenium;
	GetStartedpage Gp;
	triptypepage TT;
	destinationpage Dp;
	contactpage Cp;
	contactinfopage CIp;
	trippage Tp;
	selectionpackagepage sp;
	checkavilablitypage cp;
	datapackagepage dp;
	loginpage lp;
	billingpage Bp;
	@Given("To launch the application and navigate to url")
	public void to_launch_the_application_and_navigate_to_url() {
	
		browserSetUp(); 
		logger.info("*******Browser Launch*********");
	}
	@When("To click the getstart button")
	public void to_click_the_getstart_button() {
		Gp=new GetStartedpage(driver);
		Gp.click();
		logger.info("*******GetStarted Launch*********");
	}
	@Then("Navigate to the triptype page")
	public void navigate_to_the_triptype_page() {
		TT=new triptypepage(driver);
		TT.click();
		logger.info("*******Triptype Launch*********");
	}
	
	@Then("Navigate to the Destination page")
	public void navigate_to_the_Destination_page() {
		 Dp=new destinationpage(driver);
		Dp.click();
		logger.info("*******Destination Launch*********");
	}
	@Then("Navigate to the contact page")
	public void navigate_to_the_contact_page() {
		 Cp=new contactpage(driver);
			Cp.click();
			logger.info("*******Contact page*********");
	}
	@Then("Enter the {string} , {string} , {string} and {string}")
	public void enter_the_and(String name, String email, String subject, String message) {
		 CIp=new contactinfopage(driver);
			CIp.contact("sakthi","123@abcd.com","hi", "hello");
			CIp.click();
			logger.info("*******Contact Info page*********");
	}
    @Then("Navigate to the trips page")
    public void navigate_to_the_trips_page() {
	    Tp=new trippage(driver);
		Tp.click();
		logger.info("*******Trip page*********");
}
    @Then("Select a package")
    public void select_a_package() {
    	 sp=new selectionpackagepage(driver);
			sp.click();
			logger.info("*******Trip Selection*********");
    }
    @Then("Navigate to the Availability of package")
    public void navigate_to_the_Availability_of_package() {
    	WebDriverWait w = new WebDriverWait(driver,40);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"open-booking-modal\"]")));
		driver.findElement(By.xpath("//*[@id=\"open-booking-modal\"]")).click();
    	//cp=new checkavilablitypage(driver);
    	//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 		//cp.click();
 		logger.info("*******Trip  Availability*********");
    }
    @Then("Select date and member")
    public void select_date_and_member() {
    	 dp=new datapackagepage (driver);
 		dp.click();
 		logger.info("*******Date  Availability*********");
    }
    @Then("Enter the {string} and {string}")
    public void enter_the_and(String username, String password) {
    	 lp=new loginpage(driver);
 		lp.login("Admin_travel","travel_admin@@");
 		lp.submit();
 		logger.info("*******Login into Travel Application*********");
    }
   /* @Then("Enter Billing info {string} , {string} , {string} , {string} , {string} and {string} and Book the Trip")
    public void enter_Billing_info_and_and_Book_the_Trip(String Firstname, String Lastname, String Email, String Address, String City, String country) {
    	 Bp=new billingpage(driver);
		 Bp.login("sakthi","R","123@abc.com","abcd","coimbatore","india");
		Bp.click();   	
    }*/
    @Then("Enter Billing info {string} , {string} , {string} , {string} , {string} and {string}")
    public void enter_Billing_info_and(String fname, String lname, String email, String address, String city, String country) {
    	 Bp=new billingpage(driver);
    	 Bp.login("sakthi","R","123@abc.com","abcd","coimbatore","india");
    	 Bp.click();
    	
    }
    @Then("Screenshot of trip booking bill")
    public void screenshot_of_trip_booking_bill() throws IOException {
    	selenium=new seleniumutility(driver);
		selenium.screenshot("C:\\Users\\sakthir\\git\\project\\project\\src\\test\\resources\\screenshot\\BillDetail.png");
		logger.info("*******Taking Screenshot*********");
		 tearDown();
    }
}

	