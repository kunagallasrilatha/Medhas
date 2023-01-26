/**
 * 
 */
package com.medhas.regression;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Shashank
 *
 */
public class AdministrationMasterforUserroleLocation {

	WebDriver driver;

	public AdministrationMasterforUserroleLocation(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Administration'])[2]")
	WebElement Administrationexpansion;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Master')]")
	WebElement masteroption;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'User Role Location')]")
	WebElement userroleoption;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Create User Role Location')]")
	WebElement userrolelocbton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'p-col-12')]//input[@name='LocationId']")
	WebElement locationdropdown;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'p-col-12')]//input[@name='RoleId']")
	WebElement roledropdown;

	@FindBy(how = How.XPATH, using = "//div[@class='userlist-dropdown-and-create']//input[@name='UserId']")
	WebElement userListdropdown;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'dropdown-options')]//div[contains(@class,'dropdown-item')]")
	WebElement userListkey;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
	WebElement savebton;

	// e-Sign
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement eusername;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement epassword;

	@FindBy(how = How.XPATH, using = "//span[text()='Accept']")
	WebElement eAccept;

	public void enterDetails(String Loc1, String Admin, String adminname, String eun1, String epw1, String Loc2,
			String LIT, String Litname, String eun2, String epw2, String Loc3, String LITHead, String LitHeadname,
			String eun3, String epw3, String Loc4, String Masteradmin, String Masteradminname, String eun4, String epw4,
			String Loc5, String QALead, String QALeadname, String eun5, String epw5, String Loc6, String SiteQAHead,
			String SiteQAHeadname, String eun6, String epw6, String Loc8, String SystemAdministrator,
			String SystemAdministratorname, String eun8, String epw8, String Loc9, String SystemOwner,
			String SystemOwnername, String eun9, String epw9, String Loc10, String TechnicalOwner,
			String TechnicalOwnername, String eun10, String epw10, String Loc11, String ValidationLead,
			String ValidationLeadname, String eun11, String epw11) throws InterruptedException {

		Administrationexpansion.click();
		Thread.sleep(2000);
		masteroption.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", userroleoption);
		Actions act = new Actions(driver);
		act.moveToElement(userroleoption).click().build().perform();

		// Admin
		Thread.sleep(4000);
		userrolelocbton.click();
		Thread.sleep(2000);
		locationdropdown.sendKeys(Loc1);
		Thread.sleep(2000);

		locationdropdown.sendKeys(Keys.ARROW_DOWN);
		locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		roledropdown.sendKeys(Admin);
		Thread.sleep(2000);
		roledropdown.sendKeys(Keys.ARROW_DOWN);
		roledropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		userListdropdown.sendKeys(adminname);
		Thread.sleep(2000);
		userListkey.click();
		Thread.sleep(2000);

		savebton.click();
		Thread.sleep(2000);
		// e-Sign

		eusername.sendKeys(eun1);

		epassword.sendKeys(epw1);
		eAccept.click();

		// LIT

		Thread.sleep(4000);
		userrolelocbton.click();
		Thread.sleep(2000);
		locationdropdown.sendKeys(Loc2);
		Thread.sleep(2000);

		locationdropdown.sendKeys(Keys.ARROW_DOWN);
		locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		roledropdown.sendKeys(LIT);
		Thread.sleep(2000);
		roledropdown.sendKeys(Keys.ARROW_DOWN);
		roledropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		userListdropdown.sendKeys(Litname);
		Thread.sleep(2000);
		userListkey.click();
		Thread.sleep(2000);

		savebton.click();
		Thread.sleep(2000);
		// e-Sign
		//eusername.sendKeys(eun2);
		epassword.sendKeys(epw2);
		eAccept.click();

		// LIT Head

		Thread.sleep(4000);
		userrolelocbton.click();
		Thread.sleep(2000);
		locationdropdown.sendKeys(Loc3);
		Thread.sleep(2000);

		locationdropdown.sendKeys(Keys.ARROW_DOWN);
		locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		roledropdown.sendKeys(LITHead);
		Thread.sleep(2000);
		roledropdown.sendKeys(Keys.ARROW_DOWN);
		roledropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		userListdropdown.sendKeys(LitHeadname);
		Thread.sleep(2000);
		userListkey.click();
		Thread.sleep(2000);

		savebton.click();
		Thread.sleep(2000);
		// e-Sign
		//eusername.sendKeys(eun3);
		epassword.sendKeys(epw3);
		eAccept.click();

		// Master Admin
		Thread.sleep(4000);
		userrolelocbton.click();
		Thread.sleep(2000);
		locationdropdown.sendKeys(Loc4);
		Thread.sleep(2000);

		locationdropdown.sendKeys(Keys.ARROW_DOWN);
		locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		roledropdown.sendKeys(Masteradmin);
		Thread.sleep(2000);
		roledropdown.sendKeys(Keys.ARROW_DOWN);
		roledropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		userListdropdown.sendKeys(Masteradminname);
		Thread.sleep(2000);
		userListkey.click();
		Thread.sleep(2000);

		savebton.click();
		Thread.sleep(2000);
		// e-Sign
		//eusername.sendKeys(eun4);
		epassword.sendKeys(epw4);
		eAccept.click();

		// QA Lead
		Thread.sleep(4000);
		userrolelocbton.click();
		Thread.sleep(2000);
		locationdropdown.sendKeys(Loc5);
		Thread.sleep(2000);

		locationdropdown.sendKeys(Keys.ARROW_DOWN);
		locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		roledropdown.sendKeys(QALead);
		Thread.sleep(2000);
		roledropdown.sendKeys(Keys.ARROW_DOWN);
		roledropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		userListdropdown.sendKeys(QALeadname);
		Thread.sleep(2000);
		userListkey.click();
		Thread.sleep(2000);

		savebton.click();
		Thread.sleep(2000);
		// e-Sign
	//eusername.sendKeys(eun5);
		epassword.sendKeys(epw5);
		eAccept.click();

		// Site QA Head
		Thread.sleep(4000);
		userrolelocbton.click();
		Thread.sleep(2000);
		locationdropdown.sendKeys(Loc6);
		Thread.sleep(2000);

		locationdropdown.sendKeys(Keys.ARROW_DOWN);
		locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		roledropdown.sendKeys(SiteQAHead);
		Thread.sleep(2000);
		roledropdown.sendKeys(Keys.ARROW_DOWN);
		roledropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		userListdropdown.sendKeys(SiteQAHeadname);
		Thread.sleep(2000);
		userListkey.click();
		Thread.sleep(2000);

		savebton.click();
		Thread.sleep(2000);
		// e-Sign
		//eusername.sendKeys(eun6);
		epassword.sendKeys(epw6);
		eAccept.click();

		// System Administrator

		Thread.sleep(4000);
		userrolelocbton.click();
		Thread.sleep(2000);
		locationdropdown.sendKeys(Loc8);
		Thread.sleep(2000);

		locationdropdown.sendKeys(Keys.ARROW_DOWN);
		locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		roledropdown.sendKeys(SystemAdministrator);
		Thread.sleep(2000);
		roledropdown.sendKeys(Keys.ARROW_DOWN);
		roledropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		userListdropdown.sendKeys(SystemAdministratorname);
		Thread.sleep(2000);
		userListkey.click();
		Thread.sleep(2000);

		savebton.click();
		Thread.sleep(2000);
		// e-Sign
		//eusername.sendKeys(eun8);
		epassword.sendKeys(epw8);
		eAccept.click();

		// System Owner

		Thread.sleep(4000);
		userrolelocbton.click();
		Thread.sleep(2000);
		locationdropdown.sendKeys(Loc9);
		Thread.sleep(2000);

		locationdropdown.sendKeys(Keys.ARROW_DOWN);
		locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		roledropdown.sendKeys(SystemOwner);
		Thread.sleep(2000);
		roledropdown.sendKeys(Keys.ARROW_DOWN);
		roledropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		userListdropdown.sendKeys(SystemOwnername);
		Thread.sleep(2000);
		userListkey.click();
		Thread.sleep(2000);

		savebton.click();
		Thread.sleep(2000);
		// e-Sign
		//eusername.sendKeys(eun9);
		epassword.sendKeys(epw9);
		eAccept.click();

		// Technical Owner

		Thread.sleep(4000);
		userrolelocbton.click();
		Thread.sleep(2000);
		locationdropdown.sendKeys(Loc10);
		Thread.sleep(2000);

		locationdropdown.sendKeys(Keys.ARROW_DOWN);
		locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		roledropdown.sendKeys(TechnicalOwner);
		Thread.sleep(2000);
		roledropdown.sendKeys(Keys.ARROW_DOWN);
		roledropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		userListdropdown.sendKeys(TechnicalOwnername);
		Thread.sleep(2000);
		userListkey.click();
		Thread.sleep(2000);

		savebton.click();
		Thread.sleep(2000);
		// e-Sign
		//eusername.sendKeys(eun10);
		epassword.sendKeys(epw10);
		eAccept.click();

		// Validation Lead

		Thread.sleep(4000);
		userrolelocbton.click();
		Thread.sleep(2000);
		locationdropdown.sendKeys(Loc11);
		Thread.sleep(2000);

		locationdropdown.sendKeys(Keys.ARROW_DOWN);
		locationdropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		roledropdown.sendKeys(ValidationLead);
		Thread.sleep(2000);
		roledropdown.sendKeys(Keys.ARROW_DOWN);
		roledropdown.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		userListdropdown.sendKeys(ValidationLeadname);
		Thread.sleep(2000);
		userListkey.click();
		Thread.sleep(2000);

		savebton.click();
		Thread.sleep(2000);
		// e-Sign
		//eusername.sendKeys(eun11);
		epassword.sendKeys(epw11);
		eAccept.click();

	}

}
