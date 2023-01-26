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
public class InventoryTemplateforStorage {

	WebDriver driver;

	public InventoryTemplateforStorage(WebDriver driver) {
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

	// Basic Details

	@FindBy(how = How.XPATH, using = "//span[text()='Basic Details']")
	WebElement Basicdetailsexpansion;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Serial No.')]/../td[2]//div[@class='react-switch']")
	WebElement serialtoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Make')]/../td[2]//div[@class='react-switch']")
	WebElement maketoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Model')]/../td[2]//div[@class='react-switch']")
	WebElement modeltoggle;

	// Configuration
	@FindBy(how = How.XPATH, using = "//span[text()='Configuration']")
	WebElement Configurationsexpansion;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'RAM (No*MB)')]/../td[2]//div[@class='react-switch']")
	WebElement ramtoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'HDD (GB*No)')]/../td[2]//div[@class='react-switch']")
	WebElement hddtoggle;

	// Other Details
	@FindBy(how = How.XPATH, using = "//span[text()='Other Details']")
	WebElement Otherdetailsexpansion;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'OS Version')]/../td[2]//div[@class='react-switch']")
	WebElement ostoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Environment(Production / Validation / Development)')]/../td[2]//div[@class='react-switch']")
	WebElement envtoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Software Name')]/../td[2]//div[@class='react-switch']")
	WebElement softnametoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Roles')]/../td[2]//div[@class='react-switch']")
	WebElement rolestoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Remarks')]/../td[2]//div[@class='react-switch']")
	WebElement remarktoggle;

	// Purchase Details
	@FindBy(how = How.XPATH, using = "//span[text()='Purchase Details']")
	WebElement Purchasedetailsexpansion;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'PO No.#')]/../td[2]//div[@class='react-switch']")
	WebElement potoggle;

	// Qualification Details
	@FindBy(how = How.XPATH, using = "//span[text()='Qualification Details']")
	WebElement Qualificationdetailsexpansion;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Qualification Report #')]/../td[2]//div[@class='react-switch']")
	WebElement qualifytoggle;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
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

	public void enterBasicdetails() throws InterruptedException {

		Basicdetailsexpansion.click();

		Thread.sleep(2000);

		serialtoggle.click();

		maketoggle.click();

		modeltoggle.click();

	}

	public void enterConfigurationdetails() throws InterruptedException {

		Configurationsexpansion.click();

		Thread.sleep(2000);

		ramtoggle.click();

		hddtoggle.click();
	}

	public void enterOtherdetails() throws InterruptedException {

		Otherdetailsexpansion.click();

		Thread.sleep(2000);

		ostoggle.click();

		envtoggle.click();

		softnametoggle.click();

		rolestoggle.click();

		remarktoggle.click();

	}

	public void enterPurchasedetails() throws InterruptedException {

		Purchasedetailsexpansion.click();

		Thread.sleep(2000);
		potoggle.click();

	}

	public void enterQualificationdetails() throws InterruptedException {

		Qualificationdetailsexpansion.click();

		Thread.sleep(2000);

		qualifytoggle.click();

	}

	public void savetemplate(String eun, String epw) {

		Savebton.click();

		eusername.sendKeys(eun);

		epassword.sendKeys(epw);
		
		eAccept.click();
	}

}
