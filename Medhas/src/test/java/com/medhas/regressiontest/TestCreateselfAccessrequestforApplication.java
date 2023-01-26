package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.ApplicationaccessrequestforOnbehalfsingleuser;
import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;

/**
 * @author chennoju
 *
 */
public class TestCreateselfAccessrequestforApplication extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 12, 0), excel.getStringData("Login", 12, 2));

	}

	@Test(priority = 2)
	public void EnterRequestinfo() throws InterruptedException {
		ApplicationaccessrequestforOnbehalfsingleuser AccessRequestforApplication = PageFactory.initElements(driver,
				ApplicationaccessrequestforOnbehalfsingleuser.class);
		AccessRequestforApplication.SelfCreateAccessRequest(excel.getStringData("AccessreqforApplication", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));
	}

	@Test(priority = 3)
	public void EnterUserdetails() throws InterruptedException {
		ApplicationaccessrequestforOnbehalfsingleuser AccessRequestforApplication = PageFactory.initElements(driver,
				ApplicationaccessrequestforOnbehalfsingleuser.class);
		AccessRequestforApplication.Userdetailstcreation(excel.getStringData("UserDetailsforAccessrequest", 1, 1),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 3),
				excel.getStringData("UserDetailsforAccessrequest", 1, 4),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8),
				excel.getStringData("UserDetailsforAccessrequest", 1, 9));
	}

	@Test(priority = 4)
	public void EnterApplicationdetails() throws InterruptedException {
		ApplicationaccessrequestforOnbehalfsingleuser AccessRequestforApplication = PageFactory.initElements(driver,
				ApplicationaccessrequestforOnbehalfsingleuser.class);
		AccessRequestforApplication.Applicationdetails(excel.getStringData("AccessreqforApplication", 1, 1),
				excel.getStringData("AccessreqforApplication", 1, 2),
				excel.getStringData("AccessreqforApplication", 1, 3),
				excel.getStringData("AccessreqforApplication", 1, 4),
				excel.getStringData("AccessreqforApplication", 1, 5));
	}

	@Test(priority = 5)
	public void EnterRemarksandesign() throws InterruptedException {
		ApplicationaccessrequestforOnbehalfsingleuser AccessRequestforApplication = PageFactory.initElements(driver,
				ApplicationaccessrequestforOnbehalfsingleuser.class);
		AccessRequestforApplication.Remarks(excel.getStringData("UserDetailsforAccessrequest", 1, 10));
		AccessRequestforApplication.esign(excel.getStringData("Login", 5, 0),
				excel.getStringData("Login", 1, 2));
	}
}
