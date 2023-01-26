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
public class UserAccessReviewPendingApprovals {

	WebDriver driver;

	public UserAccessReviewPendingApprovals(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Inventory'])[2]")
	WebElement inventoryoption;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'User Access Review List')]")
	WebElement useraccessreviewlistoption;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Review ID')]")
	WebElement reviewID;

	@FindBy(how = How.XPATH, using = "//div[@class='PENDING']")
	WebElement pickuplatestrequest;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Approve')]")
	WebElement Approvebton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Send Back')]")
	WebElement Sendbackbton;

	@FindBy(how = How.XPATH, using = "//input[@name='Remarks']")
	WebElement Remarkstxtfield;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
	WebElement Savebton;

	@FindBy(how = How.XPATH, using = "//li[@class='user-profile']")
	WebElement usericon;

	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	WebElement logout;

	// e-Sign
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement eusername;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement epassword;

	@FindBy(how = How.XPATH, using = "//span[text()='Accept']")
	WebElement eAccept;

	public void selectUserAccessReviewforApproval(String eun, String epw) throws InterruptedException {

		inventoryoption.click();

		Thread.sleep(2000);
		useraccessreviewlistoption.click();
		Thread.sleep(3000);
		reviewID.click();
		reviewID.click();
		Thread.sleep(2000);
		pickuplatestrequest.click();
		Thread.sleep(4000);
		Approvebton.click();
		Thread.sleep(1000);
		Remarkstxtfield.sendKeys("Approve");
		Savebton.click();
		Thread.sleep(1000);
		eusername.sendKeys(eun);
		epassword.sendKeys(epw);
		eAccept.click();

	}

	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		usericon.click();
		Thread.sleep(2000);
		logout.click();
	}
}
