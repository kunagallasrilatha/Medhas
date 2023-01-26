package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.InventoryVirtualserverpage;
import com.medhas.regression.Loginpage;

public class TestVirtualserverInventorypage extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 5, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void VirtualserverInventorycreation() throws InterruptedException {
		InventoryVirtualserverpage fileserver = PageFactory.initElements(driver, InventoryVirtualserverpage.class);
		fileserver.VirtualserverInventorycreation(excel.getStringData("CreateinventoryforVirtualserver", 1, 0),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 1),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 2),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 3),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 4),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 5),
				excel.getStringData("CreateinventoryforVirtualServer", 2, 5),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 6),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 7),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 8),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 9),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 10),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 11),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 12),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 13),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 14),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 15),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 16),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 17),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 18),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 19),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 20),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 21),
				excel.getStringData("CreateinventoryforVirtualServer", 1, 22), excel.getStringData("Login", 5, 0),
				excel.getStringData("Login", 1, 2));
	}
}
