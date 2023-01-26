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
import org.testng.Assert;

/**
 * @author Shashank
 *
 */
public class SelfCreateAccessRequestforOperatingsystem {

	WebDriver driver;

	public SelfCreateAccessRequestforOperatingsystem(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//p[contains(text(),'Create Request')]")
	public WebElement createoptionshortcut;

	// Request Information
	// Access For Self
	@FindBy(xpath = "//div[@class='p-col-4 right-border selectable-user-category']//div[@class='radiobtn']//div[1]//div[1]//div[2]")
	public WebElement accessForSelfRdbtn;

	// Access For On Behalf
	@FindBy(xpath = "//div[@class='p-col-4 right-border selectable-user-category']//div[@class='p-radiobutton-box p-component']")
	public WebElement accessForOnBehalfRdbtn;

	// Permanent Employment Status

	@FindBy(how = How.XPATH, using = "//label[text()='Permanent']/../div")
	WebElement Permanentradio;

	// Dates
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

	// Temporary Employment Status
	@FindBy(how = How.XPATH, using = "//label[text()='Temporary']/../div")
	WebElement Temporaryradio;

	// Request Category dropdown
	@FindBy(xpath = "//input[@name='requestCategory']")
	public WebElement requestCategorydropown;

	// UserDetails

	@FindBy(xpath = "//input[@name='EmployeeId']")
	public WebElement empidtxtfield;

	@FindBy(xpath = "//input[@name='JobTitle']")
	public WebElement jobtitiletxtfield;

	@FindBy(xpath = "//input[@name='JobLocation']")
	public WebElement jobloctxtfield;

	@FindBy(xpath = "//input[@name='Department']")
	public WebElement departmenttxtfield;

	// UserLineManager Details

	@FindBy(xpath = "//input[@name='Supervisor_LoginDomain']")
	public WebElement supervisorsearchfield;

	@FindBy(xpath = "//span[@class='formatted-item-email']")
	public WebElement supervisoridkey;

	// Add one more operating system access
	@FindBy(xpath = "//span[contains(text(),'Add New')]")
	public WebElement addbton;

	@FindBy(xpath = "//a[@id='pr_id_10_header_1']//span[contains(text(),'Operating System')]")
	public WebElement osaccordion;

	// Operatingsystem Details

	@FindBy(xpath = "//input[@name='Request_LocationID']")
	public WebElement Locdropdown;

	@FindBy(xpath = "//input[@name='Os_HostName']")
	public WebElement hostnamedropdown;

	@FindBy(xpath = "//input[@name='Os_SoftwareName']")
	public WebElement softwarenamedropdown;

	@FindBy(how = How.XPATH, using = "//div[@class='p-multiselect-label-container']")
	WebElement Rolesdropdown;
	
	@FindBy(how = How.XPATH, using = "(//div[@role='checkbox'])")
	WebElement allcheckboxes;

	@FindBy(xpath = "//textarea[@name='RequestComment']")
	public WebElement remarktxtfield;

	// Submit flow
	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	public WebElement submitbton;

	@FindBy(xpath = "//span[contains(text(),'Save as Draft')]")
	public WebElement draftbton;

	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	public WebElement cancelbton;

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

	public void requestInf(String reqcate, String Employeestatus) throws InterruptedException {

		createoptionshortcut.click();

		Thread.sleep(2000);

		accessForSelfRdbtn.click();

		// Permanentradio.click();

		requestCategorydropown.sendKeys(reqcate);
		Thread.sleep(2000);

		requestCategorydropown.sendKeys(Keys.ARROW_DOWN);
		requestCategorydropown.sendKeys(Keys.ENTER);

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

	}

	public void userDetails(String empid, String jobtitle, String Jobloc, String depid, String supid)
			throws InterruptedException {

		empidtxtfield.sendKeys(empid);

		jobtitiletxtfield.sendKeys(jobtitle);

		jobloctxtfield.sendKeys(Jobloc);

		departmenttxtfield.sendKeys(depid);

		supervisorsearchfield.sendKeys(supid);
		Thread.sleep(4000);
		supervisoridkey.click();

	}

	public void operatingsystemDetails(String Loc, String hostname, String softname, String remarkkey,
			String eun, String epw) throws InterruptedException {

		Locdropdown.sendKeys(Loc);
		Thread.sleep(1000);

		Locdropdown.sendKeys(Keys.ARROW_DOWN);
		Locdropdown.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		hostnamedropdown.sendKeys(hostname);

		Thread.sleep(1000);

		hostnamedropdown.sendKeys(Keys.ARROW_DOWN);
		hostnamedropdown.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		softwarenamedropdown.sendKeys(softname);

		Thread.sleep(1000);

		softwarenamedropdown.sendKeys(Keys.ARROW_DOWN);
		softwarenamedropdown.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		Rolesdropdown.click();
		Thread.sleep(3000);
		allcheckboxes.click();
		

		Thread.sleep(1000);

		remarktxtfield.sendKeys(remarkkey);

		submitbton.click();

		Thread.sleep(2000);

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

	/*
	 * public void addnewos(String Loc, String hostname,String softname,String role,
	 * String remarkkey, String eun, String epw) throws InterruptedException {
	 * 
	 * addbton.click(); Thread.sleep(2000);
	 * 
	 * osaccordion.click();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * Locdropdown.sendKeys(Loc); Thread.sleep(3000);
	 * 
	 * Locdropdown.sendKeys(Keys.ARROW_DOWN); Locdropdown.sendKeys(Keys.ENTER);
	 * 
	 * Thread.sleep(2000);
	 * 
	 * hostnamedropdown.sendKeys(hostname);
	 * 
	 * Thread.sleep(3000);
	 * 
	 * hostnamedropdown.sendKeys(Keys.ARROW_DOWN);
	 * hostnamedropdown.sendKeys(Keys.ENTER);
	 * 
	 * Thread.sleep(2000);
	 * 
	 * softwarenamedropdown.sendKeys(softname);
	 * 
	 * Thread.sleep(3000);
	 * 
	 * softwarenamedropdown.sendKeys(Keys.ARROW_DOWN);
	 * softwarenamedropdown.sendKeys(Keys.ENTER);
	 * 
	 * Thread.sleep(2000);
	 * 
	 * roledropdown.sendKeys(role); Thread.sleep(3000);
	 * 
	 * roledropdown.sendKeys(Keys.ARROW_DOWN); roledropdown.sendKeys(Keys.ENTER);
	 * 
	 * Thread.sleep(2000);
	 * 
	 * 
	 * remarktxtfield.sendKeys(remarkkey);
	 * 
	 * 
	 * submitbton.click();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * eusername.sendKeys(eun); epassword.sendKeys(epw); eAccept.click();
	 * 
	 * 
	 * }
	 */

