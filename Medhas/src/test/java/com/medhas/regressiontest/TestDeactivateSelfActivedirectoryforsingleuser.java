package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.DeactivateSelfActivedirectoryforsingleuser;
import com.medhas.regression.Loginpage;

/**
 * @author chennoju
 *
 */
public class TestDeactivateSelfActivedirectoryforsingleuser extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void EnterRequestinfo() throws InterruptedException {
		DeactivateSelfActivedirectoryforsingleuser deactivateActivedirectoryforsingleuser = PageFactory
				.initElements(driver, DeactivateSelfActivedirectoryforsingleuser.class);
		deactivateActivedirectoryforsingleuser.requestInfo(excel.getStringData("AccessreqforActiveDirectory", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));
	}

	@Test(priority = 3)
	public void EnterUserdetails() throws InterruptedException {
		DeactivateSelfActivedirectoryforsingleuser deactivateActivedirectoryforsingleuser = PageFactory
				.initElements(driver, DeactivateSelfActivedirectoryforsingleuser.class);
		deactivateActivedirectoryforsingleuser.Userdetails(excel.getStringData("UserDetailsforAccessrequest", 1, 1),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2));
	}

	@Test(priority = 4)
	public void selectActiveDirectory() throws InterruptedException {
		DeactivateSelfActivedirectoryforsingleuser deactivateActivedirectoryforsingleuser = PageFactory
				.initElements(driver, DeactivateSelfActivedirectoryforsingleuser.class);
		deactivateActivedirectoryforsingleuser.Activedirectorydetails();
	}

	@Test(priority = 5)
	public void submitDeactivateRequest() throws InterruptedException {
		DeactivateSelfActivedirectoryforsingleuser deactivateActivedirectoryforsingleuser = PageFactory
				.initElements(driver, DeactivateSelfActivedirectoryforsingleuser.class);
		deactivateActivedirectoryforsingleuser.esign(excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2), excel.getStringData("Login", 6, 0));
	}
}
