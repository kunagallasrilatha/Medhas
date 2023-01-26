/**
 * 
 */

/**
 * @author chenn
 *
 */

/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.CreateActivedirectoryforMultipleusers;
import com.medhas.regression.Loginpage;

/**
 * @author chennoju
 *
 */
public class TestCreateOnbehalfActivedirectoryformultipleusers extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 5, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void EnterRequestinfo() throws InterruptedException {
		CreateActivedirectoryforMultipleusers AccessRequestforActivedirectory = PageFactory.initElements(driver,
				CreateActivedirectoryforMultipleusers.class);
		AccessRequestforActivedirectory.requestInfo(excel.getStringData("AccessreqforActiveDirectory", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));
	}

	@Test(priority = 3)
	public void EnterFirstUserdetails() throws InterruptedException {
		CreateActivedirectoryforMultipleusers AccessRequestforActivedirectory = PageFactory.initElements(driver,
				CreateActivedirectoryforMultipleusers.class);
		AccessRequestforActivedirectory.firstUserdetailstcreation(
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
	public void EnterSecondUserdetails() throws InterruptedException {
		CreateActivedirectoryforMultipleusers AccessRequestforApplicationmultiple = PageFactory.initElements(driver,
				CreateActivedirectoryforMultipleusers.class);
		AccessRequestforApplicationmultiple.secondUserdetailstcreation(
				excel.getStringData("UserDetailsforAccessrequest", 2, 2),
				excel.getStringData("UserDetailsforAccessrequest", 2, 3),
				excel.getStringData("UserDetailsforAccessrequest", 2, 4),
				excel.getStringData("UserDetailsforAccessrequest", 2, 5),
				excel.getStringData("UserDetailsforAccessrequest", 2, 6),
				excel.getStringData("UserDetailsforAccessrequest", 2, 7),
				excel.getStringData("UserDetailsforAccessrequest", 2, 8),
				excel.getStringData("UserDetailsforAccessrequest", 2, 9));
	}

	@Test(priority = 5)
	public void EnterActivedirectorydetails() throws InterruptedException {
		CreateActivedirectoryforMultipleusers AccessRequestforActivedirectory = PageFactory.initElements(driver,
				CreateActivedirectoryforMultipleusers.class);
		AccessRequestforActivedirectory.Activedirectorydetails(excel.getStringData("AccessreqforActiveDirectory", 1, 1),
				excel.getStringData("AccessreqforActiveDirectory", 1, 2), excel.getStringData("Login", 5, 0),
				excel.getStringData("Login", 1, 2));

	}

}
