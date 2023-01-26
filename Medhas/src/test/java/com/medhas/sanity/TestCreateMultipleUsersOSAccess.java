/**
 * 
 */
package com.medhas.sanity;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.CreateMultipleUsersOSAccess;
import com.medhas.regression.Loginpage;

/**
 * @author Shashank
 *
 */
public class TestCreateMultipleUsersOSAccess extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		CreateMultipleUsersOSAccess requestmultipleusersOSaccess = PageFactory.initElements(driver,
				CreateMultipleUsersOSAccess.class);
		requestmultipleusersOSaccess.requestInf(excel.getStringData("Selfcreaterequestopearatingsyst", 1, 0));
	}

	@Test(priority = 3)
	public void enteruserDetails() throws InterruptedException {

		CreateMultipleUsersOSAccess requestmultipleusersOSaccess = PageFactory.initElements(driver,
				CreateMultipleUsersOSAccess.class);

		requestmultipleusersOSaccess.userDetails(excel.getStringData("UserDetails for Accessrequest", 1, 0),
				excel.getStringData("UserDetails for Accessrequest", 1, 1),
				excel.getStringData("UserDetails for Accessrequest", 1, 2),
				excel.getStringData("UserDetails for Accessrequest", 1, 3),
				excel.getStringData("UserDetails for Accessrequest", 1, 4),
				excel.getStringData("UserDetails for Accessrequest", 1, 5));
	}

	@Test(priority = 4)
	public void entersecondenteruserDetails() throws InterruptedException {

		CreateMultipleUsersOSAccess requestmultipleusersOSaccess = PageFactory.initElements(driver,
				CreateMultipleUsersOSAccess.class);

		requestmultipleusersOSaccess.seconduserDetails(excel.getStringData("UserDetails for Accessrequest", 2, 0),
				excel.getStringData("UserDetails for Accessrequest", 2, 1),
				excel.getStringData("UserDetails for Accessrequest", 2, 2),
				excel.getStringData("UserDetails for Accessrequest", 2, 3),
				excel.getStringData("UserDetails for Accessrequest", 2, 4),
				excel.getStringData("UserDetails for Accessrequest", 2, 5));
	}

	@Test(priority = 5)
	public void enterOperatingsystemdetails() throws InterruptedException {
		CreateMultipleUsersOSAccess requestmultipleusersOSaccess = PageFactory.initElements(driver,
				CreateMultipleUsersOSAccess.class);
		requestmultipleusersOSaccess.operatingsystemDetails(
				excel.getStringData("Selfcreaterequestopearatingsyst", 1, 1),
				excel.getStringData("Selfcreaterequestopearatingsyst", 1, 2), 
				excel.getStringData("Selfcreaterequestopearatingsyst", 1, 3),
				excel.getStringData("Selfcreaterequestopearatingsyst", 1, 5), excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2));
	}

	@Test(priority = 6)
	public void accessRequestCreated() throws InterruptedException {
		CreateMultipleUsersOSAccess requestmultipleusersOSaccess = PageFactory.initElements(driver,
				CreateMultipleUsersOSAccess.class);
		requestmultipleusersOSaccess.Toastmsg();
	}

}
