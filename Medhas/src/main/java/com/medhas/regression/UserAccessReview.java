/**
 * 
 */
package com.medhas.regression;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Shashank
 *
 */
public class UserAccessReview {

	WebDriver driver;

	public UserAccessReview(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Inventory'])[2]")
	WebElement inventoryoption;

	@FindBy(how = How.XPATH, using = "//span[text()='User Access Review']")
	WebElement useraccessreviewoption;

	@FindBy(how = How.XPATH, using = "//input[@name='M_LocationId']")
	WebElement Locationdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='ApplicationName']")
	WebElement appdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='InstrumentName']")
	WebElement Instrumentdropdown;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
	WebElement Cancelbton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	WebElement Submitbton;

	// e-Sign
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement eusername;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement epassword;

	@FindBy(how = How.XPATH, using = "//span[text()='Accept']")
	WebElement eAccept;

	public void selectUserAccessReview(String Loc, String app, String Ins, String eun, String epw)
			throws InterruptedException {

		inventoryoption.click();

		Thread.sleep(2000);

		useraccessreviewoption.click();
		Thread.sleep(2000);

		Locationdropdown.sendKeys(Loc);

		Thread.sleep(2000);

		Locationdropdown.sendKeys(Keys.ARROW_DOWN);
		Locationdropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		appdropdown.sendKeys(app);

		Thread.sleep(2000);

		appdropdown.sendKeys(Keys.ARROW_DOWN);
		appdropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		Instrumentdropdown.sendKeys(Ins);

		Thread.sleep(2000);

		Instrumentdropdown.sendKeys(Keys.ARROW_DOWN);
		Instrumentdropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		Submitbton.click();

		Thread.sleep(2000);

		eusername.sendKeys(eun);

		epassword.sendKeys(epw);

		eAccept.click();

	}

}
