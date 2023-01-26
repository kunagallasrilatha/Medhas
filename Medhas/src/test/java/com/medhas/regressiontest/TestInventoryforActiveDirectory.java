/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.createInventoryforAD;

/**
 * @author Shashank
 *
 */
public class TestInventoryforActiveDirectory extends BaseClass {
	

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 5, 0), excel.getStringData("Login", 5, 2));

	}
	
	
	

		@Test(priority = 2)
		public void createinvforAD() throws InterruptedException {
			createInventoryforAD createinvforad = PageFactory.initElements(driver, createInventoryforAD.class);
			
createinvforad.createinvad(excel.getStringData("Create inventory for AD", 1,0), excel.getStringData("Create inventory for AD",1,1), excel.getStringData("Create inventory for AD", 1, 2), excel.getStringData("Create inventory for AD",1,3),excel.getStringData("Login", 5, 0), excel.getStringData("Login", 5, 2));

		}
		
		
		

	}



