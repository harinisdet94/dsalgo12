package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import utilities.ConfigReader;
public class StackPage {
	
		
		public static WebDriver driver=DriverFactory.getdriver();
		String homeurl = ConfigReader.getHomePage();
		
		@FindBy (xpath  = "//a[@href='stack']") WebElement getstartedstack ;
		@FindBy (xpath = "//a[text()='Operations in Stack']") WebElement operationstack;
		@FindBy (xpath = "//a[text()='Try here>>>']")static WebElement tryhere;
		@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement printstack ;
		@FindBy (xpath = "//button[text()='Run']") WebElement run;
		
		
		
		public StackPage() {
			PageFactory.initElements(driver, this);
		}
		
		public void getstartedstack() {
			getstartedstack.click();
		}
		public void operationstack() {
			operationstack.click();
		}
	   public void tryhere() {
		   tryhere.click();
	   }
	   public void stackprint() {
		   printstack.sendKeys("print'Stack'");
	   }
	   public void run() throws Exception {
		   run.click();
		   Thread.sleep(1000);
	   }
	   public void stackhomeurl() {
			driver.get(homeurl);
		}

	}


