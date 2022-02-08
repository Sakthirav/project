package baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class libraryclass {
	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;


	public static void browserSetUp() {
	properties = new Properties();
	try {
	FileInputStream inputStream = new FileInputStream("C:\\Users\\sakthir\\git\\project\\project\\src\\test\\resources\\configuration.property\\config.property");
	try {
	properties.load(inputStream);
	} catch (IOException e) {
	e.printStackTrace();
	}
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	}

	logger = Logger.getLogger(libraryclass.class);
	PropertyConfigurator.configure("C:\\Users\\sakthir\\git\\project\\project\\src\\test\\resources\\log4j.property\\log4j.property");
	logger.info("*******Starting with Browser Set Up*********");
	String browser = properties.getProperty("browser");
	String ur1 = properties.getProperty("ur1");
	System.out.println("ur1::::::"+ur1);


	switch (browser.toLowerCase()) {

	case "chrome":
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	break;
	case "firefox":
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	logger.info(String.format("Identified the browser as %s. Launching the browser", browser));
	break;

	case "ie":
	WebDriverManager.iedriver().setup();
	driver = new InternetExplorerDriver();
	logger.info(String.format("Identified the browser as %s. Launching the browser", browser));
	break;
	case "headlessbrowser":
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.setHeadless(true);
	WebDriver driver=new ChromeDriver(options);

	default:
	logger.info(String.format("Could not identify the browser as %s. Please specify correct browser", browser));
	break;
	}
	driver.get(ur1);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	logger.info("Launched the cucumber Application");
	}

	public static void tearDown() {
	driver.close();
	logger.info("Exiting the application and closing the browser");
	}

	}
	