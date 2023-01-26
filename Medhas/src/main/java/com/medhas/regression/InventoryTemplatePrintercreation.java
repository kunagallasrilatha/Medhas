package com.medhas.regression;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InventoryTemplatePrintercreation extends BaseClass{
	
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
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Printer Tag/Name')]/../td[2]//div[@class='react-switch']")
	WebElement PrinterTagName;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Make')]/../td[2]//div[@class='react-switch']")
	WebElement Make;
          
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Model')]/../td[2]//div[@class='react-switch']")
	WebElement Model;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Sr.No.')]/../td[2]//div[@class='react-switch']")
	WebElement SrNo;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'MAC Address')]/../td[2]//div[@class='react-switch']")
	WebElement MACAddress;
          
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Department')]/../td[2]//div[@class='react-switch']")
	WebElement Department;
          
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'User Name (for direct attached)')]/../td[2]//div[@class='react-switch']")
	WebElement UserName;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'IP Address (for Network Printer)')]/../td[2]//div[@class='react-switch']")
	WebElement IPAddress;

          
	@FindBy(how = How.XPATH, using = "//span[text()='Other Details']")
	WebElement Otherdetailsexpansion;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Multi Function Enabled (Yes / No)')]/../td[2]//div[@class='react-switch']")
	WebElement MultiFunction;
          
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Included In MPS (Yes / No)')]/../td[2]//div[@class='react-switch']")
	WebElement IncludedinMPS;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Secured / Unsecured')]/../td[2]//div[@class='react-switch']")
	WebElement SecuredUnsecured;
          
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Installation Date')]/../td[2]//div[@class='react-switch']")
	WebElement InstallationDate;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Remarks')]/../td[2]//div[@class='react-switch']")
	WebElement Remarksradio;
	
	
	@FindBy(how = How.XPATH, using = "//span[text()='Purchase Details']")
	WebElement PurchaseDetailsexpansion;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Purchase Date')]/../td[2]//div[@class='react-switch']")
	WebElement PurchaseDate;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'PO No.#')]/../td[2]//div[@class='react-switch']")
	WebElement PONo;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Warranty / AMC Details']")
	WebElement WarrantyAMCDetailsexpansion;
	

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
   
        	

    public void inventorytemplateforprinter(String Catetype,String TempName) throws InterruptedException{
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
    	 PrinterTagName.click();
    	 Make.click();
    	 Model.click();
    	 SrNo.click();
    	 MACAddress.click();
    	 Department.click();
    	 UserName.click();
    	 IPAddress.click();
    }
    public void OtherDetails() throws InterruptedException{
    	Thread.sleep(1500);
    	Otherdetailsexpansion.click();
    	 Thread.sleep(1500);
    	 MultiFunction.click();
    	 IncludedinMPS.click();
    	 SecuredUnsecured.click();
    	 InstallationDate.click();
    	 Remarksradio.click();
    }
	
    public void PurchaseDetails() throws InterruptedException{
    	Thread.sleep(1500);
    	PurchaseDetailsexpansion.click();
    	 Thread.sleep(1500);
    	 PurchaseDate.click();
    	 PONo.click();
    }
	
    public void WarrantyAMCDetails() throws InterruptedException{
    	Thread.sleep(1500);
    	WarrantyAMCDetailsexpansion.click();
    	 Thread.sleep(1500);
    	 UnderWarranty.click();
    	 StartDate.click();
    	 ExpiryDate.click();
    	 SLA.click();
    	 Vendor.click();
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


