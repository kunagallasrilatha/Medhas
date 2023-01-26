package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.DeactivateOnbehalfActivedirectoryformultipleusers;
import com.medhas.regression.Loginpage;

/**
 * @author chennoju
 *
 */
public class TestDeactivateOnbehalfActivedirectoryformultipleusers extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 6, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void EnterRequestinfo() throws InterruptedException {
		DeactivateOnbehalfActivedirectoryformultipleusers deactivateonbehalfActivedirectoryformultipleuser = PageFactory
				.initElements(driver, DeactivateOnbehalfActivedirectoryformultipleusers.class);
		deactivateonbehalfActivedirectoryformultipleuser.SelfCreateAccessRequest(
				excel.getStringData("AccessreqforActiveDirectory", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));
	}

	@Test(priority = 3)
	public void EnterFirstUserdetails() throws InterruptedException {
		DeactivateOnbehalfActivedirectoryformultipleusers deactivateonbehalfActivedirectoryformultipleuser = PageFactory
				.initElements(driver, DeactivateOnbehalfActivedirectoryformultipleusers.class);
		deactivateonbehalfActivedirectoryformultipleuser.Userdetailstcreation(excel.getStringData("Modify", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 3),
				excel.getStringData("UserDetailsforAccessrequest", 1, 4),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8));
	}

	@Test(priority = 4)
	public void EnterSecondUserDetails() throws InterruptedException {
		DeactivateOnbehalfActivedirectoryformultipleusers deactivateonbehalfActivedirectoryformultipleuser = PageFactory
				.initElements(driver, DeactivateOnbehalfActivedirectoryformultipleusers.class);
		deactivateonbehalfActivedirectoryformultipleuser.multipleUserdetailstcreation(
				excel.getStringData("Modify", 1, 4), excel.getStringData("UserDetailsforAccessrequest", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 3),
				excel.getStringData("UserDetailsforAccessrequest", 1, 4),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8));
	}

	@Test(priority = 5)
	public void EnterActivedirectorydetails() throws InterruptedException {
		DeactivateOnbehalfActivedirectoryformultipleusers deactivateonbehalfActivedirectoryformultipleuser = PageFactory
				.initElements(driver, DeactivateOnbehalfActivedirectoryformultipleusers.class);
		deactivateonbehalfActivedirectoryformultipleuser.Activedirectorydetails();
	}

	@Test(priority = 6)
	public void EnterRemarksandesign() throws InterruptedException {
		DeactivateOnbehalfActivedirectoryformultipleusers deactivateonbehalfActivedirectoryformultipleuser = PageFactory
				.initElements(driver, DeactivateOnbehalfActivedirectoryformultipleusers.class);
		deactivateonbehalfActivedirectoryformultipleuser.Remarks(excel.getStringData("Login", 6, 0),
				excel.getStringData("Login", 1, 2), excel.getStringData("Login", 6, 0));
	}
}
