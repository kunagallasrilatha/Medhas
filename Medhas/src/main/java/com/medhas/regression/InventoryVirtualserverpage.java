package com.medhas.regression;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InventoryVirtualserverpage extends BaseClass {

	@FindBy(name = "userId")
	WebElement untextfield;

	@FindBy(how = How.NAME, using = "password")
	WebElement pwtextfield;

	@FindBy(how = How.XPATH, using = "//span[@class='p-button-text p-c']")
	WebElement Signinbton;

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Inventory'])[2]")
	WebElement Inventoryexpansion;

	@FindBy(how = How.XPATH, using = "//span[text()='Inventory Request']")
	WebElement Inventorylink;

	@FindBy(how = How.XPATH, using = "//input[@name = 'M_Inv_CategoryID']")
	WebElement Categorydropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='Inv_InventoryTemplateID']")
	WebElement Templatedropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='M_LocationId']")
	WebElement Locationdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='cGxP']")
	WebElement cgxp;

	@FindBy(how = How.XPATH, using = "//input[@name='SoftwareName']")
	WebElement SoftwareName;

	@FindBy(how = How.XPATH, using = "//input[@name='S_SystemRoleList']")
	WebElement roles;

	@FindBy(how = How.XPATH, using = "//input[@name='HostName']")
	WebElement HostName;

	@FindBy(how = How.XPATH, using = "//input[@name='Base_Physical_Hypervisor']")
	WebElement hypervisorNametxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name='SerialNo']")
	WebElement SerialNo;

	@FindBy(how = How.XPATH, using = "//input[@name='Make']")
	WebElement Make;

	@FindBy(how = How.XPATH, using = "//input[@name='Model']")
	WebElement Model;

	@FindBy(how = How.XPATH, using = "//input[@name='OsVersion']")
	WebElement OsVersion;

	@FindBy(how = How.XPATH, using = "//input[@name='Application']")
	WebElement Application;

	@FindBy(how = How.XPATH, using = "//input[@name='Application_OwnerName']")
	WebElement OwnerName;

	@FindBy(how = How.XPATH, using = "//input[@name='ServerRole']")
	WebElement ServerRole;

	@FindBy(how = How.XPATH, using = "//input[@name='Environment']")
	WebElement Environment;

	@FindBy(how = How.XPATH, using = "//input[@name='IpAddress']")
	WebElement IpAddress;

	@FindBy(how = How.XPATH, using = "//input[@name='Conf_Ram_MbNo']")
	WebElement ramno;

	@FindBy(how = How.XPATH, using = "//input[@name='Conf_Hdd_GbNo']")
	WebElement hdd;

	@FindBy(how = How.XPATH, using = "//input[@name='Conf_Cpu']")
	WebElement Cpu;

	@FindBy(how = How.XPATH, using = "//input[@name='Conf_NoOfCpu']")
	WebElement OfCpu;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Base_Physical_HostName']")
	WebElement BasephyHostname;
	
	

	// Purchase and warranty
	@FindBy(how = How.XPATH, using = "//input[@name='PoNo']")
	WebElement PoNo;

	@FindBy(how = How.XPATH, using = "//input[@name='Is_Under_Warranty_AMC']")
	WebElement Warranty;

	@FindBy(how = How.XPATH, using = "//input[@name='WA_Sla']")
	WebElement Sla;

	@FindBy(how = How.XPATH, using = "//input[@name='WA_Vendor']")
	WebElement Vendor;

	// Qualification

	@FindBy(how = How.XPATH, using = "//input[@name='Base_Physical_IpAddress']")
	WebElement physicalip;

	@FindBy(how = How.XPATH, using = "//input[@name='IsQualified']")
	WebElement IsQualified;

	@FindBy(how = How.XPATH, using = "//textarea[@name='QualificationReport']")
	WebElement QualificationReport;

	// other details

	@FindBy(how = How.XPATH, using = "//textarea[@name='Remarks']")
	WebElement Remarks;

	@FindBy(how = How.XPATH, using = "//input[@name='AttributeOne']")
	WebElement AttributeOne;

	@FindBy(how = How.XPATH, using = "//span[text()='Cancel']")
	WebElement cancel;

	@FindBy(how = How.XPATH, using = "//span[text()='Save As Draft']")
	WebElement saveasdraft;

	@FindBy(how = How.XPATH, using = "//span[text()='Submit']")
	WebElement submit;

	@FindBy(how = How.XPATH, using = "//input[@name='Base_Physical_Hypervisor']")
	WebElement hypervisor;

	@FindBy(how = How.XPATH, using = "(//input[@name='username'])[1]")
	WebElement Acknowledgeusername;

	@FindBy(how = How.XPATH, using = "(//input[@name='password'])[1]")
	WebElement Acknowledgepassword;

	@FindBy(how = How.XPATH, using = "(//span[text()='Accept'])[1]")
	WebElement Acceptbutton;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public void VirtualserverInventorycreation(String Catetype, String TempName, String Loc, String Cgxp,
			String SoftName, String Role1,String Role2, String Host, String Os, String ApplicationName, String Ownername,
			String Server, String Ip, String ram, String Hdd, String cpu, String noofcpu, String basehostname,
			String Physicalip, String Hypervisor, String Qualified, String Qualification, String remarks,
			String Attributeone, String uid, String pass) throws InterruptedException {
		Thread.sleep(1500);
		Inventoryexpansion.click();
		Thread.sleep(500);
		Inventorylink.click();
		Thread.sleep(2000);
		Categorydropdown.sendKeys(Catetype);
		Thread.sleep(1000);
		Categorydropdown.sendKeys(Keys.ARROW_DOWN);
		Categorydropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Templatedropdown.sendKeys(TempName);
		Thread.sleep(1000);
		Templatedropdown.sendKeys(Keys.ARROW_DOWN);
		Templatedropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Locationdropdown.sendKeys(Loc);
		Thread.sleep(1000);
		Locationdropdown.sendKeys(Keys.ARROW_DOWN);
		Locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		cgxp.sendKeys(Cgxp);
		Thread.sleep(1000);
		cgxp.sendKeys(Keys.ARROW_DOWN);
		cgxp.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		SoftwareName.sendKeys(SoftName);
		roles.sendKeys(Role1);
		roles.sendKeys(Keys.ENTER);
		roles.sendKeys(Role2);
		roles.sendKeys(Keys.ENTER);
		
		HostName.sendKeys(Host);
		OsVersion.sendKeys(Os);
		Application.sendKeys(ApplicationName);
		OwnerName.sendKeys(Ownername);
		ServerRole.sendKeys(Server);
		IpAddress.sendKeys(Ip);
		ramno.sendKeys(ram);
		hdd.sendKeys(Hdd);
		Cpu.sendKeys(cpu);
		OfCpu.sendKeys(noofcpu);
		Thread.sleep(2000);
		BasephyHostname.sendKeys(basehostname);
		hypervisorNametxtfield.sendKeys(Hypervisor);
		Thread.sleep(2000);
		physicalip.sendKeys(Physicalip);
		Thread.sleep(2000);
		hypervisor.sendKeys(Hypervisor);
		Thread.sleep(2000);
		IsQualified.sendKeys(Qualified);
		Thread.sleep(2000);
		IsQualified.sendKeys(Keys.ARROW_DOWN);
		IsQualified.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		QualificationReport.click();
		QualificationReport.sendKeys(Qualification);
		Thread.sleep(2000);
		Remarks.click();
		Remarks.sendKeys(remarks);
		Thread.sleep(2000);
		AttributeOne.click();
		AttributeOne.sendKeys(Attributeone);
		submit.click();
		Thread.sleep(5000);
		Acknowledgeusername.sendKeys(uid);
		Acknowledgepassword.sendKeys(pass);
		Acceptbutton.click();
	}

}
