package com.medhas.regression;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InventoryTemplateApplicationcreation extends BaseClass{
	
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
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'cGxP')]/../td[2]//div[@class='react-switch']")
	WebElement cgxpradio;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Risk Category')]/../td[2]//div[@class='react-switch']")
	WebElement RiskCategoryVersion;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Required Attachment During Access Request')]/../td[2]//div[@class='react-switch']")
	WebElement Attachment;
          
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'System ID')]/../td[2]//div[@class='react-switch']")
	WebElement SystemID;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'System Name')]/../td[2]//div[@class='react-switch']")
	WebElement SystemName;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'System Version')]/../td[2]//div[@class='react-switch']")
	WebElement SystemVersion;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Scope')]/../td[2]//div[@class='react-switch']")
	WebElement Scope;
          
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'System Roles')]/../td[2]//div[@class='react-switch']")
	WebElement SystemRoles;
          
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'System Status')]/../td[2]//div[@class='react-switch']")
	WebElement SystemStatus;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'System Category')]/../td[2]//div[@class='react-switch']")
	WebElement SystemCategory;
          
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Instrument Name')]/../td[2]//div[@class='react-switch']")
	WebElement InstrumentName;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'SOP Number')]/../td[2]//div[@class='react-switch']")
	WebElement SOPNumber;
          
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'System Type')]/../td[2]//div[@class='react-switch']")
	WebElement SystemType;

          
	@FindBy(how = How.XPATH, using = "//span[text()='Backup or Recovery Details']")
	WebElement BackuporRecoverydetailsexpansion;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Backup Status')]/../td[2]//div[@class='react-switch']")
	WebElement BackupStatus;
          
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Backup Restoration Applicability')]/../td[2]//div[@class='react-switch']")
	WebElement BackupRestorationApplicability;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Business Continuity Plan')]/../td[2]//div[@class='react-switch']")
	WebElement BusinessContinuityPlan;
          
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Disaster Recovery Plan')]/../td[2]//div[@class='react-switch']")
	WebElement DisasterRecoveryPlan;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Change Control Number')]/../td[2]//div[@class='react-switch']")
	WebElement ChangeControlNumber;
	
	
	@FindBy(how = How.XPATH, using = "//span[text()='Vendor Details']")
	WebElement VendorDetailsexpansion;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Vendor Name')]/../td[2]//div[@class='react-switch']")
	WebElement VendorName;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Vendor Contact Details')]/../td[2]//div[@class='react-switch']")
	WebElement VendorContactDetails;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Other Details']")
	WebElement OtherDetailsexpansion;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Remarks')]/../td[2]//div[@class='react-switch']")
	WebElement Remarksradio;

	
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
    	 cgxpradio.click();
    	 RiskCategoryVersion.click();
    	 Attachment.click();
    	 SystemID.click();
    	 SystemName.click();
    	 SystemVersion.click();
    	 Scope.click();
    	 SystemRoles.click();
    	 SystemStatus.click();
    	 SystemCategory.click();
    	 InstrumentName.click();
    	 SOPNumber.click();
    	 SystemType.click();
 
    }
    public void BackuporRecovery() throws InterruptedException{
    	Thread.sleep(1500);
    	BackuporRecoverydetailsexpansion.click();
    	 Thread.sleep(1500);
    	 BackupStatus.click();
    	 BackupRestorationApplicability.click();
    	 BusinessContinuityPlan.click();
    	 DisasterRecoveryPlan.click();
    	 ChangeControlNumber.click();
    }
    public void VendorDetails() throws InterruptedException{
    	Thread.sleep(1500);
    	VendorDetailsexpansion.click();
    	 Thread.sleep(1500);
    	 VendorName.click();
    	 VendorContactDetails.click();
    }
    public void OtherDetails() throws InterruptedException{
    	Thread.sleep(1500);
    	OtherDetailsexpansion.click();
    	 Thread.sleep(1500);
    	 Remarksradio.click();

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


