package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import utilities.ConfigReader;


public class LinkedListPage {

	public static WebDriver driver=DriverFactory.getdriver();
	String homeurl = ConfigReader.getHomePage();
	String linkedlistbackurl= ConfigReader.getLinkedListpreviuos();
	
	@FindBy (xpath  = "//a[@href='linked-list']") WebElement getstartedLinkedList ;
	@FindBy (xpath = "//a[@href='introduction']") WebElement introbutton;
	@FindBy (xpath = "//a[text()='Try here>>>']")static WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement printLL ;
	@FindBy (xpath = "//button[text()='Run']") WebElement run;
	@FindBy (xpath = "//a[text()='Creating Linked LIst']")static WebElement createLL;
	
	
	public LinkedListPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void getstartedLL() {
		getstartedLinkedList.click();
	}
	public void introduction() {
		introbutton.click();
	}
	public void tryhere() {
		tryhere.click();
	}
	public void printstatement() {
		printLL.sendKeys("print'Linked List Introduction'");
	}
	public void run() {
		run.click();
	}
	public void backLL() {
		driver.get(linkedlistbackurl);
	}
	public void createlinkedlist() {
		createLL.click();
	}
	public void tryhereLL() {
		tryhere.click();
	}
	public void printstatementLL() {
		printLL.sendKeys("print'Creating Linked List'");
	}
	public void runLL() throws Exception {
		run.click();
		Thread.sleep(1000);
	}
	public void homeurl() {
		driver.get(homeurl);
	}
}
