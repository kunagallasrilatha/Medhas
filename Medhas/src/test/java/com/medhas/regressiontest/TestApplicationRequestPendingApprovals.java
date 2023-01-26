/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.ApplicationRequestPendingApprovals;
import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;

/**
 * @author chenn
 *
 */
public class TestApplicationRequestPendingApprovals extends BaseClass {

	@Test(priority = 1)
	public void loginHod() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals", 1, 0),
				excel.getStringData("PendingApprovals", 1, 2));
	}

	/*
	 * @Test(priority = 2) public void rejectAccess() throws InterruptedException {
	 * AccessRequestPendingApprovals accessrequestpending =
	 * PageFactory.initElements(driver, AccessRequestPendingApprovals.class);
	 * accessrequestpending.rejectflowaccess(excel.getStringData("PendingApprovals",
	 * 1, 0), excel.getStringData("PendingApprovals", 1, 2));
	 * 
	 * }
	 */

	/*
	 * @Test(priority = 2) public void approvalworkflowforaccessrequestwithHod()
	 * throws InterruptedException { AccessRequestPendingApprovals
	 * accessrequestpending = PageFactory.initElements(driver,
	 * AccessRequestPendingApprovals.class);
	 * accessrequestpending.sendBackRequest(excel.getStringData("PendingApprovals",
	 * 1, 0), excel.getStringData("PendingApprovals", 1, 2)); }
	 */

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
	public void checkvalidsystemowner() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals", 3, 0),
				excel.getStringData("PendingApprovals", 3, 2));
	}

	@Test(priority = 5)
	public void approvalworkflowforaccessrequestsystemowner() throws InterruptedException {
		ApplicationRequestPendingApprovals accessrequestpending = PageFactory.initElements(driver,
				ApplicationRequestPendingApprovals.class);
		accessrequestpending.approvalworkflowaccessSystemowner(excel.getStringData("PendingApprovals", 3, 0),
				excel.getStringData("PendingApprovals", 3, 2));
	}

	@Test(priority = 6)
	public void logutfromsystemowner() throws InterruptedException {
		ApplicationRequestPendingApprovals accessrequestpending = PageFactory.initElements(driver,
				ApplicationRequestPendingApprovals.class);
		accessrequestpending.logout();
	}

	@Test(priority = 7)
	public void checkvalidsystemadmin() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals", 4, 0),
				excel.getStringData("PendingApprovals", 4, 2));
	}

	@Test(priority = 8)
	public void approvalworkflowforaccessrequestsystemadmin() throws InterruptedException {
		ApplicationRequestPendingApprovals accessrequestpending = PageFactory.initElements(driver,
				ApplicationRequestPendingApprovals.class);
		accessrequestpending.approvalworkflowaccesssystemadmin(excel.getStringData("PendingApprovals", 4, 0),
				excel.getStringData("PendingApprovals", 4, 2), excel.getStringData("PendingApprovals", 1, 3),
				excel.getStringData("PendingApprovals", 1, 4));
	}

	@Test(priority = 9)
	public void accessRequestGranted() throws InterruptedException {
		ApplicationRequestPendingApprovals accessrequestpending = PageFactory.initElements(driver,
				ApplicationRequestPendingApprovals.class);
		accessrequestpending.grantToastMsg();
	}



}