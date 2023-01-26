/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.AdministrationMasterforUserroleLocation;
import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;

/**
 * @author Shashank
 *
 */
public class TestAdministrationMasterforUserroleLocation extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 6, 0), excel.getStringData("Login", 6, 2));

	}

	@Test(priority = 2)
	public void enterUserRoleLocation() throws InterruptedException {

		AdministrationMasterforUserroleLocation userrolelocation = PageFactory.initElements(driver,
				AdministrationMasterforUserroleLocation.class);

		userrolelocation.enterDetails(excel.getStringData("User Role Location", 1, 0),
				excel.getStringData("User Role Location", 1, 2), excel.getStringData("User Role Location", 1, 4),
				excel.getStringData("Login", 6, 0), excel.getStringData("Login", 6, 2),
				excel.getStringData("User Role Location", 1, 0), excel.getStringData("User Role Location", 2, 2),
				excel.getStringData("User Role Location", 2, 4), excel.getStringData("Login", 6, 0),
				excel.getStringData("Login", 6, 2), excel.getStringData("User Role Location", 1, 0),
				excel.getStringData("User Role Location", 3, 2), excel.getStringData("User Role Location", 3, 4),
				excel.getStringData("Login", 6, 0), excel.getStringData("Login", 6, 2),
				excel.getStringData("User Role Location", 1, 0), excel.getStringData("User Role Location", 4, 2),
				excel.getStringData("User Role Location", 4, 4), excel.getStringData("Login", 6, 0),
				excel.getStringData("Login", 6, 2), excel.getStringData("User Role Location", 1, 0),
				excel.getStringData("User Role Location", 5, 2), excel.getStringData("User Role Location", 5, 4),
				excel.getStringData("Login", 6, 0), excel.getStringData("Login", 6, 2),
				excel.getStringData("User Role Location", 1, 0), excel.getStringData("User Role Location", 6, 2),
				excel.getStringData("User Role Location", 6, 4), excel.getStringData("Login", 6, 0),
				excel.getStringData("Login", 6, 2), excel.getStringData("User Role Location", 1, 0),
				excel.getStringData("User Role Location", 8, 2), excel.getStringData("User Role Location", 8, 4),
				excel.getStringData("Login", 6, 0), excel.getStringData("Login", 6, 2),
				excel.getStringData("User Role Location", 1, 0), excel.getStringData("User Role Location", 9, 2),
				excel.getStringData("User Role Location", 9, 4), excel.getStringData("Login", 6, 0),
				excel.getStringData("Login", 6, 2), excel.getStringData("User Role Location", 1, 0),
				excel.getStringData("User Role Location", 10, 2), excel.getStringData("User Role Location", 10, 4),
				excel.getStringData("Login", 6, 0), excel.getStringData("Login", 6, 2),
				excel.getStringData("User Role Location", 1, 0), excel.getStringData("User Role Location", 11, 2),
				excel.getStringData("User Role Location",11, 4), excel.getStringData("Login", 6, 0),
				excel.getStringData("Login", 6, 2));

	}

}
