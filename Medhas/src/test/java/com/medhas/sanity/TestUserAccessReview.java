/**
 * 
 */
package com.medhas.sanity;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.UserAccessReview;

/**
 * @author Shashank
 *
 */
public class TestUserAccessReview extends BaseClass {

	@Test(priority = 1)
	public void loginwithSystemAdmin() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("User Access Review", 4, 0),
				excel.getStringData("User Access Review", 4, 1));

	}

	@Test(priority = 2)
	public void useraccessreview() throws InterruptedException {
		UserAccessReview accessreivew = PageFactory.initElements(driver, UserAccessReview.class);

		accessreivew.selectUserAccessReview(excel.getStringData("User Access Review", 1, 0),
				excel.getStringData("User Access Review", 1, 1), excel.getStringData("User Access Review", 1, 2),
				excel.getStringData("User Access Review", 4, 0),
				excel.getStringData("User Access Review", 4, 1));

	}

}
