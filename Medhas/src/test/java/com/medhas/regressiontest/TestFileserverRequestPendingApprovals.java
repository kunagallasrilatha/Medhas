/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.ApplicationRequestPendingApprovals;
import com.medhas.regression.BaseClass;
import com.medhas.regression.FileserverRequestPendingApprovals;
import com.medhas.regression.Loginpage;

/**
 * @author Shashank
 *
 */
public class TestFileserverRequestPendingApprovals extends BaseClass {

	@Test(priority = 1)
	public void loginHod() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals", 10, 0),
				excel.getStringData("PendingApprovals", 10, 2));
	}

	@Test(priority = 2)
	public void approvalworkflowforaccessrequestwithHod() throws InterruptedException {
		FileserverRequestPendingApprovals fileserveraccessrequestpending = PageFactory.initElements(driver,
				FileserverRequestPendingApprovals.class);
		fileserveraccessrequestpending.approvalworkflowaccessHod(excel.getStringData("PendingApprovals", 10, 0),
				excel.getStringData("PendingApprovals", 10, 2));
	}

	@Test(priority = 3)
	public void logutfromHOD() throws InterruptedException {
		FileserverRequestPendingApprovals fileserveraccessrequestpending = PageFactory.initElements(driver,
				FileserverRequestPendingApprovals.class);
		fileserveraccessrequestpending.logout();
	}

	@Test(priority = 4)
	public void checkvalidLITHead() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals", 11, 0),
				excel.getStringData("PendingApprovals", 11, 2));
	}

	@Test(priority = 5)
	public void approvalworkflowforaccessrequestLITHead() throws InterruptedException {
		FileserverRequestPendingApprovals fileserveraccessrequestpending = PageFactory.initElements(driver,
				FileserverRequestPendingApprovals.class);
		fileserveraccessrequestpending.approvalworkflowaccessLitHead(excel.getStringData("PendingApprovals", 11, 0),
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
	public void approvalworkflowforaccessrequestLIT() throws InterruptedException {
		FileserverRequestPendingApprovals fileserveraccessrequestpending = PageFactory.initElements(driver,
				FileserverRequestPendingApprovals.class);
		fileserveraccessrequestpending.approvalworkflowaccessLIT(excel.getStringData("PendingApprovals", 12, 0),
				excel.getStringData("PendingApprovals", 12, 2), excel.getStringData("PendingApprovals", 10, 3));
	}

}
