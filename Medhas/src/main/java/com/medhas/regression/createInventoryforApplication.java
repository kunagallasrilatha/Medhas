/**
 * 
 */
package com.medhas.regression;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * @author Shashank
 *
 */
public class createInventoryforApplication {

	WebDriver driver;
	WebDriverWait wait;

	public createInventoryforApplication(WebDriver driver) {
		this.driver = driver;
	}

	// BasicDetails

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Inventory'])[2]")
	WebElement inventoryoption;

	@FindBy(how = How.XPATH, using = "//span[text()='Inventory Request']")
	WebElement Inventoryrequest;

	@FindBy(how = How.XPATH, using = "//input[@name = 'M_Inv_CategoryID']")
	WebElement categoryinvapp;

	@FindBy(how = How.XPATH, using = "//input[@name= 'Inv_InventoryTemplateID']")
	WebElement invtemplate;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p-checkbox-box p-component']")
	WebElement attachmentcheckbox;

	@FindBy(how = How.XPATH, using = "//input[@name = 'M_LocationId']")
	WebElement Locationapp;

	@FindBy(how = How.XPATH, using = "//input[@name='cGxP']")
	WebElement cGxPinvappdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name = 'S_HLRA']")
	WebElement Riskcategorydropdown;

	@FindBy(how = How.XPATH, using = "//input[@name = 'S_SystemId']")
	WebElement SystemIdtxtfield;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'System ID already Exists')]")
	WebElement SystemIDvalidationmsg;

	@FindBy(how = How.XPATH, using = "//input[@name = 'S_SystemName']")
	WebElement SystemNametxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name = 'S_SystemVersion']")
	WebElement Systemversiontxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name = 'S_SystemRoleList']")
	WebElement SystemRolechiplist;

	@FindBy(how = How.XPATH, using = "//input[@name = 'S_Scope']")
	WebElement Scopetxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name = 'S_SystemStatus']")
	WebElement SystemStatusdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name = 'S_SystemCategory']")
	WebElement SystemCategorydropdown;

	@FindBy(how = How.XPATH, using = "//input[@name = 'S_InstrumentName']")
	WebElement InstrumentNamechiplist;

	@FindBy(how = How.XPATH, using = "//input[@name = 'S_SopNumber']")
	WebElement SopNumbertxtfield;

	// @FindBy(how = How.XPATH, using = "//input[@name = 'Detailed_M_LocationID']")
	// WebElement DetailLocation;

	@FindBy(how = How.XPATH, using = "//input[@name = 'M_Inv_ItemGroupID']")
	WebElement SystemTypedropdown;

	/*
	 * @FindBy(how = How.XPATH, using = "//input[@name = 'S_ValidationStatus']")
	 * WebElement ValidationStatus;
	 * 
	 * @FindBy(how = How.XPATH, using = "//input[@name = 'S_Last_ValidationDate']")
	 * WebElement Last_ValidationDate;
	 * 
	 * @FindBy(how = How.XPATH, using =
	 * "//input[@name = 'S_Last_PeriodicValidation_ReviewDate']") WebElement
	 * Last_PeriodicValidation_ReviewDate;
	 * 
	 * @FindBy(how = How.XPATH, using =
	 * "//input[@name = 'S_PeriodicValidation_ReviewDueDate']") WebElement
	 * S_PeriodicValidation_ReviewDueDate;
	 */

	// Backup or RecoveryDetails

	@FindBy(how = How.XPATH, using = "//input[@name='S_BackupStatus']")
	WebElement BackupStatusdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name = 'S_BackupRestorationApplicability']")
	WebElement BackupRestorationApplicabilitydropdown;

	@FindBy(how = How.XPATH, using = "//textarea[@name = 'S_BusinessContinuityPlan']")
	WebElement BusinessContinuityPlantxtfield;

	@FindBy(how = How.XPATH, using = "//textarea[@name = 'S_DisasterRecoveryPlan']")
	WebElement DisasterRecoveryPlantxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name = 'S_ChangeControlNumber']")
	WebElement ChangeControlNumbertxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name = 'S_VendorName']")
	WebElement VendorNametxtfield;

	// Other Details

	@FindBy(how = How.XPATH, using = "//textarea[@name = 'S_VendorContactDetails']")
	WebElement VendorContactDetailstxtfield;
	
	@FindBy(how = How.XPATH, using = "//textarea[@name='Remarks']")
	WebElement Remarksrxtfield;
	

	@FindBy(how = How.XPATH, using = "//input[@name='M_RoleID']")
	WebElement RoleIDdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='UserId']")
	WebElement UserIDsearchfield;

	@FindBy(how = How.XPATH, using = "//span[@class='formatted-item']")
	WebElement UserIDselect1;

	//// input[@name='UserId']

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
	WebElement Addnewbton;

	// buttons for request
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save As Draft')]")
	WebElement draftbton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
	WebElement cancelbton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	WebElement submitbton;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Successfully created Inventory Item Request with ID')]")
	WebElement toastMessage;

	// e-Sign
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement eusername;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement epassword;

	@FindBy(how = How.XPATH, using = "//span[text()='Accept']")
	WebElement eAccept;

	@FindBy(how = How.XPATH, using = "//button[@class='Toastify__close-button Toastify__close-button--success']")
	WebElement Successmsg;
	
	@FindBy(how = How.XPATH, using = "//button[@class='Toastify__close-button Toastify__close-button--error']")
	WebElement Failuremsg;
	
	// Toast Message
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Successfully created')]")
	WebElement inventoryRequestToastmsg;
	
	

	

	public void enterbasicdetails(String cateinvapp, String invtemp, String Loc, String GxPapp, String Riskcate,
			String SysID, String SysName, String Sysversion, String SysRole1, String SysRole2, String Scop,
			String SysStatus, String SysCategory, String InsName1, String InsName2, String SopN, String SysType)
			throws InterruptedException {
		Thread.sleep(4000);
		inventoryoption.click();
		Thread.sleep(2000);

		Inventoryrequest.click();

		Thread.sleep(3000);

		categoryinvapp.sendKeys(cateinvapp);
		Thread.sleep(2000);

		categoryinvapp.sendKeys(Keys.ARROW_DOWN);
		categoryinvapp.sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		invtemplate.sendKeys(invtemp);
		Thread.sleep(2000);
		invtemplate.sendKeys(Keys.ARROW_DOWN);
		invtemplate.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		attachmentcheckbox.click();
		Thread.sleep(2000);
		submitbton.click();
		Locationapp.sendKeys(Loc);
		Thread.sleep(2000);
		Locationapp.sendKeys(Keys.ARROW_DOWN);
		Locationapp.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		cGxPinvappdropdown.sendKeys(GxPapp);
		Thread.sleep(2000);
		cGxPinvappdropdown.sendKeys(Keys.ARROW_DOWN);
		cGxPinvappdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		if (Riskcategorydropdown.isEnabled()) {
			Riskcategorydropdown.sendKeys(Riskcate);
			Thread.sleep(2000);
			Riskcategorydropdown.sendKeys(Keys.ARROW_DOWN);
			Riskcategorydropdown.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		}

		SystemIdtxtfield.sendKeys(SysID);

		/*
		 * if(SystemIDvalidationmsg.isDisplayed()) {
		 * 
		 * String actual_msg = SystemIDvalidationmsg.getText();
		 * 
		 * String expected_msg = "System ID already Exists";
		 * 
		 * Assert.assertEquals(actual_msg, expected_msg);
		 * 
		 * 
		 * }
		 */

		SystemNametxtfield.sendKeys(SysName);
		Systemversiontxtfield.sendKeys(Sysversion);

		// chiplist
		SystemRolechiplist.sendKeys(SysRole1);
		Thread.sleep(2000);
		SystemRolechiplist.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		SystemRolechiplist.sendKeys(SysRole2);
		Thread.sleep(2000);
		SystemRolechiplist.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		Scopetxtfield.sendKeys(Scop);

		// dropdown
		SystemStatusdropdown.sendKeys(SysStatus);
		Thread.sleep(2000);
		SystemStatusdropdown.sendKeys(Keys.ARROW_DOWN);
		SystemStatusdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		SystemCategorydropdown.sendKeys(SysCategory);
		Thread.sleep(2000);
		SystemCategorydropdown.sendKeys(Keys.ARROW_DOWN);
		SystemCategorydropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		// chiplist
		InstrumentNamechiplist.sendKeys(InsName1);
		Thread.sleep(2000);
		InstrumentNamechiplist.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		InstrumentNamechiplist.sendKeys(InsName2);
		Thread.sleep(2000);
		InstrumentNamechiplist.sendKeys(Keys.ENTER);

		SopNumbertxtfield.sendKeys(SopN);

		// Dropdown
		// DetailLocation.sendKeys(DetailLoc);
		SystemTypedropdown.sendKeys(SysType);
		Thread.sleep(2000);

		SystemTypedropdown.sendKeys(Keys.ARROW_DOWN);
		SystemTypedropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	// ValidationStatus.sendKeys(ValidationStat);

	// Dates
	/*
	 * Last_ValidationDate.sendKeys(Last_Validate);
	 * Last_PeriodicValidation_ReviewDate.sendKeys(keysToSend);
	 * S_PeriodicValidation_ReviewDueDate.sendKeys(keysToSend);
	 */

	public void enterRecoveryDetails(String Backupstat, String BackupRestorationApp, String BusinessContinuPlan,
			String DisasterRecoverPlan, String ChangeCtrlNum, String VenName, String Vencondetails)
			throws InterruptedException {

		// Dropdown
		BackupStatusdropdown.sendKeys(Backupstat);
		Thread.sleep(2000);

		BackupStatusdropdown.sendKeys(Keys.ARROW_DOWN);
		BackupStatusdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		BackupRestorationApplicabilitydropdown.sendKeys(BackupRestorationApp);
		Thread.sleep(2000);

		BackupRestorationApplicabilitydropdown.sendKeys(Keys.ARROW_DOWN);
		BackupRestorationApplicabilitydropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		BusinessContinuityPlantxtfield.sendKeys(BusinessContinuPlan);
		DisasterRecoveryPlantxtfield.sendKeys(DisasterRecoverPlan);
		ChangeControlNumbertxtfield.sendKeys(ChangeCtrlNum);

		VendorNametxtfield.sendKeys(VenName);
		VendorContactDetailstxtfield.sendKeys(Vencondetails);
		
		Remarksrxtfield.sendKeys("Inventory for Application");
		
	}

	public void enterApproverDetails(String Roleid1, String Userid1, String Roleid2, String Userid2, String Roleid3,
			String Userid3, String Roleid4, String Userid4, String Roleid5, String Userid5, String euserid, String epwd)
			throws InterruptedException {

		RoleIDdropdown.sendKeys(Roleid1);
		Thread.sleep(2000);
		RoleIDdropdown.sendKeys(Keys.ARROW_DOWN);
		RoleIDdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		UserIDsearchfield.sendKeys(Userid1);
		Thread.sleep(4000);
		UserIDselect1.click();
		Thread.sleep(3000);

		Addnewbton.click();

		RoleIDdropdown.sendKeys(Roleid2);
		Thread.sleep(2000);
		RoleIDdropdown.sendKeys(Keys.ARROW_DOWN);
		RoleIDdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		UserIDsearchfield.sendKeys(Userid2);
		Thread.sleep(4000);
		UserIDselect1.click();
		Thread.sleep(3000);

		Addnewbton.click();

		RoleIDdropdown.sendKeys(Roleid3);
		Thread.sleep(2000);
		RoleIDdropdown.sendKeys(Keys.ARROW_DOWN);
		RoleIDdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		UserIDsearchfield.sendKeys(Userid3);
		Thread.sleep(4000);
		UserIDselect1.click();
		Thread.sleep(3000);

		Addnewbton.click();

		RoleIDdropdown.sendKeys(Roleid4);
		Thread.sleep(2000);
		RoleIDdropdown.sendKeys(Keys.ARROW_DOWN);
		RoleIDdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		UserIDsearchfield.sendKeys(Userid4);
		Thread.sleep(4000);
		UserIDselect1.click();
		Thread.sleep(3000);

		Addnewbton.click();

		RoleIDdropdown.sendKeys(Roleid5);
		Thread.sleep(2000);
		RoleIDdropdown.sendKeys(Keys.ARROW_DOWN);
		RoleIDdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		UserIDsearchfield.sendKeys(Userid5);
		Thread.sleep(4000);
		UserIDselect1.click();
		Thread.sleep(3000);

		Addnewbton.click();
		Thread.sleep(2000);

		submitbton.click();

		Thread.sleep(2000);
	
		eusername.sendKeys(euserid);
		epassword.sendKeys(epwd);
		
		eAccept.click();
		
	}
	
	public void Toastmsg() throws InterruptedException {
		
		Thread.sleep(4000);

		if (inventoryRequestToastmsg.isDisplayed()) {
			
			
			String expectedMessage = "Successfully created";
			String message = driver.findElement(By.xpath("//div[contains(text(),'Successfully created')]")).getText();
			System.out.println(inventoryRequestToastmsg.getText());
			Assert.assertEquals("Successfully created", expectedMessage);
			
			System.out.println(message);
			System.out.println(expectedMessage+"Pass");
			
			/*String actual_msg = Toastmsg.getText();
			System.out.println(actual_msg);
			
			String expected_msg = "Successfully created";
			Assert.assertEquals(actual_msg,expected_msg);*/
			
		}
		else
			System.out.println("Failed");

	}
		
		
		
	}


