package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.ModifyOnbehalfActivedirectoryformultipleleusers;
import com.medhas.regression.ModifyOnbehalfApplicationaccessformultipleusers;

/**
 * @author chennoju
 *
 */
public class TestModifyOnbehalfApplicationaccessformultipleusers extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 6, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void enterRequestInfo() throws InterruptedException {
		ModifyOnbehalfApplicationaccessformultipleusers OnbehalfModifyapplicationformultipleusers = PageFactory
				.initElements(driver, ModifyOnbehalfApplicationaccessformultipleusers.class);
		OnbehalfModifyapplicationformultipleusers.requestInfo(excel.getStringData("AccessreqforApplication", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));

	}

	@Test(priority = 3)
	public void enterApplicationDetails() throws InterruptedException {
		ModifyOnbehalfApplicationaccessformultipleusers OnbehalfModifyapplicationformultipleusers = PageFactory
				.initElements(driver, ModifyOnbehalfApplicationaccessformultipleusers.class);
		OnbehalfModifyapplicationformultipleusers.Applicationdetails(
				excel.getStringData("AccessreqforApplication", 1, 1),
				excel.getStringData("AccessreqforApplication", 1, 2),
				excel.getStringData("AccessreqforApplication", 1, 3),
				excel.getStringData("AccessreqforApplication", 1, 4));
	}

	@Test(priority = 4)
	public void enterFirstUserDetails() throws InterruptedException {
		ModifyOnbehalfApplicationaccessformultipleusers OnbehalfModifyapplicationformultipleusers = PageFactory
				.initElements(driver, ModifyOnbehalfApplicationaccessformultipleusers.class);
		OnbehalfModifyapplicationformultipleusers.firstUserDetails(
				excel.getStringData("UserDetailsforAccessrequest", 1, 1),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2));

	}

	@Test(priority = 5)
	public void enterSecondUserDetails() throws InterruptedException {
		ModifyOnbehalfApplicationaccessformultipleusers OnbehalfModifyapplicationformultipleusers = PageFactory
				.initElements(driver, ModifyOnbehalfApplicationaccessformultipleusers.class);
		OnbehalfModifyapplicationformultipleusers.secondUserDetails(
				excel.getStringData("UserDetailsforAccessrequest", 2, 1),
				excel.getStringData("UserDetailsforAccessrequest", 2, 5),
				excel.getStringData("UserDetailsforAccessrequest", 2, 6),
				excel.getStringData("UserDetailsforAccessrequest", 2, 7),
				excel.getStringData("UserDetailsforAccessrequest", 2, 8),
				excel.getStringData("UserDetailsforAccessrequest", 2, 2));

	}

	@Test(priority = 6)
	public void editAccess() throws InterruptedException {
		ModifyOnbehalfApplicationaccessformultipleusers OnbehalfModifyapplicationformultipleusers = PageFactory
				.initElements(driver, ModifyOnbehalfApplicationaccessformultipleusers.class);
		OnbehalfModifyapplicationformultipleusers.modifyAccessDetails(excel.getStringData("Login", 6, 0), excel.getStringData("Login", 1, 2));
	}
	@Test(priority = 7)
	public void modifyRequestCreated() throws InterruptedException {
		ModifyOnbehalfActivedirectoryformultipleleusers modifyOnbehalfActivedirectoryformultipleleusers = PageFactory
				.initElements(driver, ModifyOnbehalfActivedirectoryformultipleleusers.class);
				modifyOnbehalfActivedirectoryformultipleleusers.Toastmsg();
	}
}
