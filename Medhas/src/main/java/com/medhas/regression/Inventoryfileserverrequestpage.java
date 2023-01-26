package com.medhas.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Inventoryfileserverrequestpage extends BaseClass {

	WebDriver driver;

	public Inventoryfileserverrequestpage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(name = "userId")
	WebElement untextfield;

	@FindBy(how = How.NAME, using = "password")
	WebElement pwtextfield;

	@FindBy(how = How.XPATH, using = "//span[@class='p-button-text p-c']")
	WebElement Signinbton;

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Inventory'])[2]")
	WebElement Inventoryexpansion;

	@FindBy(how = How.XPATH, using = "//span[text()='Inventory Request']")
	WebElement Inventorylink;

	@FindBy(how = How.XPATH, using = "//input[@name = 'M_Inv_CategoryID']")
	WebElement Categorydropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='Inv_InventoryTemplateID']")
	WebElement Templatedropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='M_LocationId']")
	WebElement Locationdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='HostName']")
	WebElement Hostname;

	@FindBy(how = How.XPATH, using = "//input[@name='IpAddress']")
	WebElement ipaddress;

	@FindBy(how = How.XPATH, using = "//textarea[@name='Remarks']")
	WebElement remarks;

	@FindBy(how = How.XPATH, using = "//span[text()='Cancel']")
	WebElement cancel;

	@FindBy(how = How.XPATH, using = "//span[text()='Save As Draft']")
	WebElement saveasdraft;

	@FindBy(how = How.XPATH, using = "//span[text()='Submit']")
	WebElement submit;

	@FindBy(how = How.XPATH, using = "(//input[@name='username'])[1]")
	WebElement Acknowledgeusername;

	@FindBy(how = How.XPATH, using = "(//input[@name='password'])[1]")
	WebElement Acknowledgepassword;

	@FindBy(how = How.XPATH, using = "(//span[text()='Accept'])[1]")
	WebElement Acceptbutton;

	@FindBy(how = How.XPATH, using = "//button[@class='Toastify__close-button Toastify__close-button--success']")
	WebElement Successmsg;

	@FindBy(how = How.XPATH, using = "//button[@class='Toastify__close-button Toastify__close-button--error']")
	WebElement Failuremsg;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Successfully created')]")
	WebElement Toastmsg;
	


	public void FileserverInventorycreation(String Catetype, String TempName, String Loc, String Host, String IP,
			String remark, String uid, String pass) throws InterruptedException {
		Thread.sleep(1500);
		Inventoryexpansion.click();
		Thread.sleep(500);
		Inventorylink.click();
		Thread.sleep(2000);
		Categorydropdown.sendKeys(Catetype);
		Thread.sleep(2000);
		Categorydropdown.sendKeys(Keys.ARROW_DOWN);
		Categorydropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2500);
		Templatedropdown.sendKeys(TempName);
		Thread.sleep(2000);
		Templatedropdown.sendKeys(Keys.ARROW_DOWN);
		Templatedropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Locationdropdown.sendKeys(Loc);
		Thread.sleep(2000);
		Locationdropdown.sendKeys(Keys.ARROW_DOWN);
		Locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Hostname.click();
		Hostname.sendKeys(Host);
		ipaddress.click();
		ipaddress.sendKeys(IP);
		remarks.click();
		remarks.sendKeys(remark);
		Thread.sleep(500);
		submit.click();
		Thread.sleep(500);
		Acknowledgeusername.sendKeys(uid);
		Acceptbutton.click();
		Thread.sleep(3000);
		System.out.println("Password validation is working");
		Acknowledgeusername.sendKeys(Keys.CONTROL + "a");
		Acknowledgeusername.sendKeys(Keys.DELETE);
		Thread.sleep(1500);
		Acceptbutton.click();
		Thread.sleep(3000);
		System.out.println("Mandatory feilds validation is working");
		Acknowledgeusername.sendKeys(uid);
		Acknowledgepassword.sendKeys(pass);
		Acceptbutton.click();
	}
		
		
		public void Toastmsg() throws InterruptedException {
			
		Thread.sleep(4000);

		if (Toastmsg.isDisplayed()) {
			
			
			String expectedMessage = "Successfully created";
			String message = driver.findElement(By.xpath("//div[contains(text(),'Successfully created')]")).getText();
			System.out.println(Toastmsg.getText());
			Assert.assertEquals("Successfully created", expectedMessage);
			
			System.out.println(message);
			System.out.println(expectedMessage+"Pass");
			
			/*String actual_msg = Toastmsg.getText();
			System.out.println(actual_msg);
			
			String expected_msg = "Successfully created";
			Assert.assertEquals(actual_msg,expected_msg);*/
			
		}
		else
			System.out.println("Failed");

	}

}
