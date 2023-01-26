/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.InventoryTemplateforStorage;
import com.medhas.regression.Loginpage;

/**
 * @author Shashank
 *
 */
public class TestInventoryTemplateforStorage extends BaseClass{

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 11, 0), excel.getStringData("Login", 11, 2));

	}
	
	@Test(priority=2)
	public void templatedetails() throws InterruptedException {
		InventoryTemplateforStorage invtempstorage =  PageFactory.initElements(driver, InventoryTemplateforStorage.class);
		
		invtempstorage.entertemplatedetails(excel.getStringData("Inventory Template", 4, 0), excel.getStringData("Inventory Template", 4, 2));
	}
	
	@Test(priority=3)
	public void basicdetails() throws InterruptedException {
		InventoryTemplateforStorage invtempstorage =  PageFactory.initElements(driver, InventoryTemplateforStorage.class);
		invtempstorage.enterBasicdetails();
		
	}
	

	@Test(priority=4)
	public void configurationdetails() throws InterruptedException {
		InventoryTemplateforStorage invtempstorage =  PageFactory.initElements(driver, InventoryTemplateforStorage.class);
		invtempstorage.enterConfigurationdetails();
		
	}
	
	@Test(priority=5)
	public void otherdetails() throws InterruptedException {
		InventoryTemplateforStorage invtempstorage =  PageFactory.initElements(driver, InventoryTemplateforStorage.class);
		invtempstorage.enterOtherdetails();
		
	}
	
	
	@Test(priority=6)
	public void purchasedetails() throws InterruptedException {
		InventoryTemplateforStorage invtempstorage =  PageFactory.initElements(driver, InventoryTemplateforStorage.class);
		invtempstorage.enterPurchasedetails();
		
	}
	
	
	@Test(priority=7)
	public void qualificationdetails() throws InterruptedException {
		InventoryTemplateforStorage invtempstorage =  PageFactory.initElements(driver, InventoryTemplateforStorage.class);
		invtempstorage.enterQualificationdetails();
		
	}
	
	@Test(priority=8)
	public void save() throws InterruptedException {
		
		InventoryTemplateforStorage invtempstorage =  PageFactory.initElements(driver, InventoryTemplateforStorage.class);
		invtempstorage.savetemplate(excel.getStringData("Login", 11, 0), excel.getStringData("Login", 11, 2));
	}
}
