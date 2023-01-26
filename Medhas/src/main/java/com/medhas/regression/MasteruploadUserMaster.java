/**
 * 
 */
package com.medhas.regression;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qa.utility.TestUtil;

/**
 * @author Shashank
 *
 */
public class MasteruploadUserMaster {
	WebDriver driver;
	
	
	public MasteruploadUserMaster(WebDriver driver) {
		this.driver = driver;
	
		

	}
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]/div[1]/span[2]" )
	WebElement masteruploadoption;
	
	@FindBy(xpath = "//span[contains(text(),'User Master')]")
	public WebElement usermasteroption;
	
	
	@FindBy(xpath = "//span[contains(text(),'OK')]")
	public WebElement okpopup;
	
	
	@FindBy(xpath = "//span[@class='p-button-text p-c'][contains(text(),'Upload')]")
	public WebElement uploadbton;
	
	@FindBy(xpath = "//input[@name='LocationId']")
	public WebElement locationdropdown;
	
	@FindBy(xpath = "//input[@name='Application']")
	public WebElement applicationdropdown;
	
	@FindBy(xpath = "//input[@name='FileName']")
	public WebElement choosefilebton;
	
	@FindBy(xpath = "//span[@class='p-button-text p-c'][contains(text(),'Process')]")
	public WebElement processbton;
	
	//e-Sign
	@FindBy(xpath = "//input[@placeholder='Username']")
	public WebElement eusername;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement epassword;
	
	@FindBy(xpath = "//span[contains(text(),'Accept')]")
	public WebElement eAccept;
	
	
	
public void usermaster() throws InterruptedException {
		
		masteruploadoption.click();
		
		Thread.sleep(4000);
		
		usermasteroption.click();
		
		Thread.sleep(3000);
		
		okpopup.click();
		
	}

public void usermasterupload(String Loc,String appname, String eun, String epw) throws InterruptedException {
	
	
	uploadbton.click();
	
	TestUtil.IMPLICIT_WAIT=10;

	locationdropdown.sendKeys(Loc);
	Thread.sleep(2000);

	locationdropdown.sendKeys(Keys.ARROW_DOWN);
	locationdropdown.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	
	
	applicationdropdown.sendKeys(appname);
	Thread.sleep(2000);

	applicationdropdown.sendKeys(Keys.ARROW_DOWN);
	applicationdropdown.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	
	
	
	
	String path = System.getProperty("user.dir") + "\\MasterUpload\\" + "\\DCM AR.xlsx";
	choosefilebton.sendKeys(path);
	
	Thread.sleep(2000);
	//processbton.click();
	
	
	
	
	
	
	
	
	


	
	
	
}

	
}
