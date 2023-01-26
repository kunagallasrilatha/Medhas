/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.SystemAdminDashboard;

/**
 * @author Shashank
 *
 */
public class TestSystemAdminDashboard extends BaseClass {

	@Test(priority = 1)
	public void checkvalidSAandLIT() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("PendingApprovals", 19, 0),
				excel.getStringData("PendingApprovals", 19, 2));
	}

	@Test(priority = 2)
	public void enterDetails() throws InterruptedException {

		SystemAdminDashboard SADashBoard = PageFactory.initElements(driver, SystemAdminDashboard.class);
		SADashBoard.systemAdminBoard(excel.getStringData("Bulk Deactivation", 1, 0),
				excel.getStringData("Bulk Deactivation", 1, 1), excel.getStringData("Bulk Deactivation", 1, 2));

	}

	@Test(priority = 3)
	public void selectRequest() throws InterruptedException {

		SystemAdminDashboard SADashBoard = PageFactory.initElements(driver, SystemAdminDashboard.class);
		SADashBoard.selectcheckBox(excel.getStringData("PendingApprovals", 19, 0),
				excel.getStringData("PendingApprovals", 19, 2));

	}
	
	@Test(priority = 4)
	public void bulkdeactivationRequestCreated() throws InterruptedException {
		SystemAdminDashboard SADashBoard = PageFactory.initElements(driver, SystemAdminDashboard.class);
		SADashBoard.Toastmsg();
	}
	

}
