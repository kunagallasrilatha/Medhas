package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.ReactivateOnBehalfApplicationaccessforsingleuser;

/**
 * @author chennoju
 *
 */
public class TestReactivateOnbehalfApplicationaccessforsingleuser extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 6, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void EnterRequestinfo() throws InterruptedException {
		ReactivateOnBehalfApplicationaccessforsingleuser onbehalfreactivateapplicationdirectoryforsingleuser = PageFactory
				.initElements(driver, ReactivateOnBehalfApplicationaccessforsingleuser.class);
		onbehalfreactivateapplicationdirectoryforsingleuser.SelfCreateAccessRequest(
				excel.getStringData("AccessreqforApplication", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));
		onbehalfreactivateapplicationdirectoryforsingleuser.Userdetailstcreation(excel.getStringData("Modify", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 3),
				excel.getStringData("UserDetailsforAccessrequest", 1, 4),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8));
	}

	@Test(priority = 3)
	public void EnterUserdetails() throws InterruptedException {
		ReactivateOnBehalfApplicationaccessforsingleuser onbehalfreactivateapplicationdirectoryforsingleuser = PageFactory
				.initElements(driver, ReactivateOnBehalfApplicationaccessforsingleuser.class);
		onbehalfreactivateapplicationdirectoryforsingleuser.Userdetailstcreation(excel.getStringData("Modify", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 3),
				excel.getStringData("UserDetailsforAccessrequest", 1, 4),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8));

	}

	@Test(priority=4)
	public void selectApplication() throws InterruptedException {
		ReactivateOnBehalfApplicationaccessforsingleuser onbehalfreactivateapplicationdirectoryforsingleuser = PageFactory
				.initElements(driver, ReactivateOnBehalfApplicationaccessforsingleuser.class);
		
		onbehalfreactivateapplicationdirectoryforsingleuser.applicationDetails(excel.getStringData("Login", 6, 0), excel.getStringData("Login", 1, 2));
	}

}
