package pageobjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import driverFactory.DriverFactory;


public class SignInPage {
	
	
	
	Properties prop;
	public WebDriver driver=DriverFactory.getdriver();
	

	private By signin=By.xpath("//a[@href='/login']");
	private By username=By.id("id_username");
	private By password=By.id("id_password");
	private By loginbtn=By.xpath("//input[@value='Login']");
	
	@FindBy (xpath = "//a[@href='/logout\']") WebElement Signout;
	public SignInPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void signin_link()
	{
		driver.findElement(signin).click();
	}
	
	public void enter_username(String user_name)
	{
		driver.findElement(username).sendKeys(user_name);
	}
	public void enter_pwd(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void login_click()
	{
		driver.findElement(loginbtn).click();
	}
	public void signout() {
		Signout.click();
	}

}
