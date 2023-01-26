/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.CreateMultipleAccessFileserverforonbehalfsingleuser;
import com.medhas.regression.Loginpage;

/**
 * @author Shashank
 *
 */
public class TestCreateMultipleAccessFileserverforonbehalfsingleuser extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		CreateMultipleAccessFileserverforonbehalfsingleuser requestformultipleforonbehalfsingleuser = PageFactory
				.initElements(driver, CreateMultipleAccessFileserverforonbehalfsingleuser.class);
		requestformultipleforonbehalfsingleuser.requestInf(excel.getStringData("Selfcreaterequestforfileserver", 1, 0));
	}

	@Test(priority = 3)
	public void enteruserDetails() throws InterruptedException {

		CreateMultipleAccessFileserverforonbehalfsingleuser requestformultipleforonbehalfsingleuser = PageFactory
				.initElements(driver, CreateMultipleAccessFileserverforonbehalfsingleuser.class);

		requestformultipleforonbehalfsingleuser.userDetails(excel.getStringData("UserDetails for Accessrequest", 1, 0),
				excel.getStringData("UserDetails for Accessrequest", 1, 1),
				excel.getStringData("UserDetails for Accessrequest", 1, 2),
				excel.getStringData("UserDetails for Accessrequest", 1, 3),
				excel.getStringData("UserDetails for Accessrequest", 1, 4),
				excel.getStringData("UserDetails for Accessrequest", 1, 5));
	}

	@Test(priority = 4)
	public void enterfileserverDetails() throws InterruptedException {
		CreateMultipleAccessFileserverforonbehalfsingleuser requestformultipleforonbehalfsingleuser = PageFactory
				.initElements(driver, CreateMultipleAccessFileserverforonbehalfsingleuser.class);

		requestformultipleforonbehalfsingleuser.fileserverDetails(
				excel.getStringData("Selfcreaterequestforfileserver", 1, 1),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 2),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 3),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 4),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 5));
	}

	@Test(priority = 5)
	public void enternewFileserverdetails() throws InterruptedException {

		CreateMultipleAccessFileserverforonbehalfsingleuser requestformultipleforonbehalfsingleuser = PageFactory
				.initElements(driver, CreateMultipleAccessFileserverforonbehalfsingleuser.class);

		requestformultipleforonbehalfsingleuser.addnewfsdetails(
				excel.getStringData("Selfcreaterequestforfileserver", 2, 1),
				excel.getStringData("Selfcreaterequestforfileserver", 2, 2),
				excel.getStringData("Selfcreaterequestforfileserver", 2, 3),
				excel.getStringData("Selfcreaterequestforfileserver", 2, 4),
				excel.getStringData("Selfcreaterequestforfileserver", 2, 5),
				excel.getStringData("Selfcreaterequestforfileserver", 2, 6), excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 6)
	public void accessRequestCreated() throws InterruptedException {
		CreateMultipleAccessFileserverforonbehalfsingleuser requestformultipleforonbehalfsingleuser = PageFactory
				.initElements(driver, CreateMultipleAccessFileserverforonbehalfsingleuser.class);
		requestformultipleforonbehalfsingleuser.Toastmsg();
	}

}
