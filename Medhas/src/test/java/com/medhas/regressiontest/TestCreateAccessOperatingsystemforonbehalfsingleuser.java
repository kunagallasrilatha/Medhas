/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.CreateAccessOperatingsystemforonbehalfsingleuser;
import com.medhas.regression.Loginpage;
import com.medhas.regression.SelfCreateAccessRequestforOperatingsystem;

/**
 * @author Shashank
 *
 */
public class TestCreateAccessOperatingsystemforonbehalfsingleuser extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		CreateAccessOperatingsystemforonbehalfsingleuser requestforoperatingsystemforonbehalfsingleuser = PageFactory
				.initElements(driver, CreateAccessOperatingsystemforonbehalfsingleuser.class);
		requestforoperatingsystemforonbehalfsingleuser
				.requestInf(excel.getStringData("Selfcreaterequestopearatingsyst", 1, 0));
	}

	@Test(priority = 3)
	public void enteruserDetails() throws InterruptedException {

		CreateAccessOperatingsystemforonbehalfsingleuser requestforoperatingsystemforonbehalfsingleuser = PageFactory
				.initElements(driver, CreateAccessOperatingsystemforonbehalfsingleuser.class);

		requestforoperatingsystemforonbehalfsingleuser.userDetails(
				excel.getStringData("UserDetails for Accessrequest", 1, 0),
				excel.getStringData("UserDetails for Accessrequest", 1, 1),
				excel.getStringData("UserDetails for Accessrequest", 1, 2),
				excel.getStringData("UserDetails for Accessrequest", 1, 3),
				excel.getStringData("UserDetails for Accessrequest", 1, 4),
				excel.getStringData("UserDetails for Accessrequest", 1, 5));
	}

	@Test(priority = 4)
	public void enterOperatingsystemdetails() throws InterruptedException {
		SelfCreateAccessRequestforOperatingsystem requestforoperatingsystemself = PageFactory.initElements(driver,
				SelfCreateAccessRequestforOperatingsystem.class);
		requestforoperatingsystemself.operatingsystemDetails(
				excel.getStringData("Selfcreaterequestopearatingsyst", 1, 1),
				excel.getStringData("Selfcreaterequestopearatingsyst", 1, 2),
				excel.getStringData("Selfcreaterequestopearatingsyst", 1, 3),
				excel.getStringData("Selfcreaterequestopearatingsyst", 1, 5), excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2));
	}

	@Test(priority = 5)
	public void accessRequestCreated() throws InterruptedException {
		SelfCreateAccessRequestforOperatingsystem requestforoperatingsystemself = PageFactory.initElements(driver,
				SelfCreateAccessRequestforOperatingsystem.class);
		requestforoperatingsystemself.Toastmsg();
	}

}
