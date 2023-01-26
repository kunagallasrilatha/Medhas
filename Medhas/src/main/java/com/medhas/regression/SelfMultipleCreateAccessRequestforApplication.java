package com.medhas.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SelfMultipleCreateAccessRequestforApplication extends BaseClass {
	WebDriver driver;
	WebDriverWait wait;

	public SelfMultipleCreateAccessRequestforApplication(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//p[contains(text(),'Create Request')]")
	public WebElement createoptionshortcut;

	@FindBy(how = How.XPATH, using = "//span[text()='Submit']")
	WebElement Submitbtn;

	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	WebElement Savebtn;
	
	@FindBy(how = How.XPATH, using = "//button[@class='p-button p-component submit-btn p-button-text-only']//span[@class='p-button-text p-c'][contains(text(),'Save')]")
	WebElement Savebtn2;
	
	

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
	WebElement Remarkstxtfield;

	@FindBy(xpath = "//input[@name='JobLocation']")
	WebElement jobloctextfield;

	@FindBy(how = How.XPATH, using = "//input[@name='Supervisor_LoginDomain']")
	WebElement Supervisorsearchfeild;

	@FindBy(xpath = "//span[@class='formatted-item-email']")
	public WebElement supervisoridkey;

	@FindBy(how = How.XPATH, using = "//input[@name='requestCategory']")
	WebElement requestCategorytextbox;

	@FindBy(how = How.XPATH, using = "(//input[@name='username'])[1]")
	WebElement eUsername;

	@FindBy(how = How.XPATH, using = "(//input[@name='password'])[1]")
	WebElement ePassword;

	@FindBy(how = How.XPATH, using = "//input[@name='Request_LocationID']")
	WebElement Accesslocationdropdown;

	@FindBy(how = How.XPATH, using = "(//input[@name='Request_LocationID'])[2]")
	WebElement Accesslocationdropdown2;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p-multiselect-label-container']")
	WebElement SystemRolesdropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='pr_id_3_content_1']//div[@class='p-multiselect-label-container']")
	WebElement SystemRolesdropdown2;
	
	@FindBy(how = How.XPATH, using = "//li[1]//div[1]//div[1]")
	WebElement firstcheckbox;
	
	@FindBy(how = How.XPATH, using = "//li[2]//div[1]//div[1]")
	WebElement secondcheckbox;
	
	@FindBy(how = How.XPATH, using = "//div[@id='pr_id_3_content_1']//li[1]//div[1]//div[1]")
	WebElement firstcheckbox2;
	
	@FindBy(how = How.XPATH, using = "//div[@id='pr_id_3_content_1']//li[2]//div[1]//div[1]")
	WebElement secondcheckbox2;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p-multiselect-header']//div[@class='p-checkbox-box p-component']")
	WebElement allcheckbox2;
	
	

	@FindBy(how = How.XPATH, using = "//input[@name='M_Inv_ItemGroupID']")
	WebElement systemtypedropdown;

	@FindBy(how = How.XPATH, using = "(//input[@name='M_Inv_ItemGroupID'])[2]")
	WebElement systemtypedropdown2;

	@FindBy(how = How.XPATH, using = "//input[@name='SystemId']")
	WebElement Systemnamedropdown;

	@FindBy(how = How.XPATH, using = "(//input[@name='SystemId'])[2]")
	WebElement Systemnamedropdown2;

	@FindBy(how = How.XPATH, using = "//input[@name='InstrumentName']")
	WebElement systeminstrumentationdropdown;

	@FindBy(how = How.XPATH, using = "(//input[@name='InstrumentName'])[2]")
	WebElement systeminstrumentationdropdown2;

	

	@FindBy(how = How.XPATH, using = "(//span[text()='Accept'])[1]")
	WebElement Acceptbutton;

	@FindBy(how = How.XPATH, using = "//span[text()='Attach/View Training Document']")
	WebElement Attachdoc;
	
	@FindBy(how = How.XPATH, using = "//div[@id='pr_id_3_content_1']//span[@class='p-button-text p-c'][contains(text(),'Attach')]")
	WebElement Attachdoc2;
	
	

	@FindBy(how = How.XPATH, using = "//input[@name='FileName']")
	WebElement ChooseFilebtn;

	@FindBy(how = How.XPATH, using = "//span[text()='Upload File']")
	WebElement uploadbtn;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Attachment has uploaded')]")
	WebElement UploadToastmsg;

	@FindBy(how = How.XPATH, using = "(//span[@class='p-accordion-header-text'])[3]")
	WebElement Appdetailsexpand;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
	WebElement addnewbtn;

	// Toast Message

	@FindBy(xpath = "//div[contains(text(),'Successfully Created')]")
	public WebElement accessrequesttoastMessage;

	public void reqInfo(String RequestCattype, String Employeestatus, String Supervisor, String EmployeeId,
			String JobTitle, String JobLocation, String Department) throws InterruptedException {
		createoptionshortcut.click();
		Thread.sleep(2000);
		Selfradio.click();
		requestCategorytextbox.sendKeys(RequestCattype);
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
		Supervisorsearchfeild.sendKeys(Supervisor);
		Thread.sleep(2000);
		supervisoridkey.click();
		Thread.sleep(2000);
		EmployeeIdtextbox.sendKeys(EmployeeId);
		JobTitletextbox.sendKeys(JobTitle);
		JobLocationtextfield.sendKeys(JobLocation);
		Departmenttextfield.sendKeys(Department);
	}

	public void Applicationdetails(String Loc1, String Systemtype1, String Systemname1, String Instrumentation1,
			String Role1) throws InterruptedException {
		// Application details
		Thread.sleep(3000);
		Accesslocationdropdown.sendKeys(Loc1);
		Thread.sleep(2000);
		Accesslocationdropdown.sendKeys(Keys.ARROW_DOWN);
		Accesslocationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		systemtypedropdown.sendKeys(Systemtype1);
		Thread.sleep(2000);
		systemtypedropdown.sendKeys(Keys.ARROW_DOWN);
		systemtypedropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Systemnamedropdown.sendKeys(Systemname1);
		Thread.sleep(2000);
		Systemnamedropdown.sendKeys(Keys.ARROW_DOWN);
		Systemnamedropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		systeminstrumentationdropdown.sendKeys(Instrumentation1);
		Thread.sleep(2000);
		systeminstrumentationdropdown.sendKeys(Keys.ARROW_DOWN);
		systeminstrumentationdropdown.sendKeys(Keys.ENTER);
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
		Thread.sleep(5000);
		addnewbtn.click();
		Thread.sleep(2000);
		Appdetailsexpand.click();
		Thread.sleep(1500);
	}

	public void SecondApplicationdetails(String Loc2, String Systemtype2, String Systemname2, String Instrumentation2,
			String Role2) throws InterruptedException {
		Thread.sleep(3000);
		Accesslocationdropdown2.sendKeys(Loc2);
		Thread.sleep(2000);
		Accesslocationdropdown2.sendKeys(Keys.ARROW_DOWN);
		Accesslocationdropdown2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		systemtypedropdown2.sendKeys(Systemtype2);
		Thread.sleep(2000);
		systemtypedropdown2.sendKeys(Keys.ARROW_DOWN);
		systemtypedropdown2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Systemnamedropdown2.sendKeys(Systemname2);
		Thread.sleep(2000);
		Systemnamedropdown2.sendKeys(Keys.ARROW_DOWN);
		Systemnamedropdown2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		systeminstrumentationdropdown2.sendKeys(Instrumentation2);
		Thread.sleep(2000);
		systeminstrumentationdropdown2.sendKeys(Keys.ARROW_DOWN);
		systeminstrumentationdropdown2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		SystemRolesdropdown2.click();
		Thread.sleep(2000);
		firstcheckbox2.click();
		secondcheckbox2.click();
		Thread.sleep(2000);
		Attachdoc2.click();
		Thread.sleep(1000);
		String path = System.getProperty("user.dir") + "\\Images\\" + "\\Screenshot (2).png";
		ChooseFilebtn.sendKeys(path);
		Thread.sleep(4500);
		uploadbtn.click();
		Thread.sleep(3500);
		Savebtn2.click();
		Thread.sleep(4000);

		Remarkstxtfield.sendKeys("Create Access");

		Submitbtn.click();

	}

	public void eSign(String eun, String epw) throws InterruptedException {
		Thread.sleep(1500);
		eUsername.sendKeys(eun);
		ePassword.sendKeys(epw);
		Acceptbutton.click();
		Thread.sleep(2000);
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
