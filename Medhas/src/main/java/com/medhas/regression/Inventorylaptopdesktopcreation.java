
package com.medhas.regression;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Inventorylaptopdesktopcreation extends BaseClass{
	

	
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
        
        @FindBy(how = How.XPATH, using = "//input[@name='Monitor_Make']")
     	WebElement Make;
        
        @FindBy(how = How.XPATH, using = "//input[@name='UserWorkspace']")
       	WebElement UserWorkspace;
          
          @FindBy(how = How.XPATH, using = "//input[@name='Department']")
       	WebElement Department;
          
          @FindBy(how = How.XPATH, using = "//input[@name='UserName']")
       	WebElement UserName;
    
          @FindBy(how = How.XPATH, using = "//input[@name='ComputerType']")
         	WebElement ComputerType;
            
            @FindBy(how = How.XPATH, using = "//input[@name='ConncetionType']")
         	WebElement ConncetionType;
            
            @FindBy(how = How.XPATH, using = "//input[@name='ModelType']")
         	WebElement ModelType;
            
            @FindBy(how = How.XPATH, using = "//input[@name='ModelSeries']")
         	WebElement ModelSeries;
            
            @FindBy(how = How.XPATH, using = "//input[@name='Monitor_SerialNo']")
         	WebElement Monitor_SerialNo;
            
            @FindBy(how = How.XPATH, using = "//input[@name='IssuanceDate']")
         	WebElement IssuanceDate;
            
            @FindBy(how = How.XPATH, using = "(//td/span[text()='12'])[1]")
         	WebElement IssuanceDay;
            
            @FindBy(how = How.XPATH, using = "(//button[@class='p-datepicker-next p-link'])[1]")
         	WebElement Datenavigator;
            
            @FindBy(how = How.XPATH, using = "(//button[@class='p-datepicker-next p-link'])[2]")
         	WebElement Datenavigator2;
            
            @FindBy(how = How.XPATH, using = "(//button[@class='p-datepicker-next p-link'])[3]")
         	WebElement Datenavigator3;
            
            @FindBy(how = How.XPATH, using = "(//button[@class='p-datepicker-next p-link'])[4]")
         	WebElement Datenavigator4;
            
            @FindBy(how = How.XPATH, using = "//input[@name='GatePassNumber']")
         	WebElement GatePassNumber;
            
            @FindBy(how = How.XPATH, using = "//input[@name='Comp_Cpu']")
         	WebElement Cpu;
            
            @FindBy(how = How.XPATH, using = "//input[@name='Comp_CpuSpeed']")
         	WebElement Cpuspeed;
            
            @FindBy(how = How.XPATH, using = "//input[@name='Comp_Hdd']")
         	WebElement hdd;
            
            @FindBy(how = How.XPATH, using = "//input[@name='Comp_Ram']")
         	WebElement Ram;
            
            @FindBy(how = How.XPATH, using = "//input[@name='Comp_CdRom']")
         	WebElement CdRom;
            
            @FindBy(how = How.XPATH, using = "//input[@name='Comp_CdWriter']")
         	WebElement CdWriter;

          
            @FindBy(how = How.XPATH, using = "//input[@name='Comp_OsVersion']")
         	WebElement OsVersion;
            
            @FindBy(how = How.XPATH, using = "//input[@name='PurchaseDate']")
         	WebElement PurchaseDate;
            
            @FindBy(how = How.XPATH, using = "(//td/span[text()='12'])[2]")
         	WebElement PurchaseDay;
            
            @FindBy(how = How.XPATH, using = "//input[@name='PoNo']")
         	WebElement PoNo;

            
            @FindBy(how = How.XPATH, using = "//input[@name='Is_Under_Warranty_AMC']")
         	WebElement UnderWarranty;
            
            @FindBy(how = How.XPATH, using = "//input[@name='WA_StartDate']")
         	WebElement StartDate;
            
            @FindBy(how = How.XPATH, using = "(//td/span[text()='12'])[3]")
         	WebElement StartDay;
            
            @FindBy(how = How.XPATH, using = "//input[@name='WA_ExpiryDate']")
         	WebElement ExpiryDate;
            
            @FindBy(how = How.XPATH, using = "(//td/span[text()='18'])[4]")
         	WebElement ExpiryDay;
            
            @FindBy(how = How.XPATH, using = "//input[@name='WA_Sla']")
         	WebElement Sla;
            
            @FindBy(how = How.XPATH, using = "//input[@name='WA_Vendor']")
         	WebElement Vendor;
            
            @FindBy(how = How.XPATH, using = "//input[@name='IsQualified']")
         	WebElement IsQualified;
            
            @FindBy(how = How.XPATH, using = "//textarea[@name='QualificationReport']")
         	WebElement QualificationReport;
            
            @FindBy(how = How.XPATH, using = "//textarea[@name='Remarks']")
         	WebElement Remarks;
            
            @FindBy(how = How.XPATH, using = "//input[@name='AttributeOne']")
         	WebElement AttributeOne;
            
        	@FindBy(how = How.XPATH, using = "(//input[@name='username'])[1]")
        	WebElement Acknowledgeusername;
        	
        	@FindBy(how = How.XPATH, using = "(//input[@name='password'])[1]")
        	WebElement Acknowledgepassword;
        	
        	@FindBy(how = How.XPATH, using = "(//span[text()='Accept'])[1]")
        	WebElement Acceptbutton;
        	
        	@FindBy(how = How.XPATH, using = "//span[text()='Submit']")
         	WebElement submit;
        	JavascriptExecutor js = (JavascriptExecutor) driver;  
        	

    public void LaptopdesktopInventorycreation(String Catetype,String TempName,String Loc,String Cgxp,String SoftName,String Role,String Host,String Serial,String make,String Workspace,String Dept,String User,String ComType,String Conncetion,String Model,String Series,String Srno,String IssuanceDt,String GatePass,String cpu,String cpuspeed,String Hdd,String ram,String cdRom,String cdWriter,String os,String Purchase,String Po,String Underwarranty,String StartDt,String ExpiryDt,String sla,String vendor,String Qualified,String Qualification,String remarks,String Attributeone, String uid,String pass) throws InterruptedException{
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
    	cgxp.sendKeys(Cgxp);
    	Thread.sleep(2000);
    	cgxp.sendKeys(Keys.ARROW_DOWN);
    	cgxp.sendKeys(Keys.ENTER);
    	Thread.sleep(2000);
    	SoftwareName.sendKeys(SoftName);
    	roles.sendKeys(Role);
    	roles.sendKeys(Keys.ENTER);
    	HostName.sendKeys(Host);
    	SerialNo.sendKeys(Serial);
    	Make.sendKeys(make);
    	UserWorkspace.sendKeys(Workspace);
    	Department.sendKeys(Dept);
    	UserName.sendKeys(User);
    	ComputerType.sendKeys(ComType);
    	Thread.sleep(2000);
    	ComputerType.sendKeys(Keys.ARROW_DOWN);
    	ComputerType.sendKeys(Keys.ENTER);
    	Thread.sleep(2500);
    	ConncetionType.sendKeys(Conncetion);
    	Thread.sleep(2000);
    	ConncetionType.sendKeys(Keys.ARROW_DOWN);
    	ConncetionType.sendKeys(Keys.ENTER);
    	Thread.sleep(2500); 
    	ModelType.sendKeys(Model);
    	ModelSeries.sendKeys(Series);
    	Monitor_SerialNo.sendKeys(Srno);
    	Thread.sleep(2000);
    	//need to add method for date
    	IssuanceDate.click();
    	Datenavigator.click();
    	Thread.sleep(2000);
    	IssuanceDay.click();
    	//need to add method for date
    	GatePassNumber.sendKeys(GatePass);       
     	Cpu.sendKeys(cpu);
     	Cpuspeed.sendKeys(cpuspeed);
     	hdd.sendKeys(Hdd);
     	Ram.sendKeys(ram);
     	CdRom.sendKeys(cdRom);
     	CdWriter.sendKeys(cdWriter);
     	OsVersion.sendKeys(os);
     	//need to add method for date
     	PurchaseDate.click();
     	Thread.sleep(2000);
     	Datenavigator2.click();
     	Thread.sleep(2000);
     	PurchaseDay.click();
     	Thread.sleep(1000);
     	 PoNo.sendKeys(Po);
     	UnderWarranty.sendKeys(Underwarranty);
     	Thread.sleep(2000);
     	UnderWarranty.sendKeys(Keys.ARROW_DOWN);
     	UnderWarranty.sendKeys(Keys.ENTER);
    	Thread.sleep(2500); 
    	//need to add method for date
    	StartDate.click();
    	Thread.sleep(2000);
    	Datenavigator3.click();
    	Thread.sleep(2000);
    	StartDay.click();
    	Thread.sleep(2000);
    	ExpiryDate.click();
    	Thread.sleep(2000);
    	Datenavigator4.click();
    	Thread.sleep(2000);
    	ExpiryDay.click();
    	Thread.sleep(2000);
    	//need to add method for date
    	Sla.sendKeys(sla);
    	Vendor.sendKeys(vendor);
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
    	submit.click();
     	Thread.sleep(2000);
     	 Acknowledgeusername.sendKeys(uid);
	     Acknowledgepassword.sendKeys(pass);
		 Acceptbutton.click();
    }

}

