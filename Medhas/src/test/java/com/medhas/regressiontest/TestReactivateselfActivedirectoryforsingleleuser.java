package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.ReactivateselfActivedirectoryforsingleleuser;

/**
 * @author chennoju
 *
 */
public class TestReactivateselfActivedirectoryforsingleleuser extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void EnterRequestinfo() throws InterruptedException {
		ReactivateselfActivedirectoryforsingleleuser reactivateActivedirectoryforsingleuser = PageFactory
				.initElements(driver, ReactivateselfActivedirectoryforsingleleuser.class);
		reactivateActivedirectoryforsingleuser.SelfCreateAccessRequest(
				excel.getStringData("AccessreqforActiveDirectory", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));
	}

	@Test(priority = 2)
	public void EnterUserdetails() throws InterruptedException {
		ReactivateselfActivedirectoryforsingleleuser reactivateActivedirectoryforsingleuser = PageFactory
				.initElements(driver, ReactivateselfActivedirectoryforsingleleuser.class);
		reactivateActivedirectoryforsingleuser.Userdetailstcreation(excel.getStringData("Modify", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 3),
				excel.getStringData("UserDetailsforAccessrequest", 1, 4),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8));
	}

	@Test(priority = 3)
	public void EnterActivedirectorydetails() throws InterruptedException {
		ReactivateselfActivedirectoryforsingleleuser reactivateActivedirectoryforsingleuser = PageFactory
				.initElements(driver, ReactivateselfActivedirectoryforsingleleuser.class);
		reactivateActivedirectoryforsingleuser.Activedirectorydetails(
				excel.getStringData("AccessreqforActiveDirectory", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 10), excel.getStringData("Login", 6, 0),
				excel.getStringData("Login", 1, 2));
	}

	@Test(priority = 4)
	public void EnterRemarksandesign() throws InterruptedException {
		ReactivateselfActivedirectoryforsingleleuser reactivateActivedirectoryforsingleuser = PageFactory
				.initElements(driver, ReactivateselfActivedirectoryforsingleleuser.class);
		reactivateActivedirectoryforsingleuser.esign(excel.getStringData("Login", 6, 0),
				excel.getStringData("Login", 1, 2));
	}

}
