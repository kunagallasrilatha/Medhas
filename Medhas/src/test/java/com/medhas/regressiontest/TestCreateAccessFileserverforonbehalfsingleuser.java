/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.CreateAccessFileserverforonbehalfsingleuser;
import com.medhas.regression.Loginpage;


/**
 * @author Shashank
 *
 */
public class TestCreateAccessFileserverforonbehalfsingleuser extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 8, 0), excel.getStringData("Login", 8, 2));

	}

	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		CreateAccessFileserverforonbehalfsingleuser requestforfileserveronbehalfsingleuser = PageFactory
				.initElements(driver, CreateAccessFileserverforonbehalfsingleuser.class);
		requestforfileserveronbehalfsingleuser.requestInf(excel.getStringData("Selfcreaterequestforfileserver", 1, 0));
	}

	@Test(priority = 3)
	public void enteruserDetails() throws InterruptedException {

		CreateAccessFileserverforonbehalfsingleuser requestforfileserveronbehalfsingleuser = PageFactory
				.initElements(driver, CreateAccessFileserverforonbehalfsingleuser.class);

		requestforfileserveronbehalfsingleuser.userDetails(excel.getStringData("UserDetails for Accessrequest", 1, 0),
				excel.getStringData("UserDetails for Accessrequest", 1, 1),
				excel.getStringData("UserDetails for Accessrequest", 1, 2),
				excel.getStringData("UserDetails for Accessrequest", 1, 3),
				excel.getStringData("UserDetails for Accessrequest", 1, 4),
				excel.getStringData("UserDetails for Accessrequest", 1, 5));
	}

	@Test(priority = 4)
	public void enterfileserverDetails() throws InterruptedException {
		CreateAccessFileserverforonbehalfsingleuser requestforfileserveronbehalfsingleuser = PageFactory
				.initElements(driver, CreateAccessFileserverforonbehalfsingleuser.class);

		requestforfileserveronbehalfsingleuser.fileserverDetails(
				excel.getStringData("Selfcreaterequestforfileserver", 1, 1),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 2),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 3),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 4),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 5),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 6), excel.getStringData("Login", 8, 0),
				excel.getStringData("Login", 8, 2));
	}

	@Test(priority = 5)
	public void accessRequestCreated() throws InterruptedException {
		CreateAccessFileserverforonbehalfsingleuser requestforfileserveronbehalfsingleuser = PageFactory
				.initElements(driver, CreateAccessFileserverforonbehalfsingleuser.class);
		requestforfileserveronbehalfsingleuser.Toastmsg();
	}

}
