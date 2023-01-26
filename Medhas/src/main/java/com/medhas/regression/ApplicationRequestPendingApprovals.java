
package com.medhas.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ApplicationRequestPendingApprovals {

	WebDriver driver;

	public ApplicationRequestPendingApprovals(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Access Management'])[2]")
	WebElement accessmanagementoption;

	@FindBy(xpath = "(//span[contains(text(),'Pending Approvals')])[1]")
	public WebElement pendingapprovals;

	@FindBy(xpath = "//span[contains(text(),'Request Id')]")
	public WebElement requestidheader;

	@FindBy(xpath = "//tr[1]//td[2]")
	public WebElement requestpickup;

	@FindBy(xpath = "//span[contains(text(),'Approve')]")
	public WebElement Approvebton;

	@FindBy(xpath = "//span[contains(text(),'Send Back')]")
	public WebElement sendbackbton;

	@FindBy(xpath = "//span[contains(text(),'Reject')]")
	public WebElement rejectbton;

	@FindBy(xpath = "//span[contains(text(),'GRANT')]")
	public WebElement grantbton;

	@FindBy(xpath = "//span[contains(text(),'Not Grant')]")
	public WebElement Notgrantbton;

	@FindBy(xpath = "//input[@name='Remarks']")
	public WebElement remarktxtfield;

	@FindBy(xpath = "//input[@name='Application Username']")
	public WebElement ApplicationUsernametxtfield;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	public WebElement savebton;
	
	// e-Sign
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement eusername;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement epassword;

	@FindBy(how = How.XPATH, using = "//span[text()='Accept']")
	WebElement eAccept;

	//Logout
	@FindBy(how = How.XPATH, using = "//li[@class='user-profile']")
	WebElement usericon;

	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	WebElement logout;

	// Toast Message after granting with SystemAdmin
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Application Request Closed')]")
	WebElement accessGrantedtoastmsg;

	// Toast Message after request rejected by HOD
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Request Rejected')]")
	WebElement rejecttoastmsg;

	// Toast Message after Not Grant by SA
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Request Not Granted')]")
	WebElement notgranttoastmsg;

	// Toast Message for Sendback
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Request Sent Back')]")
	WebElement sendbacktoastmsg;

	public void approvalworkflowaccessHod(String euser, String epwd) throws InterruptedException {

		accessmanagementoption.click();
		Thread.sleep(2000);
		pendingapprovals.click();
		Thread.sleep(5000);
		requestidheader.click();
		requestidheader.click();
		Thread.sleep(2000);
		requestpickup.click();
		Thread.sleep(5000);
		Approvebton.click();
		Thread.sleep(1000);
		remarktxtfield.sendKeys("Approve the access");
		Thread.sleep(1000);
		savebton.click();
		Thread.sleep(1000);
		eusername.sendKeys(euser);
		epassword.sendKeys(epwd);
		eAccept.click();
		Thread.sleep(5000);

	}

	public void approvalworkflowaccessSystemowner(String euser, String epwd) throws InterruptedException {

		accessmanagementoption.click();
		Thread.sleep(2000);
		pendingapprovals.click();
		Thread.sleep(5000);
		requestidheader.click();
		requestidheader.click();
		Thread.sleep(2000);
		requestpickup.click();
		Thread.sleep(5000);
		Approvebton.click();
		Thread.sleep(1000);
		remarktxtfield.sendKeys("Approve the Access");
		Thread.sleep(1000);
		savebton.click();
		Thread.sleep(1000);
		eusername.sendKeys(euser);
		epassword.sendKeys(epwd);
		eAccept.click();
		Thread.sleep(5000);

	}

	public void approvalworkflowaccesssystemadmin(String euser, String epwd, String remarktxt, String appusername)
			throws InterruptedException {

		accessmanagementoption.click();
		Thread.sleep(2000);
		pendingapprovals.click();
		Thread.sleep(5000);
		requestidheader.click();
		requestidheader.click();
		Thread.sleep(2000);
		requestpickup.click();
		Thread.sleep(5000);
		grantbton.click();
		Thread.sleep(2000);
		remarktxtfield.sendKeys(remarktxt);
		Thread.sleep(1000);
		if (ApplicationUsernametxtfield.isEnabled()) {
			ApplicationUsernametxtfield.sendKeys(appusername);
			savebton.click();
			Thread.sleep(2000);
			eusername.sendKeys(euser);
			epassword.sendKeys(epwd);
			eAccept.click();
		} 
		else {
			savebton.click();
		
			Thread.sleep(2000);
			eusername.sendKeys(euser);
			epassword.sendKeys(epwd);
			eAccept.click();
		}

		
	}

	public void grantToastMsg() throws InterruptedException {

		if (accessGrantedtoastmsg.isDisplayed()) {

			String expectedMessage = "Request Closed";
			String message = driver.findElement(By.xpath("//div[contains(text(),'Application Request Closed')]"))
					.getText();
			System.out.println(accessGrantedtoastmsg.getText());
			Assert.assertEquals("Request Closed", expectedMessage);

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

		if (rejecttoastmsg.isDisplayed()) {

			String expectedMessage = "Request Rejected";
			String message = driver.findElement(By.xpath("//div[contains(text(),'Request Rejected')]")).getText();
			System.out.println(rejecttoastmsg.getText());
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

	public void NotGrantToastMsg() throws InterruptedException {

		if (notgranttoastmsg.isDisplayed()) {

			String expectedMessage = "Request Not Granted";
			String message = driver.findElement(By.xpath("//div[contains(text(),'Request Not Granted')]")).getText();
			System.out.println(notgranttoastmsg.getText());
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

	public void SendbackToastMsg() throws InterruptedException {

		if (sendbacktoastmsg.isDisplayed()) {

			String expectedMessage = "Request Sent Back";
			String message = driver.findElement(By.xpath("//div[contains(text(),'Request Sent Back')]")).getText();
			System.out.println(sendbacktoastmsg.getText());
			Assert.assertEquals("Request Sent Back", expectedMessage);

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

	public void rejectflowaccess(String euser, String epwd) throws InterruptedException {
		Thread.sleep(2000);
		accessmanagementoption.click();
		Thread.sleep(2000);
		pendingapprovals.click();
		Thread.sleep(5000);
		Actions click = new Actions(driver);
		click.doubleClick(requestidheader).perform();
		requestidheader.click();
		requestpickup.click();
		Thread.sleep(8000);
		rejectbton.click();
		Thread.sleep(3000);
		remarktxtfield.sendKeys("Reject the Access");
		savebton.click();
		Thread.sleep(2000);
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

	public void sendBackRequestflowaccess(String euser, String epwd) throws InterruptedException {
		Thread.sleep(2000);
		accessmanagementoption.click();
		Thread.sleep(2000);
		pendingapprovals.click();
		Thread.sleep(5000);
		Actions click = new Actions(driver);
		click.doubleClick(requestidheader).perform();
		requestidheader.click();
		requestpickup.click();
		Thread.sleep(8000);
		sendbackbton.click();
		Thread.sleep(3000);
		remarktxtfield.sendKeys("SendBack the request");
		savebton.click();
		eusername.sendKeys(euser);
		epassword.sendKeys(epwd);
		eAccept.click();
	}

	public void notGrantflowaccesswithSA(String euser, String epwd) throws InterruptedException {
		Thread.sleep(2000);
		accessmanagementoption.click();
		Thread.sleep(2000);
		pendingapprovals.click();
		Thread.sleep(5000);
		Actions click = new Actions(driver);
		click.doubleClick(requestidheader).perform();
		requestidheader.click();
		requestpickup.click();
		Thread.sleep(8000);
		Notgrantbton.click();
		Thread.sleep(3000);
		remarktxtfield.sendKeys("NotGrant the Access");
		savebton.click();
		Thread.sleep(2000);
		eusername.sendKeys(euser);
		epassword.sendKeys(epwd);
		eAccept.click();
	}

}