/**
 * 
 */
package com.medhas.regression;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Shashank
 *
 */
public class ReactivateOnbehalfActivedirectoryformultipleleusers {

	WebDriver driver;

	public ReactivateOnbehalfActivedirectoryformultipleleusers(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Access Management'])[2]")
	WebElement Accessmanagementexpansion;

	@FindBy(how = How.XPATH, using = "//span[text()='Reactivate']")
	WebElement Reactivatelink;

	@FindBy(how = How.XPATH, using = "//label[text()='On Behalf']/../div")
	WebElement OnBehalfradio;

	@FindBy(how = How.XPATH, using = "//label[text()='Multiple Users']/../div")
	WebElement MultipleUsersradio;

	@FindBy(how = How.XPATH, using = "//label[text()='Permanent']/../div")
	WebElement Permanentradio;

	@FindBy(how = How.XPATH, using = "//label[text()='Temporary']/../div")
	WebElement Temporaryradio;

	@FindBy(how = How.XPATH, using = "//input[@name='Request_CategoryID']")
	WebElement requestCategorytextbox;

	@FindBy(xpath = "(//span[text()='User Details'])[1]")
	public WebElement userdetailsaccordion1;

	@FindBy(xpath = "(//span[text()='User Details'])[2]")
	public WebElement userdetailsaccordion2;

	@FindBy(how = How.XPATH, using = "//span[text()='Add User']")
	WebElement Adduserbutton;

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

	@FindBy(how = How.XPATH, using = "//input[@name='LoginDomain']")
	WebElement NTid;

	@FindBy(how = How.XPATH, using = "(//input[@name='LoginDomain'])[2]")
	WebElement userNTidsearchfield2;

	@FindBy(xpath = "//span[@class='formatted-item-email']")
	public WebElement supervisoridkey;

	@FindBy(xpath = "//span[@class='formatted-item-email']")
	public WebElement supervisoridkey2;

	@FindBy(xpath = "//input[@name='EmployeeId']")
	WebElement EmployeeIdtextfield;

	@FindBy(xpath = "//input[@name='JobTitle']")
	WebElement JobTitletextfield;

	@FindBy(xpath = "//input[@name='JobLocation']")
	WebElement jobloctextfield;

	@FindBy(how = How.XPATH, using = "//input[@name='Department']")
	WebElement Departmenttextfeild;

	@FindBy(xpath = "//input[@name='Supervisor_LoginDomain']")
	public WebElement supervisorsearchfield;

	@FindBy(xpath = "(//input[@name='Supervisor_LoginDomain'])[2]")
	public WebElement supervisorsearchfield2;

	@FindBy(xpath = "(//input[@name='EmployeeId'])[2]")
	WebElement EmployeeIdtextfield2;

	@FindBy(xpath = "(//input[@name='JobTitle'])[2]")
	WebElement JobTitletextfield2;

	@FindBy(xpath = "(//input[@name='JobLocation'])[2]")
	WebElement jobloctextfield2;

	@FindBy(how = How.XPATH, using = "(//input[@name='Department'])[2]")
	WebElement Departmenttextfeild2;

	@FindBy(how = How.XPATH, using = "//input[@name='Supervisor_LoginDomain']")
	WebElement Supervisorsearch;

	@FindBy(how = How.XPATH, using = "//span[text()='Display Access Request']")
	WebElement DisplayAccessRequestbtn;

	@FindBy(how = How.XPATH, using = "(//tr[@class='p-datatable-row']/td/div/div[@class='p-checkbox-box p-component'])[1]")
	WebElement DisplayaccessCheckbox;

	@FindBy(how = How.XPATH, using = "//th[@class='p-resizable-column p-selection-column']//div[@class='p-checkbox-box p-component']")
	WebElement DisplayallaccessCheckbox;

	@FindBy(how = How.XPATH, using = "//textarea[@name='RequestComment']")
	WebElement remarkTextfield;

	@FindBy(how = How.XPATH, using = "//span[text()='Submit']")
	WebElement Submitbtn;

	// e-Sign
	@FindBy(xpath = "//input[@placeholder='Username']")
	public WebElement eusername;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement epassword;

	@FindBy(xpath = "//span[contains(text(),'Accept')]")
	public WebElement eAccept;

	public void requestInfo(String requestCate, String Employeestatus) throws InterruptedException {
		Accessmanagementexpansion.click();
		Thread.sleep(1000);
		Reactivatelink.click();
		Thread.sleep(1000);
		OnBehalfradio.click();
		Thread.sleep(1000);
		MultipleUsersradio.click();
		Thread.sleep(1000);
		requestCategorytextbox.sendKeys(requestCate);
		Thread.sleep(1000);
		requestCategorytextbox.sendKeys(Keys.ARROW_DOWN);
		requestCategorytextbox.sendKeys(Keys.ENTER);
		Adduserbutton.click();
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

		}
	}

	public void firstUserdetails(String Ntid, String EmployeeId, String JobTitle, String JobLocation,
			String Department, String Supervisor) throws InterruptedException {

		userdetailsaccordion1.click();
		Thread.sleep(2000);
		NTid.sendKeys(Ntid);
		Thread.sleep(1000);
		supervisoridkey.click();
		Thread.sleep(1000);
		supervisorsearchfield.sendKeys(Supervisor);
		Thread.sleep(1000);
		supervisoridkey.click();
		Thread.sleep(1000);
		EmployeeIdtextfield.sendKeys(EmployeeId);
		JobTitletextfield.sendKeys(JobTitle);
		jobloctextfield.sendKeys(JobLocation);
		Departmenttextfeild.sendKeys(Department);

	}

	public void seconduserDetails(String ntid2, String empid, String jobtitle, String Jobloc, String depid,
			String supid) throws InterruptedException {

		userdetailsaccordion2.click();
		Thread.sleep(2000);

		userNTidsearchfield2.sendKeys(ntid2);
		Thread.sleep(2000);

		supervisoridkey.click();
		Thread.sleep(2000);

		EmployeeIdtextfield2.sendKeys(empid);
		Thread.sleep(1000);

		JobTitletextfield2.sendKeys(jobtitle);

		jobloctextfield2.sendKeys(Jobloc);

		Departmenttextfeild2.sendKeys(depid);

		supervisorsearchfield2.sendKeys(supid);
		Thread.sleep(2000);
		supervisoridkey2.click();

	}
	
	
public void Activedirectorydetails(String uid, String pass) throws InterruptedException {
		
		DisplayAccessRequestbtn.click();
		Thread.sleep(2000);
		DisplayallaccessCheckbox.click();
		Thread.sleep(2000);
		remarkTextfield.sendKeys("Active Directory");
		Thread.sleep(1000);
		Submitbtn.click();
		Thread.sleep(1000);
		eusername.sendKeys(uid);
		epassword.sendKeys(pass);
		eAccept.click();

	}

}
