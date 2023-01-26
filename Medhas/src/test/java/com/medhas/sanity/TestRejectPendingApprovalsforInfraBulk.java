/**
 * 
 */
package com.medhas.sanity;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.PendingApprovalsforInfraBulk;

/**
 * @author Shashank
 *
 */
public class TestRejectPendingApprovalsforInfraBulk extends BaseClass {
	
	@Test(priority = 1)
	public void loginLITHead() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals",21, 0),
				excel.getStringData("PendingApprovals", 21, 2));
	}
	
	
	@Test(priority = 2)
	public void rejectAccessbyLITHead() throws InterruptedException {
		PendingApprovalsforInfraBulk accessrequestpendinginfra = PageFactory.initElements(driver,
				PendingApprovalsforInfraBulk.class);
		accessrequestpendinginfra.rejectflowaccesswithLITHead(excel.getStringData("PendingApprovals", 21, 0),
				excel.getStringData("PendingApprovals", 21, 2));

	}
	
	@Test(priority = 3)
	public void BulkDeactivationRequestRejected() throws InterruptedException {
		PendingApprovalsforInfraBulk accessrequestpendinginfra = PageFactory.initElements(driver,
				PendingApprovalsforInfraBulk.class);
		accessrequestpendinginfra.rejectToastMsg();
	}

}
