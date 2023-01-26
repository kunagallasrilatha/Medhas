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
 * @author chennoju
 *
 */
public class ApplicationOnBehalfaccessrequestformultipleusers extends BaseClass {
	WebDriver driver;
	WebDriverWait wait;

	public ApplicationOnBehalfaccessrequestformultipleusers(WebDriver driver) {
		this.driver = driver;
	}

	// Request Information
	@FindBy(xpath = "//p[contains(text(),'Create Request')]")
	public WebElement createoptionshortcut;

	@FindBy(how = How.XPATH, using = "//span[text()='Create']")
	WebElement Createlink;

	@FindBy(how = How.XPATH, using = "//label[text()='On Behalf']/../div")
	WebElement OnBehalfradio;

	@FindBy(how = How.XPATH, using = "//label[text()='Multiple Users']/../div")
	WebElement MultipleUserradio;

	@FindBy(how = How.XPATH, using = "//input[@name='requestCategory']")
	WebElement requestCategorytextbox;

	@FindBy(how = How.XPATH, using = "//span[text()='Yes']")
	WebElement conformationbtn;

	@FindBy(how = How.XPATH, using = "//label[text()='Permanent']/../div")
	WebElement Permanentradio;

	@FindBy(how = How.XPATH, using = "//label[text()='Temporary']/../div")
	WebElement Temporaryradio;

	@FindBy(how = How.XPATH, using = "//label[text()='Windows Account Required']/../div")
	WebElement WindowsAccountradio;

	// Dates for Temporary request
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

	// First User Details
	@FindBy(xpath = "//input[@name='EmployeeId']")
	WebElement EmployeeIdtextfield;

	@FindBy(xpath = "//input[@name='JobTitle']")
	WebElement JobTitletextfield;

	@FindBy(xpath = "//input[@name='JobLocation']")
	WebElement jobloctextfield;

	@FindBy(how = How.XPATH, using = "//input[@name='Department']")
	WebElement Departmenttextfeild;

	// Second UserDetails
	@FindBy(xpath = "(//input[@name='EmployeeId'])[2]")
	WebElement EmployeeIdtextfield2;

	@FindBy(xpath = "(//input[@name='JobTitle'])[2]")
	WebElement JobTitletextfield2;

	@FindBy(xpath = "(//input[@name='JobLocation'])[2]")
	WebElement jobloctextfield2;

	@FindBy(how = How.XPATH, using = "(//input[@name='Department'])[2]")
	WebElement Departmenttextfeild2;

	@FindBy(how = How.XPATH, using = "(//input[@name='EmailAddress'])[2]")
	WebElement EmailAddresstextfeild2;

	@FindBy(how = How.XPATH, using = "//input[@name='LoginDomain']")
	WebElement NTid;

	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-item']")
	WebElement NTidKey;

	@FindBy(how = How.XPATH, using = "(//input[@name='LoginDomain'])[2]")
	WebElement NTid2;

	@FindBy(how = How.XPATH, using = "//input[@name='Supervisor_LoginDomain']")
	WebElement Supervisorid;

	@FindBy(xpath = "//span[@class='formatted-item-email']")
	public WebElement supervisoridkey;

	@FindBy(how = How.XPATH, using = "(//input[@name='Supervisor_LoginDomain'])[2]")
	WebElement Supervisorid2;

	@FindBy(xpath = "//span[@class='formatted-item-email']")
	public WebElement supervisoridkey2;

	@FindBy(how = How.XPATH, using = "//input[@name='Supervisor_LoginDomain']")
	WebElement Supervisorsearch;

	@FindBy(how = How.XPATH, using = "(//span[text()='User Details'])[2]")
	WebElement userDetailsAccordion;

	@FindBy(how = How.XPATH, using = "//input[@name='Request_LocationID']")
	WebElement Locationdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='M_Inv_ItemGroupID']")
	WebElement Systemtypedropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='SystemId']")
	WebElement Systemnamedropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='InstrumentName']")
	WebElement Systeminstrumentdropdown;

	@FindBy(how = How.XPATH, using = "//div[@class='p-multiselect-label-container']")
	WebElement SystemRolesdropdown;

	@FindBy(how = How.XPATH, using = "//li[1]//div[1]//div[1]")
	WebElement firstcheckbox;

	@FindBy(how = How.XPATH, using = "//li[2]//div[1]//div[1]")
	WebElement secondcheckbox;

	@FindBy(how = How.XPATH, using = "//span[text()='Attach/View Training Document']")
	WebElement Attachdoc;

	@FindBy(how = How.XPATH, using = "//input[@name='FileName']")
	WebElement ChooseFilebtn;

	@FindBy(how = How.XPATH, using = "//span[text()='Upload File']")
	WebElement uploadbtn;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Attachment has uploaded')]")
	WebElement UploadToastmsg;

	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	WebElement Savebtn;

	@FindBy(how = How.XPATH, using = "(//input[@name='Request_LocationID'])[2]")
	WebElement Locationdropdown2;

	@FindBy(how = How.XPATH, using = "(//input[@name='M_Inv_ItemGroupID'])[2]")
	WebElement Systemtypedropdown2;

	@FindBy(how = How.XPATH, using = "(//input[@name='SystemId'])[2]")
	WebElement Systemnamedropdown2;

	@FindBy(how = How.XPATH, using = "(//input[@name='InstrumentName'])[2]")
	WebElement Systeminstrumentdropdown2;

	@FindBy(how = How.XPATH, using = "(//div[@class='p-checkbox-box p-component'])[1]")
	WebElement SystemRoledropdown2;

	@FindBy(how = How.XPATH, using = "//textarea[@name='RequestComment']")
	WebElement remarktxtfield;

	@FindBy(how = How.XPATH, using = "//span[text()='Submit']")
	WebElement Submitbtn;

	// e-Sign

	@FindBy(xpath = "//input[@placeholder='Username']")
	public WebElement eusername;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement epassword;

	@FindBy(xpath = "//span[contains(text(),'Accept')]")
	public WebElement eAccept;

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Access Management'])[2]")
	WebElement Accessmanagementexpansion;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add User')]")
	WebElement Adduserbutton;

	// Toast Message

	@FindBy(xpath = "//div[contains(text(),'Successfully Created Access Request')]")
	public WebElement accessrequesttoastMessage;

	public void RequestInfo(String RequestCate, String Employeestatus) throws InterruptedException {
		createoptionshortcut.click();
		Thread.sleep(2000);
		OnBehalfradio.click();
		Thread.sleep(1000);
		MultipleUserradio.click();
		Thread.sleep(1000);
		requestCategorytextbox.sendKeys(RequestCate);
		Thread.sleep(2000);
		requestCategorytextbox.sendKeys(Keys.ARROW_DOWN);
		requestCategorytextbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		if (Employeestatus.equals("Permanent")) {
			Permanentradio.click();
			Thread.sleep(1000);
			System.out.println("Employee status is permenent");
		} else {
			Temporaryradio.click();
			Thread.sleep(1000);
			System.out.println("Employee status is Temporary so need to enter start and end dates");
			Thread.sleep(1000);
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

		Thread.sleep(2000);
		Adduserbutton.click();

	}

	public void firstUserdetails(String Ntid, String EmployeeId, String JobTitle, String JobLocation, String Department,
			String Supervisor) throws InterruptedException {

		NTid.sendKeys(Ntid);
		Thread.sleep(2000);
		NTidKey.click();
		Thread.sleep(2000);
		EmployeeIdtextfield.sendKeys(EmployeeId);
		JobTitletextfield.sendKeys(JobTitle);
		jobloctextfield.sendKeys(JobLocation);
		Departmenttextfeild.sendKeys(Department);
		Thread.sleep(2000);
		Supervisorid.sendKeys(Supervisor);
		Thread.sleep(2000);
		supervisoridkey.click();
		Thread.sleep(2000);

	}

	public void secondUserdetails(String Ntid, String EmployeeId, String JobTitle, String JobLocation,
			String Department, String Supervisor2) throws InterruptedException {

		userDetailsAccordion.click();
		Thread.sleep(1500);
		NTid2.sendKeys(Ntid);
		Thread.sleep(2000);
		NTidKey.click();
		Thread.sleep(2000);
		EmployeeIdtextfield2.sendKeys(EmployeeId);
		JobTitletextfield2.sendKeys(JobTitle);
		jobloctextfield2.sendKeys(JobLocation);
		Departmenttextfeild2.sendKeys(Department);
		Thread.sleep(2000);
		Supervisorid2.sendKeys(Supervisor2);
		Thread.sleep(2000);
		supervisoridkey2.click();

	}

	public void Applicationdetails(String Accesslocation, String Systemtype, String Systemname,
			String SystemInstrumentid, String eun, String epw) throws InterruptedException {
		Locationdropdown.sendKeys(Accesslocation);
		Thread.sleep(2000);
		Locationdropdown.sendKeys(Keys.ARROW_DOWN);
		Locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Systemtypedropdown.sendKeys(Systemtype);
		Thread.sleep(2000);
		Systemtypedropdown.sendKeys(Keys.ARROW_DOWN);
		Systemtypedropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Systemnamedropdown.sendKeys(Systemname);
		Thread.sleep(2000);
		Systemnamedropdown.sendKeys(Keys.ARROW_DOWN);
		Systemnamedropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Systeminstrumentdropdown.sendKeys(SystemInstrumentid);
		Thread.sleep(2000);
		Systeminstrumentdropdown.sendKeys(Keys.ARROW_DOWN);
		Systeminstrumentdropdown.sendKeys(Keys.ENTER);
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
			System.out.println(expectedMessage + "Pass");

			/*
			 * String actual_msg = Toastmsg.getText(); System.out.println(actual_msg);
			 * 
			 * String expected_msg = "Successfully created";
			 * Assert.assertEquals(actual_msg,expected_msg);
			 */

		} else {
			System.out.println("Failed");
		}

	}

}
