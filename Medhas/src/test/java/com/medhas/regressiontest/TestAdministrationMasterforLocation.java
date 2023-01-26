/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.AdministrationMasterforLocation;
import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;


public class TestAdministrationMasterforLocation extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 11, 0), excel.getStringData("Login", 11, 2));

	}

	@Test(priority = 2)
	public void enterlocation() throws InterruptedException {
		AdministrationMasterforLocation locationcreation = PageFactory.initElements(driver,
				AdministrationMasterforLocation.class);
		locationcreation.createLocation(excel.getStringData("Location Administration", 1, 0),
				excel.getStringData("Location Administration", 1, 1),
				excel.getStringData("Location Administration", 1, 2), excel.getStringData("Login", 11, 0),
				excel.getStringData("Login", 11, 2));
	}

}
