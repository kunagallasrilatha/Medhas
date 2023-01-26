/**
 * 
 */
package com.medhas.sanity;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.PendingApprovalsforAppBulk;

/**
 * @author Shashank
 *
 */
public class TestRejectPendingApprovalsforAppBulk extends BaseClass {
	
	@Test(priority = 1)
	public void loginSO() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals",21, 0),
				excel.getStringData("PendingApprovals", 21, 2));
	}
	
	
	@Test(priority = 2)
	public void rejectAccessbySO() throws InterruptedException {
		PendingApprovalsforAppBulk accessrequestpending = PageFactory.initElements(driver,
				PendingApprovalsforAppBulk.class);
		accessrequestpending.rejectflowaccesswithSO(excel.getStringData("PendingApprovals", 21, 0),
				excel.getStringData("PendingApprovals", 21, 2));

	}
	
	@Test(priority = 3)
	public void BulkDeactivationRequestRejected() throws InterruptedException {
		PendingApprovalsforAppBulk accessrequestpending = PageFactory.initElements(driver,
				PendingApprovalsforAppBulk.class);
		accessrequestpending.rejectToastMsg();
	}

}
