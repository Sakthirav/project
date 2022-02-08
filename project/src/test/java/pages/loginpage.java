package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"post-314\"]/div/div/div[1]/div[1]/form/div[1]/input")
	WebElement username ;
	@FindBy(xpath="//*[@id=\"post-314\"]/div/div/div[1]/div[1]/form/div[2]/input")
	WebElement password;
	@FindBy(xpath="//*[@id=\"post-314\"]/div/div/div[1]/div[1]/form/div[4]/input")
	WebElement login;
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
	public void login(String uname,String psword)
	{
		username.sendKeys(uname);
		password.sendKeys(psword);
	
	}
	
	public void submit() {
		login.click();
		
	}	
}

