/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.CreateMultipleUsersFileserverAccess;
import com.medhas.regression.Loginpage;
import com.medhas.regression.SelfCreateAccessRequestforFileserver;

/**
 * @author Shashank
 *
 */
public class TestCreateMultipleUsersFileserverAccess extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		CreateMultipleUsersFileserverAccess requestmultipleusersfileserveraccess = PageFactory.initElements(driver,
				CreateMultipleUsersFileserverAccess.class);
		requestmultipleusersfileserveraccess.requestInf(excel.getStringData("Selfcreaterequestforfileserver", 1, 0));
	}

	@Test(priority = 3)
	public void enteruserDetails() throws InterruptedException {

		CreateMultipleUsersFileserverAccess requestmultipleusersfileserveraccess = PageFactory.initElements(driver,
				CreateMultipleUsersFileserverAccess.class);

		requestmultipleusersfileserveraccess.userDetails(excel.getStringData("UserDetails for Accessrequest", 1, 0),
				excel.getStringData("UserDetails for Accessrequest", 1, 1),
				excel.getStringData("UserDetails for Accessrequest", 1, 2),
				excel.getStringData("UserDetails for Accessrequest", 1, 3),
				excel.getStringData("UserDetails for Accessrequest", 1, 4),
				excel.getStringData("UserDetails for Accessrequest", 1, 5));
	}

	@Test(priority = 4)
	public void entersecondenteruserDetails() throws InterruptedException {

		CreateMultipleUsersFileserverAccess requestmultipleusersfileserveraccess = PageFactory.initElements(driver,
				CreateMultipleUsersFileserverAccess.class);

		requestmultipleusersfileserveraccess.seconduserDetails(
				excel.getStringData("UserDetails for Accessrequest", 2, 0),
				excel.getStringData("UserDetails for Accessrequest", 2, 1),
				excel.getStringData("UserDetails for Accessrequest", 2, 2),
				excel.getStringData("UserDetails for Accessrequest", 2, 3),
				excel.getStringData("UserDetails for Accessrequest", 2, 4),
				excel.getStringData("UserDetails for Accessrequest", 2, 5));
	}

	@Test(priority = 5)
	public void enterfileserverDetails() throws InterruptedException {
		SelfCreateAccessRequestforFileserver requestforfileserverself = PageFactory.initElements(driver,
				SelfCreateAccessRequestforFileserver.class);
		requestforfileserverself.fileserverDetails(excel.getStringData("Selfcreaterequestforfileserver", 1, 1),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 2),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 3),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 4),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 5),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 6), excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2));
	}
	
	@Test(priority = 6)
	public void accessRequestCreated() throws InterruptedException {
		CreateMultipleUsersFileserverAccess requestmultipleusersfileserveraccess = PageFactory.initElements(driver,
				CreateMultipleUsersFileserverAccess.class);
		requestmultipleusersfileserveraccess.Toastmsg();
	}

}
