/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.ReactivateOnbehalfActivedirectoryformultipleleusers;

/**
 * @author Shashank
 *
 */
public class TestReactivateOnbehalfActivedirectoryformultipleleusers extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void EnterRequestinfo() throws InterruptedException {
		ReactivateOnbehalfActivedirectoryformultipleleusers reactiOnbehalfADMultipleusers = PageFactory
				.initElements(driver, ReactivateOnbehalfActivedirectoryformultipleleusers.class);
		reactiOnbehalfADMultipleusers.requestInfo(excel.getStringData("AccessreqforActiveDirectory", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));
	}

	@Test(priority = 3)
	public void EnterFirstUserdetails() throws InterruptedException {
		ReactivateOnbehalfActivedirectoryformultipleleusers reactiOnbehalfADMultipleusers = PageFactory
				.initElements(driver, ReactivateOnbehalfActivedirectoryformultipleleusers.class);
		reactiOnbehalfADMultipleusers.firstUserdetails(excel.getStringData("UserDetails forReactivateAccess", 2, 0),
				excel.getStringData("UserDetails forReactivateAccess", 2, 1),
				excel.getStringData("UserDetails forReactivateAccess", 2, 2),
				excel.getStringData("UserDetails forReactivateAccess", 2, 3),
				excel.getStringData("UserDetails forReactivateAccess", 2, 4),
				excel.getStringData("UserDetails forReactivateAccess", 2, 5));
	}

	@Test(priority = 4)
	public void EnterSecondUserdetails() throws InterruptedException {
		ReactivateOnbehalfActivedirectoryformultipleleusers reactiOnbehalfADMultipleusers = PageFactory
				.initElements(driver, ReactivateOnbehalfActivedirectoryformultipleleusers.class);
		reactiOnbehalfADMultipleusers.seconduserDetails(excel.getStringData("UserDetails forReactivateAccess", 2, 0),
				excel.getStringData("UserDetails forReactivateAccess", 2, 1),
				excel.getStringData("UserDetails forReactivateAccess", 2, 2),
				excel.getStringData("UserDetails forReactivateAccess", 2, 3),
				excel.getStringData("UserDetails forReactivateAccess", 2, 4),
				excel.getStringData("UserDetails forReactivateAccess", 2, 5));
	}

	@Test(priority = 5)
	public void EnterActivedirectorydetails() throws InterruptedException {
		ReactivateOnbehalfActivedirectoryformultipleleusers reactiOnbehalfADMultipleusers = PageFactory
				.initElements(driver, ReactivateOnbehalfActivedirectoryformultipleleusers.class);
		reactiOnbehalfADMultipleusers.Activedirectorydetails(excel.getStringData("Login", 6, 0),
				excel.getStringData("Login", 1, 2));
	}

}
