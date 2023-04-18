package pageobjects;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import driverFactory.DriverFactory;
import utilities.ConfigReader;



public class ArrayPage {
	public static WebDriver driver=DriverFactory.getdriver();
	String homeurl = ConfigReader.getHomePage();
	String arraybackurl = ConfigReader.getarrayprevious();
	
	@FindBy (xpath = "//a[@href='array']") WebElement arrays;
	@FindBy (xpath = "//a[text()='Arrays in Python']") WebElement arraypython ;
	@FindBy (xpath = "//a[text()='Try here>>>']") WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement printcode ;
	@FindBy (xpath = "//button[text()='Run']") WebElement run;
	@FindBy (xpath = "//a[text()='Practice Questions']") WebElement practicequestion;
	@FindBy (xpath = "//a[text()='Search the array']") WebElement searcharray;
	//@FindBy (xpath = "//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[4]") WebElement practicequeText;
	@FindBy (xpath = "//textarea[@id='editor']") WebElement practicequeText;
    public ArrayPage() {
    	
    	PageFactory.initElements(driver, this);
    }
    
    public void getstartedarray() {
    	arrays.click();
    }
	 public void arrayPython() {
		 arraypython.click();
	 }
    public void tryhere() {
    	tryhere.click();
    }
	public void printcode() {
		printcode.sendKeys("print'Array'");
	}
    public void runaaray() throws Exception {
    	run.click();
  
    }
	 public void back() {
		 driver.get(arraybackurl);
	 }
	public void practisequestion() {
		practicequestion.click();
	}
	
	public void searcharray() {
		searcharray.click();
	}

	public void homepage() {
		driver.get(homeurl);
	}
/*public void prac_try()
{
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	practicequeText.clear();
	practicequeText.sendKeys("print'practice qns'");
}*/

}
