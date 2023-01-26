/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.MasteruploadApplicationInventory;

/**
 * @author Shashank
 *
 */
public class TestMasteruploadApplicationInventory extends BaseClass {
	
	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 9, 0), excel.getStringData("Login", 9, 2));
		

	}
	
	
	@Test(priority=2)
	public void clickinventorymaster() throws InterruptedException {
		MasteruploadApplicationInventory uploadappinventory = PageFactory.initElements(driver, MasteruploadApplicationInventory.class);
		uploadappinventory.inventorymaster();
		
	}
	
	@Test(priority=3)
	public void clickinventorymasterupload() throws InterruptedException {
		
		MasteruploadApplicationInventory uploadappinventory = PageFactory.initElements(driver, MasteruploadApplicationInventory.class);
		uploadappinventory.inventorymasterupload(excel.getStringData("MasterUpload", 1, 0),excel.getStringData("Login", 9, 0), excel.getStringData("Login", 9, 2));
	}
	
	

}
