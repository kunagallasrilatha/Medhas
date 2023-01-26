/**
 * 
 */
package com.medhas.sanity;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.SubmitReworkRequest;

/**
 * @author Shashank
 *
 */
public class TestSubmitReworkRequest extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 13, 0), excel.getStringData("Login", 13, 2));

	}

	@Test(priority = 2)
	public void submitReworkRequest() throws InterruptedException {

		SubmitReworkRequest sendbacksubmit = PageFactory.initElements(driver, SubmitReworkRequest.class);
		sendbacksubmit.submitreworkRequest(excel.getStringData("Login", 13,0), excel.getStringData("Login", 13,2));

	}

}
