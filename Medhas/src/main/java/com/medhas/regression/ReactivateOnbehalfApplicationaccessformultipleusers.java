package com.medhas.regression;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author chennoju
 *
 */
public class ReactivateOnbehalfApplicationaccessformultipleusers extends BaseClass {
	WebDriver driver;
	public static boolean Norecordsfound;
	@FindBy(name = "userId")
	WebElement untextfield;

	@FindBy(how = How.NAME, using = "password")
	WebElement pwtextfield;

	@FindBy(how = How.XPATH, using = "//span[@class='p-button-text p-c']")
	WebElement Signinbton;

	@FindBy(how = How.XPATH, using = "//span[text()='Create']")
	WebElement Createlink;

	@FindBy(how = How.XPATH, using = "(//tr[@class='p-datatable-row']/td/div/div[@class='p-checkbox-box p-component'])[1]")
	WebElement DisplayaccessCheckbox;

	@FindBy(how = How.XPATH, using = "(//tr[@class='p-datatable-row']/td/div/div[@class='p-checkbox-box p-component'])[2]")
	WebElement DisplayaccessCheckbox2;

	@FindBy(how = How.XPATH, using = "//span[text()='Reactivate']")
	WebElement Reactivatelink;

	@FindBy(how = How.XPATH, using = "//span[text()='Submit']")
	WebElement Submitbtn;

	@FindBy(how = How.XPATH, using = "//textarea[@name='RequestComment']")
	WebElement RequestCommenttextbox;

	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	WebElement Savebtn;

	@FindBy(how = How.XPATH, using = "//label[text()='On Behalf']/../div")
	WebElement OnBehalfradio;

	@FindBy(how = How.XPATH, using = "//label[text()='Multiple Users']/../div")
	WebElement MultipleUsersradio;

	@FindBy(how = How.XPATH, using = "//input[@name='Request_CategoryID']")
	WebElement requestCategorytextbox;

	@FindBy(how = How.XPATH, using = "//span[text()='Yes']")
	WebElement conformationbtn;

	@FindBy(how = How.XPATH, using = "//label[text()='Permanent']/../div")
	WebElement Permanentradio;

	@FindBy(how = How.XPATH, using = "//label[text()='Temporary']/../div")
	WebElement Temporaryradio;


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


	
	@FindBy(xpath = "//input[@name='EmployeeId']")
	WebElement EmployeeIdtextfield;

	@FindBy(xpath = "//input[@name='JobTitle']")
	WebElement JobTitletextfield;

	@FindBy(xpath = "//input[@name='JobLocation']")
	WebElement jobloctextfield;

	@FindBy(how = How.XPATH, using = "//input[@name='Department']")
	WebElement Departmenttextfeild;

	@FindBy(how = How.XPATH, using = "//span[text()='Display Access Request']")
	WebElement DisplayAccessRequestbtn;

	@FindBy(how = How.XPATH, using = "(//i[@class='pi pi-pencil delete-table-row'])[1]")
	WebElement Pencilicon;

	@FindBy(how = How.XPATH, using = "(//i[@class='pi pi-pencil delete-table-row'])[2]")
	WebElement Pencilicon2;

	@FindBy(how = How.XPATH, using = "//input[@name='SystemRole']")
	WebElement SystemRoletextbox;

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

	@FindBy(how = How.XPATH, using = "(//input[@name='Department'])[2]")
	WebElement Departmenttextfeild2;

	@FindBy(how = How.XPATH, using = "(//input[@name='EmailAddress'])[2]")
	WebElement EmailAddresstextfeild2;

	@FindBy(how = How.XPATH, using = "//input[@name='LoginDomain']")
	WebElement NTid;

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

	
	

	@FindBy(how = How.XPATH, using = "//input[@name='RequestComment']")
	WebElement Commenttextfeild;

	@FindBy(how = How.XPATH, using = "(//input[@name='username'])[1]")
	WebElement Acknowledgeusername;

	@FindBy(how = How.XPATH, using = "(//input[@name='password'])[1]")
	WebElement Acknowledgepassword;

	@FindBy(how = How.XPATH, using = "(//span[text()='Accept'])[1]")
	WebElement Acceptbutton;

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Access Management'])[2]")
	WebElement Accessmanagementexpansion;

	@FindBy(how = How.XPATH, using = "(//span[@class='p-accordion-header-text'])[1]")
	WebElement userexpansion;

	@FindBy(how = How.XPATH, using = "(//span[@class='p-accordion-header-text'])[2]")
	WebElement userexpansion2;

	@FindBy(how = How.XPATH, using = "(//span[@class='p-accordion-header-text'])[3]")
	WebElement userexpansion3;

	@FindBy(how = How.XPATH, using = "//span[text()='Add User']")
	WebElement Adduserbutton;

	@FindBy(how = How.XPATH, using = "//label[text()='Multiple Users']/../div")
	WebElement MultipleUserradio;
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	
	//Enter Application Details
	@FindBy(how = How.XPATH, using = "//input[@name='Request_LocationID']")
	WebElement Accesslocationdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='M_Inv_ItemGroupID']")
	WebElement systemtypedropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='SystemId']")
	WebElement Systemnamedropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='InstrumentName']")
	WebElement systeminstrumentdropdown;
	
	@FindBy(xpath = "//textarea[@name='RequestComment']")
	public WebElement remarktxtfield;
	
	// e-Sign
		@FindBy(xpath = "//input[@placeholder='Username']")
		public WebElement eusername;

		@FindBy(xpath = "//input[@placeholder='Password']")
		public WebElement epassword;

		@FindBy(xpath = "//span[contains(text(),'Accept')]")
		public WebElement eAccept;
	
	
	

	public void SelfCreateAccessRequest(String ApplicationDirectoryRequest, String Employeestatus)
			throws InterruptedException {
		Thread.sleep(3000);
		Accessmanagementexpansion.click();
		Thread.sleep(1000);
		Reactivatelink.click();
		Thread.sleep(1000);
		OnBehalfradio.click();
		Thread.sleep(2000);
		MultipleUsersradio.click();
		Thread.sleep(1000);
		requestCategorytextbox.sendKeys(ApplicationDirectoryRequest);
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
	}
	
	public void Applicationdetails(String Loc,String Systemtype, String Systemname,String Insid) throws InterruptedException {
		
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
		systeminstrumentdropdown.sendKeys(Insid);
		Thread.sleep(2000);
		systeminstrumentdropdown.sendKeys(Keys.ARROW_DOWN);
		systeminstrumentdropdown.sendKeys(Keys.ENTER);
	}

	public void Userdetailstcreation(String Ntid, String Supervisor, String FirstName, String LastName,
			String EmployeeId, String JobTitle, String JobLocation, String Department) throws InterruptedException {
		Thread.sleep(1500);
		userexpansion2.click();
		Thread.sleep(1500);
		NTid.sendKeys(Ntid);
		Thread.sleep(2000);
		supervisoridkey.click();
		Thread.sleep(4000);
		Supervisorid.sendKeys(Supervisor);
		Thread.sleep(2000);
		supervisoridkey.click();
		Thread.sleep(2000);
		EmployeeIdtextfield.sendKeys(EmployeeId);
		JobTitletextfield.sendKeys(JobTitle);
		jobloctextfield.sendKeys(JobLocation);
		Departmenttextfeild.sendKeys(Department);
	}

	public void Userdetailstcreationmultiple(String Ntid, String Supervisor, String FirstName, String LastName,
			String EmployeeId, String JobTitle, String JobLocation, String Department) throws InterruptedException {
		Thread.sleep(1500);
		userexpansion3.click();
		Thread.sleep(1500);
		NTid2.sendKeys(Ntid);
		Thread.sleep(2000);
		supervisoridkey.click();
		Thread.sleep(4000);
		Supervisorid2.sendKeys(Supervisor);
		Thread.sleep(2000);
		supervisoridkey.click();
		Thread.sleep(2000);
		EmployeeIdtextfield2.sendKeys(EmployeeId);
		JobTitletextfield2.sendKeys(JobTitle);
		jobloctextfield2.sendKeys(JobLocation);
		Departmenttextfeild2.sendKeys(Department);
	}
	
	public void submitReactivate(String eun,String epw) throws InterruptedException {
		
		remarktxtfield.sendKeys("Reactivate");
		
		Submitbtn.click();
		
		Thread.sleep(2000);
		
		eusername.sendKeys(eun);
		epassword.sendKeys(epw);
		eAccept.click();
		
	}

	


}
