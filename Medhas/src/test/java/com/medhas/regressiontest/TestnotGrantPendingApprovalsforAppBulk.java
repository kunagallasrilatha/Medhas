/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.PendingApprovalsforAppBulk;

/**
 * @author Shashank
 *
 */
public class TestnotGrantPendingApprovalsforAppBulk extends BaseClass {

	
	@Test(priority = 1)
	public void loginSO() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals", 21, 0),
				excel.getStringData("PendingApprovals", 21, 2));
	}
	
	@Test(priority = 2)
	public void approvalworkflowforaccessrequestsystemowner() throws InterruptedException {
		PendingApprovalsforAppBulk accessrequestpending = PageFactory.initElements(driver,
				PendingApprovalsforAppBulk.class);
		accessrequestpending.approvalworkflowaccessSO(excel.getStringData("PendingApprovals", 21, 0),
				excel.getStringData("PendingApprovals", 21, 2));
	}
	
	@Test(priority = 3)
	public void logutfromsystemowner() throws InterruptedException {
		PendingApprovalsforAppBulk accessrequestpending = PageFactory.initElements(driver,
				PendingApprovalsforAppBulk.class);
		accessrequestpending.logout();
	}
	
	@Test(priority = 7)
	public void checkvalidsystemadmin() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals", 19, 0),
				excel.getStringData("PendingApprovals", 19, 2));
	}

	@Test(priority = 8)
	public void notGrantybySystemAdmin() throws InterruptedException {
		PendingApprovalsforAppBulk accessrequestpending = PageFactory.initElements(driver,
				PendingApprovalsforAppBulk.class);
		accessrequestpending.notGrantflowaccesswithSA(excel.getStringData("PendingApprovals", 19, 0),
				excel.getStringData("PendingApprovals", 19, 2));

	}

	@Test(priority = 9)
	public void accessRequestNotGranted() throws InterruptedException {
		PendingApprovalsforAppBulk accessrequestpending = PageFactory.initElements(driver,
				PendingApprovalsforAppBulk.class);
		accessrequestpending.notgrantToastMsg();
	}

}
