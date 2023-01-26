package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.ReactivateOnbehalfApplicationaccessformultipleusers;

/**
 * @author chennoju
 *
 */
public class TestReactivateOnbehalfApplicationaccessformultipleusers extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 6, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void EnterRequestinfo() throws InterruptedException {
		ReactivateOnbehalfApplicationaccessformultipleusers Onbehalfreactivateapplicationdirectoryformultipleusers = PageFactory
				.initElements(driver, ReactivateOnbehalfApplicationaccessformultipleusers.class);
		Onbehalfreactivateapplicationdirectoryformultipleusers.SelfCreateAccessRequest(
				excel.getStringData("AccessreqforApplication", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));
	}

	@Test(priority = 3)
	public void EnterApplicationdetails() throws InterruptedException {
		ReactivateOnbehalfApplicationaccessformultipleusers Onbehalfreactivateapplicationdirectoryformultipleusers = PageFactory
				.initElements(driver, ReactivateOnbehalfApplicationaccessformultipleusers.class);
		Onbehalfreactivateapplicationdirectoryformultipleusers.Applicationdetails(
				excel.getStringData("AccessreqforApplication", 1, 1),
				excel.getStringData("AccessreqforApplication", 1, 2), excel.getStringData("Reactivate", 1, 0),
				excel.getStringData("Reactivate", 1, 1));
	}

	@Test(priority = 4)
	public void EnterUserdetails() throws InterruptedException {
		ReactivateOnbehalfApplicationaccessformultipleusers Onbehalfreactivateapplicationdirectoryformultipleusers = PageFactory
				.initElements(driver, ReactivateOnbehalfApplicationaccessformultipleusers.class);
		Onbehalfreactivateapplicationdirectoryformultipleusers.Userdetailstcreation(excel.getStringData("Modify", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 3),
				excel.getStringData("UserDetailsforAccessrequest", 1, 4),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8));
	}

	@Test(priority = 5)
	public void submitRequest() throws InterruptedException {
		ReactivateOnbehalfApplicationaccessformultipleusers Onbehalfreactivateapplicationdirectoryformultipleusers = PageFactory
				.initElements(driver, ReactivateOnbehalfApplicationaccessformultipleusers.class);
		Onbehalfreactivateapplicationdirectoryformultipleusers.submitReactivate(excel.getStringData("Login", 6, 0),
				excel.getStringData("Login", 1, 2));

	}

}
