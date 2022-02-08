package testrunner;

import org.junit.AfterClass;
import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\sakthir\\git\\project\\project\\src\\test\\resources\\feature\\testcase.feature",
plugin = {"pretty",// "html:reports/cucumberreport","json:reports/cucumberreport/jsonreport",
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
},
glue="testrunner",
strict=true
)
public class testrunner extends AbstractTestNGCucumberTests{
@AfterClass
public void Extentsreport()
{
Reporter.loadXMLConfig("/hybridcucumber/src/test/resources/extent-config.xml");
Reporter.setSystemInfo("user", System.getProperty("user.name"));
Reporter.setSystemInfo("os", "Windows");
Reporter.setTestRunnerOutput("Sample test runner output message");

}}


