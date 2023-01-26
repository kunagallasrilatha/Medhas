/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.MultipleusersModifyRequestforOperatingsystem;
import com.medhas.regression.SingleuserModifyRequestforFileserver;

/**
 * @author Shashank
 *
 */
public class TestMultipleusersModifyRequestforOperatingsystem extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 5, 0), excel.getStringData("Login", 5, 2));

	}

	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		MultipleusersModifyRequestforOperatingsystem multipleusersmodifyforoperatingsystem = PageFactory
				.initElements(driver, MultipleusersModifyRequestforOperatingsystem.class);
		multipleusersmodifyforoperatingsystem.requestInf(excel.getStringData("Modify OperatingSystem", 1, 0));
	}

	@Test(priority = 3)
	public void enteroperatingsystemaccess() throws InterruptedException {
		MultipleusersModifyRequestforOperatingsystem multipleusersmodifyforoperatingsystem = PageFactory
				.initElements(driver, MultipleusersModifyRequestforOperatingsystem.class);
		multipleusersmodifyforoperatingsystem.enteroperatingsystemname(
				excel.getStringData("Modify OperatingSystem", 1, 3),
				excel.getStringData("Modify OperatingSystem", 1, 4),
				excel.getStringData("Modify OperatingSystem", 1, 5));
	}

	@Test(priority = 4)
	public void enterfirstUserDetails() throws InterruptedException {
		MultipleusersModifyRequestforOperatingsystem multipleusersmodifyforoperatingsystem = PageFactory
				.initElements(driver, MultipleusersModifyRequestforOperatingsystem.class);
		multipleusersmodifyforoperatingsystem.userDetails1(excel.getStringData("UserDetails for Modify Request", 1, 0),
				excel.getStringData("UserDetails for Modify Request", 1, 1),
				excel.getStringData("UserDetails for Modify Request", 1, 2),
				excel.getStringData("UserDetails for Modify Request", 1, 3),
				excel.getStringData("UserDetails for Modify Request", 1, 4),
				excel.getStringData("UserDetails for Modify Request", 1, 5));
	}

	@Test(priority = 5)
	public void entersecondUserDetails() throws InterruptedException {
		MultipleusersModifyRequestforOperatingsystem multipleusersmodifyforoperatingsystem = PageFactory
				.initElements(driver, MultipleusersModifyRequestforOperatingsystem.class);
		multipleusersmodifyforoperatingsystem.userDetails2(excel.getStringData("UserDetails for Modify Request", 2, 0),
				excel.getStringData("UserDetails for Modify Request", 2, 1),
				excel.getStringData("UserDetails for Modify Request", 2, 2),
				excel.getStringData("UserDetails for Modify Request", 2, 3),
				excel.getStringData("UserDetails for Modify Request", 2, 4),
				excel.getStringData("UserDetails for Modify Request", 2, 5));
	}

	@Test(priority = 6)
	public void selectthemodifyrequest() throws InterruptedException {
		MultipleusersModifyRequestforOperatingsystem multipleusersmodifyforoperatingsystem = PageFactory
				.initElements(driver, MultipleusersModifyRequestforOperatingsystem.class);
		multipleusersmodifyforoperatingsystem.modifyaccess(excel.getStringData("Modify OperatingSystem", 1, 1),
				excel.getStringData("Modify OperatingSystem", 1, 1),
				excel.getStringData("Modify OperatingSystem", 1, 2), excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2));
	}
	
	@Test(priority = 5)
	public void modifyRequestCreated() throws InterruptedException {
		SingleuserModifyRequestforFileserver singleusermodifyforfileserver = PageFactory.initElements(driver,
				SingleuserModifyRequestforFileserver.class);
		singleusermodifyforfileserver.Toastmsg();
	}

}
