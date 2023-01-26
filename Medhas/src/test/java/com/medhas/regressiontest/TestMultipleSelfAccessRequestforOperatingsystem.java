/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.MultipleSelfAccessRequestforOperatingsystem;

/**
 * @author Shashank
 *
 */
public class TestMultipleSelfAccessRequestforOperatingsystem extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		MultipleSelfAccessRequestforOperatingsystem requestformultipleoperatingsystemsself = PageFactory
				.initElements(driver, MultipleSelfAccessRequestforOperatingsystem.class);
		requestformultipleoperatingsystemsself.requestInf(excel.getStringData("Selfcreaterequestopearatingsyst", 1, 0));
	}

	@Test(priority = 3)
	public void enteruserDetails() throws InterruptedException {

		MultipleSelfAccessRequestforOperatingsystem requestformultipleoperatingsystemsself = PageFactory
				.initElements(driver, MultipleSelfAccessRequestforOperatingsystem.class);

		requestformultipleoperatingsystemsself.userDetails(excel.getStringData("UserDetails for Accessrequest", 1, 1),
				excel.getStringData("UserDetails for Accessrequest", 1, 2),
				excel.getStringData("UserDetails for Accessrequest", 1, 3),
				excel.getStringData("UserDetails for Accessrequest", 1, 4),
				excel.getStringData("UserDetails for Accessrequest", 1, 5));
	}

	@Test(priority = 4)
	public void enterOperatingsystemdetails() throws InterruptedException {
		MultipleSelfAccessRequestforOperatingsystem requestformultipleoperatingsystemsself = PageFactory
				.initElements(driver, MultipleSelfAccessRequestforOperatingsystem.class);
		requestformultipleoperatingsystemsself.operatingsystemDetails(
				excel.getStringData("Selfcreaterequestopearatingsyst", 1, 1),
				excel.getStringData("Selfcreaterequestopearatingsyst", 1, 2),
				excel.getStringData("Selfcreaterequestopearatingsyst", 1, 3));

	}

	@Test(priority = 5)
	public void enternewOperatingsystemdetails() throws InterruptedException {
		MultipleSelfAccessRequestforOperatingsystem requestformultipleoperatingsystemsself = PageFactory
				.initElements(driver, MultipleSelfAccessRequestforOperatingsystem.class);
		requestformultipleoperatingsystemsself.addnewos(excel.getStringData("Selfcreaterequestopearatingsyst", 2, 1),
				excel.getStringData("Selfcreaterequestopearatingsyst", 2, 2),
				excel.getStringData("Selfcreaterequestopearatingsyst", 2, 3),
				excel.getStringData("Selfcreaterequestopearatingsyst", 2, 5), excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 6)
	public void accessRequestCreated() throws InterruptedException {
		MultipleSelfAccessRequestforOperatingsystem requestformultipleoperatingsystemsself = PageFactory
				.initElements(driver, MultipleSelfAccessRequestforOperatingsystem.class);
		requestformultipleoperatingsystemsself.Toastmsg();
	}

}
