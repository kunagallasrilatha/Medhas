/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.MultipleusersModifyRequestforFileserver;


/**
 * @author Shashank
 *
 */
public class TestMultipleusersModifyRequestforFileserver extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		MultipleusersModifyRequestforFileserver multipleusersmodifyforfileserver = PageFactory.initElements(driver,
				MultipleusersModifyRequestforFileserver.class);
		multipleusersmodifyforfileserver.requestInf(excel.getStringData("Selfcreaterequestforfileserver", 1, 0));
	}

	@Test(priority = 3)
	public void enterfileserveraccess() throws InterruptedException {
		MultipleusersModifyRequestforFileserver multipleusersmodifyforfileserver = PageFactory.initElements(driver,
				MultipleusersModifyRequestforFileserver.class);
		multipleusersmodifyforfileserver.enterfileservername(excel.getStringData("Modify Fileserver", 1, 4),
				excel.getStringData("Modify Fileserver", 1, 5));
	}

	@Test(priority = 4)
	public void enterfirstUserDetails() throws InterruptedException {
		MultipleusersModifyRequestforFileserver multipleusersmodifyforfileserver = PageFactory.initElements(driver,
				MultipleusersModifyRequestforFileserver.class);
		multipleusersmodifyforfileserver.userDetails1(excel.getStringData("UserDetails for Modify Request", 1, 0),
				excel.getStringData("UserDetails for Modify Request", 1, 1),
				excel.getStringData("UserDetails for Modify Request", 1, 2),
				excel.getStringData("UserDetails for Modify Request", 1, 3),
				excel.getStringData("UserDetails for Modify Request", 1, 4),
				excel.getStringData("UserDetails for Modify Request", 1, 5));
	}

	@Test(priority = 5)
	public void entersecondUserDetails() throws InterruptedException {
		MultipleusersModifyRequestforFileserver multipleusersmodifyforfileserver = PageFactory.initElements(driver,
				MultipleusersModifyRequestforFileserver.class);
		multipleusersmodifyforfileserver.userDetails2(excel.getStringData("UserDetails for Modify Request", 2, 0),
				excel.getStringData("UserDetails for Modify Request", 2, 1),
				excel.getStringData("UserDetails for Modify Request", 2, 2),
				excel.getStringData("UserDetails for Modify Request", 2, 3),
				excel.getStringData("UserDetails for Modify Request", 2, 4),
				excel.getStringData("UserDetails for Modify Request", 2, 5));
	}

	@Test(priority = 6)
	public void selectthemodifyrequest() throws InterruptedException {
		MultipleusersModifyRequestforFileserver multipleusersmodifyforfileserver = PageFactory.initElements(driver,
				MultipleusersModifyRequestforFileserver.class);
		multipleusersmodifyforfileserver.modifyaccess(excel.getStringData("Modify Fileserver", 1, 0),
				excel.getStringData("Modify Fileserver", 1, 1), excel.getStringData("Modify Fileserver", 1, 2),
				excel.getStringData("Modify Fileserver", 1, 3), excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2));
	}

	@Test(priority = 7)
	public void modifyRequestCreated() throws InterruptedException {
		MultipleusersModifyRequestforFileserver multipleusersmodifyforfileserver = PageFactory.initElements(driver,
				MultipleusersModifyRequestforFileserver.class);
		multipleusersmodifyforfileserver.Toastmsg();
	}

}
