/**
 * 
 */
package com.medhas.sanity;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.SelfReactivaterequestforFileserver;

/**
 * @author Shashank
 *
 */
public class TestSelfReactivaterequestforFileserver extends BaseClass{
	

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 16, 0), excel.getStringData("Login", 16, 2));

	}

	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		SelfReactivaterequestforFileserver selfreactivateforfileserver = PageFactory.initElements(driver,
				SelfReactivaterequestforFileserver.class);
		selfreactivateforfileserver.requestInf(excel.getStringData("Selfcreaterequestforfileserver", 1, 0));
	}

	@Test(priority = 3)
	public void enterUserDetails() throws InterruptedException {
		SelfReactivaterequestforFileserver selfreactivateforfileserver = PageFactory.initElements(driver,
				SelfReactivaterequestforFileserver.class);
		selfreactivateforfileserver.userDetails(excel.getStringData("UserDetails forReactivateAccess", 1, 1),
				excel.getStringData("UserDetails forReactivateAccess", 1, 2),
				excel.getStringData("UserDetails forReactivateAccess", 1, 3),
				excel.getStringData("UserDetails forReactivateAccess", 1, 4),
				excel.getStringData("UserDetails forReactivateAccess", 1, 5));
	}

	@Test(priority = 4)
	public void selectdeactivaterequest() throws InterruptedException {

		SelfReactivaterequestforFileserver selfreactivateforfileserver = PageFactory.initElements(driver,
				SelfReactivaterequestforFileserver.class);
		selfreactivateforfileserver.selectdeactivateaccess(excel.getStringData("Login", 16, 0),
				excel.getStringData("Login", 16, 2));

	}

}
