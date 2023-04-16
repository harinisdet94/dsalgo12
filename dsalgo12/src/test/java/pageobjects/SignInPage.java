package pageobjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import driverFactory.DriverFactory;


public class SignInPage {
	
	
	
	Properties prop;
	public WebDriver driver=DriverFactory.getdriver();
	

	private By signin=By.xpath("//a[@href='/login']");
	private By username=By.id("id_username");
	private By password=By.id("id_password");
	private By loginbtn=By.xpath("//input[@value='Login']");
	
		
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
}
