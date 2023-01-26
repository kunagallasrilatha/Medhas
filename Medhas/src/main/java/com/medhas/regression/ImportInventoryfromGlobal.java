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
public class ImportInventoryfromGlobal {

	WebDriver driver;
	WebDriverWait wait;

	public ImportInventoryfromGlobal(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Inventory'])[2]")
	WebElement inventoryoption;

	@FindBy(how = How.XPATH, using = "//span[text()='Inventory Request']")
	WebElement Inventoryrequest;

	@FindBy(how = How.XPATH, using = "//div[@class='p-radiobutton-box p-component']")
	WebElement importglobalradiobton;

	@FindBy(how = How.XPATH, using = "//input[@name = 'M_LocationId']")
	WebElement Locationdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='GlobalInventoryItemId']")
	WebElement globalinventorysearchbox;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Import')]")
	WebElement importbton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	WebElement submitbton;

	// e-Sign
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement eusername;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement epassword;

	@FindBy(how = How.XPATH, using = "//span[text()='Accept']")
	WebElement eAccept;

	// Toast Message
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Successfully created')]")
	WebElement inventoryRequestToastmsg;

	public void importglobal(String Loc,String globalinv,String eun,String epw) throws InterruptedException {
		inventoryoption.click();
		Thread.sleep(2000);

		Inventoryrequest.click();

		Thread.sleep(2000);
		
		importglobalradiobton.click();
		Thread.sleep(2000);
		Locationdropdown.sendKeys(Loc);
		Thread.sleep(1000);
		Locationdropdown.sendKeys(Keys.ARROW_DOWN);
		Locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		
		globalinventorysearchbox.sendKeys(globalinv);
		Thread.sleep(1000);
		globalinventorysearchbox.sendKeys(Keys.ARROW_DOWN);
		globalinventorysearchbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		importbton.click();
		Thread.sleep(3000);
		submitbton.click();
		Thread.sleep(2000);
		
		eusername.sendKeys(eun);
		epassword.sendKeys(epw);
		
		eAccept.click();
		}
	
	
	public void Toastmsg() throws InterruptedException {

		if (inventoryRequestToastmsg.isDisplayed()) {

			String expectedMessage = "Successfully created";
			String message = driver.findElement(By.xpath("//div[contains(text(),'Successfully created')]")).getText();
			System.out.println(inventoryRequestToastmsg.getText());
			Assert.assertEquals("Successfully created", expectedMessage);

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
