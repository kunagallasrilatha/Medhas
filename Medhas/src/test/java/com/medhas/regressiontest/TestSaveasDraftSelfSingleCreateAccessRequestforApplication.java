/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.SaveasDraftSelfSingleCreateAccessRequestforApplication;


/**
 * @author Shashank
 *
 *
 */
public class TestSaveasDraftSelfSingleCreateAccessRequestforApplication extends BaseClass {

	

		@Test(priority = 1)
		public void checkvalidUser() throws InterruptedException {

			Loginpage login = PageFactory.initElements(driver, Loginpage.class);

			login.Login_medhas(excel.getStringData("Login", 13, 0), excel.getStringData("Login", 13, 2));

		}

		@Test(priority = 2)
		public void enterrequestInfo() throws InterruptedException {
			SaveasDraftSelfSingleCreateAccessRequestforApplication DraftRequestforApplication = PageFactory
					.initElements(driver, SaveasDraftSelfSingleCreateAccessRequestforApplication.class);
			DraftRequestforApplication.enterUserDetails(excel.getStringData("AccessreqforApplication", 1, 0),
					excel.getStringData("UserDetailsforAccessrequest", 1, 0),
					excel.getStringData("UserDetailsforAccessrequest", 1, 2),
					excel.getStringData("UserDetailsforAccessrequest", 1, 5),
					excel.getStringData("UserDetailsforAccessrequest", 1, 6),
					excel.getStringData("UserDetailsforAccessrequest", 1, 7),
					excel.getStringData("UserDetailsforAccessrequest", 1, 8));
		}

		@Test(priority = 3)
		public void enterApplicationDetails() throws InterruptedException {
			SaveasDraftSelfSingleCreateAccessRequestforApplication DraftRequestforApplication = PageFactory
					.initElements(driver, SaveasDraftSelfSingleCreateAccessRequestforApplication.class);
			DraftRequestforApplication.selfDraftApplication(excel.getStringData("AccessreqforApplication", 1, 1),
					excel.getStringData("AccessreqforApplication", 1, 2),
					excel.getStringData("AccessreqforApplication", 1, 3),
					excel.getStringData("AccessreqforApplication", 1, 4),
					excel.getStringData("AccessreqforApplication", 1, 5), excel.getStringData("Login", 8, 0),
					excel.getStringData("Login", 8, 2));

		}

		@Test(priority = 5)
		public void draftRequestCreated() throws InterruptedException {
			SaveasDraftSelfSingleCreateAccessRequestforApplication DraftRequestforApplication = PageFactory
					.initElements(driver, SaveasDraftSelfSingleCreateAccessRequestforApplication.class);
			DraftRequestforApplication.Toastmsg();
		}

		@Test(priority = 6)
		public void submitDraftRequest() throws InterruptedException {
			SaveasDraftSelfSingleCreateAccessRequestforApplication DraftRequestforApplication = PageFactory
					.initElements(driver, SaveasDraftSelfSingleCreateAccessRequestforApplication.class);
			DraftRequestforApplication.submitDraftRequest(excel.getStringData("Login", 8, 2));
		}
		
		@Test(priority = 7)
		public void submitteddraftRequest() throws InterruptedException {
			SaveasDraftSelfSingleCreateAccessRequestforApplication DraftRequestforApplication = PageFactory
					.initElements(driver, SaveasDraftSelfSingleCreateAccessRequestforApplication.class);
			DraftRequestforApplication.SubmitdraftToastmsg();
		}
		

	}

