package pageobjects;



import org.apache.commons.lang.RandomStringUtils;
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
	
	   }
	public void validdata() throws Exception {
		
		
		String s = RandomStringUtils.randomAlphanumeric(6); 
		username.sendKeys(s);
	 
	   	password.sendKeys("pwdcheck1234");
	  
	   	confirmpassword.sendKeys("pwdcheck1234");
		
	   }
	public void signout() {
		Signout.click();
	}

}
