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
public class DeactivateOnbehalfApplicationaccessformultipleusers extends BaseClass {
	WebDriver driver;
	public static boolean Norecordsfound;
	@FindBy(name = "userId")
	WebElement untextfield;

	@FindBy(how = How.NAME, using = "password")
	WebElement pwtextfield;

	@FindBy(how = How.XPATH, using = "//span[@class='p-button-text p-c']")
	WebElement Signinbton;

	// Accessmanagement
	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Access Management'])[2]")
	WebElement Accessmanagementexpansion;

	@FindBy(how = How.XPATH, using = "//span[text()='Deactivate']")
	WebElement Deactivatelink;

	@FindBy(how = How.XPATH, using = "//label[text()='On Behalf']/../div")
	WebElement OnBehalfradio;

	@FindBy(how = How.XPATH, using = "//label[text()='Multiple Users']/../div")
	WebElement MultipleUsersradio;

	@FindBy(how = How.XPATH, using = "//input[@name='Request_CategoryID']")
	WebElement requestCategorytextbox;

	// Userdetailstcreation

	@FindBy(how = How.XPATH, using = "(//span[@class='p-accordion-header-text'])[2]")
	WebElement userexpansion2;

	@FindBy(how = How.XPATH, using = "//input[@name='LoginDomain']")
	WebElement NTid;

	@FindBy(how = How.XPATH, using = "//input[@name='Supervisor_LoginDomain']")
	WebElement Supervisorid;

	@FindBy(xpath = "//span[@class='formatted-item-email']")
	public WebElement supervisoridkey;

	@FindBy(xpath = "//input[@name='EmployeeId']")
	WebElement EmployeeIdtextfield;

	@FindBy(xpath = "//input[@name='JobTitle']")
	WebElement JobTitletextfield;

	@FindBy(xpath = "//input[@name='JobLocation']")
	WebElement jobloctextfield;

	@FindBy(how = How.XPATH, using = "//input[@name='Department']")
	WebElement Departmenttextfeild;

	@FindBy(how = How.XPATH, using = "(//span[@class='p-accordion-header-text'])[3]")
	WebElement userexpansion3;

	// Userdetailstcreationmultiple

	@FindBy(how = How.XPATH, using = "//span[text()='Submit']")
	WebElement Submitbtn;

	@FindBy(how = How.XPATH, using = "//textarea[@name='RequestComment']")
	WebElement RequestCommenttextbox;

	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	WebElement Savebtn;

	@FindBy(how = How.XPATH, using = "(//input[@name='LoginDomain'])[2]")
	WebElement NTid2;

	@FindBy(how = How.XPATH, using = "(//input[@name='Supervisor_LoginDomain'])[2]")
	WebElement Supervisorid2;

	@FindBy(xpath = "(//input[@name='EmployeeId'])[2]")
	WebElement EmployeeIdtextfield2;

	@FindBy(xpath = "(//input[@name='JobTitle'])[2]")
	WebElement JobTitletextfield2;

	@FindBy(xpath = "(//input[@name='JobLocation'])[2]")
	WebElement jobloctextfield2;

	@FindBy(how = How.XPATH, using = "(//input[@name='Department'])[2]")
	WebElement Departmenttextfeild2;

	// Applicationdetails

	@FindBy(how = How.XPATH, using = "//input[@name='Request_LocationID']")
	WebElement Locationdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='M_Inv_ItemGroupID']")
	WebElement Systemtypedropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='SystemId']")
	WebElement Systemnamedropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='InstrumentName']")
	WebElement Systeminstrumentdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='SystemRole']")
	WebElement SystemRoledropdown;

	@FindBy(how = How.XPATH, using = "//span[text()='Add User']")
	WebElement Adduserbutton;

	@FindBy(how = How.XPATH, using = "//span[text()='Display Access Request']")
	WebElement DisplayAccessRequestbtn;

	@FindBy(how = How.XPATH, using = "(//input[@name='username'])[1]")
	WebElement Acknowledgeusername;

	@FindBy(how = How.XPATH, using = "(//input[@name='password'])[1]")
	WebElement Acknowledgepassword;

	@FindBy(how = How.XPATH, using = "(//span[text()='Accept'])[1]")
	WebElement Acceptbutton;

	@FindBy(how = How.XPATH, using = "(//span[@class='p-accordion-header-text'])[1]")
	WebElement userexpansion;

	@FindBy(how = How.XPATH, using = "//label[text()='Multiple Users']/../div")
	WebElement MultipleUserradio;
	JavascriptExecutor jse = (JavascriptExecutor) driver;

	public void SelfCreateAccessRequest(String ApplicationDirectoryRequest, String Employeestatus)
			throws InterruptedException {
		Thread.sleep(3000);
		Accessmanagementexpansion.click();
		Thread.sleep(1000);
		Deactivatelink.click();
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

	public void Applicationdetails(String Accesslocation, String Systemtype, String Systemname,
			String SystemInstrumentid) throws InterruptedException {
		Thread.sleep(1000);
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
		Thread.sleep(4000);
		Systemnamedropdown.sendKeys(Keys.ARROW_DOWN);
		Systemnamedropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Systeminstrumentdropdown.sendKeys(SystemInstrumentid);
		Thread.sleep(2000);
		Systeminstrumentdropdown.sendKeys(Keys.ARROW_DOWN);
		Systeminstrumentdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Adduserbutton.click();
		Thread.sleep(2000);
	}

	public void esign(String Updatedsystemmrole, String Comment, String uid, String pass)
			throws InterruptedException {
		Thread.sleep(1000);
		DisplayAccessRequestbtn.click();
		Thread.sleep(4000);
		RequestCommenttextbox.sendKeys(Comment);
		Thread.sleep(1500);
		 Submitbtn.click();
		 Thread.sleep(2000);
		// Acknowledgeusername.sendKeys(uid);
		// Acknowledgepassword.sendKeys(pass);
		// Acceptbutton.click();
		Thread.sleep(2000);

	}

}
