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
public class createinventoryforStorage {
	
	WebDriver driver;

	public createinventoryforStorage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Basic Details
	
	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Inventory'])[2]")
	WebElement inventoryoption;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Inventory Request']")
	WebElement Inventoryrequest;
	
	
	@FindBy(how = How.XPATH, using = "//input[@name = 'M_Inv_CategoryID']")
	WebElement categoryinvdropdown;
	
	@FindBy(how=How.XPATH, using = "//input[@name= 'Inv_InventoryTemplateID']")
	WebElement invtemplatedropdown;
	
	@FindBy(how = How.XPATH, using = "//input[@name='M_LocationId']")
	WebElement LocationStorage;
	
	@FindBy(how = How.XPATH, using = "//input[@name='SoftwareName']")
	WebElement softnametxtfield;
	
	@FindBy(how = How.XPATH, using = "//input[@name='S_SystemRoleList']")
	WebElement Roleschiplist;
	
	@FindBy(how = How.XPATH, using = "//input[@name='HostName']")
	WebElement hosttxtfield;
	
	@FindBy(how = How.XPATH, using = "//input[@name='SerialNo']")
	WebElement serialtxtfield;
	

	@FindBy(how = How.XPATH, using = "//input[@name='Make']")
	WebElement maketxtfield;
	

	@FindBy(how = How.XPATH, using = "//input[@name='Model']")
	WebElement modtxtfield;
	

	@FindBy(how = How.XPATH, using = "//input[@name='OsVersion']")
	WebElement OStxtfield;
	

	@FindBy(how = How.XPATH, using = "//input[@name='Environment']")
	WebElement envdropdown;
	
	@FindBy(how = How.XPATH, using = "//input[@name='IpAddress']")
	WebElement iptxtfield;
	
	//Configuration details
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[6]/div[1]/div[3]/div[2]/div[2]/div[2]/fieldset[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement ramtxtfield;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Conf_Hdd_GbNo']")
	WebElement hddtxtfield;
	
	@FindBy(how = How.XPATH, using = "//input[@name='PoNo']")
	WebElement potxtfield;
	
	@FindBy(how = How.XPATH, using = "//textarea[@name='QualificationReport']")
	WebElement qrtxtfield;
	
	@FindBy(how = How.XPATH, using = "//textarea[@name='Remarks']")
	WebElement remarktxtfield;
	
	//buttons for request
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save As Draft')]")
	WebElement draftbton;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
	WebElement cancelbton;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	WebElement submitbton;
	
	
	//e-Sign
		@FindBy(how=How.XPATH,using = "//input[@name='username']")
		WebElement eusername;
		
		@FindBy(how=How.XPATH,using = "//input[@name='password']")
		WebElement epassword;
		
		@FindBy(how= How.XPATH, using = "//span[text()='Accept']")
		WebElement eAccept;
	
	
	
	public void BasicDetails(String cateinvSt, String invtemp, String Loc, String softname, String roles, String host, 
			String serial, String make, String model, String os, String env, String ip) throws InterruptedException {
		
		
		

		inventoryoption.click();
		
		Inventoryrequest.click();
		
		categoryinvdropdown.sendKeys(cateinvSt);
		Thread.sleep(2000);
		
		categoryinvdropdown.sendKeys(Keys.ARROW_DOWN);
		categoryinvdropdown.sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		
		invtemplatedropdown.sendKeys(invtemp);
		Thread.sleep(2000);
		
		invtemplatedropdown.sendKeys(Keys.ARROW_DOWN);
		invtemplatedropdown.sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		LocationStorage.sendKeys(Loc);
		Thread.sleep(2000);
		
		LocationStorage.sendKeys(Keys.ARROW_DOWN);
		LocationStorage.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		submitbton.click();
		
		softnametxtfield.sendKeys(softname);
		Roleschiplist.sendKeys(roles);
		Thread.sleep(2000);
		Roleschiplist.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		hosttxtfield.sendKeys(host);
		
		serialtxtfield.sendKeys(serial);
		
		maketxtfield.sendKeys(make);
		
		modtxtfield.sendKeys(model);
		
		OStxtfield.sendKeys(os);
		
		envdropdown.sendKeys(env);
		Thread.sleep(2000);
		
		envdropdown.sendKeys(Keys.ARROW_DOWN);
		envdropdown.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		iptxtfield.sendKeys(ip);
		
	}
	
	
	
	public void configurationdetails( String ram, String hdd, String po, String qr, String remark, String euserid, String epwd) throws InterruptedException {
		
		
		ramtxtfield.sendKeys(ram);
		hddtxtfield.sendKeys(hdd);
		potxtfield.sendKeys(po);
		qrtxtfield.sendKeys(qr);
		remarktxtfield.sendKeys(remark);
		
		submitbton.click();
		Thread.sleep(2000);
		eAccept.click();
		eusername.sendKeys(euserid);
		epassword.sendKeys(epwd);
		eAccept.click();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
