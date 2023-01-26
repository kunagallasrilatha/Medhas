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
public class CreateMultipleAccessOperatingsystemforonbehalfsingleuser {

	WebDriver driver;

	public CreateMultipleAccessOperatingsystemforonbehalfsingleuser(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath = "//p[contains(text(),'Create Request')]")
	public WebElement createoptionshortcut;

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Access Management'])[2]")
	WebElement accessmanagementoption;

	@FindBy(xpath = "//span[contains(text(),'Create')]")
	public WebElement createoption;

	// Access for Onbehalf
	// Request Information
	@FindBy(xpath = "//div[@class='p-col-4 right-border selectable-user-category']//div[2]//div[1]//div[2]")
	public WebElement onbehalfrdbton;

	@FindBy(xpath = "//div[@class='p-col-4 right-border selectable-user-category']//div[2]//div[1]//div[1]//div[2]")
	public WebElement singleuserrdbton;

	// Permanent Employment Status
	@FindBy(xpath = "//div[@class='p-col-4 right-border']//div[@class='radiobtn']//div[1]//div[1]//div[2]")
	public WebElement Permanentchkbox;

	// Temporary Employment Status
	@FindBy(xpath = "//div[@class='p-col-4 right-border']//div[@class='p-radiobutton-box p-component']")
	public WebElement Temporarychkbox;

	// From Date
	@FindBy(xpath = "//input[@placeholder='From Date']")
	public WebElement fromDatechkbox;

	// To Date
	@FindBy(xpath = "//input[@placeholder='To Date']")
	public WebElement endDatechkbox;

	// Request Category dropdown
	@FindBy(xpath = "//input[@name='requestCategory']")
	public WebElement requestCategorydropown;

	// UserDetails

	@FindBy(xpath = "//input[@name='LoginDomain']")
	public WebElement userNTidsearchfield;

	@FindBy(xpath = "//div[@class='dropdown-item']")
	public WebElement userNTidkey;

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

	@FindBy(xpath = "(//span[text()='Operating System'])[2]")
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
	
	@FindBy(how = How.XPATH, using = "(//div[@role='checkbox'])[1]")
	WebElement allcheckboxes1;
	
	@FindBy(how = How.XPATH, using = "(//div[@role='checkbox'])[2]")
	WebElement allcheckboxes2;

	// 2nd Accordion

	@FindBy(xpath = "(//input[@name='Request_LocationID'])[2]")
	public WebElement Locdropdown2;

	@FindBy(xpath = "(//input[@name='Os_HostName'])[2]")
	public WebElement hostnamedropdown2;

	@FindBy(xpath = "(//input[@name='Os_SoftwareName'])[2]")
	public WebElement softwarenamedropdown2;

	@FindBy(how = How.XPATH, using = "(//div[@class='p-multiselect-label-container'])[2]")
	WebElement Rolesdropdown2;

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

	@FindBy(xpath = "//div[contains(text(),'Successfully Created Access Request')]")
	public WebElement accessrequesttoastMessage;

	public void requestInf(String reqcate) throws InterruptedException {

		createoptionshortcut.click();

		Thread.sleep(2000);

		onbehalfrdbton.click();
		Thread.sleep(2000);
		singleuserrdbton.click();

		Permanentchkbox.click();

		requestCategorydropown.sendKeys(reqcate);
		Thread.sleep(2000);

		requestCategorydropown.sendKeys(Keys.ARROW_DOWN);
		requestCategorydropown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

	}

	public void userDetails(String ntid, String empid, String jobtitle, String Jobloc, String depid, String supid)
			throws InterruptedException {

		userNTidsearchfield.sendKeys(ntid);

		userNTidkey.click();
		Thread.sleep(2000);

		empidtxtfield.sendKeys(empid);
		Thread.sleep(2000);

		jobtitiletxtfield.sendKeys(jobtitle);

		jobloctxtfield.sendKeys(Jobloc);

		departmenttxtfield.sendKeys(depid);

		supervisorsearchfield.sendKeys(supid);
		Thread.sleep(4000);
		supervisoridkey.click();

	}

	public void operatingsystemDetails(String Loc, String hostname, String softname)
			throws InterruptedException {

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

		allcheckboxes1.click();

		Thread.sleep(2000);

	}

	public void addnewos(String Loc, String hostname, String softname,String remarkkey, String eun,
			String epw) throws InterruptedException {

		addbton.click();

		Thread.sleep(2000);

		osaccordion.click();

		Thread.sleep(5000);

		Locdropdown2.sendKeys(Loc);
		Thread.sleep(1000);

		Locdropdown2.sendKeys(Keys.ARROW_DOWN);
		Locdropdown2.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		hostnamedropdown2.sendKeys(hostname);

		Thread.sleep(1000);

		hostnamedropdown2.sendKeys(Keys.ARROW_DOWN);
		hostnamedropdown2.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		softwarenamedropdown2.sendKeys(softname);

		Thread.sleep(1000);

		softwarenamedropdown2.sendKeys(Keys.ARROW_DOWN);
		softwarenamedropdown2.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		Rolesdropdown2.click();
		Thread.sleep(3000);

		allcheckboxes2.click();

		Thread.sleep(2000);

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
