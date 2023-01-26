/**
 * 
 */
package com.medhas.regressiontest;

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
	public void loginwithSystemOwner() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("PendingApprovals", 3, 0),
				excel.getStringData("PendingApprovals", 3, 2));

	}

	@Test(priority = 2)
	public void useraccessreviewapproval() throws InterruptedException {
		UserAccessReviewPendingApprovals accessreivewapproval = PageFactory.initElements(driver,
				UserAccessReviewPendingApprovals.class);

		accessreivewapproval.selectUserAccessReviewforApproval(excel.getStringData("PendingApprovals", 3, 0),
				excel.getStringData("PendingApprovals", 3, 2));

	}

}
