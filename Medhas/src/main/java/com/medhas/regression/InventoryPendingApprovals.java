/**
 * 
 */
package com.medhas.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Shashank
 *
 */
public class InventoryPendingApprovals {

	WebDriver driver;

	public InventoryPendingApprovals(WebDriver driver) {
		this.driver = driver;

	}

	// Login with Approver
	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Inventory'])[2]")
	WebElement inventoryoption;

	@FindBy(how = How.XPATH, using = "//li[@class='active-menuitem']//ul//li//span[@class='layout-menuitem-text'][contains(text(),'Pending Approvals')]")
	WebElement pendingapprovalsinv;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Request Id')]")
	WebElement requestidheader;

	@FindBy(how = How.XPATH, using = "//tr[1]//td[4]")
	WebElement requestid;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Approve')]")
	WebElement Approvebton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Send Back')]")
	WebElement Sendbackbton;

	@FindBy(how = How.XPATH, using = "//input[@name='Remarks']")
	WebElement remarktxtfield;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
	WebElement savebton;

	// e-Sign
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement eusername;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement epassword;

	@FindBy(how = How.XPATH, using = "//span[text()='Accept']")
	WebElement eAccept;

	public void approvalflowinv(String euser, String epwd) throws InterruptedException {

		inventoryoption.click();
		Thread.sleep(2000);
		pendingapprovalsinv.click();
		Thread.sleep(2000);

		Actions click = new Actions(driver);
		click.doubleClick(requestidheader).perform();
		requestidheader.click();

		requestid.click();

		Thread.sleep(5000);

		Approvebton.click();

		Thread.sleep(3000);

		remarktxtfield.sendKeys("Approve the inventory");
		savebton.click();

		eusername.sendKeys(euser);
		epassword.sendKeys(epwd);
		eAccept.click();

	}

}
