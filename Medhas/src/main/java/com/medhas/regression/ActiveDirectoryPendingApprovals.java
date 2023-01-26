/**
 * 
 */
package com.medhas.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Shashank
 *
 */
public class ActiveDirectoryPendingApprovals {

	WebDriver driver;

	public ActiveDirectoryPendingApprovals(WebDriver driver) {
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

	@FindBy(how = How.XPATH, using = "//li[@class='user-profile']")
	WebElement usericon;

	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	WebElement logout;

	public void approvalworkflowaccessHod(String euser, String epwd) throws InterruptedException {

		accessmanagementoption.click();
		Thread.sleep(2000);
		pendingapprovals.click();
		Thread.sleep(3000);
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

	public void approvalworkflowaccessLocationITHead(String euser, String epwd) throws InterruptedException {

		accessmanagementoption.click();
		Thread.sleep(2000);
		pendingapprovals.click();
		Thread.sleep(3000);
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

	public void approvalworkflowLIT(String euser, String epwd, String remarktxt, String appusername)
			throws InterruptedException {

		accessmanagementoption.click();
		Thread.sleep(2000);
		pendingapprovals.click();
		Thread.sleep(3000);
		requestidheader.click();
		requestidheader.click();
		Thread.sleep(2000);
		requestpickup.click();
		Thread.sleep(5000);
		grantbton.click();
		Thread.sleep(2000);
		remarktxtfield.sendKeys(remarktxt);
		Thread.sleep(1000);
		ApplicationUsernametxtfield.sendKeys(appusername);
		Thread.sleep(4000);
		savebton.click();
		Thread.sleep(2000);
		eusername.sendKeys(euser);
		epassword.sendKeys(epwd);
		eAccept.click();

	}

}
