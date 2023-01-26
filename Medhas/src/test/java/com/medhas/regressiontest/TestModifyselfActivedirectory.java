package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.ModifyOnbehalfActivedirectoryformultipleleusers;
import com.medhas.regression.ModifySelfActivedirectory;

/**
 * @author chennoju
 *
 */
public class TestModifyselfActivedirectory extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void SelfCreateAccessRequest() throws InterruptedException {
		ModifySelfActivedirectory modifyActivedirectoryforsingleuser = PageFactory.initElements(driver,
				ModifySelfActivedirectory.class);
		modifyActivedirectoryforsingleuser.SelfCreateAccessRequest(
				excel.getStringData("AccessreqforActiveDirectory", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));
	}

	@Test(priority = 3)
	public void Userdetailstcreation() throws InterruptedException {
		ModifySelfActivedirectory modifyActivedirectoryforsingleuser = PageFactory.initElements(driver,
				ModifySelfActivedirectory.class);
		modifyActivedirectoryforsingleuser.Userdetailstcreation(
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2));
	}

	@Test(priority = 4)
	public void modifyActivedirectorydetails() throws InterruptedException {
		ModifySelfActivedirectory modifyActivedirectoryforsingleuser = PageFactory.initElements(driver,
				ModifySelfActivedirectory.class);
		modifyActivedirectoryforsingleuser.Activedirectorydetails(
				excel.getStringData("AccessreqforActiveDirectory", 1, 2), excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2));
	}

	@Test(priority = 5)
	public void modifyRequestCreated() throws InterruptedException {
		ModifyOnbehalfActivedirectoryformultipleleusers modifyOnbehalfActivedirectoryformultipleleusers = PageFactory
				.initElements(driver, ModifyOnbehalfActivedirectoryformultipleleusers.class);
		modifyOnbehalfActivedirectoryformultipleleusers.Toastmsg();
	}
}
