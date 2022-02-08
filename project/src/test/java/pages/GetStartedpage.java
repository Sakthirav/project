package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class GetStartedpage {
	WebDriver driver;

@FindBy(xpath="//*[@id=\"banner-section\"]/div[2]/a")
	WebElement GETSTARTED;
	/*WebElement GETSTARTED=driver.findElement(By.xpath("//*[@id=\"banner-section\"]/div[2]/a"));
	Actions action=new Actions(driver);
	action.moveToElement(GETSTARTED).perform();*/
public GetStartedpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver ,this);
}
public void click() {
	GETSTARTED.click();
	
}
}
