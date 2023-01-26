/**
 * 
 */
package com.medhas.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * @author Shashank
 *
 */
public class PendingApprovalsforInfraBulk {
	
	WebDriver driver;

	public PendingApprovalsforInfraBulk(WebDriver driver) {
		this.driver = driver;

	}
	
	
	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Access Management'])[2]")
	WebElement accessmanagementoption;

	@FindBy(xpath = "//span[contains(text(),'Bulk Pending Approvals')]")
	public WebElement bulkpendingapprovalsoption;

	@FindBy(xpath = "//span[contains(text(),'Request Id')]")
	public WebElement requestidheader;

	@FindBy(xpath = "//tr[1]//td[1]//div[1]//div[2]")
	public WebElement firstcheckbox;

	@FindBy(xpath = "//tr[2]//td[1]//div[1]//div[2]")
	public WebElement secondchecbox;

	@FindBy(xpath = "//tr[3]//td[1]//div[1]//div[2]")
	public WebElement thirdchecbox;

	@FindBy(xpath = "//tr[4]//td[1]//div[1]//div[2]")
	public WebElement fourthcheckbox;

	@FindBy(xpath = "//span[contains(text(),'Approve')]")
	public WebElement Approvebton;

	@FindBy(xpath = "//span[contains(text(),'Reject')]")
	public WebElement rejectbton;

	@FindBy(xpath = "//span[contains(text(),'GRANT')]")
	public WebElement grantbton;

	@FindBy(xpath = "//span[contains(text(),'Not Grant')]")
	public WebElement Notgrantbton;

	@FindBy(xpath = "//input[@name='Remarks']")
	public WebElement remarktxtfield;
	
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	public WebElement savebton;

	// e-Sign
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement eusername;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement epassword;

	@FindBy(how = How.XPATH, using = "//span[text()='Accept']")
	WebElement eAccept;

	// Logout
	@FindBy(how = How.XPATH, using = "//img[@class='header-profile-icon']")
	WebElement usericon;

	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	WebElement logout;

	// Toast Message after approved with SO
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Request Approved')]")
	WebElement ApprovedToastmsg;
	

	// Toast Message after reject with SO
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Request Rejected')]")
	WebElement rejectToastmsg;

	// Toast Message after approved with SA
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Bulk Deactivation Request Closed')]")
	WebElement GrantToastmsg;

	// Toast Message after notgrant with SA
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Request Not Granted')]")
	WebElement NotGrantToastmsg;

	public void approvalworkflowaccessLITHead(String euser, String epwd) throws InterruptedException {

		accessmanagementoption.click();
		Thread.sleep(2000);
		bulkpendingapprovalsoption.click();
		Thread.sleep(5000);
		requestidheader.click();
		requestidheader.click();
		Thread.sleep(2000);
		firstcheckbox.click();
		secondchecbox.click();
		// thirdchecbox.click();
		// fourthcheckbox.click();
		Thread.sleep(1000);
		Approvebton.click();
		Thread.sleep(1000);

		remarktxtfield.sendKeys("Approve the Deactivation");
		Thread.sleep(1000);
		savebton.click();
		Thread.sleep(1000);
		eusername.sendKeys(euser);
		epassword.sendKeys(epwd);
		eAccept.click();
		Thread.sleep(5000);

	}

	public void approvalworkflowaccessLIT(String euser, String epwd) throws InterruptedException {

		accessmanagementoption.click();
		Thread.sleep(2000);
		bulkpendingapprovalsoption.click();
		Thread.sleep(5000);
		requestidheader.click();
		requestidheader.click();
		Thread.sleep(2000);
		firstcheckbox.click();
		secondchecbox.click();
		// thirdchecbox.click();
		// fourthcheckbox.click();
		Thread.sleep(1000);
		grantbton.click();
		Thread.sleep(1000);

		remarktxtfield.sendKeys("Grant the Deactivation");
		Thread.sleep(1000);
		savebton.click();
		Thread.sleep(1000);
		eusername.sendKeys(euser);
		epassword.sendKeys(epwd);
		eAccept.click();

	}
	
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		usericon.click();
		Thread.sleep(2000);
		logout.click();
	}

	public void rejectflowaccesswithLITHead(String euser, String epwd) throws InterruptedException {

		accessmanagementoption.click();
		Thread.sleep(2000);
		bulkpendingapprovalsoption.click();
		Thread.sleep(5000);
		requestidheader.click();
		requestidheader.click();
		Thread.sleep(2000);
		firstcheckbox.click();
		secondchecbox.click();
		Thread.sleep(1000);
		rejectbton.click();
		Thread.sleep(1000);

		remarktxtfield.sendKeys("Grant the Deactivation");
		Thread.sleep(1000);
		savebton.click();
		Thread.sleep(1000);
		
		eusername.sendKeys(euser);
		epassword.sendKeys(epwd);
		eAccept.click();
	}

	public void notGrantflowaccesswithLIT(String euser, String epwd) throws InterruptedException {
		Thread.sleep(2000);
		accessmanagementoption.click();
		bulkpendingapprovalsoption.click();
		Thread.sleep(5000);
		requestidheader.click();
		requestidheader.click();
		Thread.sleep(2000);
		firstcheckbox.click();
		secondchecbox.click();
		Thread.sleep(1000);
		Notgrantbton.click();
		Thread.sleep(1000);

		remarktxtfield.sendKeys("Grant the Deactivation");
		Thread.sleep(1000);
		eusername.sendKeys(euser);
		epassword.sendKeys(epwd);
		eAccept.click();
	}

	public void approveToastMsg() throws InterruptedException {

		if (ApprovedToastmsg.isDisplayed()) {

			String expectedMessage = "Request Approved";
			String message = driver.findElement(By.xpath("//div[contains(text(),'Request Approved')]")).getText();
			System.out.println(ApprovedToastmsg.getText());
			Assert.assertEquals("Request Approved", expectedMessage);

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

	public void grantToastMsg() throws InterruptedException {

		if (GrantToastmsg.isDisplayed()) {

			String expectedMessage = "Bulk Deactivation Request Closed";
			String message = driver.findElement(By.xpath("//div[contains(text(),'Bulk Deactivation Request Closed')]"))
					.getText();
			System.out.println(GrantToastmsg.getText());
			Assert.assertEquals("Bulk Deactivation Request Closed", expectedMessage);

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
	
	
	public void rejectToastMsg() throws InterruptedException {

		if (rejectToastmsg.isDisplayed()) {

			String expectedMessage = "Request Rejected";
			String message = driver.findElement(By.xpath("//div[contains(text(),'Request Rejected')]"))
					.getText();
			System.out.println(rejectToastmsg.getText());
			Assert.assertEquals("Request Rejected", expectedMessage);

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

	public void notgrantToastMsg() throws InterruptedException {

		if (NotGrantToastmsg.isDisplayed()) {

			String expectedMessage = "Request Not Granted";
			String message = driver.findElement(By.xpath("//div[contains(text(),'Request Not Granted')]"))
					.getText();
			System.out.println(NotGrantToastmsg.getText());
			Assert.assertEquals("Request Not Granted", expectedMessage);

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
