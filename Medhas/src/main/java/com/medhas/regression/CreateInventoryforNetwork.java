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
import org.testng.Assert;

/**
 * @author Shashank
 *
 */
public class CreateInventoryforNetwork {

	WebDriver driver;

	public CreateInventoryforNetwork(WebDriver driver) {
		this.driver = driver;
	}

	// Basic Details

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Inventory'])[2]")
	WebElement inventoryoption;

	@FindBy(how = How.XPATH, using = "//span[text()='Inventory Request']")
	WebElement Inventoryrequest;

	@FindBy(how = How.XPATH, using = "//input[@name = 'M_Inv_CategoryID']")
	WebElement categoryinvdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name= 'Inv_InventoryTemplateID']")
	WebElement invtemplatedropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='M_LocationId']")
	WebElement Locationnetwork;

	@FindBy(how = How.XPATH, using = "//input[@name='SoftwareName']")
	WebElement softnametxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name='S_SystemRoleList']")
	WebElement Roleschiplist;

	@FindBy(how = How.XPATH, using = "//input[@name='HostName']")
	WebElement hosttxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name='SerialNo']")
	WebElement serialtxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name='Make']")
	WebElement maketxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name='Model']")
	WebElement modtxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name='IpAddress']")
	WebElement iptxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name='InstallationDate']")
	WebElement installationdatecalender;

	@FindBy(how = How.XPATH, using = "//div[@class='p-datepicker p-component p-input-overlay p-shadow p-input-overlay-visible']//tr[1]//td[4]//span[1]")
	WebElement installationdatedate;

	@FindBy(how = How.XPATH, using = "//input[@name='DeviceType']")
	WebElement devicetypetxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name='DeviceDescription']")
	WebElement devicedescriptiontxtfield;

	// Purchase&Warranty

	@FindBy(how = How.XPATH, using = "//input[@name='PoNo']")
	WebElement potxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name='Is_Under_Warranty_AMC']")
	WebElement warrantydropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='WA_Sla']")
	WebElement slatxtfield;

	@FindBy(how = How.XPATH, using = "//input[@name='WA_Vendor']")
	WebElement vendortxtfield;

	// CalenderDates

	@FindBy(how = How.XPATH, using = "//input[@name='PurchaseDate']")
	WebElement purchasedatecalender;

	@FindBy(how = How.XPATH, using = "//div[@class='p-datepicker p-component p-input-overlay p-shadow p-input-overlay-visible']//tr[1]//td[4]//span[1]")
	WebElement purchasedatedate;

	@FindBy(how = How.XPATH, using = "//input[@name='WA_StartDate']")
	WebElement startdatecalender;

	@FindBy(how = How.XPATH, using = "//div[@class='p-datepicker p-component p-input-overlay p-shadow p-input-overlay-visible']//tr[1]//td[4]//span[1]")
	WebElement startdatedate;

	@FindBy(how = How.XPATH, using = "//input[@name='WA_ExpiryDate']")
	WebElement expirydatecalender;

	@FindBy(how = How.XPATH, using = "//div[@class='p-datepicker p-component p-input-overlay p-shadow p-input-overlay-visible']//span[contains(text(),'31')]")
	WebElement expirydatedate;

	// Qualification Details
	@FindBy(how = How.XPATH, using = "//input[@name='IsQualified']")
	WebElement qualifydropdown;

	@FindBy(how = How.XPATH, using = "//textarea[@name='QualificationReport']")
	WebElement qualificationreporttxtfield;

	@FindBy(how = How.XPATH, using = "//textarea[@name='Remarks']")
	WebElement remarktxtfield;

	// buttons for request
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save As Draft')]")
	WebElement draftbton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
	WebElement cancelbton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	WebElement submitbton;

	// e-Sign
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement eusername;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement epassword;

	@FindBy(how = How.XPATH, using = "//span[text()='Accept']")
	WebElement eAccept;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Successfully created')]")
	WebElement Toastmsg;

	public void enterbasicdetails(String cateinvN, String invtemp, String Loc, String softname, String role1,
			String role2, String host, String serial, String make, String model, String ip, String devicetype,
			String devicedescription) throws InterruptedException {

		inventoryoption.click();

		Inventoryrequest.click();

		categoryinvdropdown.sendKeys(cateinvN);
		Thread.sleep(2000);

		categoryinvdropdown.sendKeys(Keys.ARROW_DOWN);
		categoryinvdropdown.sendKeys(Keys.ENTER);

		Thread.sleep(4000);

		invtemplatedropdown.sendKeys(invtemp);
		Thread.sleep(2000);

		invtemplatedropdown.sendKeys(Keys.ARROW_DOWN);
		invtemplatedropdown.sendKeys(Keys.ENTER);

		Thread.sleep(4000);
		Locationnetwork.sendKeys(Loc);
		Thread.sleep(2000);

		Locationnetwork.sendKeys(Keys.ARROW_DOWN);
		Locationnetwork.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		softnametxtfield.sendKeys(softname);
		Roleschiplist.sendKeys(role1);
		Thread.sleep(2000);
		Roleschiplist.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Roleschiplist.sendKeys(role2);
		Thread.sleep(2000);
		Roleschiplist.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		hosttxtfield.sendKeys(host);

		serialtxtfield.sendKeys(serial);

		maketxtfield.sendKeys(make);

		modtxtfield.sendKeys(model);

		iptxtfield.sendKeys(ip);

		installationdatecalender.click();
		Thread.sleep(2000);

		installationdatedate.click();

		devicetypetxtfield.sendKeys(devicetype);

		devicedescriptiontxtfield.sendKeys(devicedescription);

	}

	public void enterwarrantydetails(String po, String warranty, String sla, String vendor, String qualified,
			String qualifyreport, String remarks, String euserid, String epwd) throws InterruptedException {

		purchasedatecalender.click();
		Thread.sleep(2000);
		purchasedatedate.click();
		Thread.sleep(2000);

		potxtfield.sendKeys(po);
		warrantydropdown.sendKeys(warranty);
		Thread.sleep(2000);

		warrantydropdown.sendKeys(Keys.ARROW_DOWN);
		warrantydropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		Thread.sleep(2000);
		startdatecalender.click();
		Thread.sleep(2000);
		startdatedate.click();
		Thread.sleep(4000);

		expirydatecalender.click();
		Thread.sleep(2000);
		expirydatedate.click();
		Thread.sleep(2000);

		slatxtfield.sendKeys(sla);
		vendortxtfield.sendKeys(vendor);

		qualifydropdown.sendKeys(qualified);
		Thread.sleep(2000);

		qualifydropdown.sendKeys(Keys.ARROW_DOWN);
		qualifydropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		qualificationreporttxtfield.sendKeys(qualifyreport);

		remarktxtfield.sendKeys(remarks);

		submitbton.click();
		Thread.sleep(2000);
		eusername.sendKeys(euserid);
		epassword.sendKeys(epwd);
		eAccept.click();
	}
		
		
		
		public void Toastmsg() throws InterruptedException {
			
			Thread.sleep(4000);

			if (Toastmsg.isDisplayed()) {
				
				
				String expectedMessage = "Successfully created";
				String message = driver.findElement(By.xpath("//div[contains(text(),'Successfully created')]")).getText();
				System.out.println(Toastmsg.getText());
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


