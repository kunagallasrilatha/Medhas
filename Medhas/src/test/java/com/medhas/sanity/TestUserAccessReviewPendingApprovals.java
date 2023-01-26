/**
 * 
 */
package com.medhas.sanity;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.UserAccessReviewPendingApprovals;

/**
 * @author Shashank
 *
 */
public class TestUserAccessReviewPendingApprovals extends BaseClass {

	@Test(priority = 1)
	public void loginSO() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals", 15, 0),
				excel.getStringData("PendingApprovals", 15, 2));
	}

	@Test(priority = 2)
	public void Soflow() throws InterruptedException {
		UserAccessReviewPendingApprovals accessreviewpending = PageFactory.initElements(driver,
				UserAccessReviewPendingApprovals.class);
		accessreviewpending.selectUserAccessReviewforApproval(excel.getStringData("PendingApprovals", 15, 0),
				excel.getStringData("PendingApprovals", 15, 2));

	}

	@Test(priority = 3)
	public void logutfromSO() throws InterruptedException {
		UserAccessReviewPendingApprovals accessreviewpending = PageFactory.initElements(driver,
				UserAccessReviewPendingApprovals.class);
		accessreviewpending.logout();
	}

	@Test(priority = 4)
	public void loginQAlead() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.Login_medhas(excel.getStringData("PendingApprovals", 16, 0),
				excel.getStringData("PendingApprovals", 16, 2));

	}
	
	@Test(priority = 5)
	public void QAleadflow() throws InterruptedException {
		UserAccessReviewPendingApprovals accessreviewpending = PageFactory.initElements(driver,
				UserAccessReviewPendingApprovals.class);
		accessreviewpending.selectUserAccessReviewforApproval(excel.getStringData("PendingApprovals", 16, 0),
				excel.getStringData("PendingApprovals", 16, 2));

	}
	
	@Test(priority = 3)
	public void logutfromQAlead() throws InterruptedException {
		UserAccessReviewPendingApprovals accessreviewpending = PageFactory.initElements(driver,
				UserAccessReviewPendingApprovals.class);
		accessreviewpending.logout();
	}
	
	

}
