package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.ReactivateOnbehalfActivedirectoryforsingleleuser;

/**
 * @author chennoju
 *
 */
public class TestReactivateOnbehalfActivedirectoryforsingleleuser extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void EnterRequestinfo() throws InterruptedException {
		ReactivateOnbehalfActivedirectoryforsingleleuser reactiOnbehalfADSingleUser = PageFactory.initElements(driver,
				ReactivateOnbehalfActivedirectoryforsingleleuser.class);
		reactiOnbehalfADSingleUser.requestInfo(excel.getStringData("AccessreqforActiveDirectory", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));
	}

	@Test(priority = 2)
	public void EnterUserdetails() throws InterruptedException {
		ReactivateOnbehalfActivedirectoryforsingleleuser reactiOnbehalfADSingleUser = PageFactory.initElements(driver,
				ReactivateOnbehalfActivedirectoryforsingleleuser.class);
		reactiOnbehalfADSingleUser.Userdetails(excel.getStringData("UserDetails forReactivateAccess", 1, 0),
				excel.getStringData("UserDetails forReactivateAccess", 1, 1),
				excel.getStringData("UserDetails forReactivateAccess", 1, 2),
				excel.getStringData("UserDetails forReactivateAccess", 1, 3),
				excel.getStringData("UserDetails forReactivateAccess", 1, 4),
				excel.getStringData("UserDetails forReactivateAccess", 1, 5));
	}

	@Test(priority = 3)
	public void EnterActivedirectorydetails() throws InterruptedException {
		ReactivateOnbehalfActivedirectoryforsingleleuser reactiOnbehalfADSingleUser = PageFactory.initElements(driver,
				ReactivateOnbehalfActivedirectoryforsingleleuser.class);
		reactiOnbehalfADSingleUser.Activedirectorydetails(excel.getStringData("Login", 6, 0),
				excel.getStringData("Login", 1, 2));
	}

}
