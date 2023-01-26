package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.InventoryTemplateDesktoplaptopApplicationcreation;
import com.medhas.regression.Loginpage;

public class TestInventoryTemplateDesktoplaptopApplicationcreation extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 8, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void inventorytemplateforapplication() throws InterruptedException {
		InventoryTemplateDesktoplaptopApplicationcreation InventoryDesktoplaptopApplicationcreation = PageFactory
				.initElements(driver, InventoryTemplateDesktoplaptopApplicationcreation.class);
		InventoryDesktoplaptopApplicationcreation.inventorytemplateforapplication(
				excel.getStringData("Inventory Template", 7, 0), excel.getStringData("Inventory Template", 7, 2));
	}

	@Test(priority = 3)
	public void basicdetails() throws InterruptedException {
		InventoryTemplateDesktoplaptopApplicationcreation InventoryDesktoplaptopApplicationcreation = PageFactory
				.initElements(driver, InventoryTemplateDesktoplaptopApplicationcreation.class);
		InventoryDesktoplaptopApplicationcreation.basicdetails();
	}

	@Test(priority = 4)
	public void OtherDetailsforapplication() throws InterruptedException {
		InventoryTemplateDesktoplaptopApplicationcreation InventoryDesktoplaptopApplicationcreation = PageFactory
				.initElements(driver, InventoryTemplateDesktoplaptopApplicationcreation.class);
		InventoryDesktoplaptopApplicationcreation.OtherDetails();
	}

	@Test(priority = 5)
	public void Configurationforapplication() throws InterruptedException {
		InventoryTemplateDesktoplaptopApplicationcreation InventoryDesktoplaptopApplicationcreation = PageFactory
				.initElements(driver, InventoryTemplateDesktoplaptopApplicationcreation.class);
		InventoryDesktoplaptopApplicationcreation.Configuration();
	}

	@Test(priority = 6)
	public void MonitorDetailsforapplication() throws InterruptedException {
		InventoryTemplateDesktoplaptopApplicationcreation InventoryDesktoplaptopApplicationcreation = PageFactory
				.initElements(driver, InventoryTemplateDesktoplaptopApplicationcreation.class);
		InventoryDesktoplaptopApplicationcreation.MonitorDetails();
	}

	@Test(priority = 7)
	public void WarrantyAMCDetailsforapplication() throws InterruptedException {
		InventoryTemplateDesktoplaptopApplicationcreation InventoryDesktoplaptopApplicationcreation = PageFactory
				.initElements(driver, InventoryTemplateDesktoplaptopApplicationcreation.class);
		InventoryDesktoplaptopApplicationcreation.WarrantyAMCDetails();
	}

	@Test(priority = 8)
	public void QualificationDetailsforapplication() throws InterruptedException {
		InventoryTemplateDesktoplaptopApplicationcreation InventoryDesktoplaptopApplicationcreation = PageFactory
				.initElements(driver, InventoryTemplateDesktoplaptopApplicationcreation.class);
		InventoryDesktoplaptopApplicationcreation.QualificationDetails();
	}

	@Test(priority = 9)
	public void Acknowledgementforapplication() throws InterruptedException {
		InventoryTemplateDesktoplaptopApplicationcreation InventoryDesktoplaptopApplicationcreation = PageFactory
				.initElements(driver, InventoryTemplateDesktoplaptopApplicationcreation.class);
		InventoryDesktoplaptopApplicationcreation.Acknowledgement(excel.getStringData("Login", 8, 0),
				excel.getStringData("Login", 1, 2));
	}
}