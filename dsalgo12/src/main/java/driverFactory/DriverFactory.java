package driverFactory;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverFactory {
	public static WebDriver driver;

	public WebDriver init_driver(String browser) {
		
		if (browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("headless");
			driver = new ChromeDriver();
			options.setAcceptInsecureCerts(true);
		}
		else
		{
			System.out.println("please pass correct browser value"+browser);
		}
		
		getdriver().manage().deleteAllCookies();
		getdriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
		getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getdriver().manage().window().maximize();
		return getdriver();
	
	}
    
	public static  WebDriver getdriver() {
		
		return driver;
	}
  	
    public static  void closedriver() {
    	driver.close();
    }


}
