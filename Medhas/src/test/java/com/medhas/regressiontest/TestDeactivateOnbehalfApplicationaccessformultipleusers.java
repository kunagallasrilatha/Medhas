package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.DeactivateOnbehalfApplicationaccessformultipleusers;
import com.medhas.regression.Loginpage;

/**
 * @author chennoju
 *
 */
public class TestDeactivateOnbehalfApplicationaccessformultipleusers extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void EnterRequestinfo() throws InterruptedException {
		DeactivateOnbehalfApplicationaccessformultipleusers Onbehalfdeactivateapplicationdirectoryformultipleusers = PageFactory
				.initElements(driver, DeactivateOnbehalfApplicationaccessformultipleusers.class);
		Onbehalfdeactivateapplicationdirectoryformultipleusers.SelfCreateAccessRequest(
				excel.getStringData("AccessreqforApplication", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));
	}

	@Test(priority = 3)
	public void EnterApplicationdetails() throws InterruptedException {
		DeactivateOnbehalfApplicationaccessformultipleusers Onbehalfdeactivateapplicationdirectoryformultipleusers = PageFactory
				.initElements(driver, DeactivateOnbehalfApplicationaccessformultipleusers.class);
		Onbehalfdeactivateapplicationdirectoryformultipleusers.Applicationdetails(
				excel.getStringData("AccessreqforApplication", 1, 1),
				excel.getStringData("AccessreqforApplication", 1, 2),
				excel.getStringData("AccessreqforApplication", 1, 3),
				excel.getStringData("AccessreqforApplication", 1, 4));
	}

	@Test(priority = 4)
	public void EnterFirstUserDetails() throws InterruptedException {
		DeactivateOnbehalfApplicationaccessformultipleusers Onbehalfdeactivateapplicationdirectoryformultipleusers = PageFactory
				.initElements(driver, DeactivateOnbehalfApplicationaccessformultipleusers.class);
		Onbehalfdeactivateapplicationdirectoryformultipleusers.Userdetailstcreation(excel.getStringData("Modify", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 3),
				excel.getStringData("UserDetailsforAccessrequest", 1, 4),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8));
	}

	@Test(priority = 5)
	public void enterSecondUserDetails() throws InterruptedException {
		DeactivateOnbehalfApplicationaccessformultipleusers Onbehalfdeactivateapplicationdirectoryformultipleusers = PageFactory
				.initElements(driver, DeactivateOnbehalfApplicationaccessformultipleusers.class);
		Onbehalfdeactivateapplicationdirectoryformultipleusers.Userdetailstcreationmultiple(
				excel.getStringData("Modify", 1, 4), excel.getStringData("UserDetailsforAccessrequest", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 3),
				excel.getStringData("UserDetailsforAccessrequest", 1, 4),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8));
	}

	@Test(priority = 6)
	public void EnterRemarksandesign() throws InterruptedException {
		DeactivateOnbehalfApplicationaccessformultipleusers Onbehalfdeactivateapplicationdirectoryformultipleusers = PageFactory
				.initElements(driver, DeactivateOnbehalfApplicationaccessformultipleusers.class);
		Onbehalfdeactivateapplicationdirectoryformultipleusers.esign(excel.getStringData("Modify", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 10), excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2));
	}
}
