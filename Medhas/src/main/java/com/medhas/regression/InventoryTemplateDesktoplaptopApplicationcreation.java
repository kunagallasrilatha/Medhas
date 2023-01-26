package com.medhas.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class InventoryTemplateDesktoplaptopApplicationcreation extends BaseClass{
	
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
    
	@FindBy(how = How.XPATH, using = "//span[text()='Basic Details']")
	WebElement Basicdetailsexpansion;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Users WorkPlace')]/../td[2]//div[@class='react-switch']")
	WebElement UsersWorkPlace;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Department')]/../td[2]//div[@class='react-switch']")
	WebElement Department;
          
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'User Name')]/../td[2]//div[@class='react-switch']")
	WebElement UserName;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Host Name')]/../td[2]//div[@class='react-switch']")
	WebElement HostName;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Type(Networked PC / Instrument Connected / Standalone Workstation)')]/../td[2]//div[@class='react-switch']")
	WebElement Type;
          
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Model Type')]/../td[2]//div[@class='react-switch']")
	WebElement ModelType;
          
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Model Series')]/../td[2]//div[@class='react-switch']")
	WebElement ModelSeries;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Serial No.')]/../td[2]//div[@class='react-switch']")
	WebElement SerialNo;
          
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Computer Type')]/../td[2]//div[@class='react-switch']")
	WebElement ComputerType;
          
	@FindBy(how = How.XPATH, using = "//span[text()='Other Details']")
	WebElement OtherDetailsexpansion;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Issuance Date')]/../td[2]//div[@class='react-switch']")
	WebElement IssuanceDate;
          
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Gate Pass #')]/../td[2]//div[@class='react-switch']")
	WebElement GatePass;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Software Name')]/../td[2]//div[@class='react-switch']")
	WebElement SoftwareName;
          
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Roles')]/../td[2]//div[@class='react-switch']")
	WebElement Roles;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Remarks')]/../td[2]//div[@class='react-switch']")
	WebElement Remarksradio;
	
	
	@FindBy(how = How.XPATH, using = "//span[text()='Configuration Details']")
	WebElement ConfigurationDetailsexpansion;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'CPU')]/../td[2]//div[@class='react-switch']")
	WebElement CPU;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'CPU Speed')]/../td[2]//div[@class='react-switch']")
	WebElement CPUSpeed;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'HDD')]/../td[2]//div[@class='react-switch']")
	WebElement HDD;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'RAM')]/../td[2]//div[@class='react-switch']")
	WebElement RAM;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'CD ROM')]/../td[2]//div[@class='react-switch']")
	WebElement CDROM;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'CD Writer')]/../td[2]//div[@class='react-switch']")
	WebElement CDWriter;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'OS Version')]/../td[2]//div[@class='react-switch']")
	WebElement OSVersion;
	
	
	@FindBy(how = How.XPATH, using = "//span[text()='Monitor Details']")
	WebElement MonitorDetailssexpansion;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Make')]/../td[2]//div[@class='react-switch']")
	WebElement Make;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Sr. No.')]/../td[2]//div[@class='react-switch']")
	WebElement SrNo;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Warranty / AMC Details']")
	WebElement WarrantyAMCDetailssexpansion;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Under (Warranty or AMC)')]/../td[2]//div[@class='react-switch']")
	WebElement UnderWarranty;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Start Date')]/../td[2]//div[@class='react-switch']")
	WebElement StartDate;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Expiry Date')]/../td[2]//div[@class='react-switch']")
	WebElement ExpiryDate;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'SLA')]/../td[2]//div[@class='react-switch']")
	WebElement SLA;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Vendor')]/../td[2]//div[@class='react-switch']")
	WebElement Vendor;
	
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
            
            @FindBy(how = How.XPATH, using = "//span[text()='Save']")
        	WebElement savebutton;
            
        	@FindBy(how = How.XPATH, using = "(//input[@name='username'])[1]")
        	WebElement Acknowledgeusername;
        	
        	@FindBy(how = How.XPATH, using = "(//input[@name='password'])[1]")
        	WebElement Acknowledgepassword;
        	
        	@FindBy(how = How.XPATH, using = "(//span[text()='Accept'])[1]")
        	WebElement Acceptbutton;

@FindBy(xpath = "//div[contains(text(),'Successfully Modified')]")
public WebElement modifyRequesttoastMessage;
        	

    public void inventorytemplateforapplication(String Catetype,String TempName) throws InterruptedException{
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
    public void basicdetails() throws InterruptedException{
    	Thread.sleep(1500);
    	Basicdetailsexpansion.click();
    	 Thread.sleep(1500);
    	 UsersWorkPlace.click();
    	 Department.click();
    	 UserName.click();
    	 HostName.click();
    	 Type.click();
    	 ModelType.click();
    	 ModelSeries.click();
    	 SerialNo.click();
    	 ComputerType.click();
    }
    public void OtherDetails() throws InterruptedException{
    	Thread.sleep(1500);
    	OtherDetailsexpansion.click();
    	 Thread.sleep(1500);
    	 IssuanceDate.click();
    	 GatePass.click();
    	 SoftwareName.click();
    	 Roles.click();
    	 Remarksradio.click();
    }
  public void Configuration() throws InterruptedException{
    	Thread.sleep(1500);
    	ConfigurationDetailsexpansion.click();
    	 Thread.sleep(1500);
    	 CPU.click();
    	 HDD.click();
    	 RAM.click();
    	 CDROM.click();
    	 CDWriter.click();
    	 OSVersion.click();
    }
    public void MonitorDetails() throws InterruptedException{
    	Thread.sleep(1500);
    	 MonitorDetailssexpansion.click();
    	 Thread.sleep(1500);
    	 Make.click();
    	 SrNo.click();
    } 
    public void Toastmsg() throws InterruptedException {

    	Thread.sleep(4000);

    	if (modifyRequesttoastMessage.isDisplayed()) {

    	String expectedMessage = "Successfully Modified";
    	String message = driver.findElement(By.xpath("//div[contains(text(),'Successfully Modified')]")).getText();
    	System.out.println(modifyRequesttoastMessage.getText());
    	Assert.assertEquals("Successfully Created", expectedMessage);

    	System.out.println(message);
    	System.out.println(expectedMessage + "Pass");
    	} else {
    	System.out.println("Failed");
    	}

    	}	 
    public void WarrantyAMCDetails() throws InterruptedException{
    	Thread.sleep(1500);
    	WarrantyAMCDetailssexpansion.click();
    	 Thread.sleep(1500);
    	 UnderWarranty.click();
    	 StartDate.click();	 
    	 ExpiryDate.click();
    	 SLA.click();
    	 Vendor.click();
    }
    public void QualificationDetails() throws InterruptedException{
    	Thread.sleep(1500);
    	QualificationDetailsexpansion.click();
    	 Thread.sleep(1500);
    	 cGxP.click();
    	 Qualified.click();	 
    	 QualificationReport.click();
    }
    public void Acknowledgement(String uid,String pass) throws InterruptedException{
   	 Thread.sleep(1500);
   	savebutton.click();
    Thread.sleep(1500);
   	 Acknowledgeusername.sendKeys(uid);
    Acknowledgepassword.sendKeys(pass);
    Acceptbutton.click();
   	 Thread.sleep(2000);
   } 
}


