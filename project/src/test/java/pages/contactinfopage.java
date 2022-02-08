package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactinfopage {
        WebDriver driver;
	    @FindBy(xpath="//*[@id=\"wpcf7-f193-p296-o1\"]/form/p[1]/label/span/input")
		WebElement yourname ;
		@FindBy(xpath="//*[@id=\"wpcf7-f193-p296-o1\"]/form/p[2]/label/span/input")
		WebElement youremail;
		@FindBy(xpath="//*[@id=\"wpcf7-f193-p296-o1\"]/form/p[3]/label/span/input")
		WebElement yoursubject;
		@FindBy(xpath="//*[@id=\"wpcf7-f193-p296-o1\"]/form/p[4]/label/span/textarea")
		WebElement yourmessage;
		@FindBy(xpath="//*[@id=\"wpcf7-f193-p296-o1\"]/form/p[5]/input")
		WebElement send;
		public contactinfopage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver ,this);
		}
		public void contact(String name, String email, String subject, String message) {
				yourname.sendKeys(name);
				youremail.sendKeys(email);
				yoursubject.sendKeys(subject);
				yourmessage.sendKeys(message);
			}
		public void click() {
			send.click();
		}

}
