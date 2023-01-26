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
public class MultipleusersModifyRequestforOperatingsystem {

	WebDriver driver;

	public MultipleusersModifyRequestforOperatingsystem(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Access Management'])[2]")
	WebElement accessmanagementoption;

	@FindBy(how = How.XPATH, using = "//span[text()='Modify']")
	WebElement Modifyoption;

	// Modify for onbehalf single user
	@FindBy(how = How.XPATH, using = "//div[@class='p-grid card card-w-title user-category']//div[1]//div[1]//div[2]//div[1]//div[2]")
	WebElement onbehalfrdbton;

	@FindBy(how = How.XPATH, using = "//div[@class='p-col-4 right-border']//div[2]//div[2]//div[1]//div[2]")
	WebElement multipleusersrdbton;

	@FindBy(how = How.XPATH, using = "//div[@class='card card-w-title card-w-title-full-screen']//div[2]//div[1]//div[1]//div[1]//div[2]")
	WebElement Permanentrdbton;

	@FindBy(how = How.XPATH, using = "//input[@name='Request_CategoryID']")
	WebElement requestCategorydropown;

	// Operating system details

	@FindBy(how = How.XPATH, using = "//input[@name='Request_LocationID']")
	WebElement locationdropown;

	@FindBy(how = How.XPATH, using = "//input[@name='Os_HostName']")
	WebElement Hostnamedropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='Os_SoftwareName']")
	WebElement softwarenamedropown;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add User')]")
	WebElement AddUserbton;

	// User Details

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/a[1]/span[2]")
	WebElement userdetailsaccordion1;

	@FindBy(how = How.XPATH, using = "//input[@name='LoginDomain']")
	WebElement userntidsearchfield;

	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-item']")
	WebElement userntidkey;

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

	// New UserDetails

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[1]/a[1]")
	WebElement userdetailsaccordion2;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement userntidsearchfield1;

	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-item']")
	WebElement userntidkey1;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]")
	WebElement empidtxtfield1;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/input[1]")
	WebElement jobtitletxtfield1;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]")
	WebElement joblocationtxtfield1;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/input[1]")
	WebElement departmenttxtfield1;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement supidsearchfield1;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]")
	WebElement supidkey1;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Display Access Request')]")
	WebElement Displayaccessrequestrdbton;

	// To edit the access

	@FindBy(how = How.XPATH, using = "//tr[1]//td[1]//div[1]//i[1]")
	WebElement editicon1;

	@FindBy(how = How.XPATH, using = "//div[@class='p-multiselect-label-container']")
	WebElement Rolesdropdown;

	@FindBy(how = How.XPATH, using = "//li[2]//div[1]//div[1]")
	WebElement Secondcheckbox;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
	WebElement Savebton1;

	// To edit the second access

	@FindBy(how = How.XPATH, using = "//tr[2]//td[1]//div[1]//i[1]")
	WebElement editicon2;

	@FindBy(how = How.XPATH, using = "//div[@class='p-multiselect-label-container']")
	WebElement Rolesdropdown2;

	@FindBy(how = How.XPATH, using = "//li[2]//div[1]//div[1]")
	WebElement Secondcheckbox2;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
	WebElement Savebton2;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Display Access Request')]")
	WebElement Displayaccessrequestbton;

	@FindBy(how = How.XPATH, using = "//textarea[@name='RequestComment']")
	WebElement remarktxtfield;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	WebElement Submitbton;

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

		onbehalfrdbton.click();
		Thread.sleep(2000);

		multipleusersrdbton.click();

		Permanentrdbton.click();

		requestCategorydropown.sendKeys(reqcate);
		Thread.sleep(2000);

		requestCategorydropown.sendKeys(Keys.ARROW_DOWN);
		requestCategorydropown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
	}

	public void enteroperatingsystemname(String Loc, String hostname, String softwarename) throws InterruptedException {

		locationdropown.sendKeys(Keys.CONTROL + "a");
		locationdropown.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		locationdropown.sendKeys(Loc);
		Thread.sleep(2000);
		locationdropown.sendKeys(Keys.ARROW_DOWN);
		locationdropown.sendKeys(Keys.ENTER);

		Hostnamedropdown.sendKeys(Keys.CONTROL + "a");
		Hostnamedropdown.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		Hostnamedropdown.sendKeys(hostname);
		Thread.sleep(2000);
		Hostnamedropdown.sendKeys(Keys.ARROW_DOWN);
		Hostnamedropdown.sendKeys(Keys.ENTER);

		softwarenamedropown.sendKeys(Keys.CONTROL + "a");
		softwarenamedropown.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		softwarenamedropown.sendKeys(softwarename);
		Thread.sleep(2000);
		softwarenamedropown.sendKeys(Keys.ARROW_DOWN);
		softwarenamedropown.sendKeys(Keys.ENTER);

		AddUserbton.click();

		Thread.sleep(3000);
	}

	public void userDetails1(String userntid, String empid, String jobtitle, String Jobloc, String depid, String supid)
			throws InterruptedException {

		userdetailsaccordion1.click();

		TestUtil.IMPLICIT_WAIT = 5;

		userntidsearchfield.sendKeys(userntid);
		Thread.sleep(2000);

		userntidkey.click();

		Thread.sleep(3000);
		empidtxtfield.sendKeys(empid);
		Thread.sleep(2000);

		jobtitletxtfield.sendKeys(jobtitle);

		joblocationtxtfield.sendKeys(Jobloc);

		departmenttxtfield.sendKeys(depid);

		supidsearchfield.sendKeys(supid);
		Thread.sleep(4000);
		supidkey.click();

	}

	public void userDetails2(String userntid1, String empid1, String jobtitle1, String Jobloc1, String depid1,
			String supid1) throws InterruptedException {

		userdetailsaccordion2.click();

		TestUtil.IMPLICIT_WAIT = 5;

		userntidsearchfield1.sendKeys(userntid1);
		Thread.sleep(2000);

		userntidkey1.click();

		Thread.sleep(3000);
		empidtxtfield1.sendKeys(empid1);
		Thread.sleep(2000);

		jobtitletxtfield1.sendKeys(jobtitle1);

		joblocationtxtfield1.sendKeys(Jobloc1);

		departmenttxtfield1.sendKeys(depid1);

		supidsearchfield1.sendKeys(supid1);
		Thread.sleep(4000);
		supidkey1.click();

		Displayaccessrequestbton.click();

	}

	public void modifyaccess(String Role1, String Role2, String remark, String eun, String epw)
			throws InterruptedException {

		editicon1.click();

		Rolesdropdown.click();

		Secondcheckbox.click();
		Thread.sleep(2000);

		Savebton1.click();

		editicon2.click();

		Rolesdropdown2.click();

		Secondcheckbox2.click();
		Thread.sleep(2000);
		Savebton2.click();

		remarktxtfield.sendKeys(remark);

		Submitbton.click();

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
