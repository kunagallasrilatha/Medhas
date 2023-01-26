/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.SelfReactivaterequestforOperatingsystem;

/**
 * @author Shashank
 *
 */
public class TestSelfReactivaterequestforOperatingsystem extends BaseClass {
	
	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 20, 0), excel.getStringData("Login", 20, 2));

	}

	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		SelfReactivaterequestforOperatingsystem selfreactivateforoperatingsystem = PageFactory.initElements(driver,
				SelfReactivaterequestforOperatingsystem.class);
		selfreactivateforoperatingsystem.requestInf(excel.getStringData("Selfcreaterequestopearatingsyst", 1, 0));
	}

	@Test(priority = 3)
	public void enterUserDetails() throws InterruptedException {
		SelfReactivaterequestforOperatingsystem selfreactivateforoperatingsystem = PageFactory.initElements(driver,
				SelfReactivaterequestforOperatingsystem.class);
		selfreactivateforoperatingsystem.userDetails(excel.getStringData("UserDetails forReactivateAccess", 1, 1),
				excel.getStringData("UserDetails forReactivateAccess", 1, 2),
				excel.getStringData("UserDetails forReactivateAccess", 1, 3),
				excel.getStringData("UserDetails forReactivateAccess", 1, 4),
				excel.getStringData("UserDetails forReactivateAccess", 1, 5));
	}

	@Test(priority = 4)
	public void selectreactivaterequest() throws InterruptedException {

		SelfReactivaterequestforOperatingsystem selfreactivateforoperatingsystem = PageFactory.initElements(driver,
				SelfReactivaterequestforOperatingsystem.class);
		selfreactivateforoperatingsystem.selectdeactivateaccess(excel.getStringData("Login", 20, 0),
				excel.getStringData("Login", 20, 2));

	}

}
