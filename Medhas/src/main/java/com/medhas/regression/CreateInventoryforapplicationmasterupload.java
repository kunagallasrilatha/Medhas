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
public class CreateInventoryforapplicationmasterupload {
	

	WebDriver driver;

	public CreateInventoryforapplicationmasterupload(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(how = How.XPATH,using = "//li[@class='layout-root-menuitem']//ul//li//span[@class='layout-menuitem-text'][contains(text(),'Master Uploads')]")
	WebElement MasterUpload;
	
	@FindBy(how=How.XPATH,using = "//li[@class='active-menuitem']//li[@class='active-menuitem']//span[@class='layout-menuitem-text'][contains(text(),'Application Inventory')]")
	WebElement MasterUploadapp;
	
	@FindBy(how=How.XPATH,using = "//span[contains(text(),'OK')]")
	WebElement popok;
	
	@FindBy(how=How.XPATH,using = "//input[@name='LocationId']")
	WebElement Location;
	
	@FindBy(how=How.XPATH,using = "//input[@name='FileName']")
	WebElement FileName;
	
	@FindBy(how=How.XPATH,using = "//span[contains(text(),'Process')]")
	WebElement Process;
	

}
