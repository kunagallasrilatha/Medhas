package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Inventorylaptopdesktopcreation;
import com.medhas.regression.Loginpage;

public class Testlaptopdesktopcreation extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 5, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void Laptopdesktop() throws InterruptedException {
		Inventorylaptopdesktopcreation fileserver = PageFactory.initElements(driver,
				Inventorylaptopdesktopcreation.class);
		fileserver.LaptopdesktopInventorycreation(excel.getStringData("CreateinventoryforLaptop", 1, 0),
				excel.getStringData("CreateinventoryforLaptop", 1, 1),
				excel.getStringData("CreateinventoryforLaptop", 1, 2),
				excel.getStringData("CreateinventoryforLaptop", 1, 3),
				excel.getStringData("CreateinventoryforLaptop", 1, 4),
				excel.getStringData("CreateinventoryforLaptop", 1, 5),
				excel.getStringData("CreateinventoryforLaptop", 1, 6),
				excel.getStringData("CreateinventoryforLaptop", 1, 7),
				excel.getStringData("CreateinventoryforLaptop", 1, 8),
				excel.getStringData("CreateinventoryforLaptop", 1, 9),
				excel.getStringData("CreateinventoryforLaptop", 1, 10),
				excel.getStringData("CreateinventoryforLaptop", 1, 11),
				excel.getStringData("CreateinventoryforLaptop", 1, 12),
				excel.getStringData("CreateinventoryforLaptop", 1, 13),
				excel.getStringData("CreateinventoryforLaptop", 1, 14),
				excel.getStringData("CreateinventoryforLaptop", 1, 15),
				excel.getStringData("CreateinventoryforLaptop", 1, 16),
				excel.getStringData("CreateinventoryforLaptop", 1, 17),
				excel.getStringData("CreateinventoryforLaptop", 1, 18),
				excel.getStringData("CreateinventoryforLaptop", 1, 19),
				excel.getStringData("CreateinventoryforLaptop", 1, 20),
				excel.getStringData("CreateinventoryforLaptop", 1, 21),
				excel.getStringData("CreateinventoryforLaptop", 1, 22),
				excel.getStringData("CreateinventoryforLaptop", 1, 23),
				excel.getStringData("CreateinventoryforLaptop", 1, 24),
				excel.getStringData("CreateinventoryforLaptop", 1, 25),
				excel.getStringData("CreateinventoryforLaptop", 1, 26),
				excel.getStringData("CreateinventoryforLaptop", 1, 27),
				excel.getStringData("CreateinventoryforLaptop", 1, 28),
				excel.getStringData("CreateinventoryforLaptop", 1, 29),
				excel.getStringData("CreateinventoryforLaptop", 1, 30),
				excel.getStringData("CreateinventoryforLaptop", 1, 31),
				excel.getStringData("CreateinventoryforLaptop", 1, 32),
				excel.getStringData("CreateinventoryforLaptop", 1, 33),
				excel.getStringData("CreateinventoryforLaptop", 1, 34),
				excel.getStringData("CreateinventoryforLaptop", 1, 35),
				excel.getStringData("CreateinventoryforLaptop", 1, 36), excel.getStringData("Login", 5, 0),
				excel.getStringData("Login", 1, 2));
	}
}