package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.OnbehalfApplicationaccessrequestformultipleaccess;

/**
 * @author chennoju
 *
 */
public class TestCreateOnbehalfApplicationaccessrequestformultipleaccess extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void EnterRequestInfo() throws InterruptedException {
		OnbehalfApplicationaccessrequestformultipleaccess multipleaccessapplication = PageFactory.initElements(driver,
				OnbehalfApplicationaccessrequestformultipleaccess.class);

		multipleaccessapplication.RequestInfo(excel.getStringData("AccessreqforApplication", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));

	}

	@Test(priority = 3)
	public void EnterUserDetails() throws InterruptedException {

		OnbehalfApplicationaccessrequestformultipleaccess multipleaccessapplication = PageFactory.initElements(driver,
				OnbehalfApplicationaccessrequestformultipleaccess.class);
		multipleaccessapplication.userDetails(excel.getStringData("UserDetailsforAccessrequest", 1, 1),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8));

	}

	@Test(priority = 4)
	public void EnterFirstApplicationDetails() throws InterruptedException {
		OnbehalfApplicationaccessrequestformultipleaccess multipleaccessapplication = PageFactory.initElements(driver,
				OnbehalfApplicationaccessrequestformultipleaccess.class);
		multipleaccessapplication.Firstapplicationdetails(excel.getStringData("AccessreqforApplication", 1, 1),
				excel.getStringData("AccessreqforApplication", 1, 2),
				excel.getStringData("AccessreqforApplication", 1, 3),
				excel.getStringData("AccessreqforApplication", 1, 4));

	}

	@Test(priority = 5)
	public void enterSecondApplicationDetails() throws InterruptedException {
		OnbehalfApplicationaccessrequestformultipleaccess multipleaccessapplication = PageFactory.initElements(driver,
				OnbehalfApplicationaccessrequestformultipleaccess.class);
		multipleaccessapplication.Secondapplicationdetails(excel.getStringData("AccessreqforApplication", 2, 1),
				excel.getStringData("AccessreqforApplication", 2, 2),
				excel.getStringData("AccessreqforApplication", 2, 3),
				excel.getStringData("AccessreqforApplication", 2, 4), excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2));
	}
}
