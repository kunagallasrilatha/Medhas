package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.InventoryTemplatePrintercreation;
import com.medhas.regression.Loginpage;

public class TestInventoryTemplatePrintercreation extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 8, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void inventorytemplateforprinter() throws InterruptedException {
		InventoryTemplatePrintercreation InventoryTemplatePrintercreation = PageFactory.initElements(driver,
				InventoryTemplatePrintercreation.class);
		InventoryTemplatePrintercreation.inventorytemplateforprinter(excel.getStringData("Inventory Template", 6, 0),
				excel.getStringData("Inventory Template", 6, 2));
	}

	@Test(priority = 3)
	public void basicdetails() throws InterruptedException {
		InventoryTemplatePrintercreation InventoryTemplatePrintercreation = PageFactory.initElements(driver,
				InventoryTemplatePrintercreation.class);
		InventoryTemplatePrintercreation.basicdetails();
	}

	@Test(priority = 4)
	public void OtherDetails() throws InterruptedException {
		InventoryTemplatePrintercreation InventoryTemplatePrintercreation = PageFactory.initElements(driver,
				InventoryTemplatePrintercreation.class);
		InventoryTemplatePrintercreation.OtherDetails();
	}

	@Test(priority = 5)
	public void PurchaseDetails() throws InterruptedException {
		InventoryTemplatePrintercreation InventoryTemplatePrintercreation = PageFactory.initElements(driver,
				InventoryTemplatePrintercreation.class);
		InventoryTemplatePrintercreation.PurchaseDetails();
		InventoryTemplatePrintercreation.WarrantyAMCDetails();
		InventoryTemplatePrintercreation.Acknowledgement(excel.getStringData("Login", 8, 0),
				excel.getStringData("Login", 1, 2));
	}

	@Test(priority = 6)
	public void WarrantyAMCDetails() throws InterruptedException {
		InventoryTemplatePrintercreation InventoryTemplatePrintercreation = PageFactory.initElements(driver,
				InventoryTemplatePrintercreation.class);
		InventoryTemplatePrintercreation.WarrantyAMCDetails();
		InventoryTemplatePrintercreation.Acknowledgement(excel.getStringData("Login", 8, 0),
				excel.getStringData("Login", 1, 2));
	}

	@Test(priority = 7)
	public void Acknowledgement() throws InterruptedException {
		InventoryTemplatePrintercreation InventoryTemplatePrintercreation = PageFactory.initElements(driver,
				InventoryTemplatePrintercreation.class);
		InventoryTemplatePrintercreation.Acknowledgement(excel.getStringData("Login", 8, 0),
				excel.getStringData("Login", 1, 2));
	}
}