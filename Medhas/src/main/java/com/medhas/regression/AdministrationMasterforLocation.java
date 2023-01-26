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
public class AdministrationMasterforLocation {

	WebDriver driver;

	public AdministrationMasterforLocation(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Administration'])[2]")
	WebElement Administrationexpansion;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Master')]")
	WebElement masteroption;

	@FindBy(how = How.XPATH, using = "//body//li[@class='active-menuitem']//li[@class='active-menuitem']//li[4]//a[1]//div[1]//span[2]")
	WebElement Locoption;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Create Location')]")
	WebElement createlocbton;

	@FindBy(how = How.XPATH, using = "//input[@name='Name']")
	WebElement locationtxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name='Code']")
	WebElement codetxtfield;

	@FindBy(how = How.XPATH, using = "//textarea[@name='Description']")
	WebElement decriptiontxtfield;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
	WebElement Savebton;

	// e-Sign
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement eusername;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement epassword;

	@FindBy(how = How.XPATH, using = "//span[text()='Accept']")
	WebElement eAccept;
	
	public void createLocation(String Loc, String code, String des, String eun, String epw) throws InterruptedException {
		
		Administrationexpansion.click();
		
		Thread.sleep(2000);
		
		masteroption.click();
		
		Thread.sleep(3000);
		
		
		Locoption.click();
		
		Thread.sleep(2000);
		
		createlocbton.click();
		
		Thread.sleep(2000);
		
		locationtxtfield.sendKeys(Loc);
		
		codetxtfield.sendKeys(code);
		
		decriptiontxtfield.sendKeys(des);
		
		Savebton.click();
		
		
		eusername.sendKeys(eun);
		
		epassword.sendKeys(epw);
		
		eAccept.click();
	}
	
	
	
	
	
	
	
	

}
