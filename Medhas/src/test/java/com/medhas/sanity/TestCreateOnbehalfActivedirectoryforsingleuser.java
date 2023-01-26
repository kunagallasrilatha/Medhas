/**
 * 
 */
package com.medhas.sanity;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.CreateOnbehalfActivedirectoryforSingleuser;
import com.medhas.regression.Loginpage;

/**
 * @author chennoju
 *
 */
public class TestCreateOnbehalfActivedirectoryforsingleuser extends BaseClass {

	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void EnterRequestinfo() throws InterruptedException {
		CreateOnbehalfActivedirectoryforSingleuser AccessRequestforActivedirectory = PageFactory.initElements(driver,
				CreateOnbehalfActivedirectoryforSingleuser.class);
		AccessRequestforActivedirectory.SelfCreateAccessRequest(
				excel.getStringData("AccessreqforActiveDirectory", 1, 0),
				excel.getStringData("UserDetailsforAccessrequest", 1, 0));
	}

	@Test(priority = 3)
	public void EnterUserdetails() throws InterruptedException {
		CreateOnbehalfActivedirectoryforSingleuser AccessRequestforActivedirectory = PageFactory.initElements(driver,
				CreateOnbehalfActivedirectoryforSingleuser.class);
		AccessRequestforActivedirectory.Userdetailstcreation(excel.getStringData("UserDetailsforAccessrequest", 1, 2),
				excel.getStringData("UserDetailsforAccessrequest", 1, 3),
				excel.getStringData("UserDetailsforAccessrequest", 1, 4),
				excel.getStringData("UserDetailsforAccessrequest", 1, 5),
				excel.getStringData("UserDetailsforAccessrequest", 1, 6),
				excel.getStringData("UserDetailsforAccessrequest", 1, 7),
				excel.getStringData("UserDetailsforAccessrequest", 1, 8),
				excel.getStringData("UserDetailsforAccessrequest", 1, 9));
	}

	@Test(priority = 4)
	public void EnterActivedirectorydetails() throws InterruptedException {
		CreateOnbehalfActivedirectoryforSingleuser AccessRequestforActivedirectory = PageFactory.initElements(driver,
				CreateOnbehalfActivedirectoryforSingleuser.class);
		AccessRequestforActivedirectory.Activedirectory(excel.getStringData("AccessreqforActiveDirectory", 1, 1),
				excel.getStringData("AccessreqforActiveDirectory", 1, 2));
	}

	@Test(priority = 5)
	public void EnterRemarksandesign() throws InterruptedException {
		CreateOnbehalfActivedirectoryforSingleuser AccessRequestforActivedirectory = PageFactory.initElements(driver,
				CreateOnbehalfActivedirectoryforSingleuser.class);
		AccessRequestforActivedirectory.Remarks(excel.getStringData("Login", 5, 0), excel.getStringData("Login", 1, 2));
	}
}
