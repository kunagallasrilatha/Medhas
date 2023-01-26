/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.createinventoryforStorage;

/**
 * @author Shashank
 *
 */
public class TestcreateinventoryforStorage extends BaseClass {
	
	
	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 4, 0), excel.getStringData("Login", 4, 2));

	}
	
	
	
	@Test(priority=2)
	public void enterbasicdetailsstorage() throws InterruptedException {
		createinventoryforStorage createinveforstorage = PageFactory.initElements(driver, createinventoryforStorage.class);
		createinveforstorage.BasicDetails(excel.getStringData("create inventory for Storage", 1, 0), excel.getStringData("create inventory for Storage", 1, 1), excel.getStringData("create inventory for Storage", 1, 2), excel.getStringData("create inventory for Storage", 1, 3), excel.getStringData("create inventory for Storage", 1, 4), excel.getStringData("create inventory for Storage", 1, 5), excel.getStringData("create inventory for Storage", 1, 6), excel.getStringData("create inventory for Storage", 1, 7), excel.getStringData("create inventory for Storage", 1, 8), excel.getStringData("create inventory for Storage", 1, 9), excel.getStringData("create inventory for Storage", 1, 10), excel.getStringData("create inventory for Storage", 1, 11));
	}
	
	
	@Test(priority=3)
	public void enterconfigdetails() throws InterruptedException {
	createinventoryforStorage createinveforstorage = PageFactory.initElements(driver, createinventoryforStorage.class);
	createinveforstorage.configurationdetails(excel.getStringData("create inventory for Storage", 1, 12), excel.getStringData("create inventory for Storage", 1, 13), excel.getStringData("create inventory for Storage", 1, 14), excel.getStringData("create inventory for Storage", 1, 15), excel.getStringData("create inventory for Storage", 1, 16),excel.getStringData("Login", 5, 0), excel.getStringData("Login", 5, 2));
	
	
	}
	

}
