package com.medhas.regression;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InventoryTemplateVirtualServercreation extends BaseClass {

	@FindBy(name = "userId")
	WebElement untextfield;

	@FindBy(how = How.NAME, using = "password")
	WebElement pwtextfield;

	@FindBy(how = How.XPATH, using = "//span[@class='p-button-text p-c']")
	WebElement Signinbton;

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

	@FindBy(how = How.XPATH, using = "//span[text()='Configuration']")
	WebElement Configurationexpansion;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'RAM')]/../td[2]//div[@class='react-switch']")
	WebElement RAM;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'HDD')]/../td[2]//div[@class='react-switch']")
	WebElement HDD;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'CPU')]/../td[2]//div[@class='react-switch']")
	WebElement CPU;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'# Of CPU')]/../td[2]//div[@class='react-switch']")
	WebElement OfCPU;

	@FindBy(how = How.XPATH, using = "//span[text()='Base Physical Host']")
	WebElement BasePhysicalHostdetailsexpansion;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Host Name')]/../td[2]//div[@class='react-switch']")
	WebElement HostName;

	@FindBy(how = How.XPATH, using = "(//td[contains(text(),'IP Address')]/../td[2]//div[@class='react-switch'])[2]")
	WebElement IPAddress;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Hypervisor (Make & Version)')]/../td[2]//div[@class='react-switch']")
	WebElement Hypervisor;

	@FindBy(how = How.XPATH, using = "//span[text()='Other Details']")
	WebElement OtherDetailsexpansion;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'OS Version')]/../td[2]//div[@class='react-switch']")
	WebElement OSVersion;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Application')]/../td[2]//div[@class='react-switch']")
	WebElement Application;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Application Owner (Name)')]/../td[2]//div[@class='react-switch']")
	WebElement ApplicationOwnerName;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Server Role')]/../td[2]//div[@class='react-switch']")
	WebElement ServerRole;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Roles')]/../td[2]//div[@class='react-switch']")
	WebElement Roles;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Remarks')]/../td[2]//div[@class='react-switch']")
	WebElement Remarksradio;

	@FindBy(how = How.XPATH, using = "//span[text()='Qualification Details']")
	WebElement QualificationDetailsexpansion;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'cGxP (Yes / No)')]/../td[2]//div[@class='react-switch']")
	WebElement cGxP;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Qualified (Yes / No)')]/../td[2]//div[@class='react-switch']")
	WebElement Qualified;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Qualification Report #')]/../td[2]//div[@class='react-switch']")
	WebElement QualificationReport;

	@FindBy(how = How.XPATH, using = "//textarea[@name='Remarks']")
	WebElement Remarks;

	@FindBy(how = How.XPATH, using = "(//input[@name='username'])[1]")
	WebElement Acknowledgeusername;

	@FindBy(how = How.XPATH, using = "(//input[@name='password'])[1]")
	WebElement Acknowledgepassword;

	@FindBy(how = How.XPATH, using = "(//span[text()='Accept'])[1]")
	WebElement Acceptbutton;

	public void inventorytemplateforvirtualserver(String Catetype, String TempName) throws InterruptedException {
		Thread.sleep(3500);
		Administrationexpansion.click();
		Thread.sleep(1500);
		InventoryTemplatelink.click();
		Thread.sleep(3000);
		Createnewbtn.click();
		Thread.sleep(2000);
		Categorydropdown.sendKeys(Catetype);
		Thread.sleep(2000);
		Categorydropdown.sendKeys(Keys.ARROW_DOWN);
		Categorydropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2500);
		TemplateNametextfeild.sendKeys(TempName);
		Thread.sleep(2000);
	}

	public void Configurationdetails() throws InterruptedException {
		Thread.sleep(1500);
		Configurationexpansion.click();
		Thread.sleep(1500);
		RAM.click();
		HDD.click();
		CPU.click();
		OfCPU.click();
	}

	public void BasePhysicalHostdetails() throws InterruptedException {
		Thread.sleep(1500);
		BasePhysicalHostdetailsexpansion.click();
		Thread.sleep(1500);
		Hypervisor.click();
	}

	public void OtherDetails() throws InterruptedException {
		Thread.sleep(1500);
		OtherDetailsexpansion.click();
		Thread.sleep(1500);
		OSVersion.click();
		Application.click();
		ApplicationOwnerName.click();
		ServerRole.click();
		Roles.click();
		Remarksradio.click();
	}

	public void QualificationDetails() throws InterruptedException {
		Thread.sleep(1500);
		QualificationDetailsexpansion.click();
		Thread.sleep(1500);
		cGxP.click();
		Qualified.click();
		QualificationReport.click();

	}
}
