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
public class DeactivateSelfApplicationaccessforsingleuser extends BaseClass {
	WebDriver driver;
	public static boolean Norecordsfound;

	@FindBy(name = "userId")
	WebElement untextfield;

	@FindBy(how = How.NAME, using = "password")
	WebElement pwtextfield;

	@FindBy(how = How.XPATH, using = "//span[@class='p-button-text p-c']")
	WebElement Signinbton;

	// SelfCreateAccessRequest

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Access Management'])[2]")
	WebElement Accessmanagementexpansion;

	@FindBy(how = How.XPATH, using = "//span[text()='Deactivate']")
	WebElement Deactivatelink;

	@FindBy(how = How.XPATH, using = "//label[text()='Self']/../div")
	WebElement Selfradio;

	@FindBy(how = How.XPATH, using = "//input[@name='Request_CategoryID']")
	WebElement requestCategorytextbox;

	// Userdetailstcreation
	@FindBy(how = How.XPATH, using = "(//span[@class='p-accordion-header-text'])[1]")
	WebElement userexpansion;

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

	// Applicationdetails

	@FindBy(how = How.XPATH, using = "//span[text()='Display Access Request']")
	WebElement DisplayAccessRequestbtn;

	@FindBy(how = How.XPATH, using = "(//tr[@class='p-datatable-row']/td/div/div[@class='p-checkbox-box p-component'])[1]")
	WebElement DisplayaccessCheckbox;

	@FindBy(how = How.XPATH, using = "//textarea[@name='RequestComment']")
	WebElement RequestCommenttextbox;

	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	WebElement Savebtn;

	@FindBy(how = How.XPATH, using = "//span[text()='Submit']")
	WebElement Submitbtn;

	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement Acknowledgeusername;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement Acknowledgepassword;

	@FindBy(how = How.XPATH, using = "//span[text()='Accept']")
	WebElement Acceptbutton;

	JavascriptExecutor jse = (JavascriptExecutor) driver;

	public void SelfCreateAccessRequest(String ApplicationDirectoryRequest, String Employeestatus)
			throws InterruptedException {
		Thread.sleep(3000);
		Accessmanagementexpansion.click();
		Thread.sleep(1000);
		Deactivatelink.click();
		Thread.sleep(1000);
		Selfradio.click();
		Thread.sleep(2000);
		requestCategorytextbox.sendKeys(ApplicationDirectoryRequest);
		Thread.sleep(2000);
		requestCategorytextbox.sendKeys(Keys.ARROW_DOWN);
		requestCategorytextbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	public void Userdetailstcreation(String Ntid, String Supervisor, String FirstName, String LastName,
			String EmployeeId, String JobTitle, String JobLocation, String Department) throws InterruptedException {
		Thread.sleep(1500);
		userexpansion.click();
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

	public void Applicationdetails(String Accesslocation, String Systemtype, String Systemname,
			String SystemInstrumentid, String SystemRole, String Comment, String uid, String pass)
			throws InterruptedException {
		Thread.sleep(1000);
		DisplayAccessRequestbtn.click();
		Thread.sleep(2000);
		DisplayaccessCheckbox.click();
		Thread.sleep(2000);
		RequestCommenttextbox.sendKeys(Comment);
		Thread.sleep(1500);
		Submitbtn.click();
		Thread.sleep(2000);
		Acknowledgeusername.sendKeys(uid);
		Acknowledgepassword.sendKeys(pass);
		Acceptbutton.click();
		Thread.sleep(2000);

	}
}
