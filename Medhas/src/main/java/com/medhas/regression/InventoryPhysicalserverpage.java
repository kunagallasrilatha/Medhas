package com.medhas.regression;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InventoryPhysicalserverpage extends BaseClass{
	
	
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
            
            //Purchase and warranty
            @FindBy(how = How.XPATH, using = "//input[@name='PoNo']")
         	WebElement PoNo;
            
            @FindBy(how = How.XPATH, using = "//input[@name='Is_Under_Warranty_AMC']")
         	WebElement Warranty;
            
            @FindBy(how = How.XPATH, using = "//input[@name='WA_Sla']")
         	WebElement Sla;
            
            @FindBy(how = How.XPATH, using = "//input[@name='WA_Vendor']")
         	WebElement Vendor;
            
            //Qualification
            
            @FindBy(how = How.XPATH, using = "//input[@name='IsQualified']")
         	WebElement IsQualified;
            
            @FindBy(how = How.XPATH, using = "//input[@name='QualificationReport']")
         	WebElement QualificationReport;
            
           //other details
            
            @FindBy(how = How.XPATH, using = "//input[@name='Remarks']")
         	WebElement Remarks;
            
            @FindBy(how = How.XPATH, using = "//input[@name='AttributeOne']")
         	WebElement AttributeOne;
            
            @FindBy(how = How.XPATH, using = "//span[text()='Cancel']")
         	WebElement cancel;
            
            @FindBy(how = How.XPATH, using = "//span[text()='Save As Draft']")
         	WebElement saveasdraft;
            
            @FindBy(how = How.XPATH, using = "//span[text()='Submit']")
         	WebElement submit;
            
    public void PhysicalserverInventorycreation(String Catetype,String TempName,String Loc,String Host) throws InterruptedException{
    	Thread.sleep(1500);
    	Inventoryexpansion.click();
    	 Thread.sleep(500);
    	Inventorylink.click();
    	Thread.sleep(2000);
    	Categorydropdown.sendKeys(Catetype);
    	Thread.sleep(2000);
    	Categorydropdown.sendKeys(Keys.ARROW_DOWN);
    	Categorydropdown.sendKeys(Keys.ENTER);
    	Thread.sleep(2500);
    	Templatedropdown.sendKeys(TempName);
    	Thread.sleep(2000);
    	Templatedropdown.sendKeys(Keys.ARROW_DOWN);
    	Templatedropdown.sendKeys(Keys.ENTER);
    	Thread.sleep(2000);
    	Locationdropdown.sendKeys(Loc);
    	Thread.sleep(2000);
    	Locationdropdown.sendKeys(Keys.ARROW_DOWN);
    	Locationdropdown.sendKeys(Keys.ENTER);
    	Thread.sleep(2000);
    	
    	
    }

}
