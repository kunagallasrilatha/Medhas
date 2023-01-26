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
public class TestSendbackAccessRequestPendingApprovals extends BaseClass {

	
	@Test(priority = 1)
	public void loginHod() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals", 1, 0),
				excel.getStringData("PendingApprovals", 1, 2));
	}
	
	@Test(priority = 2)
	public void sendbackAccessbyHOD() throws InterruptedException {
		ApplicationRequestPendingApprovals accessrequestpending = PageFactory.initElements(driver,
				ApplicationRequestPendingApprovals.class);
		accessrequestpending.sendBackRequestflowaccess(excel.getStringData("PendingApprovals", 1, 0),
				excel.getStringData("PendingApprovals", 1, 2));

	}
	
	@Test(priority = 3)
	public void accessRequestsentback() throws InterruptedException {
		ApplicationRequestPendingApprovals accessrequestpending = PageFactory.initElements(driver,
				ApplicationRequestPendingApprovals.class);
		accessrequestpending.SendbackToastMsg();
	}
	
	
}
