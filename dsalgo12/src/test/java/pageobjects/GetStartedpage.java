package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetStartedpage {
	private WebDriver driver;
	
	private By getstart=By.xpath("//a[@href='/home']");
	
	public GetStartedpage(WebDriver driver)
	{
		this.driver=driver;
	}
 public void getstartclick()
 {
	 driver.findElement(getstart).click();
 }
 
}
