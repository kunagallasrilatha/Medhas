/**
 * 
 */
package com.medhas.regression;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.utility.TestUtil;

/**
 * @author Shashank
 *
 */
public class MultipleUsersDeactivaterequestforOperatingsystem {
	
	WebDriver driver;
	WebDriverWait wait;

	public MultipleUsersDeactivaterequestforOperatingsystem(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Access Management'])[2]")
	WebElement accessmanagementoption;

	@FindBy(xpath = "//span[contains(text(),'Deactivate')]")
	public WebElement Deactivateoption;

	@FindBy(how = How.XPATH, using = "//div[@class='p-col-6 right-border']//div[2]//div[1]//div[2]")
	WebElement onbehalfrdbton;

	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div/div[@class='layout-wrapper layout-static layout-menu-dark']/div[@class='layout-main']/div[@class='layout-content']/div[@class='card card-w-title card-w-title-full-screen']/div[@class='create-access-request deactivate-request']/div[@class='p-grid card card-w-title user-category']/div[@class='p-col-6 right-border']/div[@class='radiobtnz']/div[@class='radiobtns']/div[2]/div[1]")
	WebElement multipleusersrdbton;

	@FindBy(how = How.XPATH, using = "//input[@name='Request_CategoryID']")
	WebElement requestCategorydropown;

	@FindBy(how = How.XPATH, using = "//input[@name='Request_LocationID']")
	WebElement locationdropdown;

	@FindBy(how = How.XPATH, using = "//input[@name='Os_HostName']")
	WebElement operatingsystemdropown;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Os_SoftwareName']")
	WebElement softwarenamedropown;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add User')]")
	WebElement AddUserbton;

	// User Details

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/a[1]/span[2]")
	WebElement userdetailsaccordion1;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement userntidsearchfield1;

	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-item']")
	WebElement userntidkey1;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]")
	WebElement empidtxtfield1;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/input[1]")
	WebElement jobtitletxtfield1;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]")
	WebElement joblocationtxtfield1;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/input[1]")
	WebElement departmenttxtfield1;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement supidsearchfield1;

	@FindBy(how = How.XPATH, using = "//div[@class='p-grid supervisor-details']//div[@class='dropdown-item']")
	WebElement supidkey1;

	// New UserDetails

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[1]/a[1]")
	WebElement userdetailsaccordion2;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement userntidsearchfield2;

	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-item']")
	WebElement userntidkey2;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]")
	WebElement empidtxtfield2;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/input[1]")
	WebElement jobtitletxtfield2;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]")
	WebElement joblocationtxtfield2;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/input[1]")
	WebElement departmenttxtfield2;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement supidsearchfield2;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]")
	WebElement supidkey2;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Display Access Request')]")
	WebElement Displayaccessrequestbton;

	@FindBy(how = How.XPATH, using = "//textarea[@name='RequestComment']")
	WebElement Remarktxtfield;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	WebElement Submitbton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
	WebElement Cancelbton;

	// e-Sign
	@FindBy(xpath = "//input[@placeholder='Username']")
	public WebElement eusername;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement epassword;

	@FindBy(xpath = "//span[contains(text(),'Accept')]")
	public WebElement eAccept;

	public void requestInf(String reqcate) throws InterruptedException {

		accessmanagementoption.click();
		Thread.sleep(2000);
		Deactivateoption.click();

		Thread.sleep(2000);

		onbehalfrdbton.click();
		Thread.sleep(2000);

		multipleusersrdbton.click();

		requestCategorydropown.sendKeys(reqcate);
		Thread.sleep(2000);

		requestCategorydropown.sendKeys(Keys.ARROW_DOWN);
		requestCategorydropown.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

	}

	public void enteroperatingsystemname(String Loc, String operatingsystemname,String softwarename) throws InterruptedException {

		locationdropdown.sendKeys(Keys.CONTROL + "a");
		locationdropdown.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		locationdropdown.sendKeys(Loc);
		Thread.sleep(2000);
		locationdropdown.sendKeys(Keys.ARROW_DOWN);
		locationdropdown.sendKeys(Keys.ENTER);

		operatingsystemdropown.sendKeys(Keys.CONTROL + "a");
		operatingsystemdropown.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		operatingsystemdropown.sendKeys(operatingsystemname);
		Thread.sleep(2000);
		operatingsystemdropown.sendKeys(Keys.ARROW_DOWN);
		operatingsystemdropown.sendKeys(Keys.ENTER);
		
		softwarenamedropown.sendKeys(Keys.CONTROL + "a");
		softwarenamedropown.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		softwarenamedropown.sendKeys(softwarename);
		Thread.sleep(2000);
		softwarenamedropown.sendKeys(Keys.ARROW_DOWN);
		softwarenamedropown.sendKeys(Keys.ENTER);

		AddUserbton.click();

		Thread.sleep(3000);

	}

	public void userDetails1(String userntid, String empid, String jobtitle, String Jobloc, String depid, String supid)
			throws InterruptedException {

		userdetailsaccordion1.click();

		TestUtil.IMPLICIT_WAIT = 5;

		userntidsearchfield1.sendKeys(userntid);
		Thread.sleep(2000);

		userntidkey1.click();

		Thread.sleep(3000);
		empidtxtfield1.sendKeys(empid);
		

		jobtitletxtfield1.sendKeys(jobtitle);

		joblocationtxtfield1.sendKeys(Jobloc);

		departmenttxtfield1.sendKeys(depid);

		supidsearchfield1.sendKeys(supid);
		Thread.sleep(4000);
		supidkey1.click();

	}

	public void userDetails2(String userntid1, String empid1, String jobtitle1, String Jobloc1, String depid1,
			String supid1,String eun, String epw) throws InterruptedException {

		userdetailsaccordion2.click();

		TestUtil.IMPLICIT_WAIT = 5;

		userntidsearchfield2.sendKeys(userntid1);
		Thread.sleep(2000);

		userntidkey2.click();

		Thread.sleep(3000);
		empidtxtfield2.sendKeys(empid1);
		

		jobtitletxtfield2.sendKeys(jobtitle1);

		joblocationtxtfield2.sendKeys(Jobloc1);

		departmenttxtfield2.sendKeys(depid1);

		supidsearchfield2.sendKeys(supid1);
		Thread.sleep(4000);
		supidkey2.click();

		Displayaccessrequestbton.click();

		Thread.sleep(2000);

		Remarktxtfield.sendKeys("Deactivation request");

		Submitbton.click();

		Thread.sleep(2000);

		eusername.sendKeys(eun);
		epassword.sendKeys(epw);
		eAccept.click();

	}

}
