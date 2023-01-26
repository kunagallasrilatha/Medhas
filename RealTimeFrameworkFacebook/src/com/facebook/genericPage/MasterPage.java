/**
 * @author Srilatha
 */
package com.facebook.genericPage;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * @author srilata
 *
 */
public class MasterPage {

	public static WebDriver driver;
	public Properties prop;
	public Properties or;
	public Properties td;

	public MasterPage() throws Exception {
		
		// configuration properiest file

		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\reprository\\Configuration.properties");
		prop = new Properties();
		prop.load(ip);

		// locators properties file
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\reprository\\locators.properties");
		or = new Properties();
		or.load(fs);

		
		//test data properties file
		
		FileInputStream ts = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\reprository\\testdata.properties");
		td = new Properties();
		td.load(ts);

		// browser lanuching
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+ "\\src\\com.facebook.drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\src\\com.facebook.drivers\\chromedriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("open IE browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

	// click method
	public void click(String xpathkey)
	{
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	}

//enter data
	public void enterData(String xpathkey, String testData)
	{
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(td.getProperty(testData));
	}

//clear data

	public void clear(String xpathkey)
	{
		driver.findElement(By.xpath(or.getProperty(xpathkey))).clear();
	}

	//mouse over
	
	public void moveToElement(String xpathkey)
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathkey)))).build().perform();	
	}
	
	
	//click list of web element
	public void clickListElement(String xpathkey, String testData)
	{
		List <WebElement> radios=driver.findElements(By.xpath(or.getProperty(xpathkey)));
		for(int i=0;i<radios.size();i++)
		{
			if(radios.get(i).getText().equalsIgnoreCase(td.getProperty(testData)))	
			{
				radios.get(i).click();
			}
		}
	}
	
	
	//selct dropdown values
	public void selectDropdownvalues(String xpathkey, String testdata)
	{
		Select vales=new Select(driver.findElement(By.xpath(or.getProperty(xpathkey))));
		vales.selectByValue(td.getProperty(testdata));
	}
	
	
}
