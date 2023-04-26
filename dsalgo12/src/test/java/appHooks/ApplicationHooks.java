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
	private static  DriverFactory driverFactory;
	private static  WebDriver driver;
	private static  ConfigReader configReader;
	static Properties prop;
	
	@BeforeAll
	public static void before() throws Throwable {
		
		try {
			configReader=new ConfigReader();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop=configReader.init_pop();
		String browserName=prop.getProperty("browser");
		driverFactory=new DriverFactory();
		driver=driverFactory.init_driver(browserName);
		LoggerLoad.info("Test is running on "+browserName);
		
	
		LoggerLoad.info("Driver is Intialized");
	}


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



	
	

