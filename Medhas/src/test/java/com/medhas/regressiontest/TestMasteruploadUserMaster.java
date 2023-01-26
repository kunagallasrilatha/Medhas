/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.MasteruploadUserMaster;

/**
 * @author Shashank
 *
 */
public class TestMasteruploadUserMaster extends BaseClass {

	
	
	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 9, 0), excel.getStringData("Login", 9, 2));
		

	}
	
	
	@Test(priority=2)
	public void clickusermaster() throws InterruptedException {
		MasteruploadUserMaster uploadappusermaster = PageFactory.initElements(driver, MasteruploadUserMaster.class);
		uploadappusermaster.usermaster();
		
	}
	
	@Test(priority=3)
	public void clickusermasterupload() throws InterruptedException {
		
		MasteruploadUserMaster uploadappusermaster = PageFactory.initElements(driver, MasteruploadUserMaster.class);
		uploadappusermaster.usermasterupload(excel.getStringData("MasterUpload", 1, 0),excel.getStringData("MasterUpload", 1, 2),
				excel.getStringData("Login", 9, 0), excel.getStringData("Login", 9, 2));
	}
	
}
