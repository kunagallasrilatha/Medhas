/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.SingleUserDeactivaterequestforFileserver;

/**
 * @author Shashank
 *
 */
public class TestSingleUserDeactivaterequestforFileserver extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		SingleUserDeactivaterequestforFileserver singleuserdeactivateforfileserver = PageFactory.initElements(driver,
				SingleUserDeactivaterequestforFileserver.class);
		singleuserdeactivateforfileserver.requestInf(excel.getStringData("Selfcreaterequestforfileserver", 1, 0));
	}

	@Test(priority = 3)
	public void enterUserDetails() throws InterruptedException {
		SingleUserDeactivaterequestforFileserver singleuserdeactivateforfileserver = PageFactory.initElements(driver,
				SingleUserDeactivaterequestforFileserver.class);
		singleuserdeactivateforfileserver.userDetails(excel.getStringData("UserDetails forDeactivateAccess", 1, 0),
				excel.getStringData("UserDetails forDeactivateAccess", 1, 1),
				excel.getStringData("UserDetails forDeactivateAccess", 1, 2),
				excel.getStringData("UserDetails forDeactivateAccess", 1, 3),
				excel.getStringData("UserDetails forDeactivateAccess", 1, 4),
				excel.getStringData("UserDetails forDeactivateAccess", 1, 5));
	}
	
	@Test(priority=4)
	public void selectdeactivaterequest() throws InterruptedException {
		
		SingleUserDeactivaterequestforFileserver singleuserdeactivateforfileserver = PageFactory.initElements(driver, SingleUserDeactivaterequestforFileserver.class);
		singleuserdeactivateforfileserver.selectdeactivateaccess(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));
		
		
	}

}
