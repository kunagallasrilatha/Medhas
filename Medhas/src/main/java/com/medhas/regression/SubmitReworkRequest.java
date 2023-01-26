/**
 * 
 */
package com.medhas.regression;

import org.openqa.selenium.By;
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
public class SubmitReworkRequest {

	WebDriver driver;
	WebDriverWait wait;

	public SubmitReworkRequest(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='nav']/span[text()='Access Management'])[2]")
	WebElement accessmanagementoption;

	@FindBy(xpath = "//span[contains(text(),'My Request')]")
	public WebElement myRequest;

	@FindBy(xpath = "//span[contains(text(),'Request Id')]")
	public WebElement requestidheader;

	// To pick up rework request

	@FindBy(xpath = "//div[@class='REWORK']")
	public WebElement reworkRequestpickup;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
	WebElement Submitbtn;

	// Toast Message
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Successfully Updated Access Request')]")
	WebElement ReworksubmitRequestToastmsg;

	// e-Sign
	@FindBy(xpath = "//input[@placeholder='Username']")
	public WebElement eusername;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement epassword;

	@FindBy(xpath = "//span[contains(text(),'Accept')]")
	public WebElement eAccept;

	public void submitreworkRequest(String eun, String epw) throws InterruptedException {

		accessmanagementoption.click();

		Thread.sleep(2000);

		myRequest.click();

		Thread.sleep(3000);

		requestidheader.click();
		requestidheader.click();
		Thread.sleep(3000);

		reworkRequestpickup.click();
		Thread.sleep(4000);

		Submitbtn.click();
		Thread.sleep(1000);
		eusername.sendKeys(eun);
		epassword.sendKeys(epw);
		eAccept.click();

	}

	
	
public void Toastmsg() throws InterruptedException {
		
		Thread.sleep(4000);

		if (ReworksubmitRequestToastmsg.isDisplayed()) {
			
			
			String expectedMessage = "Successfully Updated";
			String message = driver.findElement(By.xpath("//div[contains(text(),'Successfully Updated')]")).getText();
			System.out.println(ReworksubmitRequestToastmsg.getText());
			Assert.assertEquals("Successfully Updated", expectedMessage);
			
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
