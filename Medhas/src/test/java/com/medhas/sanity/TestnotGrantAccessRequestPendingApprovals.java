/**
 * 
 */
package com.medhas.sanity;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.ApplicationRequestPendingApprovals;
import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;

/**
 * @author Shashank
 *
 */
public class TestnotGrantAccessRequestPendingApprovals extends BaseClass {
	
	@Test(priority = 1)
	public void loginHod() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals", 1, 0),
				excel.getStringData("PendingApprovals", 1, 2));
	}

	@Test(priority = 2)
	public void approvalworkflowforaccessrequestwithHod() throws InterruptedException {
		ApplicationRequestPendingApprovals accessrequestpending = PageFactory.initElements(driver,
				ApplicationRequestPendingApprovals.class);
		accessrequestpending.approvalworkflowaccessHod(excel.getStringData("PendingApprovals", 1, 0),
				excel.getStringData("PendingApprovals", 1, 2));
	}

	@Test(priority = 3)
	public void logutfromHOD() throws InterruptedException {
		ApplicationRequestPendingApprovals accessrequestpending = PageFactory.initElements(driver,
				ApplicationRequestPendingApprovals.class);
		accessrequestpending.logout();
	}

	@Test(priority = 4)
	public void checkvalidsystemLITHead() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals", 11, 0),
				excel.getStringData("PendingApprovals", 11, 2));
	}

	@Test(priority = 5)
	public void approvalworkflowforaccessrequestLITHead() throws InterruptedException {
		ApplicationRequestPendingApprovals accessrequestpending = PageFactory.initElements(driver,
				ApplicationRequestPendingApprovals.class);
		accessrequestpending.approvalworkflowaccessSystemowner(excel.getStringData("PendingApprovals", 11, 0),
				excel.getStringData("PendingApprovals", 11, 2));
	}

	@Test(priority = 6)
	public void logutfromLITHead() throws InterruptedException {
		ApplicationRequestPendingApprovals accessrequestpending = PageFactory.initElements(driver,
				ApplicationRequestPendingApprovals.class);
		accessrequestpending.logout();
	}

	@Test(priority = 7)
	public void checkvalidLIT() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals", 12, 0),
				excel.getStringData("PendingApprovals", 12, 2));
	}

	@Test(priority = 8)
	public void notGrantybyLIT() throws InterruptedException {
		ApplicationRequestPendingApprovals accessrequestpending = PageFactory.initElements(driver,
				ApplicationRequestPendingApprovals.class);
		accessrequestpending.notGrantflowaccesswithSA(excel.getStringData("PendingApprovals", 12, 0),
				excel.getStringData("PendingApprovals", 12, 2));

	}

	@Test(priority = 9)
	public void accessRequestNotGranted() throws InterruptedException {
		ApplicationRequestPendingApprovals accessrequestpending = PageFactory.initElements(driver,
				ApplicationRequestPendingApprovals.class);
		accessrequestpending.NotGrantToastMsg();
	}

}
