/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.MultipleusersReactivaterequestforOperatingsystem;

/**
 * @author Shashank
 *
 */
public class TestMultipleusersReactivaterequestforOperatingsystem extends BaseClass {
	
	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		MultipleusersReactivaterequestforOperatingsystem multipleusersreactivateforoperatingsystem = PageFactory
				.initElements(driver, MultipleusersReactivaterequestforOperatingsystem.class);
		multipleusersreactivateforoperatingsystem.requestInf(excel.getStringData("Selfcreaterequestopearatingsyst", 1, 0));
	}

	@Test(priority = 3)
	public void enteroperatingsystemaccess() throws InterruptedException {
		MultipleusersReactivaterequestforOperatingsystem multipleusersreactivateforoperatingsystem = PageFactory
				.initElements(driver, MultipleusersReactivaterequestforOperatingsystem.class);
		multipleusersreactivateforoperatingsystem.enteroperatingsystemname(excel.getStringData("Deactivate operatingsystem", 1, 0),
				excel.getStringData("Deactivate operatingsystem", 1, 1),excel.getStringData("Deactivate operatingsystem", 1, 2));
	}

	
	@Test(priority=4)
	public void enterfirstUserDetails() throws InterruptedException {
		
		MultipleusersReactivaterequestforOperatingsystem multipleusersreactivateforoperatingsystem = PageFactory
				.initElements(driver, MultipleusersReactivaterequestforOperatingsystem.class);
		multipleusersreactivateforoperatingsystem.userDetails1(excel.getStringData("UserDetails forReactivateAccess", 1, 0), excel.getStringData("UserDetails forReactivateAccess", 1, 1), 
				
				excel.getStringData("UserDetails forReactivateAccess", 1, 2), excel.getStringData("UserDetails forReactivateAccess", 1, 3), excel.getStringData("UserDetails forReactivateAccess", 1, 4), excel.getStringData("UserDetails forReactivateAccess", 1, 5));
	}

	@Test(priority = 5)
	public void entersecondUserDetails() throws InterruptedException {
		MultipleusersReactivaterequestforOperatingsystem multipleusersreactivateforoperatingsystem = PageFactory
				.initElements(driver, MultipleusersReactivaterequestforOperatingsystem.class);
		multipleusersreactivateforoperatingsystem.userDetails2(excel.getStringData("UserDetails forReactivateAccess", 2, 0),
				excel.getStringData("UserDetails forReactivateAccess", 2, 1),
				excel.getStringData("UserDetails forReactivateAccess", 2, 2),
				excel.getStringData("UserDetails forReactivateAccess", 2, 3),
				excel.getStringData("UserDetails forReactivateAccess", 2, 4),
				excel.getStringData("UserDetails forReactivateAccess", 2, 5), excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2));
	}


}
