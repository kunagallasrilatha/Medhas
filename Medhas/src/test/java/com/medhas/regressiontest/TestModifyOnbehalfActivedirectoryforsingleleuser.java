package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.ModifyOnbehalfActivedirectoryformultipleleusers;
import com.medhas.regression.ModifyOnbehalfActivedirectoryforsingleleuser;

/**
 * @author chennoju
 *
 */
public class TestModifyOnbehalfActivedirectoryforsingleleuser extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void EnterRequestinfo() throws InterruptedException {
		ModifyOnbehalfActivedirectoryforsingleleuser modifyOnbehalfActivedirectoryforsingleleusers = PageFactory
				.initElements(driver, ModifyOnbehalfActivedirectoryforsingleleuser.class);
		modifyOnbehalfActivedirectoryforsingleleusers.SelfCreateAccessRequest(
				excel.getStringData("AccessreqforActiveDirectory", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));
	}

	@Test(priority = 3)
	public void EnterUserdetails() throws InterruptedException {
		ModifyOnbehalfActivedirectoryforsingleleuser modifyOnbehalfActivedirectoryforsingleleusers = PageFactory
				.initElements(driver, ModifyOnbehalfActivedirectoryforsingleleuser.class);
		modifyOnbehalfActivedirectoryforsingleleusers.Userdetailstcreation(
				excel.getStringData("UserDetailsforAccessrequest", 1, 1),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8));
	}

	@Test(priority = 4)
	public void EnterModifyActivedirectorydetails() throws InterruptedException {
		ModifyOnbehalfActivedirectoryforsingleleuser modifyOnbehalfActivedirectoryforsingleleusers = PageFactory
				.initElements(driver, ModifyOnbehalfActivedirectoryforsingleleuser.class);
		modifyOnbehalfActivedirectoryforsingleleusers.Activedirectorydetails(
				excel.getStringData("AccessreqforActiveDirectory", 2, 2), excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2));
	}

	@Test(priority = 5)
	public void modifyRequestCreated() throws InterruptedException {
		ModifyOnbehalfActivedirectoryformultipleleusers modifyOnbehalfActivedirectoryformultipleleusers = PageFactory
				.initElements(driver, ModifyOnbehalfActivedirectoryformultipleleusers.class);
		modifyOnbehalfActivedirectoryformultipleleusers.Toastmsg();
	}
}
