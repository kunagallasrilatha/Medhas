/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Createinventoryforprinter;
import com.medhas.regression.Loginpage;


/**
 * @author Shashank
 *
 */
public class TestcreateinventoryforPrinter extends BaseClass {
	
	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 5, 0), excel.getStringData("Login", 5, 2));

	}
	
	@Test(priority=2)
	public void enterbasicdetails() throws InterruptedException {
		Createinventoryforprinter createinveforprinter = PageFactory.initElements(driver, Createinventoryforprinter.class);
		createinveforprinter.BasicDetails(excel.getStringData("Create inventory for Printer", 1, 0),excel.getStringData("Create inventory for Printer", 1, 1), excel.getStringData("Create inventory for Printer", 1, 2), excel.getStringData("Create inventory for Printer", 1, 3), excel.getStringData("Create inventory for Printer", 1, 4), excel.getStringData("Create inventory for Printer", 1, 5), excel.getStringData("Create inventory for Printer", 1, 6), excel.getStringData("Create inventory for Printer", 1, 7),excel.getStringData("Create inventory for Printer", 1, 8),
				excel.getStringData("Create inventory for Printer", 1, 9), excel.getStringData("Create inventory for Printer", 1, 10), excel.getStringData("Create inventory for Printer", 1,11), excel.getStringData("Create inventory for Printer", 1, 12), excel.getStringData("Create inventory for Printer", 1, 13));
		
	}
	
	
	@Test(priority=3)
	public void enterWarrantydetails() throws InterruptedException {
		Createinventoryforprinter createinveforprinter = PageFactory.initElements(driver, Createinventoryforprinter.class);
		createinveforprinter.warrantydetils(excel.getStringData("Create inventory for Printer", 1, 14),excel.getStringData("Create inventory for Printer", 1, 15), excel.getStringData("Create inventory for Printer", 1, 16), excel.getStringData("Create inventory for Printer", 1, 17),excel.getStringData("Create inventory for Printer", 1, 18),excel.getStringData("Login", 5, 0), excel.getStringData("Login", 5, 2));
		
	}
	
	/*@Test(priority=4)
	public void requestidcapture() {
		Createinventoryforprinter createinveforprinter = PageFactory.initElements(driver, Createinventoryforprinter.class);
		createinveforprinter.getRequestId();
		
		
	}*/
	

}
