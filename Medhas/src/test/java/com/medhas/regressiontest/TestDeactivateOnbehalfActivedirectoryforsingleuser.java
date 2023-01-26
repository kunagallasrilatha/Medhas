package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.DeactivateOnbehalfActivedirectoryforsingleuser;
import com.medhas.regression.Loginpage;

/**
 * @author chennoju
 *
 */
public class TestDeactivateOnbehalfActivedirectoryforsingleuser extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 6, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void EnterRequestinfo() throws InterruptedException {
		DeactivateOnbehalfActivedirectoryforsingleuser deactivateonbehalfActivedirectoryforsingleuser = PageFactory
				.initElements(driver, DeactivateOnbehalfActivedirectoryforsingleuser.class);
		deactivateonbehalfActivedirectoryforsingleuser.SelfCreateAccessRequest(
				excel.getStringData("AccessreqforActiveDirectory", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));
	}

	@Test(priority = 3)
	public void EnterUserdetails() throws InterruptedException {
		DeactivateOnbehalfActivedirectoryforsingleuser deactivateonbehalfActivedirectoryforsingleuser = PageFactory
				.initElements(driver, DeactivateOnbehalfActivedirectoryforsingleuser.class);
		deactivateonbehalfActivedirectoryforsingleuser.requestInfo(excel.getStringData("Modify", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 3),
				excel.getStringData("UserDetailsforAccessrequest", 1, 4),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8));
	}

	@Test(priority = 4)
	public void EnterActivedirectorydetails() throws InterruptedException {
		DeactivateOnbehalfActivedirectoryforsingleuser deactivateonbehalfActivedirectoryforsingleuser = PageFactory
				.initElements(driver, DeactivateOnbehalfActivedirectoryforsingleuser.class);
		deactivateonbehalfActivedirectoryforsingleuser.Activedirectorydetails();
	}

	@Test(priority = 5)
	public void EnterRemarksandesign() throws InterruptedException {
		DeactivateOnbehalfActivedirectoryforsingleuser deactivateonbehalfActivedirectoryforsingleuser = PageFactory
				.initElements(driver, DeactivateOnbehalfActivedirectoryforsingleuser.class);
		deactivateonbehalfActivedirectoryforsingleuser.esign(excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2), excel.getStringData("Login", 6, 0));
	}
}
