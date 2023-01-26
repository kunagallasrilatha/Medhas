/**
 * 
 */
package com.medhas.sanity;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.createInventoryforApplication;

/**
 * @author Shashank
 *
 */
public class TestcreateInventoryforApplication extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 5, 0), excel.getStringData("Login", 5, 2));

	}

	@Test(priority = 2)
	public void basicDetails() throws InterruptedException {

		createInventoryforApplication createinveapp = PageFactory.initElements(driver,
				createInventoryforApplication.class);
		createinveapp.enterbasicdetails(excel.getStringData("CreateInventory for Application", 1, 0),
				excel.getStringData("CreateInventory for Application", 1, 1),
				excel.getStringData("CreateInventory for Application", 1, 2),
				excel.getStringData("CreateInventory for Application", 1, 3),
				excel.getStringData("CreateInventory for Application", 1, 4),
				excel.getStringData("CreateInventory for Application", 1, 5),
				excel.getStringData("CreateInventory for Application", 1, 6),
				excel.getStringData("CreateInventory for Application", 1, 7),
				excel.getStringData("CreateInventory for Application", 1, 8),
				excel.getStringData("CreateInventory for Application", 2, 8),
				excel.getStringData("CreateInventory for Application", 1, 9),
				excel.getStringData("CreateInventory for Application", 1, 10),
				excel.getStringData("CreateInventory for Application", 1, 11),
				excel.getStringData("CreateInventory for Application", 2, 12),
				excel.getStringData("CreateInventory for Application", 1, 12),
				excel.getStringData("CreateInventory for Application", 1, 13),
				excel.getStringData("CreateInventory for Application", 1, 14));
	}

	@Test(priority = 3)
	public void recoverDetails() throws InterruptedException {
		createInventoryforApplication createinveapp = PageFactory.initElements(driver,
				createInventoryforApplication.class);
		createinveapp.enterRecoveryDetails(excel.getStringData("CreateInventory for Application", 1, 15),
				excel.getStringData("CreateInventory for Application", 1, 16),
				excel.getStringData("CreateInventory for Application", 1, 17),
				excel.getStringData("CreateInventory for Application", 1, 18),
				excel.getStringData("CreateInventory for Application", 1, 19),
				excel.getStringData("CreateInventory for Application", 1, 20),
				excel.getStringData("CreateInventory for Application", 1, 21));

	}

	@Test(priority = 4)
	public void approverDetails() throws InterruptedException {
		createInventoryforApplication createinveapp = PageFactory.initElements(driver,
				createInventoryforApplication.class);

		createinveapp.enterApproverDetails(excel.getStringData("CreateInventory for Application", 1, 22),
				excel.getStringData("CreateInventory for Application", 1, 23),
				excel.getStringData("CreateInventory for Application", 1, 24),
				excel.getStringData("CreateInventory for Application", 1, 25),
				excel.getStringData("CreateInventory for Application", 1, 26),
				excel.getStringData("CreateInventory for Application", 1, 27),
				excel.getStringData("CreateInventory for Application", 1, 28),
				excel.getStringData("CreateInventory for Application", 1, 29),
				excel.getStringData("CreateInventory for Application", 1, 30),
				excel.getStringData("CreateInventory for Application", 1, 31), excel.getStringData("Login", 5, 0),
				excel.getStringData("Login", 5, 2));
	}

	@Test(priority = 5)
	public void inventoryRequestCreated() throws InterruptedException {
		createInventoryforApplication createinveapp = PageFactory.initElements(driver,
				createInventoryforApplication.class);
		createinveapp.Toastmsg();
	}

}
