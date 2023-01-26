package com.medhas.regression;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateApplicationInventory extends BaseClass {
	
	WebDriver driver;
	WebDriverWait wait;

	public UpdateApplicationInventory(WebDriver driver) {
		this.driver = driver;
	}
	

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Inventory'])[2]")
	WebElement Inventoryexpansion;

	@FindBy(how = How.XPATH, using = "//span[text()='Inventory List']")
	WebElement InventoryListlink;

	@FindBy(how = How.XPATH, using = "//span[text()='Create New']")
	WebElement Createnewbtn;

	@FindBy(how = How.XPATH, using = "(//input[@name = 'filterValue'])[1]")
	WebElement Status;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'APPROVE')]")
	WebElement ApproveStatus;
	
	

	@FindBy(how = How.XPATH, using = "(//input[@name = 'filterValue'])[2]")
	WebElement filterlocationdropdown;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Automation')]")
	WebElement locationvalue;

	@FindBy(how = How.XPATH, using = "(//span[@class='pi pi-fw pi-chevron-down p-c p-button-icon-left'])[1]")
	WebElement valuedropdown;

	@FindBy(how = How.XPATH, using = "//span[text()='APPROVE']")
	WebElement approve;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Request Id')]")
	WebElement Requestid;

	@FindBy(how = How.XPATH, using = "(//tr[@class='p-datatable-row']/td[text()='Application']/../td[1])[1]")
	WebElement UpdateRequestId;

	@FindBy(how = How.XPATH, using = "//input[@name = 'S_SystemRoleList']")
	WebElement SystemRolechiplist;

	@FindBy(how = How.XPATH, using = "(//div[@class='p-chips p-component'])[2]")
	WebElement Instrumentchiplist;

	@FindBy(how = How.XPATH, using = "//input[@name = 'M_RoleID']")
	WebElement RoleIDdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name = 'UserId']")
	WebElement UserIdsearch;

	@FindBy(xpath = "//span[@class='formatted-item-email']")
	public WebElement supervisoridkey;

	@FindBy(how = How.XPATH, using = "//tr[@class='p-datatable-row']/td[text()='QA Lead']/../td/div")
	WebElement deleteqaleadrole;

	@FindBy(how = How.XPATH, using = "//span[text()='Add New']")
	WebElement addnewuserbtn;

	@FindBy(how = How.XPATH, using = "//textarea[@name='Remarks']")
	WebElement Remarks;

	@FindBy(how = How.XPATH, using = "//span[text()='Submit']")
	WebElement Submitbutton;

	@FindBy(how = How.XPATH, using = "(//input[@name='username'])[1]")
	WebElement Acknowledgeusername;

	@FindBy(how = How.XPATH, using = "(//input[@name='password'])[1]")
	WebElement Acknowledgepassword;

	@FindBy(how = How.XPATH, using = "(//span[text()='Accept'])[1]")
	WebElement Acceptbutton;

	public void inventorylist(String filterlocation) throws InterruptedException {
		Thread.sleep(3500);
		Inventoryexpansion.click();
		Thread.sleep(3000);
		InventoryListlink.click();
		Thread.sleep(10000);
		Status.click();
		ApproveStatus.click();
		filterlocationdropdown.click();
		locationvalue.click();
		Thread.sleep(2500);
		Requestid.click();
		Thread.sleep(500);
		Requestid.click();
		Thread.sleep(1000);
	}

	public void updaterequest(String SystemRole, String Instrument, String RoleID, String UserId)
			throws InterruptedException {
		Thread.sleep(1500);
		UpdateRequestId.click();
		Thread.sleep(1500);
		SystemRolechiplist.sendKeys(SystemRole);
		Thread.sleep(2000);
		filterlocationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		Instrumentchiplist.sendKeys(Instrument);
		Thread.sleep(2000);
		Instrumentchiplist.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		deleteqaleadrole.click();
		Thread.sleep(1500);
		RoleIDdropdown.sendKeys(RoleID);
		Thread.sleep(2000);
		RoleIDdropdown.sendKeys(Keys.ARROW_DOWN);
		RoleIDdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2500);
		UserIdsearch.sendKeys(UserId);
		Thread.sleep(2000);
		supervisoridkey.click();
		Thread.sleep(4000);
		addnewuserbtn.click();
	}

	public void Acknowledgement(String uid, String pass) throws InterruptedException {
		Thread.sleep(1500);
		Submitbutton.click();
		Thread.sleep(1500);
		// Acknowledgeusername.sendKeys(uid);
		// Acknowledgepassword.sendKeys(pass);
		// Acceptbutton.click();
		// Thread.sleep(2000);
	}
}
