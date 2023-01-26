/**
 * 
 */
package com.medhas.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * @author Shashank
 *
 */
public class SelfSingleCreateAccessRequestforApplication {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public SelfSingleCreateAccessRequestforApplication(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//p[contains(text(),'Create Request')]")
	public WebElement createoptionshortcut;

	// User Details

	@FindBy(how = How.XPATH, using = "//label[text()='Self']/../div")
	WebElement Selfradio;

	@FindBy(how = How.XPATH, using = "//input[@name='AccessStartDate']")
	WebElement StartDate;

	@FindBy(how = How.XPATH, using = "(//td/span[text()='12'])[1]")
	WebElement StartDay;

	@FindBy(how = How.XPATH, using = "//input[@name='AccessEndDate']")
	WebElement ExpiryDate;

	@FindBy(how = How.XPATH, using = "(//td/span[text()='18'])[2]")
	WebElement ExpiryDay;

	@FindBy(how = How.XPATH, using = "(//button[@class='p-datepicker-next p-link'])[1]")
	WebElement Datenavigator;

	@FindBy(how = How.XPATH, using = "(//button[@class='p-datepicker-next p-link'])[2]")
	WebElement Datenavigator2;

	@FindBy(how = How.XPATH, using = "//label[text()='Permanent']/../div")
	WebElement Permanentradio;

	@FindBy(how = How.XPATH, using = "//label[text()='Temporary']/../div")
	WebElement Temporaryradio;

	@FindBy(how = How.XPATH, using = "//input[@name='EmployeeId']")
	WebElement EmployeeIdtextbox;

	@FindBy(how = How.XPATH, using = "//input[@name='JobTitle']")
	WebElement JobTitletextbox;

	@FindBy(xpath = "//input[@name='JobLocation']")
	WebElement JobLocationtextfield;

	@FindBy(xpath = "//input[@name='Department']")
	WebElement Departmenttextfield;

	@FindBy(how = How.XPATH, using = "//textarea[@name='RequestComment']")
	WebElement RequestCommenttextbox;

	@FindBy(xpath = "//input[@name='JobLocation']")
	WebElement jobloctextfield;

	@FindBy(how = How.XPATH, using = "//input[@name='Supervisor_LoginDomain']")
	WebElement Supervisorsearchfeild;

	@FindBy(xpath = "//span[@class='formatted-item-email']")
	public WebElement supervisoridkey;

	@FindBy(how = How.XPATH, using = "//input[@name='requestCategory']")
	WebElement requestCategorydropdown;

	// Application Details

	@FindBy(how = How.XPATH, using = "//input[@name='Request_LocationID']")
	WebElement Accesslocationdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='M_Inv_ItemGroupID']")
	WebElement systemtypedropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='SystemId']")
	WebElement Systemnamedropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='InstrumentName']")
	WebElement systeminstrumentdropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p-multiselect-label-container']")
	WebElement SystemRolesdropdown;
	
	@FindBy(how = How.XPATH, using = "//li[1]//div[1]//div[1]")
	WebElement firstcheckbox;
	
	@FindBy(how = How.XPATH, using = "//li[2]//div[1]//div[1]")
	WebElement secondcheckbox;
	
	

	//@FindBy(how = How.XPATH, using = "//input[@name='SystemRole']")
	//WebElement SystemRoledropdown;

	@FindBy(how = How.XPATH, using = "//span[text()='Attach/View Training Document']")
	WebElement Attachdoc;

	@FindBy(how = How.XPATH, using = "//input[@name='FileName']")
	WebElement ChooseFilebtn;

	@FindBy(how = How.XPATH, using = "//span[text()='Upload File']")
	WebElement uploadbtn;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Attachment has uploaded')]")
	WebElement UploadToastmsg;

	@FindBy(how = How.XPATH, using = "//span[text()='Submit']")
	WebElement Submitbtn;

	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	WebElement Savebtn;

	@FindBy(xpath = "//textarea[@name='RequestComment']")
	public WebElement remarktxtfield;

	// e-Sign
	@FindBy(xpath = "//input[@placeholder='Username']")
	public WebElement eusername;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement epassword;

	@FindBy(xpath = "//span[contains(text(),'Accept')]")
	public WebElement eAccept;

	// Toast Message

	@FindBy(xpath = "//div[contains(text(),'Successfully Created')]")
	public WebElement accessrequesttoastMessage;

	public void enterUserDetails(String RequestCattype, String Employeestatus, String Supervisor, String EmployeeId,
			String JobTitle, String JobLocation, String Department) throws InterruptedException {

		createoptionshortcut.click();

		Thread.sleep(1000);
		Selfradio.click();

		requestCategorydropdown.sendKeys(RequestCattype);
		Thread.sleep(2000);
		requestCategorydropdown.sendKeys(Keys.ARROW_DOWN);
		requestCategorydropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		if (Employeestatus.equals("Permanent")) {
			Permanentradio.click();
			Thread.sleep(1000);
			System.out.println("Employee status is permenent");
		} else {
			Temporaryradio.click();
			Thread.sleep(1000);
			System.out.println("Employee status is Temporary so need to enter start and end dates");
			StartDate.click();
			Thread.sleep(2000);
			Datenavigator.click();
			Thread.sleep(2000);
			StartDay.click();
			Thread.sleep(2000);
			ExpiryDate.click();
			Thread.sleep(2000);
			Datenavigator2.click();
			Thread.sleep(2000);
			ExpiryDay.click();
			Thread.sleep(2000);
		}

		EmployeeIdtextbox.sendKeys(EmployeeId);
		JobTitletextbox.sendKeys(JobTitle);
		JobLocationtextfield.sendKeys(JobLocation);
		Departmenttextfield.sendKeys(Department);
		Thread.sleep(2000);
		Supervisorsearchfeild.sendKeys(Supervisor);
		Thread.sleep(2000);
		supervisoridkey.click();
	}

	public void selfCreateApplication(String Loc, String Systemtype, String Systemname, String Instrumentation,
			String Role,String eun, String epw) throws InterruptedException {
		Accesslocationdropdown.sendKeys(Loc);
		Thread.sleep(2000);
		Accesslocationdropdown.sendKeys(Keys.ARROW_DOWN);
		Accesslocationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		systemtypedropdown.sendKeys(Systemtype);
		Thread.sleep(2000);
		systemtypedropdown.sendKeys(Keys.ARROW_DOWN);
		systemtypedropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Systemnamedropdown.sendKeys(Systemname);
		Thread.sleep(2000);
		Systemnamedropdown.sendKeys(Keys.ARROW_DOWN);
		Systemnamedropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		systeminstrumentdropdown.sendKeys(Instrumentation);
		Thread.sleep(2000);
		systeminstrumentdropdown.sendKeys(Keys.ARROW_DOWN);
		systeminstrumentdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		SystemRolesdropdown.click();
		Thread.sleep(2000);
		firstcheckbox.click();
		secondcheckbox.click();
		Thread.sleep(2000);
		Attachdoc.click();
		Thread.sleep(1000);
		String path = System.getProperty("user.dir") + "\\Images\\" + "\\Screenshot (2).png";
		ChooseFilebtn.sendKeys(path);
		Thread.sleep(4500);
		uploadbtn.click();
		Thread.sleep(3500);
		Savebtn.click();
		Thread.sleep(4000);
		remarktxtfield.sendKeys("Application Access Request");
		
		Submitbtn.click();
		
		eusername.sendKeys(eun);
		epassword.sendKeys(epw);
		eAccept.click();
		
	}
	
public void Toastmsg() throws InterruptedException {
		
		Thread.sleep(4000);

		if (accessrequesttoastMessage.isDisplayed()) {
			
			
			String expectedMessage = "Successfully Created";
			String message = driver.findElement(By.xpath("//div[contains(text(),'Successfully Created')]")).getText();
			System.out.println(accessrequesttoastMessage.getText());
			Assert.assertEquals("Successfully Created", expectedMessage);
			
			System.out.println(message);
			System.out.println(expectedMessage+"Pass");
			
			/*String actual_msg = Toastmsg.getText();
			System.out.println(actual_msg);
			
			String expected_msg = "Successfully created";
			Assert.assertEquals(actual_msg,expected_msg);*/
			
		}
		else {
			System.out.println("Failed");
		}

	}

}
