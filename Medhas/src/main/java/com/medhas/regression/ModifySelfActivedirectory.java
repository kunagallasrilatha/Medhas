package com.medhas.regression;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author chennoju
 *
 */
public class ModifySelfActivedirectory extends BaseClass {
	WebDriver driver;
	WebDriverWait wait;

	public ModifySelfActivedirectory(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@name='LoginDomain']")
	public WebElement userNTidsearchfield;

	@FindBy(xpath = "//div[@class='dropdown-item']")
	public WebElement userNTidkey;

	@FindBy(how = How.XPATH, using = "//span[text()='Create']")
	WebElement Createlink;

	@FindBy(how = How.XPATH, using = "(//tr[@class='p-datatable-row']/td/div/div[@class='p-checkbox-box p-component'])[1]")
	WebElement DisplayaccessCheckbox;

	@FindBy(how = How.XPATH, using = "(//i[@class='pi pi-pencil delete-table-row'])[1]")
	WebElement Pencilicon;

	@FindBy(how = How.XPATH, using = "//span[text()='Modify']")
	WebElement Modifylink;

	@FindBy(how = How.XPATH, using = "//span[text()='Submit']")
	WebElement Submitbtn;

	@FindBy(how = How.XPATH, using = "//textarea[@name='RequestComment']")
	WebElement RequestCommenttextbox;

	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	WebElement Savebtn;

	@FindBy(how = How.XPATH, using = "//label[text()='Self']/../div")
	WebElement Selfradio;

	@FindBy(how = How.XPATH, using = "//input[@name='Request_CategoryID']")
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

	@FindBy(how = How.XPATH, using = "//span[text()='Display Access Request']")
	WebElement DisplayAccessRequestbtn;

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

	@FindBy(how = How.XPATH, using = "//input[@name='SystemRole']")
	WebElement SystemRoledropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='FileName']")
	WebElement ChooseFilebtn;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Email Approval Attachment')]")
	WebElement emailAttachdoc;

	@FindBy(how = How.XPATH, using = "//span[text()='Upload File']")
	WebElement uploadbtn;

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

	@FindBy(how = How.XPATH, using = "//span[text()='Add User']")
	WebElement Adduserbutton;

	@FindBy(how = How.XPATH, using = "//label[text()='Multiple Users']/../div")
	WebElement MultipleUserradio;
	JavascriptExecutor jse = (JavascriptExecutor) driver;

	public void SelfCreateAccessRequest(String ActiveDirectoryRequest, String Employeestatus)
			throws InterruptedException {
		Thread.sleep(3000);
		Accessmanagementexpansion.click();
		Thread.sleep(1000);
		Modifylink.click();
		Thread.sleep(1000);
		Selfradio.click();
		Thread.sleep(2000);
		requestCategorytextbox.sendKeys(ActiveDirectoryRequest);
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
	}

	public void Userdetailstcreation(String EmployeeId, String JobTitle, String JobLocation,
			String Department, String Supervisor) throws InterruptedException {
		Thread.sleep(1500);
		userexpansion.click();
		Thread.sleep(4000);
		EmployeeIdtextfield.sendKeys(EmployeeId);
		JobTitletextfield.sendKeys(JobTitle);
		jobloctextfield.sendKeys(JobLocation);
		Departmenttextfeild.sendKeys(Department);
		Thread.sleep(2000);
		Supervisorid.sendKeys(Supervisor);
		Thread.sleep(2000);
		supervisoridkey.click();

	}

	public void Activedirectorydetails(String DistributionList, String uid, String pass) throws InterruptedException {
		Thread.sleep(1000);
		DisplayAccessRequestbtn.click();
		Thread.sleep(4000);
		Pencilicon.click();
		Thread.sleep(2000);
		EmailAccountradio.click();
		InternetAccessradio.click();
		EmailDisasterradio.click();
		DistributionGroupListtextbox.sendKeys(DistributionList);
		Thread.sleep(3000);
		DistributionGroupListtextbox.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		emailAttachdoc.click();
		Thread.sleep(1000);
		String path = System.getProperty("user.dir") + "\\Images\\" + "\\Screenshot (2).png";
		ChooseFilebtn.sendKeys(path);
		Thread.sleep(3000);
		uploadbtn.click();
		Thread.sleep(5000);
		Savebtn.click();
		Thread.sleep(2000);
		Savebtn.click();
		Thread.sleep(1000);
		DisplayaccessCheckbox.click();
		Thread.sleep(1000);
		RequestCommenttextbox.sendKeys("Modify Account");
		Thread.sleep(1500);
		Submitbtn.click();
		Thread.sleep(2000);
		Acknowledgeusername.sendKeys(uid);
		Acknowledgepassword.sendKeys(pass);
		Acceptbutton.click();
		Thread.sleep(2000);

	}

}
