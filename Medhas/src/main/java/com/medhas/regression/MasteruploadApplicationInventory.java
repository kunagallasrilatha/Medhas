/**
 * 
 */
package com.medhas.regression;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qa.utility.TestUtil;







/**
 * @author Shashank
 *
 */
public class MasteruploadApplicationInventory {
	WebDriver driver;
	


	

	public MasteruploadApplicationInventory(WebDriver driver) {
		this.driver = driver;
	
		

	}
	

	@FindBy(how = How.XPATH, using = "(//span[text()='Master Uploads'])[2]" )
	WebElement masteruploadoption;

	@FindBy(how = How.XPATH, using = "//li[@class='active-menuitem']//li[1]//a[1]//div[1]//span[2]")
	WebElement applicationinventoryoption;
	
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'OK')]")
	WebElement okpopup;
	
	@FindBy(how=How.XPATH, using = "//input[@name='LocationId']")
	WebElement Locationdropdown;
	
	@FindBy(how=How.XPATH, using = "//input[@name='FileName']")
	WebElement choosefilebton;
	
	@FindBy(xpath = "//input[@name='FileName']")
	public WebElement selectFile;
	
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'Process')]")
	WebElement processbton;
	
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'Submit')]")
	WebElement Submitbton;
	
	
	//e-Sign
			@FindBy(xpath = "//input[@placeholder='Username']")
			public WebElement eusername;

			@FindBy(xpath = "//input[@placeholder='Password']")
			public WebElement epassword;
			
			@FindBy(xpath = "//span[contains(text(),'Accept')]")
			public WebElement eAccept;
	
	
	
	
	public void inventorymaster() throws InterruptedException {
		
		masteruploadoption.click();
		
		Thread.sleep(4000);
		
		applicationinventoryoption.click();
		
		Thread.sleep(3000);
		
		okpopup.click();
		
	}
	
	public void inventorymasterupload(String Loc, String eun, String epw) throws InterruptedException {
		Locationdropdown.sendKeys(Loc);
		Thread.sleep(2000);

		Locationdropdown.sendKeys(Keys.ARROW_DOWN);
		Locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		String path = System.getProperty("user.dir") + "\\MasterUpload\\" + "\\Inventory masterupload.xlsx";
		choosefilebton.sendKeys(path);
		
		Thread.sleep(2000);
		processbton.click();
		
		TestUtil.IMPLICIT_WAIT=10;
		
		
		
		Submitbton.click();
		
		Thread.sleep(2000);
		
		eusername.sendKeys(eun);
		epassword.sendKeys(epw);
		eAccept.click();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
