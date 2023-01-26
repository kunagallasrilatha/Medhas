/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.PendingApprovalsforInfraBulk;

/**
 * @author Shashank
 *
 */
public class TestnotGrantPendingApprovalsforInfraBulk extends BaseClass{
	
	@Test(priority = 1)
	public void loginLITHead() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals", 22, 0),
				excel.getStringData("PendingApprovals", 22, 2));
	}
	
	@Test(priority = 2)
	public void approvalworkflowforaccessrequestLITHead() throws InterruptedException {
		PendingApprovalsforInfraBulk accessrequestpendinginfra = PageFactory.initElements(driver,
				PendingApprovalsforInfraBulk.class);
		accessrequestpendinginfra.approvalworkflowaccessLITHead(excel.getStringData("PendingApprovals", 22, 0),
				excel.getStringData("PendingApprovals", 22, 2));
	}
	
	@Test(priority = 3)
	public void logutfromLIHead() throws InterruptedException {
		PendingApprovalsforInfraBulk accessrequestpendinginfra = PageFactory.initElements(driver,
				PendingApprovalsforInfraBulk.class);
		accessrequestpendinginfra.logout();
	}
	
	@Test(priority = 7)
	public void checkvalidLIT() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals", 20, 0),
				excel.getStringData("PendingApprovals", 20, 2));
	}

	@Test(priority = 8)
	public void notGrantybyLIT() throws InterruptedException {
		PendingApprovalsforInfraBulk accessrequestpendinginfra = PageFactory.initElements(driver,
				PendingApprovalsforInfraBulk.class);
		accessrequestpendinginfra.notGrantflowaccesswithLIT(excel.getStringData("PendingApprovals", 20, 0),
				excel.getStringData("PendingApprovals", 20, 2));

	}

	@Test(priority = 9)
	public void BulkDeactivationNotGranted() throws InterruptedException {
		PendingApprovalsforInfraBulk accessrequestpendinginfra = PageFactory.initElements(driver,
				PendingApprovalsforInfraBulk.class);
		accessrequestpendinginfra.notgrantToastMsg();
	}

}
