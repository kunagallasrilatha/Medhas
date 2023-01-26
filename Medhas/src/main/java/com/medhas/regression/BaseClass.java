package com.medhas.regression;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.qa.utility.BrowserFactory;
import com.qa.utility.ConfigDataProvider;
import com.qa.utility.ExcelDataProvider;
import com.qa.utility.Helper;


public class BaseClass {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	
	
	@BeforeSuite
	public void setUpSuite() {
		
		  excel = new ExcelDataProvider();
		  
		  config = new ConfigDataProvider();
		 
		 
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		driver = BrowserFactory.launchBrowser(driver, config.getBrowser(),config.getqaURL());
		 
	}
	
	
	
	@AfterClass
	public void tearDown() {
		
		BrowserFactory.quitBrowser(driver);
	}

	
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
	if(result.getStatus()==ITestResult.SUCCESS) {
		Helper.captureScreenshot(driver);
	}


}
}
