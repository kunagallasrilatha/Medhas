/**
 * 
 */
package com.medhas.regressiontest;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.CreateInventoryforNetwork;
import com.medhas.regression.Loginpage;



/**
 * @author Shashank
 *
 */
public class TestinventoryforNetwork extends BaseClass {
	
	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 5, 0), excel.getStringData("Login", 5, 2));
		

	}
	
	
	
	@Test(priority=2)
	public void enterbasicdetailsnetwork() throws InterruptedException {
		CreateInventoryforNetwork createinvefornetwork = PageFactory.initElements(driver, CreateInventoryforNetwork.class);
		createinvefornetwork.enterbasicdetails(excel.getStringData("create inventory for Network", 1, 0), excel.getStringData("create inventory for Network", 1, 1), excel.getStringData("create inventory for Network", 1, 2), excel.getStringData("create inventory for Network", 1, 3),
				excel.getStringData("create inventory for Network", 1, 4), excel.getStringData("create inventory for Network", 1, 5), excel.getStringData("create inventory for Network", 1, 6), excel.getStringData("create inventory for Network", 1, 7), excel.getStringData("create inventory for Network", 1, 8), excel.getStringData("create inventory for Network", 1, 9), excel.getStringData("create inventory for Network", 1, 10), excel.getStringData("create inventory for Network", 1, 11), excel.getStringData("create inventory for Network", 1, 12));
	}
	
	
	@Test(priority=3)
	public void enterwarrantydetailsnetwork() throws InterruptedException {
		CreateInventoryforNetwork createinvefornetwork = PageFactory.initElements(driver, CreateInventoryforNetwork.class);
		createinvefornetwork.enterwarrantydetails(excel.getStringData("create inventory for Network", 1, 13), excel.getStringData("create inventory for Network", 1, 14), excel.getStringData("create inventory for Network", 1, 15), excel.getStringData("create inventory for Network", 1, 16), excel.getStringData("create inventory for Network", 1, 17), excel.getStringData("create inventory for Network", 1, 18), excel.getStringData("create inventory for Network", 1, 19),excel.getStringData("Login", 5, 0), excel.getStringData("Login", 5, 2));
		
	}
	
	@Test(priority = 4)
	public void inventoryRequestCreated() throws InterruptedException {
		CreateInventoryforNetwork createinvefornetwork = PageFactory.initElements(driver, CreateInventoryforNetwork.class);
		createinvefornetwork.Toastmsg();
	}
	
	

}
