/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.SingleUserReactivaterequestforOperatingsystem;


/**
 * @author Shashank
 *
 */
public class TestSingleUserReactivaterequestforOperatingsystem extends BaseClass{
	
	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}
	
	
	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		SingleUserReactivaterequestforOperatingsystem singleuserreactivateforoperatingsytem = PageFactory.initElements(driver,
				SingleUserReactivaterequestforOperatingsystem.class);
		singleuserreactivateforoperatingsytem.requestInf(excel.getStringData("Selfcreaterequestopearatingsyst", 1, 0));
	}
	
	@Test(priority = 3)
	public void enterUserDetails() throws InterruptedException {
		SingleUserReactivaterequestforOperatingsystem singleuserreactivateforoperatingsytem = PageFactory.initElements(driver,
				SingleUserReactivaterequestforOperatingsystem.class);
		singleuserreactivateforoperatingsytem.userDetails(excel.getStringData("UserDetails forReactivateAccess", 1, 0),
				excel.getStringData("UserDetails forReactivateAccess", 1, 1),
				excel.getStringData("UserDetails forReactivateAccess", 1, 2),
				excel.getStringData("UserDetails forReactivateAccess", 1, 3),
				excel.getStringData("UserDetails forReactivateAccess", 1, 4),
				excel.getStringData("UserDetails forReactivateAccess", 1, 5));
	}
	
	@Test(priority=4)
	public void selectreactivaterequest() throws InterruptedException {
		
		SingleUserReactivaterequestforOperatingsystem singleuserreactivateforoperatingsytem = PageFactory.initElements(driver, SingleUserReactivaterequestforOperatingsystem.class);
		singleuserreactivateforoperatingsytem.selectdeactivateaccess(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));
		
		
	}
}
