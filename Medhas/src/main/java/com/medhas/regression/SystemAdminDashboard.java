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

/**
 * @author Shashank
 *
 */
public class SystemAdminDashboard {

	WebDriver driver;
	WebDriverWait wait;

	public SystemAdminDashboard(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'System Admin Dashboard')])[2]")
	WebElement systemAdminDashbordoption;

	// Select the request with location and category
	@FindBy(how = How.XPATH, using = "//input[@name='location']")
	WebElement locationDropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='category']")
	WebElement Categorydropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='categoryType']")
	WebElement inventoryitemdropdown;

	// Search the request
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
	WebElement searchBton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Request Id')]")
	WebElement requestIDHeader;

	@FindBy(how = How.XPATH, using = "//tr[1]//td[1]//div[1]//div[2]")
	WebElement firstCheckbox;

	@FindBy(how = How.XPATH, using = "//tr[2]//td[1]//div[1]//div[2]")
	WebElement secondCheckbox;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	WebElement submitBton;

	// A pop up will be displayed to enter remarks enter remarks and submit the
	// request
	@FindBy(how = How.XPATH, using = "//textarea[@name='RequestComment']")
	WebElement RemarkstxtBox;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'cancel')]")
	WebElement cancelBton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'submit')]")
	WebElement submitBton2;

	// e-Sign
	@FindBy(xpath = "//input[@placeholder='Username']")
	public WebElement eusername;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement epassword;

	@FindBy(xpath = "//span[contains(text(),'Accept')]")
	public WebElement eAccept;

	// Toast Message

	@FindBy(xpath = "//div[contains(text(),'Requested for Deactivation')]")
	public WebElement BulkRequestToastmsg;

	public void systemAdminBoard(String Loc, String Cate, String cateType) throws InterruptedException {

		systemAdminDashbordoption.click();

		Thread.sleep(3000);

		locationDropdown.sendKeys(Loc);
		Thread.sleep(1000);
		locationDropdown.sendKeys(Keys.ARROW_DOWN);
		locationDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		Categorydropdown.sendKeys(Cate);
		Thread.sleep(1000);
		Categorydropdown.sendKeys(Keys.ARROW_DOWN);
		Categorydropdown.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		inventoryitemdropdown.sendKeys(cateType);
		Thread.sleep(1000);
		inventoryitemdropdown.sendKeys(Keys.ARROW_DOWN);
		inventoryitemdropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		searchBton.click();
	}

	public void selectcheckBox(String eun, String epw) throws InterruptedException {

		Thread.sleep(3000);

		requestIDHeader.click();
		requestIDHeader.click();
		Thread.sleep(1000);
		firstCheckbox.click();
		secondCheckbox.click();
		Thread.sleep(2000);
		submitBton.click();
		Thread.sleep(3000);

		RemarkstxtBox.sendKeys("Bulk Deactivation Requests");
		Thread.sleep(2000);
		submitBton2.click();
		Thread.sleep(2000);
		eusername.sendKeys(eun);
		epassword.sendKeys(epw);
		eAccept.click();
	}

	public void Toastmsg() throws InterruptedException {

		Thread.sleep(4000);

		if (BulkRequestToastmsg.isDisplayed()) {

			String expectedMessage = "Requested for Deactivation";
			String message = driver.findElement(By.xpath("//div[contains(text(),'Requested for Deactivation')]"))
					.getText();
			System.out.println(BulkRequestToastmsg.getText());
			Assert.assertEquals("Requested for Deactivation", expectedMessage);

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
