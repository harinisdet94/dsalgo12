package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import driverFactory.DriverFactory;
import utilities.ConfigReader;

import utilities.ScreenShots_Utils;
import utilities.registerExcelReader;

public class Registerpage {
	public static WebDriver driver=DriverFactory.getdriver();
	String url=ConfigReader.getHomePage();
	registerExcelReader RER = new registerExcelReader();
	
	@FindBy (xpath  = "//a/button") WebElement getstarted ;
	@FindBy (xpath = "//a[text()=' Register ']") WebElement registerlink;
	@FindBy (xpath = "//input[@name='username']")static WebElement username;
	@FindBy (id="id_password1") WebElement password ;
	@FindBy (id="id_password2") WebElement confirmpassword;
	@FindBy (xpath = "//input[@value='Register']") WebElement registerbtn;
	@FindBy (xpath = "//a[text()='Sign out']") WebElement Signout;
	
	public Registerpage() {
		PageFactory.initElements(driver, this);
	}
	public void url() {
		driver.get(url);
	}
	
	public void register() {
		registerlink.click();
	}
	public void emptyfeilds() throws Exception {
		registerbtn.click();
		Thread.sleep(2000);
		
	}
	
	public void takescreenshot(String filename) throws Exception {
		ScreenShots_Utils.capturescreenshots(driver,filename);
	}
	
	public void invalidusernameonly() throws Exception {
	   	String excelusername=RER.getregisterusername(2); 	
		Thread.sleep(2000);	
	   	username.sendKeys(excelusername);
	   
	   }
	public void registerclick() throws Exception {
		registerbtn.click();
			
	}
	public void invalidpassword() throws Exception {
		String excelusername=RER.getregisterusername(3); 	
	   	username.sendKeys(excelusername);
	   	
	   	String excelpassword=RER.getregisterpassword(3); 	
	   	password.sendKeys(excelpassword);
	   	Thread.sleep(2000);	
	   	
	   }
	public void mismatchdata() throws Exception {
		String excelusername=RER.getregisterusername(4); 	
	   	username.sendKeys(excelusername);
	   	String excelpassword=RER.getregisterpassword(4); 	
	   	password.sendKeys(excelpassword);
	   	String excelconfirmpassword=RER.getregisterconfirmpassword(4); 	
	   	confirmpassword.sendKeys(excelconfirmpassword);
	   Thread.sleep(2000);	
	   }
	public void validdata() throws Exception {
		//String excelusername=RER.getregisterusername(5); 	
	   	username.sendKeys("regis134");
	  // 	String excelpassword=RER.getregisterpassword(5); 	
	   	password.sendKeys("pwdcheck1234");
	   //	String excelconfirmpassword=RER.getregisterconfirmpassword(5); 	
	   	confirmpassword.sendKeys("pwdcheck1234");
	   	Thread.sleep(1000);	
	   }
	public void signout() {
		Signout.click();
	}

}
