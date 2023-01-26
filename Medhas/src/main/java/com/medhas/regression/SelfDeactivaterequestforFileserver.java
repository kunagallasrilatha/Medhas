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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.utility.TestUtil;

/**
 * @author Shashank
 *
 */
public class SelfDeactivaterequestforFileserver {

	WebDriver driver;
	WebDriverWait wait;

	public SelfDeactivaterequestforFileserver(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Access Management'])[2]")
	WebElement accessmanagementoption;

	@FindBy(xpath = "//span[contains(text(),'Deactivate')]")
	public WebElement Deactivateoption;

	@FindBy(xpath = "//p[contains(text(),'Deactivate Request')]")
	public WebElement Deactivateoptionshortcut;

	// Deactivate for Self

	@FindBy(how = How.XPATH, using = "//body//div[@class='radiobtn']//div[@class='radiobtn']//div[1]//div[1]//div[2]")
	WebElement accessForSelfRdbtn;

	@FindBy(how = How.XPATH, using = "//div[@class='p-col-6 right-border']//div[2]//div[1]//div[2]")
	WebElement onbehalfrdbton;

	@FindBy(how = How.XPATH, using = "//div[@class='radiobtns']//div[1]//div[1]//div[2]")
	WebElement singleuserrdbton;

	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div/div[@class='layout-wrapper layout-static layout-menu-dark']/div[@class='layout-main']/div[@class='layout-content']/div[@class='card card-w-title card-w-title-full-screen']/div[@class='create-access-request deactivate-request']/div[@class='p-grid card card-w-title user-category']/div[@class='p-col-6 right-border']/div[@class='radiobtnz']/div[@class='radiobtns']/div[2]/div[1]")
	WebElement multipleusersrdbton;

	@FindBy(how = How.XPATH, using = "//input[@name='Request_CategoryID']")
	WebElement requestCategorydropown;

	// User Details

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/span[2]")
	WebElement userdetailsaccordion;

	@FindBy(how = How.XPATH, using = "//input[@name='EmployeeId']")
	WebElement empidtxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name='JobTitle']")
	WebElement jobtitletxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name='JobLocation']")
	WebElement joblocationtxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name='Department']")
	WebElement departmenttxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name='Supervisor_LoginDomain']")
	WebElement supidsearchfield;

	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-item']")
	WebElement supidkey;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Display Access Request')]")
	WebElement dispaybton;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'No Records found')]")
	WebElement Norecordsfoundmsg;

	@FindBy(how = How.XPATH, using = "//th[@class='p-resizable-column p-selection-column']//div[@class='p-checkbox-box p-component']")
	WebElement checkboxforall;

	@FindBy(how = How.XPATH, using = "//td[@class='p-selection-column']//div[@class='p-checkbox-box p-component']")
	WebElement firstcheckbox;

	@FindBy(how = How.XPATH, using = "//textarea[@name='RequestComment']")
	WebElement Remarktxtfield;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	WebElement Submitbton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
	WebElement Cancelbton;

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

		/*
		 * accessmanagementoption.click(); Thread.sleep(2000); Deactivateoption.click();
		 */

		Deactivateoptionshortcut.click();

		Thread.sleep(2000);

		accessForSelfRdbtn.click();

		requestCategorydropown.sendKeys(reqcate);
		Thread.sleep(2000);

		requestCategorydropown.sendKeys(Keys.ARROW_DOWN);
		requestCategorydropown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

	}

	public void userDetails(String empid, String jobtitle, String Jobloc, String depid, String supid)
			throws InterruptedException {

		userdetailsaccordion.click();

		TestUtil.IMPLICIT_WAIT = 5;

		empidtxtfield.sendKeys(empid);

		jobtitletxtfield.sendKeys(jobtitle);

		joblocationtxtfield.sendKeys(Jobloc);

		departmenttxtfield.sendKeys(depid);

		supidsearchfield.sendKeys(supid);
		Thread.sleep(4000);
		supidkey.click();

		dispaybton.click();

	}

	public void selectdeactivateaccess(String eun, String epw) throws InterruptedException {

		checkboxforall.click();

		Remarktxtfield.sendKeys("Deactivation request");

		Submitbton.click();

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
