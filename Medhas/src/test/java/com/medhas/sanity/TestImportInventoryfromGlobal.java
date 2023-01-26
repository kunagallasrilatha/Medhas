/**
 * 
 */
package com.medhas.sanity;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.ImportInventoryfromGlobal;
import com.medhas.regression.Loginpage;



/**
 * @author Shashank
 *
 */
public class TestImportInventoryfromGlobal extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 11, 0), excel.getStringData("Login", 11, 2));

	}

	@Test(priority = 2)
	public void importinvenfromglobal() throws InterruptedException {
		ImportInventoryfromGlobal importglobal = PageFactory.initElements(driver, ImportInventoryfromGlobal.class);
		importglobal.importglobal(excel.getStringData("Import from Global", 1, 0),
				excel.getStringData("Import from Global", 1, 2), excel.getStringData("Login", 11, 0),
				excel.getStringData("Login", 11, 2));
	}
	
	@Test(priority = 3)
	public void inventoryRequestImportedtosite() throws InterruptedException {
		ImportInventoryfromGlobal importglobal = PageFactory.initElements(driver, ImportInventoryfromGlobal.class);
		importglobal.Toastmsg();
	}

}
