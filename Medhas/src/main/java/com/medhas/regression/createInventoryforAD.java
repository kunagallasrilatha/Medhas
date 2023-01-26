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
public class createInventoryforAD {
	
	WebDriver driver;

	public createInventoryforAD(WebDriver driver) {
		this.driver = driver;
	}
	

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Inventory'])[2]")
	WebElement inventoryoption;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Inventory Request']")
	WebElement Inventoryrequest;
	
	
	@FindBy(how = How.XPATH, using = "//input[@name = 'M_Inv_CategoryID']")
	WebElement categoryinv;
	
	@FindBy(how=How.XPATH, using = "//input[@name= 'Inv_InventoryTemplateID']")
	WebElement invtemplate;
	
	@FindBy(how = How.XPATH, using = "//input[@name='M_LocationId']")
	WebElement LocationAD;
	
	
	@FindBy(how = How.XPATH, using = "//textarea[@name = 'Remarks']")
	WebElement Remarks;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
	WebElement cancel;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save As Draft')]")
	WebElement saveasdraft;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	WebElement submit;
	
	
	//e-Sign
	@FindBy(how=How.XPATH,using = "//input[@name='username']")
	WebElement eusername;
	
	@FindBy(how=How.XPATH,using = "//input[@name='password']")
	WebElement epassword;
	
	@FindBy(how= How.XPATH, using = "//span[text()='Accept']")
	WebElement eAccept;
	
	
public void createinvad(String cateinvad,String invtemp, String Loc, String remark, String eun, String epw) throws InterruptedException {
	
		
		inventoryoption.click();
		
		Inventoryrequest.click();
		
		categoryinv.sendKeys(cateinvad);
		Thread.sleep(2000);
		
		categoryinv.sendKeys(Keys.ARROW_DOWN);
		categoryinv.sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		
		invtemplate.sendKeys(invtemp);
		Thread.sleep(2000);
		
		invtemplate.sendKeys(Keys.ARROW_DOWN);
		invtemplate.sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		LocationAD.sendKeys(Loc);
		Thread.sleep(2000);
		
		LocationAD.sendKeys(Keys.ARROW_DOWN);
		LocationAD.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		Remarks.sendKeys(remark);
		
		
		saveasdraft.click();
		Thread.sleep(2000);
		
		//e-Sign
		Thread.sleep(2000);
		eusername.sendKeys(eun);
		epassword.sendKeys(epw);
		
		eAccept.click();
		
		
		
		
		
		
		
		
		
	}
	


}
