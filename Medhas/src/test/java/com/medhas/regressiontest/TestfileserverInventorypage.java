package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Inventoryfileserverrequestpage;
import com.medhas.regression.Loginpage;

public class TestfileserverInventorypage extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 5, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void draftFileserverInventorycreation() throws InterruptedException {
		Inventoryfileserverrequestpage fileserver = PageFactory.initElements(driver,
				Inventoryfileserverrequestpage.class);
		fileserver.FileserverInventorycreation(excel.getStringData("CreateinventoryforFileServer", 1, 0),
				excel.getStringData("CreateinventoryforFileServer", 1, 1),
				excel.getStringData("CreateinventoryforFileServer", 1, 2),
				excel.getStringData("CreateinventoryforFileServer", 1, 3),
				excel.getStringData("CreateinventoryforFileServer", 1, 4),
				excel.getStringData("CreateinventoryforFileServer", 1, 5), excel.getStringData("Login", 5, 0),
				excel.getStringData("Login", 1, 2));
	}

	@Test(priority = 3)
	public void inventoryRequestCreated() throws InterruptedException {
		Inventoryfileserverrequestpage fileserver = PageFactory.initElements(driver,
				Inventoryfileserverrequestpage.class);
		fileserver.Toastmsg();
	}
}
