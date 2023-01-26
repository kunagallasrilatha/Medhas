/**
 * 
 */
package com.medhas.regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * @author Shashank
 *
 */
public class Createinventoryforprinter {
	
	WebDriver driver;
	WebDriverWait wait;

	public Createinventoryforprinter(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	//Basic Details

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Inventory'])[2]")
	WebElement inventoryoption;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Inventory Request']")
	WebElement Inventoryrequest;
	
	
	@FindBy(how = How.XPATH, using = "//input[@name = 'M_Inv_CategoryID']")
	WebElement categoryinvdropdown;
	
	@FindBy(how=How.XPATH, using = "//input[@name= 'Inv_InventoryTemplateID']")
	WebElement invtemplatedropdown;
		
		@FindBy(how = How.XPATH, using = "//input[@name='M_LocationId']")
		WebElement Locationprinter;
		
		@FindBy(how = How.XPATH, using = "//input[@name='SerialNo']")
		WebElement Serialtxtfield;
		
		@FindBy(how = How.XPATH, using = "//input[@name='Make']")
		WebElement Maketxtfield;
		
		@FindBy(how = How.XPATH, using = "//input[@name='Model']")
		WebElement Modeltxtfield;
		
		@FindBy(how = How.XPATH, using = "//input[@name='IpAddress']")
		WebElement iptxtfield;
		
		@FindBy(how = How.XPATH, using = "//input[@name='InstallationDate']")
		WebElement installationdatecalender;
		
		@FindBy(how = How.XPATH, using = "//div[@class='p-datepicker p-component p-input-overlay p-shadow p-input-overlay-visible']//tr[1]//td[4]//span[1]")
		WebElement installationdatedate;
		
		@FindBy(how = How.XPATH, using = "//input[@name='PrinterTagName']")
		WebElement printertagtxtfield;
		
		@FindBy(how = How.XPATH, using = "//input[@name='MacAddress']")
		WebElement mactxtfield;
		
		@FindBy(how = How.XPATH, using = "//input[@name='IsMultiFunctionEnabled']")
		WebElement multifunctiondropdown;
		
		@FindBy(how = How.XPATH, using = "//input[@name='IsIncludedInMps']")
		WebElement mpsdropdown;
		
		@FindBy(how = How.XPATH, using = "//input[@name='Security']")
		WebElement securitydropdown;
		
		@FindBy(how = How.XPATH, using = "//input[@name='Department']")
		WebElement departmenttxtfield;
		
		@FindBy(how = How.XPATH, using = "//input[@name='UserName_DirectAttach']")
		WebElement undirecttxtfield;
		
		
		//purchase & Warrantydetails
		
		@FindBy(how = How.XPATH, using = "//input[@name='PurchaseDate']")
		WebElement purchasedatecalender;
		
		@FindBy(how = How.XPATH, using = "//div[@class='p-datepicker p-component p-input-overlay p-shadow p-input-overlay-visible']//tr[1]//td[4]//span[1]")
		WebElement purchasedatedate;
		
		
		@FindBy(how = How.XPATH, using = "//input[@name='PoNo']")
		WebElement potxtfield;
		
		
		
		@FindBy(how = How.XPATH, using = "//input[@name='Is_Under_Warranty_AMC']")
		WebElement warrantydropdown;
		
		@FindBy(how = How.XPATH, using = "//input[@name='WA_StartDate']")
		WebElement startdatecalender;
		
		@FindBy(how = How.XPATH, using = "//div[@class='p-datepicker p-component p-input-overlay p-shadow p-input-overlay-visible']//tr[1]//td[4]//span[1]")
		WebElement startdatedate;
		
		@FindBy(how = How.XPATH, using = "//input[@name='WA_ExpiryDate']")
		WebElement Expirydatecalender;
		
		@FindBy(how = How.XPATH, using = "//div[@class='p-datepicker p-component p-input-overlay p-shadow p-input-overlay-visible']//span[contains(text(),'31')]")
		WebElement Expirydatedate;
		
		
		
		@FindBy(how = How.XPATH, using = "//input[@name='WA_Sla']")
		WebElement slatxtfield;
		
		@FindBy(how = How.XPATH, using = "//input[@name='WA_Vendor']")
		WebElement vendortxtfield;
		
		@FindBy(how = How.XPATH, using = "//textarea[@name='Remarks']")
		WebElement remarktxtfield;
		
		
		//buttons for request
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
				
				@FindBy(xpath = "//div[contains(text(),'Successfully Created Inventory Item Reques')]")
				WebElement toastMessagePI;
				
				
				
		
		public void BasicDetails(String cateinvp, String invtemp, String Loc,String srno, String makeno, String model, String ip,
				String ptag, String macno, String multikey, String mskey, String securitykey, String departmentkey, String unkey ) throws InterruptedException {
			
			
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			inventoryoption.click();
			
			Inventoryrequest.click();
			
			categoryinvdropdown.sendKeys(cateinvp);
			Thread.sleep(2000);
			
			categoryinvdropdown.sendKeys(Keys.ARROW_DOWN);
			categoryinvdropdown.sendKeys(Keys.ENTER);
			
			Thread.sleep(4000);
			
			invtemplatedropdown.sendKeys(invtemp);
			Thread.sleep(2000);
			
			invtemplatedropdown.sendKeys(Keys.ARROW_DOWN);
			invtemplatedropdown.sendKeys(Keys.ENTER);
			
			Thread.sleep(4000);
			Locationprinter.sendKeys(Loc);
			Thread.sleep(2000);
			
			Locationprinter.sendKeys(Keys.ARROW_DOWN);
			Locationprinter.sendKeys(Keys.ENTER);
			
			Thread.sleep(2000);
			
			Serialtxtfield.sendKeys(srno);
			
			Maketxtfield.sendKeys(makeno);
			
			Modeltxtfield.sendKeys(model);
			
			iptxtfield.sendKeys(ip);
			
			installationdatecalender.click();
			Thread.sleep(2000);
			installationdatedate.click();
			
			printertagtxtfield.sendKeys(ptag);
			mactxtfield.sendKeys(macno);
			
			multifunctiondropdown.sendKeys(multikey);
			Thread.sleep(3000);
			multifunctiondropdown.sendKeys(Keys.ARROW_DOWN);
			multifunctiondropdown.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			mpsdropdown.sendKeys(mskey);
			Thread.sleep(2000);
			mpsdropdown.sendKeys(Keys.ARROW_DOWN);
			mpsdropdown.sendKeys(Keys.ENTER);
			
			Thread.sleep(2000);
			
			securitydropdown.sendKeys(securitykey);
			Thread.sleep(2000);
			
			securitydropdown.sendKeys(Keys.ARROW_DOWN);
			securitydropdown.sendKeys(Keys.ENTER);
			
			Thread.sleep(2000);
			
			departmenttxtfield.sendKeys(departmentkey);
			
			undirecttxtfield.sendKeys(unkey);
			}
		
		
		public void warrantydetils(String po, String warrantykey,String slakey, String venname , String remarkkey,String euserid, String epwd) throws InterruptedException {
			
			
			purchasedatecalender.click();
			Thread.sleep(2000);
			purchasedatedate.click();
			
			Thread.sleep(2000);
			
			
			potxtfield.sendKeys(po);
			
			warrantydropdown.sendKeys(warrantykey);
			Thread.sleep(2000);
			
			warrantydropdown.sendKeys(Keys.ARROW_DOWN);
			warrantydropdown.sendKeys(Keys.ENTER);
			
			
			startdatecalender.click();
			Thread.sleep(2000);
			startdatedate.click();
			Thread.sleep(2000);
			
			
			Expirydatecalender.click();
			
			Expirydatedate.click();
			
			
			
			slatxtfield.sendKeys(slakey);
			vendortxtfield.sendKeys(venname);
			remarktxtfield.sendKeys(remarkkey);
			
			submitbton.click();
			
			Thread.sleep(2000);
			eAccept.click();
			eusername.sendKeys(euserid);
			epassword.sendKeys(epwd);
			eAccept.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		/*public void getRequestId() {
			wait.until(ExpectedConditions.visibilityOf(toastMessagePI));
			String text = toastMessagePI.getText();
			System.out.println(text);
			String[] toastMessagePI = text.split(":");
			String requestId = toastMessagePI[1];
			System.out.println("requestId is :" + requestId);
			
			
		}*/
		
		
		
		
		
		
		
		
		
		

}
