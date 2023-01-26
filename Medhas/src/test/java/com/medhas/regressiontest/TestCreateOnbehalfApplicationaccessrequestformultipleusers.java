package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.ApplicationOnBehalfaccessrequestformultipleusers;
import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;

/**
 * @author chennoju
 *
 */
public class TestCreateOnbehalfApplicationaccessrequestformultipleusers extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 5, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void enterReqeustInfo() throws InterruptedException {
		ApplicationOnBehalfaccessrequestformultipleusers applicationformultipleusers = PageFactory.initElements(driver,
				ApplicationOnBehalfaccessrequestformultipleusers.class);

		applicationformultipleusers.RequestInfo(excel.getStringData("AccessreqforApplication", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));

	}

	@Test(priority = 3)
	public void enterFirstUserDetails() throws InterruptedException {
		ApplicationOnBehalfaccessrequestformultipleusers applicationformultipleusers = PageFactory.initElements(driver,
				ApplicationOnBehalfaccessrequestformultipleusers.class);
		applicationformultipleusers.firstUserdetails(excel.getStringData("UserDetailsforAccessrequest", 1, 1),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2));

	}
	
	@Test(priority = 4)
	public void enterSecondUserDetails() throws InterruptedException {
		ApplicationOnBehalfaccessrequestformultipleusers applicationformultipleusers = PageFactory.initElements(driver,
				ApplicationOnBehalfaccessrequestformultipleusers.class);
		applicationformultipleusers.secondUserdetails(excel.getStringData("UserDetailsforAccessrequest", 2, 1),
				excel.getStringData("UserDetailsforAccessrequest", 2, 5),
				excel.getStringData("UserDetailsforAccessrequest", 2, 6),
				excel.getStringData("UserDetailsforAccessrequest", 2, 7),
				excel.getStringData("UserDetailsforAccessrequest", 2, 8),
				excel.getStringData("UserDetailsforAccessrequest", 2, 2));

	}

	@Test(priority = 5)
	public void enterApplicationDetails() throws InterruptedException {
		ApplicationOnBehalfaccessrequestformultipleusers applicationformultipleusers = PageFactory.initElements(driver,
				ApplicationOnBehalfaccessrequestformultipleusers.class);
		applicationformultipleusers.Applicationdetails(excel.getStringData("AccessreqforApplication", 1, 1),
				excel.getStringData("AccessreqforApplication", 1, 2),
				excel.getStringData("AccessreqforApplication", 1, 3),
				excel.getStringData("AccessreqforApplication", 1, 4), excel.getStringData("Login", 5, 0),
				excel.getStringData("Login", 1, 2));

	}
}
