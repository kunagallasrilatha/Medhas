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
public class TestnotGrantApplicationRequestPendingApprovals extends BaseClass {

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
	public void notGrantybySystemAdmin() throws InterruptedException {
		ApplicationRequestPendingApprovals accessrequestpending = PageFactory.initElements(driver,
				ApplicationRequestPendingApprovals.class);
		accessrequestpending.notGrantflowaccesswithSA(excel.getStringData("PendingApprovals", 4, 0),
				excel.getStringData("PendingApprovals", 4, 2));

	}

	@Test(priority = 9)
	public void accessRequestNotGranted() throws InterruptedException {
		ApplicationRequestPendingApprovals accessrequestpending = PageFactory.initElements(driver,
				ApplicationRequestPendingApprovals.class);
		accessrequestpending.NotGrantToastMsg();
	}

}
