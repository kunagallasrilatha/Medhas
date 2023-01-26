/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.InventoryPendingApprovals;
import com.medhas.regression.Loginpage;


/**
 * @author Shashank
 *
 */
public class TestInventoryforPendingApprovals extends BaseClass {
	
	
	
	@Test(priority = 1)
	public void loginwithQALead() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("PendingApprovals", 2, 0), excel.getStringData("PendingApprovals", 2, 2));
	}
		
		
		
	@Test(priority=2)
	public void approvalflowforinvQALead() throws InterruptedException {
		
		InventoryPendingApprovals invpendingapprovals= PageFactory.initElements(driver, InventoryPendingApprovals.class);
		
		invpendingapprovals.approvalflowinv(excel.getStringData("PendingApprovals", 2, 0), excel.getStringData("PendingApprovals", 2, 2));
	}
		

}
