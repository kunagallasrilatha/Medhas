package com.medhas.regression;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author chennoju
 *
 */
public class OnbehalfApplicationaccessrequestformultipleaccess extends BaseClass {
	WebDriver driver;

	public OnbehalfApplicationaccessrequestformultipleaccess(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//p[contains(text(),'Create Request')]")
	public WebElement createoptionshortcut;

	@FindBy(how = How.XPATH, using = "//span[text()='Create']")
	WebElement Createlink;

	@FindBy(how = How.XPATH, using = "//textarea[@name='RequestComment']")
	WebElement RequestCommenttextbox;

	@FindBy(how = How.XPATH, using = "//label[text()='On Behalf']/../div")
	WebElement OnBehalfradio;

	@FindBy(how = How.XPATH, using = "//label[text()='Single User']/../div")
	WebElement SingleUserradio;

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

	@FindBy(how = How.XPATH, using = "//label[text()='Email Account Required']/../div")
	WebElement EmailAccountradio;

	@FindBy(how = How.XPATH, using = "//label[text()='Internet Access Required']/../div")
	WebElement InternetAccessradio;

	@FindBy(how = How.XPATH, using = "//label[text()='Email Disaster Recovery Required']/../div")
	WebElement EmailDisasterradio;

	@FindBy(how = How.XPATH, using = "//input[@name='FirstName']")
	WebElement FirstNametextbox;

	@FindBy(how = How.XPATH, using = "//input[@name='LastName']")
	WebElement LastNametextbox;

	@FindBy(xpath = "//input[@name='EmployeeId']")
	WebElement EmployeeIdtextfield;

	@FindBy(xpath = "//input[@name='JobTitle']")
	WebElement JobTitletextfield;

	@FindBy(xpath = "//input[@name='JobLocation']")
	WebElement jobloctextfield;

	@FindBy(how = How.XPATH, using = "//input[@name='Department']")
	WebElement Departmenttextfeild;

	@FindBy(how = How.XPATH, using = "//input[@name='EmailAddress']")
	WebElement EmailAddresstextfeild;

	@FindBy(how = How.XPATH, using = "(//input[@name='FirstName'])[2]")
	WebElement FirstNametextbox2;

	@FindBy(how = How.XPATH, using = "(//input[@name='LastName'])[2]")
	WebElement LastNametextbox2;

	@FindBy(xpath = "(//input[@name='EmployeeId'])[2]")
	WebElement EmployeeIdtextfield2;

	@FindBy(xpath = "(//input[@name='JobTitle'])[2]")
	WebElement JobTitletextfield2;

	@FindBy(xpath = "(//input[@name='JobLocation'])[2]")
	WebElement jobloctextfield2;

	@FindBy(how = How.XPATH, using = "//input[@name='Department']")
	WebElement Departmenttextfeild2;

	@FindBy(how = How.XPATH, using = "(//input[@name='EmailAddress'])[2]")
	WebElement EmailAddresstextfeild2;

	@FindBy(how = How.XPATH, using = "//input[@name='LoginDomain']")
	WebElement NTid;

	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-item']")
	WebElement NTidKey;

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

	@FindBy(how = How.XPATH, using = "//input[@name='DistributionGroupList_Provided']")
	WebElement DistributionGroupListtextbox;

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

	@FindBy(how = How.XPATH, using = "(//span[@class='p-checkbox-icon p-c'])[2]")
	WebElement firstcheckbox2;

	@FindBy(how = How.XPATH, using = "(//span[@class='p-checkbox-icon p-c'])[3]")
	WebElement secondcheckbox2;

	@FindBy(how = How.XPATH, using = "(//div[@role='checkbox'])[2]")
	WebElement allcheckboxes;

	@FindBy(how = How.XPATH, using = "(//input[@name='Request_LocationID'])[2]")
	WebElement Locationdropdown2;

	@FindBy(how = How.XPATH, using = "(//input[@name='M_Inv_ItemGroupID'])[2]")
	WebElement Systemtypedropdown2;

	@FindBy(how = How.XPATH, using = "(//input[@name='SystemId'])[2]")
	WebElement Systemnamedropdown2;

	@FindBy(how = How.XPATH, using = "(//input[@name='InstrumentName'])[2]")
	WebElement Systeminstrumentdropdown2;

	@FindBy(how = How.XPATH, using = "(//div[@class='p-multiselect-label-container'])[2]")
	WebElement SystemRolesdropdown2;

	@FindBy(how = How.XPATH, using = "//span[text()='Attach/View Training Document']")
	WebElement Attachdoc;

	@FindBy(how = How.XPATH, using = "(//span[text()='Attach/View Training Document'])[2]")
	WebElement Attachdoc2;

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

	@FindBy(how = How.XPATH, using = "//input[@name='RequestComment']")
	WebElement Commenttextfeild;

	@FindBy(how = How.XPATH, using = "(//input[@name='username'])[1]")
	WebElement Acknowledgeusername;

	@FindBy(how = How.XPATH, using = "(//input[@name='password'])[1]")
	WebElement Acknowledgepassword;

	@FindBy(how = How.XPATH, using = "(//span[text()='Accept'])[1]")
	WebElement Acceptbutton;

	@FindBy(how = How.XPATH, using = "(//span[text()='Application Details'])[2]")
	WebElement applicationDetailsAccordion;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
	WebElement Addnewbutton;

	public void RequestInfo(String RequestCate, String Employeestatus) throws InterruptedException {
		createoptionshortcut.click();
		Thread.sleep(2000);
		OnBehalfradio.click();
		Thread.sleep(1000);
		SingleUserradio.click();
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

		Addnewbutton.click();
	}

	public void userDetails(String Ntid, String Supervisor, String EmployeeId, String JobTitle, String JobLocation,
			String Department) throws InterruptedException {
		NTid.sendKeys(Ntid);
		Thread.sleep(2000);
		NTidKey.click();
		Thread.sleep(2000);
		EmployeeIdtextfield.sendKeys(EmployeeId);
		JobTitletextfield.sendKeys(JobTitle);
		jobloctextfield.sendKeys(JobLocation);
		Departmenttextfeild.sendKeys(Department);
		Thread.sleep(1000);
		Supervisorid.sendKeys(Supervisor);
		Thread.sleep(2000);
		supervisoridkey.click();

	}

	public void Firstapplicationdetails(String Accesslocation, String Systemtype, String Systemname,
			String SystemInstrumentid) throws InterruptedException {

		Locationdropdown.sendKeys(Accesslocation);
		Thread.sleep(1000);
		Locationdropdown.sendKeys(Keys.ARROW_DOWN);
		Locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Systemtypedropdown.sendKeys(Systemtype);
		Thread.sleep(1000);
		Systemtypedropdown.sendKeys(Keys.ARROW_DOWN);
		Systemtypedropdown.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Systemnamedropdown.sendKeys(Systemname);
		Thread.sleep(1000);
		Systemnamedropdown.sendKeys(Keys.ARROW_DOWN);
		Systemnamedropdown.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Systeminstrumentdropdown.sendKeys(SystemInstrumentid);
		Thread.sleep(1000);
		Systeminstrumentdropdown.sendKeys(Keys.ARROW_DOWN);
		Systeminstrumentdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
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
		Thread.sleep(2000);

	}

	public void Secondapplicationdetails(String Accesslocation, String Systemtype, String Systemname,
			String SystemInstrumentid, String eun, String epw) throws InterruptedException {

		applicationDetailsAccordion.click();
		Thread.sleep(1000);
		Locationdropdown2.sendKeys(Accesslocation);
		Thread.sleep(1000);
		Locationdropdown2.sendKeys(Keys.ARROW_DOWN);
		Locationdropdown2.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Systemtypedropdown2.sendKeys(Systemtype);
		Thread.sleep(1000);
		Systemtypedropdown2.sendKeys(Keys.ARROW_DOWN);
		Systemtypedropdown2.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Systemnamedropdown2.sendKeys(Systemname);
		Thread.sleep(1000);
		Systemnamedropdown2.sendKeys(Keys.ARROW_DOWN);
		Systemnamedropdown2.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Systeminstrumentdropdown2.sendKeys(SystemInstrumentid);
		Thread.sleep(1000);
		Systeminstrumentdropdown2.sendKeys(Keys.ARROW_DOWN);
		Systeminstrumentdropdown2.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		SystemRolesdropdown2.click();
		Thread.sleep(2000);
		allcheckboxes.click();
		Thread.sleep(2000);
		Attachdoc2.click();
		Thread.sleep(1000);
		String path = System.getProperty("user.dir") + "\\Images\\" + "\\Screenshot (2).png";
		ChooseFilebtn.sendKeys(path);
		Thread.sleep(4500);
		uploadbtn.click();
		Thread.sleep(3500);
		Savebtn.click();
		Thread.sleep(2000);
		RequestCommenttextbox.sendKeys("Access Request");
		Thread.sleep(1500);
		Submitbtn.click();
		Thread.sleep(2000);
		Acknowledgeusername.sendKeys(eun);
		Acknowledgepassword.sendKeys(epw);
		Acceptbutton.click();
	}

}
