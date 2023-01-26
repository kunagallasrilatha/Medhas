/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.InventoryTemplateforFileserver;
import com.medhas.regression.Loginpage;

/**
 * @author Shashank
 *
 */
public class TestInventoryTemplateforFileserver extends BaseClass {
	
	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 11, 0), excel.getStringData("Login", 11, 2));

	}
	
	@Test(priority=2)
	public void templatedetails() throws InterruptedException {
		InventoryTemplateforFileserver invtempfileserver =  PageFactory.initElements(driver, InventoryTemplateforFileserver.class);
		
		invtempfileserver.entertemplatedetails(excel.getStringData("Inventory Template", 2, 0), excel.getStringData("Inventory Template", 2, 2));
	}
	
	@Test(priority=3)
	public void otherdetails() throws InterruptedException {
	InventoryTemplateforFileserver invtempfileserver =  PageFactory.initElements(driver, InventoryTemplateforFileserver.class);
	invtempfileserver.giveotherdetails();
	}
	
	
	
	@Test(priority=4)
	public void save() throws InterruptedException {
		
		InventoryTemplateforFileserver invtempfileserver =  PageFactory.initElements(driver, InventoryTemplateforFileserver.class);
		invtempfileserver.savetemplate(excel.getStringData("Login", 11, 0), excel.getStringData("Login", 11, 2));
	}
	
	


}
