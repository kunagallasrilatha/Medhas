package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.UpdateApplicationInventory;

public class TestUpdateApplicationInventory extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 5, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void Inventoryupdateforapplication() throws InterruptedException {
		UpdateApplicationInventory UpdateAppInv = PageFactory.initElements(driver, UpdateApplicationInventory.class);
		UpdateAppInv.inventorylist(excel.getStringData("UpdateAppInventory", 1, 1));
		UpdateAppInv.updaterequest(excel.getStringData("UpdateAppInventory", 1, 2),
				excel.getStringData("UpdateAppInventory", 1, 3), excel.getStringData("UpdateAppInventory", 1, 4),
				excel.getStringData("UpdateAppInventory", 1, 5));
		UpdateAppInv.Acknowledgement(excel.getStringData("Login", 5, 0), excel.getStringData("Login", 1, 2));
	}
}