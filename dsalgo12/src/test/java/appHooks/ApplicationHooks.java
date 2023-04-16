package appHooks;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;

public class ApplicationHooks {
	private static DriverFactory driverFactory;
	private static WebDriver driver;
	private ConfigReader configReader;
	static Properties prop;
	
	@BeforeMethod
	@Before(order=0)
	public void getProperty()
	{
		configReader=new ConfigReader();
		prop=configReader.init_pop();
	}
	@BeforeMethod
	@Before(order=1)
	public static void lauchBrowser()
	{
		String browserName=prop.getProperty("browser");
		driverFactory=new DriverFactory();
		driver=driverFactory.init_driver(browserName);
	}
	
	/*@After(order=0)
	public void quitbrowser()
	{
		driver.close();
		
	}*/
	
	@AfterMethod
	@After(order=1)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			//take screenshot
			String screenshotname=scenario.getName().replaceAll(" ", "-");
			byte[] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotname);
		}
	}
	
}
