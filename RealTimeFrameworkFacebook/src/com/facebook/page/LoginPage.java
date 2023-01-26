/**
 * @author Srilatha
 */
package com.facebook.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author srilata
 *
 */
public class LoginPage {
	WebDriver driver;

	@Test
	public void medhasdslogin() throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://medhas.walkingtree.tech/");
		String mainpage = driver.getWindowHandle();
		System.out.println("mainpagewindowhandles :" + mainpage + driver.getTitle());

		WebElement dd = driver.findElement(By.xpath("//input[@name='domainName']"));
		dd.sendKeys("spil.com");
		Thread.sleep(1000);
		dd.sendKeys(Keys.ARROW_DOWN);
		dd.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("sudhakar.lingala");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ewsuser23");

		driver.findElement(By.xpath("//a[normalize-space()='User Manual']")).click();
		Thread.sleep(1000);
		driver.switchTo().window(mainpage);
		driver.findElement(By.xpath("//span[normalize-space()='Sign In']")).click();
		Thread.sleep(5000);
		
		
		//Administrator//master//role
		driver.findElement(By.xpath("//li[@class='layout-root-menuitem']//ul//li//span[@class='layout-menuitem-text'][normalize-space()='Administration']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Master']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='nav'])[32]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Create Role']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='p-dialog-titlebar-close-icon pi pi-times']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Create Role']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Create Role']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("admin1234");
		driver.findElement(By.xpath("//textarea[@id='Description']")).sendKeys("admin");
		WebElement role=driver.findElement(By.xpath("//input[@name='RoleCategoryId']"));
		role.sendKeys("LIT GSD");
		Thread.sleep(1000);
		role.sendKeys(Keys.ARROW_DOWN);
		role.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("sudhakar.lingala");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("sudhakar.lingala");
		driver.findElement(By.xpath("//span[normalize-space()='Accept']")).click();
		
		String actualtext="Role has been created successfully";
		Assert.assertEquals(actualtext, "Role has been created successfully");
		System.out.println("proper message is displayed");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='header-profile-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		
		driver.quit();
	}

}
