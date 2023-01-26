package com.medhas.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Loginpage {

	WebDriver driver;
	public static boolean elemFound;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(name = "userId")
	WebElement untextfield;

	@FindBy(how = How.NAME, using = "password")
	WebElement pwtextfield;

	@FindBy(how = How.XPATH, using = "//span[@class='p-button-text p-c']")
	WebElement Signinbton;

	@FindBy(how = How.LINK_TEXT, using = "User Manual")
	WebElement usermanuallink;

	@FindBy(how = How.XPATH, using = "//div[text()='Username is Mandatory']")
	WebElement unmandate;

	@FindBy(how = How.XPATH, using = "//div[text()='Password is Mandatory']")
	WebElement pwmandate;

	@FindBy(how = How.XPATH, using = "//div[text() = 'Invalid user']")
	WebElement invalid;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Username length should be less than 21')]")
	WebElement longusercharacters;

	@FindBy(how = How.XPATH, using = "//p[text()='Access Request']")
	WebElement enteredloginpage;

	@FindBy(how = How.XPATH, using = "//div[@class='p-checkbox-box p-component']")
	WebElement Acknowledgecheckbox;

	@FindBy(how = How.XPATH, using = "(//input[@name='username'])[1]")
	WebElement eusername;

	@FindBy(how = How.XPATH, using = "(//input[@name='password'])[1]")
	WebElement epassword;

	@FindBy(how = How.XPATH, using = "(//span[text()='Accept'])[1]")
	WebElement ackAcceptbton;

	public void usermanual() {
		usermanuallink.click();
	}

	public void errormessages() throws InterruptedException {

		Signinbton.click();
		Thread.sleep(2000);

		String actual_unerror = unmandate.getText();

		String expected_unerror = "Username is Mandatory";

		Assert.assertEquals(actual_unerror, expected_unerror);

		String actual_pwerror = pwmandate.getText();

		String expected_pwerror = "Password is Mandatory";

		Assert.assertEquals(actual_pwerror, expected_pwerror);

	}

	public void invalidUser(String uid, String pass) throws InterruptedException {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}

		untextfield.sendKeys(uid);
		pwtextfield.sendKeys(pass);
		Signinbton.click();
		Thread.sleep(2000);
		String actual_invaliderror = invalid.getText();

		String expected_invaliderror = "Invalid user";

		Assert.assertEquals(actual_invaliderror, expected_invaliderror);

	}

	public void longuserid(String uid, String pass) throws InterruptedException {

		untextfield.sendKeys(Keys.CONTROL + "a");
		untextfield.sendKeys(Keys.DELETE);
		pwtextfield.sendKeys(Keys.CONTROL + "a");
		pwtextfield.sendKeys(Keys.DELETE);
		untextfield.sendKeys(uid);
		pwtextfield.sendKeys(pass);
		Signinbton.click();
		Thread.sleep(2000);

		String actual_error = longusercharacters.getText();

		String expected_error = "Username length should be less than 21";

		Assert.assertEquals(actual_error, expected_error);
	}

	public void Login_medhas(String uid, String pass) throws InterruptedException {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}

		untextfield.sendKeys(Keys.CONTROL + "a");
		untextfield.sendKeys(Keys.DELETE);
		pwtextfield.sendKeys(Keys.CONTROL + "a");
		pwtextfield.sendKeys(Keys.DELETE);
		untextfield.sendKeys(uid);
		pwtextfield.sendKeys(pass);
		Signinbton.click();
		Thread.sleep(5000);
		String enterloginpagesuccess = enteredloginpage.getText();
		System.out.println(enterloginpagesuccess);
	}

	public void Firsttimeuser(String uid, String pass) throws InterruptedException {

		// usericon.click();
		// Thread.sleep(1500);
		// logout.click();
		Thread.sleep(1500);
		untextfield.sendKeys(uid);
		pwtextfield.sendKeys(pass);
		Signinbton.click();
		elemFound = driver.findElements(By.xpath("//div[@class='p-checkbox-box p-component']")).size() > 0;

		if (elemFound == true) {
			Acknowledgecheckbox.click();
			ackAcceptbton.click();
			Thread.sleep(3000);
			eusername.sendKeys(uid);
			ackAcceptbton.click();
			Thread.sleep(3000);
			System.out.println("Password validation is working");
			eusername.click();
			eusername.sendKeys(Keys.CONTROL + "a");
			eusername.sendKeys(Keys.DELETE);
			Thread.sleep(1500);
			ackAcceptbton.click();
			Thread.sleep(3000);
			System.out.println("Mandatory feilds validation is working");
			eusername.sendKeys(uid);
			epassword.sendKeys(pass);
			ackAcceptbton.click();
		} else {
			System.out.println("User is logged in already");
		}

		Thread.sleep(5000);

		String enterloginpagesuccess = enteredloginpage.getText();
		System.out.println(enterloginpagesuccess);

	}

}