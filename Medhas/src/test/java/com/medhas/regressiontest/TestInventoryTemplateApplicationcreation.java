package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.InventoryTemplateApplicationcreation;
import com.medhas.regression.Loginpage;

public class TestInventoryTemplateApplicationcreation extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 11, 0), excel.getStringData("Login", 11, 2));

	}

	@Test(priority = 2)
	public void inventorytemplateforapplicationforapplication() throws InterruptedException {
		InventoryTemplateApplicationcreation InventoryTemplateApplicationcreation = PageFactory.initElements(driver,
				InventoryTemplateApplicationcreation.class);
		InventoryTemplateApplicationcreation.inventorytemplateforapplication(
				excel.getStringData("Inventory Template", 1, 0), excel.getStringData("Inventory Template", 1, 2));
	}

	@Test(priority = 3)
	public void basicdetailsforapplication() throws InterruptedException {
		InventoryTemplateApplicationcreation InventoryTemplateApplicationcreation = PageFactory.initElements(driver,
				InventoryTemplateApplicationcreation.class);
		InventoryTemplateApplicationcreation.basicdetails();
	}

	@Test(priority = 4)
	public void BackuporRecovery() throws InterruptedException {
		InventoryTemplateApplicationcreation InventoryTemplateApplicationcreation = PageFactory.initElements(driver,
				InventoryTemplateApplicationcreation.class);
		InventoryTemplateApplicationcreation.BackuporRecovery();
	}

	@Test(priority = 5)
	public void VendorDetailsforapplication() throws InterruptedException {
		InventoryTemplateApplicationcreation InventoryTemplateApplicationcreation = PageFactory.initElements(driver,
				InventoryTemplateApplicationcreation.class);
		InventoryTemplateApplicationcreation.VendorDetails();
	}

	@Test(priority = 6)
	public void OtherDetailsforapplication() throws InterruptedException {
		InventoryTemplateApplicationcreation InventoryTemplateApplicationcreation = PageFactory.initElements(driver,
				InventoryTemplateApplicationcreation.class);
		InventoryTemplateApplicationcreation.OtherDetails();
	}

	@Test(priority = 7)
	public void Acknowledgementforapplication() throws InterruptedException {
		InventoryTemplateApplicationcreation InventoryTemplateApplicationcreation = PageFactory.initElements(driver,
				InventoryTemplateApplicationcreation.class);
		InventoryTemplateApplicationcreation.Acknowledgement(excel.getStringData("Login", 11, 0),
				excel.getStringData("Login", 11, 2));
	}
}