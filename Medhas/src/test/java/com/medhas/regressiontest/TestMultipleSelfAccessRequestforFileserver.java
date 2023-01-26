/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.MultipleSelfAccessRequestforFileserver;
import com.medhas.regression.MultipleSelfAccessRequestforOperatingsystem;

/**
 * @author Shashank
 *
 */
public class TestMultipleSelfAccessRequestforFileserver extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		MultipleSelfAccessRequestforFileserver requestformultiplefileserversself = PageFactory.initElements(driver,
				MultipleSelfAccessRequestforFileserver.class);
		requestformultiplefileserversself.requestInf(excel.getStringData("Selfcreaterequestforfileserver", 1, 0),
				excel.getStringData("UserDetails for Accessrequest", 1, 6));
	}

	@Test(priority = 3)
	public void enteruserDetails() throws InterruptedException {

		MultipleSelfAccessRequestforOperatingsystem requestformultiplefileserversself = PageFactory.initElements(driver,
				MultipleSelfAccessRequestforOperatingsystem.class);

		requestformultiplefileserversself.userDetails(excel.getStringData("UserDetails for Accessrequest", 1, 1),
				excel.getStringData("UserDetails for Accessrequest", 1, 2),
				excel.getStringData("UserDetails for Accessrequest", 1, 3),
				excel.getStringData("UserDetails for Accessrequest", 1, 4),
				excel.getStringData("UserDetails for Accessrequest", 1, 5));
	}

	@Test(priority = 4)
	public void enterFileserverdetails() throws InterruptedException {
		MultipleSelfAccessRequestforFileserver requestformultiplefileserversself = PageFactory.initElements(driver,
				MultipleSelfAccessRequestforFileserver.class);

		requestformultiplefileserversself.fileserverDetails(excel.getStringData("Selfcreaterequestforfileserver", 1, 1),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 2),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 3),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 4),
				excel.getStringData("Selfcreaterequestforfileserver", 1, 5));

	}

	@Test(priority = 5)
	public void enternewFileserverdetails() throws InterruptedException {

		MultipleSelfAccessRequestforFileserver requestformultiplefileserversself = PageFactory.initElements(driver,
				MultipleSelfAccessRequestforFileserver.class);

		requestformultiplefileserversself.addnewfsdetails(excel.getStringData("Selfcreaterequestforfileserver", 2, 1),
				excel.getStringData("Selfcreaterequestforfileserver", 2, 2),
				excel.getStringData("Selfcreaterequestforfileserver", 2, 3),
				excel.getStringData("Selfcreaterequestforfileserver", 2, 4),
				excel.getStringData("Selfcreaterequestforfileserver", 2, 5),
				excel.getStringData("Selfcreaterequestforfileserver", 2, 6), excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 6)
	public void accessRequestCreated() throws InterruptedException {
		MultipleSelfAccessRequestforFileserver requestformultiplefileserversself = PageFactory.initElements(driver,
				MultipleSelfAccessRequestforFileserver.class);
		requestformultiplefileserversself.Toastmsg();
	}

}
