package com.medhas.sanity;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.ModifyOnbehalfActivedirectoryformultipleleusers;
import com.medhas.regression.ModifySelfApplicationaccessforsingleuser;

/**
 * @author chennoju
 *
 */
public class TestModifySelfApplicationaccessforsingleuser extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 17, 0), excel.getStringData("Login", 17, 2));

	}

	@Test(priority = 2)
	public void enterRequestInfo() throws InterruptedException {
		ModifySelfApplicationaccessforsingleuser SelfModifyapplicationrequestforsingleuser = PageFactory
				.initElements(driver, ModifySelfApplicationaccessforsingleuser.class);

		SelfModifyapplicationrequestforsingleuser.requestInfo(excel.getStringData("AccessreqforApplication", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));

	}

	@Test(priority = 3)
	public void enterUserDetails() throws InterruptedException {
		ModifySelfApplicationaccessforsingleuser SelfModifyapplicationrequestforsingleuser = PageFactory
				.initElements(driver, ModifySelfApplicationaccessforsingleuser.class);
		SelfModifyapplicationrequestforsingleuser.Userdetails(excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8),
				excel.getStringData("UserDetailsforAccessrequest", 1, 2));

	}

	@Test(priority = 4)
	public void modifyApplication() throws InterruptedException {
		ModifySelfApplicationaccessforsingleuser SelfModifyapplicationrequestforsingleuser = PageFactory
				.initElements(driver, ModifySelfApplicationaccessforsingleuser.class);
		SelfModifyapplicationrequestforsingleuser.Applicationdetails(excel.getStringData("Login", 16, 0),
				excel.getStringData("Login", 16, 2));
	}

	@Test(priority = 5)
	public void modifyRequestCreated() throws InterruptedException {
		ModifyOnbehalfActivedirectoryformultipleleusers modifyOnbehalfActivedirectoryformultipleleusers = PageFactory
				.initElements(driver, ModifyOnbehalfActivedirectoryformultipleleusers.class);
		modifyOnbehalfActivedirectoryformultipleleusers.Toastmsg();
	}
}
