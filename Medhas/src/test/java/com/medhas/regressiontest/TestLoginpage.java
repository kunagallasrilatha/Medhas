
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;

public class TestLoginpage extends BaseClass {

	@Test(priority = 1)
	public void verifyUserManual() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.usermanual();
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void validations() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.errormessages();
	}

	@Test(priority = 3)
	public void checkinvalidUser() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.invalidUser(excel.getStringData("Login", 2, 0), excel.getStringData("Login", 2, 2));

	}

	
	@Test(priority=4)
	public void checklonguserid() throws InterruptedException {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.longuserid(excel.getStringData("Login", 3, 0), excel.getStringData("Login", 3, 2));
		
	}
	
	
	
	@Test(priority = 5)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

}
