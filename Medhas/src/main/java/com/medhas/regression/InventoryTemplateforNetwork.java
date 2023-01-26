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
public class InventoryTemplateforNetwork {

	WebDriver driver;

	public InventoryTemplateforNetwork(WebDriver driver) {
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

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Device Type')]/../td[2]//div[@class='react-switch']")
	WebElement devicetoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Device Description')]/../td[2]//div[@class='react-switch']")
	WebElement devicedestoggle;

	// Other Details
	@FindBy(how = How.XPATH, using = "//span[text()='Other Details']")
	WebElement Otherdetailsexpansion;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Installation Date')]/../td[2]//div[@class='react-switch']")
	WebElement installationtoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Software Name')]/../td[2]//div[@class='react-switch']")
	WebElement softnametoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Roles')]/../td[2]//div[@class='react-switch']")
	WebElement rolestoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Remarks')]/../td[2]//div[@class='react-switch']")
	WebElement remarkstoggle;

	// Purchase Details
	@FindBy(how = How.XPATH, using = "//span[text()='Purchase Details']")
	WebElement Purchasedetailsexpansion;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Purchase Date')]/../td[2]//div[@class='react-switch']")
	WebElement purtoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'PO No.#')]/../td[2]//div[@class='react-switch']")
	WebElement potoggle;

	// warranty Details
	@FindBy(how = How.XPATH, using = "//span[text()='Warranty / AMC Details']")
	WebElement warrantydetailsexpansion;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Under (Warranty or AMC)')]/../td[2]//div[@class='react-switch']")
	WebElement amctoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Start Date')]/../td[2]//div[@class='react-switch']")
	WebElement starttoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Expiry Date')]/../td[2]//div[@class='react-switch']")
	WebElement expirytoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'SLA')]/../td[2]//div[@class='react-switch']")
	WebElement slatoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Vendor')]/../td[2]//div[@class='react-switch']")
	WebElement vendortoggle;

	// Qualification Details
	@FindBy(how = How.XPATH, using = "//span[text()='Qualification Details']")
	WebElement Qualificationdetailsexpansion;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Qualified (Yes / No)')]/../td[2]//div[@class='react-switch']")
	WebElement qualifytoggle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Qualification Report#')]/../td[2]//div[@class='react-switch']")
	WebElement qualifyreporttoggle;

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

		devicetoggle.click();

		devicedestoggle.click();

	}

	public void enterOtherdetails() throws InterruptedException {

		Otherdetailsexpansion.click();
		
		Thread.sleep(2000);
		
		installationtoggle.click();
		
		softnametoggle.click();
		rolestoggle.click();
		remarkstoggle.click();
	}
	
	
	public void enterPurchasedetails() throws InterruptedException {
		
	Purchasedetailsexpansion.click();
	
	Thread.sleep(2000);
	
	purtoggle.click();
	potoggle.click();
	
	}
	
	public void enterWarrantyDetails() throws InterruptedException {
		
		warrantydetailsexpansion.click();
		
		Thread.sleep(2000);
		
		amctoggle.click();
		
		starttoggle.click();
		expirytoggle.click();

		slatoggle.click();
		
		vendortoggle.click();
	}
	
	public void enterQualificationDetails() throws InterruptedException {
		
		Qualificationdetailsexpansion.click();
		
		Thread.sleep(2000);
		
		qualifytoggle.click();
		
		qualifyreporttoggle.click();
		}
	
	public void savetemplate(String eun, String epw) {

		Savebton.click();

		eusername.sendKeys(eun);

		epassword.sendKeys(epw);
		
		eAccept.click();
	}

}
