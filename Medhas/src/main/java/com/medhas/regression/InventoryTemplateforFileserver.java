/**
 * 
 */
package com.medhas.regression;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Shashank
 *
 */
public class InventoryTemplateforFileserver {

	WebDriver driver;

	public InventoryTemplateforFileserver(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Administration'])[2]")
	WebElement Administrationexpansion;

	@FindBy(how = How.XPATH, using = "//span[text()='Inventory Template']")
	WebElement InventoryTemplatelink;

	@FindBy(how = How.XPATH, using = "//span[text()='Create New']")
	WebElement Createnewbtn;

	@FindBy(how = How.XPATH, using = "//input[@name = 'M_Inv_CategoryID']")
	WebElement Categorydropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='TemplateName']")
	WebElement TemplateNametextfeild;

	@FindBy(how = How.XPATH, using = "//span[text()='Basic Details']")
	WebElement Basicdetailsexpansion;

	@FindBy(how = How.XPATH, using = "//span[text()='Other Details']")
	WebElement Otherdetailsexpansion;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Remarks')]/../td[2]//div[@class='react-switch']")
	WebElement remarkstoggle;

	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	WebElement Savebton;

	// e-Sign
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement eusername;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement epassword;

	@FindBy(how = How.XPATH, using = "//span[text()='Accept']")
	WebElement eAccept;

	public void entertemplatedetails(String cate, String tempname) throws InterruptedException {
		
		Administrationexpansion.click();
		Thread.sleep(2000);
		
		InventoryTemplatelink.click();
		
		Thread.sleep(2000);
		
		Createnewbtn.click();
		
		Thread.sleep(2000);

		Categorydropdown.sendKeys(cate);

		Thread.sleep(2000);

		Categorydropdown.sendKeys(Keys.ARROW_DOWN);
		Categorydropdown.sendKeys(Keys.ENTER);

		TemplateNametextfeild.sendKeys(tempname);

	}

	public void giveotherdetails() throws InterruptedException {

		Otherdetailsexpansion.click();

		Thread.sleep(2000);

		remarkstoggle.click();
	}

	public void savetemplate(String eun, String epw) throws InterruptedException {
		
		

		Savebton.click();
		
	
		
		Thread.sleep(2000);
		

		eusername.sendKeys(eun);

		epassword.sendKeys(epw);
		
		eAccept.click();
	}

}
