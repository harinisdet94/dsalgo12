package appHooks;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;

import utilities.LoggerLoad;


public class ApplicationHooks {
	private  DriverFactory driverFactory;
	private  WebDriver driver;
	private  ConfigReader configReader;
	static Properties prop;
	


	@Before(order=0)
	public void getProperty()
	{
		configReader=new ConfigReader();
		prop=configReader.init_pop();
	}

	@Before(order=1)
	public  void lauchBrowser()
	{
		
		String browserName=prop.getProperty("browser");
		driverFactory=new DriverFactory();
		driver=driverFactory.init_driver(browserName);
	}
	
	/*@AfterAll
	public void quitbrowser()
	{
		driver.quit();
		
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
