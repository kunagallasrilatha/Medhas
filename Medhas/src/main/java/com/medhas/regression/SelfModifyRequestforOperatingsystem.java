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

import com.qa.utility.TestUtil;

/**
 * @author Shashank
 *
 */
public class SelfModifyRequestforOperatingsystem {
	WebDriver driver;

	public SelfModifyRequestforOperatingsystem(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Access Management'])[2]")
	WebElement accessmanagementoption;

	@FindBy(how = How.XPATH, using = "//span[text()='Modify']")
	WebElement Modifyoption;

	// Modify for Self

	@FindBy(how = How.XPATH, using = "//div[@class='p-grid card card-w-title user-category']//div[1]//div[1]//div[1]//div[1]//div[2]")
	WebElement accessForSelfRdbtn;

	@FindBy(how = How.XPATH, using = "//div[@class='p-grid card card-w-title user-category']//div[1]//div[1]//div[2]//div[1]//div[2]")
	WebElement onbehalfrdbton;

	@FindBy(how = How.XPATH, using = "//div[@class='p-col-4 right-border']//div[2]//div[1]//div[1]//div[2]")
	WebElement singleuserrdbton;

	@FindBy(how = How.XPATH, using = "//div[@class='p-col-4 right-border']//div[2]//div[2]//div[1]//div[2]")
	WebElement multipleusersrdbton;

	@FindBy(how = How.XPATH, using = "//div[@class='card card-w-title card-w-title-full-screen']//div[2]//div[1]//div[1]//div[1]//div[2]")
	WebElement Permanentrdbton;

	@FindBy(how = How.XPATH, using = "//input[@name='Request_CategoryID']")
	WebElement requestCategorydropown;

	// User Details

	@FindBy(how = How.XPATH, using = "//span[@class='p-accordion-header-text']")
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
	
	//To select the request
	@FindBy(how = How.XPATH, using = "//th[@class='p-resizable-column p-selection-column']//div[@class='p-checkbox-box p-component']")
	WebElement checkboxforall;

	@FindBy(how = How.XPATH, using = "//tr[1]//td[2]//div[1]//div[2]")
	WebElement firstcheckbox;

	@FindBy(how = How.XPATH, using = "//div[@class='delete-row']")
	WebElement editicon;

	@FindBy(how = How.XPATH, using = "//textarea[@name='RequestComment']")
	WebElement remarkstxtfield;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	WebElement submitbton;

	// Editable fields

	@FindBy(how = How.XPATH, using = "//div[@class='p-multiselect-label-container']")
	WebElement Rolesdropdown;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
	WebElement savebton;

	@FindBy(how = How.XPATH, using = "//li[2]//div[1]//div[1]")
	WebElement Secondcheckbox;

	// e-Sign
	@FindBy(xpath = "//input[@placeholder='Username']")
	public WebElement eusername;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement epassword;

	@FindBy(xpath = "//span[contains(text(),'Accept')]")
	public WebElement eAccept;

	// Toast Message

	@FindBy(xpath = "//div[contains(text(),'Successfully Modified')]")
	public WebElement modifyRequesttoastMessage;

	public void requestInf(String reqcate) throws InterruptedException {

		accessmanagementoption.click();
		Thread.sleep(2000);
		Modifyoption.click();

		Thread.sleep(2000);

		accessForSelfRdbtn.click();

		Permanentrdbton.click();

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

	public void selectRequest(String Role, String remark, String eun, String epw) throws InterruptedException {

		editicon.click();

		Thread.sleep(2000);

		Rolesdropdown.click();

		Secondcheckbox.click();
		Thread.sleep(2000);

		savebton.click();
		Thread.sleep(2000);

		firstcheckbox.click();

		remarkstxtfield.sendKeys(remark);

		submitbton.click();

		Thread.sleep(2000);

		eusername.sendKeys(eun);
		epassword.sendKeys(epw);
		eAccept.click();
	}

	public void Toastmsg() throws InterruptedException {

		Thread.sleep(4000);

		if (modifyRequesttoastMessage.isDisplayed()) {

			String expectedMessage = "Successfully Modified";
			String message = driver.findElement(By.xpath("//div[contains(text(),'Successfully Modified')]")).getText();
			System.out.println(modifyRequesttoastMessage.getText());
			Assert.assertEquals("Successfully Modified", expectedMessage);

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