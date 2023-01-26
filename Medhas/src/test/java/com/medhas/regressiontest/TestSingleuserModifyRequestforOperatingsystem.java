/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.SingleuserModifyRequestforOperatingsystem;

/**
 * @author Shashank
 *
 */
public class TestSingleuserModifyRequestforOperatingsystem extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 5, 0), excel.getStringData("Login", 5, 2));

	}

	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		SingleuserModifyRequestforOperatingsystem singleusermodiforoperatingsystem = PageFactory.initElements(driver,
				SingleuserModifyRequestforOperatingsystem.class);
		singleusermodiforoperatingsystem.requestInf(excel.getStringData("Modify OperatingSystem", 1, 0));
	}

	@Test(priority = 3)
	public void enterUserDetails() throws InterruptedException {
		SingleuserModifyRequestforOperatingsystem singleusermodiforoperatingsystem = PageFactory.initElements(driver,
				SingleuserModifyRequestforOperatingsystem.class);
		singleusermodiforoperatingsystem.userDetails(excel.getStringData("UserDetails for Modify Request", 1, 0),
				excel.getStringData("UserDetails for Modify Request", 1, 1),
				excel.getStringData("UserDetails for Modify Request", 1, 2),
				excel.getStringData("UserDetails for Modify Request", 1, 3),
				excel.getStringData("UserDetails for Modify Request", 1, 4),
				excel.getStringData("UserDetails for Modify Request", 1, 5));
	}

	@Test(priority = 4)
	public void selectthemodifyrequest() throws InterruptedException {
		SingleuserModifyRequestforOperatingsystem singleusermodiforoperatingsystem = PageFactory.initElements(driver,
				SingleuserModifyRequestforOperatingsystem.class);
		singleusermodiforoperatingsystem.selectRequest(excel.getStringData("Modify OperatingSystem", 1, 1),
				excel.getStringData("Modify OperatingSystem", 1, 2), excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2));
	}
	
	@Test(priority = 5)
	public void modifyRequestCreated() throws InterruptedException {
		SingleuserModifyRequestforOperatingsystem singleusermodiforoperatingsystem = PageFactory.initElements(driver,
				SingleuserModifyRequestforOperatingsystem.class);
		singleusermodiforoperatingsystem.Toastmsg();
	}


}
