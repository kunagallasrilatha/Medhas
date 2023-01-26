package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.InventoryTemplateApplicationcreation;
import com.medhas.regression.InventoryTemplateVirtualServercreation;
import com.medhas.regression.Loginpage;

public class TestInventoryTemplateVirtualServercreation extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 8, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void inventorytemplateforvirtualserver() throws InterruptedException {
		InventoryTemplateVirtualServercreation InventoryTemplateVirtualServercreation = PageFactory.initElements(driver,
				InventoryTemplateVirtualServercreation.class);
		InventoryTemplateVirtualServercreation.inventorytemplateforvirtualserver(
				excel.getStringData("Inventory Template", 8, 0), excel.getStringData("Inventory Template", 8, 2));
	}

	@Test(priority = 3)
	public void Configurationdetails() throws InterruptedException {
		InventoryTemplateVirtualServercreation InventoryTemplateVirtualServercreation = PageFactory.initElements(driver,
				InventoryTemplateVirtualServercreation.class);
		InventoryTemplateVirtualServercreation.Configurationdetails();
	}

	@Test(priority = 4)
	public void BasePhysicalHostdetails() throws InterruptedException {
		InventoryTemplateVirtualServercreation InventoryTemplateVirtualServercreation = PageFactory.initElements(driver,
				InventoryTemplateVirtualServercreation.class);
		InventoryTemplateVirtualServercreation.BasePhysicalHostdetails();

	}

	@Test(priority = 5)
	public void OtherDetails() throws InterruptedException {
		InventoryTemplateVirtualServercreation InventoryTemplateVirtualServercreation = PageFactory.initElements(driver,
				InventoryTemplateVirtualServercreation.class);
		InventoryTemplateVirtualServercreation.OtherDetails();
	}

	@Test(priority = 6)
	public void QualificationDetails() throws InterruptedException {
		InventoryTemplateVirtualServercreation InventoryTemplateVirtualServercreation = PageFactory.initElements(driver,
				InventoryTemplateVirtualServercreation.class);
		InventoryTemplateVirtualServercreation.QualificationDetails();
	}

	@Test(priority = 7)
	public void Inventorytemplateforapplication() throws InterruptedException {
		InventoryTemplateApplicationcreation InventoryTemplateApplicationcreation = PageFactory.initElements(driver,
				InventoryTemplateApplicationcreation.class);
		InventoryTemplateApplicationcreation.Acknowledgement(excel.getStringData("Login", 8, 0),
				excel.getStringData("Login", 1, 2));

	}
}