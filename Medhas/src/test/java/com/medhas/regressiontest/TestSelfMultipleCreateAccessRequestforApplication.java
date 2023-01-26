package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.SelfMultipleCreateAccessRequestforApplication;

/**
 * @author chennoju
 *
 */
public class TestSelfMultipleCreateAccessRequestforApplication extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 16, 0), excel.getStringData("Login", 16, 2));

	}

	@Test(priority = 2)
	public void enterReqeustInfo() throws InterruptedException {
		SelfMultipleCreateAccessRequestforApplication AccessRequestforApplication = PageFactory.initElements(driver,
				SelfMultipleCreateAccessRequestforApplication.class);
		AccessRequestforApplication.reqInfo(excel.getStringData("AccessreqforApplication", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8));
	}

	@Test(priority = 3)
	public void addFirstappdetails() throws InterruptedException {
		SelfMultipleCreateAccessRequestforApplication AccessRequestforApplication = PageFactory.initElements(driver,
				SelfMultipleCreateAccessRequestforApplication.class);
		AccessRequestforApplication.Applicationdetails(excel.getStringData("AccessreqforApplication", 1, 1),
				excel.getStringData("AccessreqforApplication", 1, 2),
				excel.getStringData("AccessreqforApplication", 1, 3),
				excel.getStringData("AccessreqforApplication", 1, 4),
				excel.getStringData("AccessreqforApplication", 1, 5));
	}


	@Test(priority = 4)
	public void addSecondappdetails() throws InterruptedException {
		SelfMultipleCreateAccessRequestforApplication AccessRequestforApplication = PageFactory.initElements(driver,
				SelfMultipleCreateAccessRequestforApplication.class);
		AccessRequestforApplication.SecondApplicationdetails(excel.getStringData("AccessreqforApplication", 2, 1),
				excel.getStringData("AccessreqforApplication", 2, 2),
				excel.getStringData("AccessreqforApplication", 2, 3),
				excel.getStringData("AccessreqforApplication", 2, 4),
				excel.getStringData("AccessreqforApplication", 2, 5));

	}

	@Test(priority = 5)
	public void EnterRemarksandesign() throws InterruptedException {
		SelfMultipleCreateAccessRequestforApplication AccessRequestforApplication = PageFactory.initElements(driver,
				SelfMultipleCreateAccessRequestforApplication.class);
		AccessRequestforApplication.eSign(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 6)
	public void accessRequestCreated() throws InterruptedException {
		SelfMultipleCreateAccessRequestforApplication AccessRequestforApplication = PageFactory.initElements(driver,
				SelfMultipleCreateAccessRequestforApplication.class);
		AccessRequestforApplication.Toastmsg();
	}

}
