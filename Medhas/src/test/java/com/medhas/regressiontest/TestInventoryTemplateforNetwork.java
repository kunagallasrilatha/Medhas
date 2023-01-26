/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.InventoryTemplateforNetwork;
import com.medhas.regression.InventoryTemplateforStorage;
import com.medhas.regression.Loginpage;

/**
 * @author Shashank
 *
 */
public class TestInventoryTemplateforNetwork extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 11, 0), excel.getStringData("Login", 11, 2));

	}
	
	@Test(priority=2)
	public void templatedetails() throws InterruptedException {
		InventoryTemplateforNetwork invtempnetwork =  PageFactory.initElements(driver, InventoryTemplateforNetwork.class);
		
		invtempnetwork.entertemplatedetails(excel.getStringData("Inventory Template", 5, 0), excel.getStringData("Inventory Template", 5, 2));
	}
	
	@Test(priority=3)
	public void basicDetails() throws InterruptedException {
		InventoryTemplateforNetwork invtempnetwork =  PageFactory.initElements(driver, InventoryTemplateforNetwork.class);
		
		invtempnetwork.enterBasicdetails();
	}
	
	@Test(priority=4)
	public void otherDetails() throws InterruptedException {
		InventoryTemplateforNetwork invtempnetwork =  PageFactory.initElements(driver, InventoryTemplateforNetwork.class);
		
		invtempnetwork.enterOtherdetails();
	}
	
	
	@Test(priority=5)
	public void purchaseDetails() throws InterruptedException {
		InventoryTemplateforNetwork invtempnetwork =  PageFactory.initElements(driver, InventoryTemplateforNetwork.class);
		
		invtempnetwork.enterPurchasedetails();
	}
	
	@Test(priority=6)
	public void warrantyDetails() throws InterruptedException {
		InventoryTemplateforNetwork invtempnetwork =  PageFactory.initElements(driver, InventoryTemplateforNetwork.class);
		
		invtempnetwork.enterWarrantyDetails();
	}
	
	@Test(priority=7)
	public void qualificationDetails() throws InterruptedException {
		InventoryTemplateforNetwork invtempnetwork =  PageFactory.initElements(driver, InventoryTemplateforNetwork.class);
		
		invtempnetwork.enterQualificationDetails();
	}
	
	@Test(priority=8)
	public void save() throws InterruptedException {
		
		InventoryTemplateforStorage invtempstorage =  PageFactory.initElements(driver, InventoryTemplateforStorage.class);
		invtempstorage.savetemplate(excel.getStringData("Login", 11, 0), excel.getStringData("Login", 11, 2));
	}
	
	
}
