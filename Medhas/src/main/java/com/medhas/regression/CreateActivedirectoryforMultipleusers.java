
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
 * @author chennoju
 *
 */
public class CreateActivedirectoryforMultipleusers extends BaseClass {
	WebDriver driver;

	@FindBy(name = "userId")
	WebElement untextfield;

	@FindBy(how = How.NAME, using = "password")
	WebElement pwtextfield;

	@FindBy(how = How.XPATH, using = "//span[@class='p-button-text p-c']")
	WebElement Signinbton;

	@FindBy(xpath = "//p[contains(text(),'Create Request')]")
	public WebElement createoptionshortcut;

	@FindBy(how = How.XPATH, using = "//span[text()='Submit']")
	WebElement Submitbtn;

	@FindBy(how = How.XPATH, using = "//textarea[@name='RequestComment']")
	WebElement RequestCommenttextbox;

	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	WebElement Savebtn;

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

	@FindBy(how = How.XPATH, using = "(//input[@name='Department'])[2]")
	WebElement Departmenttextfeild2;

	@FindBy(how = How.XPATH, using = "(//input[@name='EmailAddress'])[2]")
	WebElement EmailAddresstextfeild2;

	@FindBy(how = How.XPATH, using = "//input[@name='LoginDomain']")
	WebElement Ntidsearchfeild;

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

	@FindBy(how = How.XPATH, using = "//input[@name='Request_LocationID']")
	WebElement Locationdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='DistributionGroupList_Provided']")
	WebElement DistributionGroupListtextbox;
	
	@FindBy(how = How.XPATH, using = "//input[@name='FileName']")
	WebElement ChooseFilebtn;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Upload File']")
	WebElement uploadbtn;
	
	
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Email Approval Attachment')]")
	WebElement emailAttachdoc;

	@FindBy(how = How.XPATH, using = "//input[@name='SystemRole']")
	WebElement SystemRoledropdown;

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
	
	@FindBy(how = How.XPATH, using = "(//span[@class='p-accordion-header-text'])[2]")
	WebElement userexpansion2;

	@FindBy(how = How.XPATH, using = "//span[text()='Add User']")
	WebElement Adduserbutton;

	public void requestInfo(String ActiveDirectoryRequest, String Employeestatus)
			throws InterruptedException {
		
		
		createoptionshortcut.click();
		Thread.sleep(1000);
		OnBehalfradio.click();
		Thread.sleep(1000);
		MultipleUserradio.click();
		Thread.sleep(2000);
		requestCategorytextbox.sendKeys(ActiveDirectoryRequest);
		Thread.sleep(2000);
		requestCategorytextbox.sendKeys(Keys.ARROW_DOWN);
		requestCategorytextbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		conformationbtn.click();
		Thread.sleep(2000);
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
			Thread.sleep(2000);
			

		}
	}

	public void firstUserdetailstcreation(String Supervisor, String FirstName, String LastName, String EmployeeId,
			String JobTitle, String JobLocation, String Department, String Emailid) throws InterruptedException {

		Supervisorid.sendKeys(Supervisor);
		Thread.sleep(2000);
		supervisoridkey.click();
		Thread.sleep(2000);
		FirstNametextbox.sendKeys(FirstName);
		LastNametextbox.sendKeys(LastName);
		EmployeeIdtextfield.sendKeys(EmployeeId);
		JobTitletextfield.sendKeys(JobTitle);
		jobloctextfield.sendKeys(JobLocation);
		Departmenttextfeild.sendKeys(Department);
		EmailAddresstextfeild.sendKeys(Emailid);
	}

	public void secondUserdetailstcreation(String Supervisor2, String FirstName2, String LastName2, String EmployeeId2,
			String JobTitle2, String JobLocation2, String Department2, String Emailid2) throws InterruptedException {
		
		Thread.sleep(2000);
		userexpansion2.click();
		Thread.sleep(1500);
		Supervisorid2.sendKeys(Supervisor2);
		Thread.sleep(2000);
		supervisoridkey.click();
		Thread.sleep(2000);
		FirstNametextbox2.sendKeys(FirstName2);
		Thread.sleep(500);
		LastNametextbox2.sendKeys(LastName2);
		Thread.sleep(500);
		EmployeeIdtextfield2.sendKeys(EmployeeId2);
		JobTitletextfield2.sendKeys(JobTitle2);
		jobloctextfield2.sendKeys(JobLocation2);
		Departmenttextfeild2.sendKeys(Department2);
		EmailAddresstextfeild2.sendKeys(Emailid2);
	}

	public void Activedirectorydetails(String Location, String DistributionList,String uid, String epw) throws InterruptedException {
		Thread.sleep(1000);
		Locationdropdown.sendKeys(Location);
		Thread.sleep(2000);
		Locationdropdown.sendKeys(Keys.ARROW_DOWN);
		Locationdropdown.sendKeys(Keys.ENTER);
		EmailAccountradio.click();
		InternetAccessradio.click();
		EmailDisasterradio.click();
		DistributionGroupListtextbox.sendKeys(DistributionList);
		Thread.sleep(2000);
		DistributionGroupListtextbox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		emailAttachdoc.click();
		Thread.sleep(1000);
		String path = System.getProperty("user.dir") + "\\Images\\" + "\\Screenshot (2).png";
		ChooseFilebtn.sendKeys(path);
		Thread.sleep(3000);
		uploadbtn.click();
		Thread.sleep(5000);
		Savebtn.click();
		Thread.sleep(2000);
		RequestCommenttextbox.sendKeys("Create Account");
		Thread.sleep(1500);
		Submitbtn.click();
		Thread.sleep(2000);
		Acknowledgeusername.sendKeys(uid);
		Acknowledgepassword.sendKeys(epw);
		Acceptbutton.click();
		
	}

	
}
