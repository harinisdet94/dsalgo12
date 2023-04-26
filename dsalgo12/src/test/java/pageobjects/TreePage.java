package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import driverFactory.DriverFactory;
import utilities.ConfigReader;

public class TreePage {

	public static WebDriver driver = DriverFactory.getdriver();
	String homeurl = ConfigReader.getHomePage();
	String treebackurl=ConfigReader.gettreepreviuos();

	@FindBy (xpath = "//a[@href='tree']") WebElement treebtn;
	@FindBy (xpath = "//a[text()='Overview of Trees']") WebElement overview;
	@FindBy (xpath = "//a[text()='Try here>>>']") WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea" )WebElement printtree;
	@FindBy (xpath = "//button[text()='Run']") WebElement runbtn;
	@FindBy (xpath = "//a[text()='Terminologies']") WebElement terminologies;
	@FindBy (xpath = "//a[text()='Types of Trees']") WebElement typesOfTrees;
	
	
	public TreePage() {
	PageFactory.initElements(driver,this);
	}
		public void getstartedtree() {
		treebtn.click();
	}
	public void overviewtree() {
	overview.click();
	}
	public void tryhere() {
		tryhere.click();
		
	}
    public void printoverview() {
    	printtree.sendKeys("print'Tree Overview'");
		   }
    public void run() throws Exception {
    	runbtn.click();
    	Thread.sleep(1000);
    }
		
    public void previouspage() {
    	driver.get(treebackurl);
    }
    
    public void terminologies() {
    	terminologies.click();
    }
    public void trybutton() {
    	tryhere.click();
    }
	public void printterminologies() {
		printtree.sendKeys("print'Tree Terminologies'");
	}
    public void runbutton() throws Exception {
    	runbtn.click();
    	Thread.sleep(1000);
    }
    public void previouspagetree() {
    	driver.get(treebackurl);
    }
    public void typesoftree() {
    	typesOfTrees.click();
    }
    public void tryb() {
    	tryhere.click();
    }
	public void printtypestree() {
		printtree.sendKeys("print'Tree Types'");
	}
    public void runb() throws Exception {
    	runbtn.click();
    	Thread.sleep(1000);
    }

   public void homepage() {
	   driver.get(homeurl);
   }

}
