/**
 * @author Srilatha
 */
package com.facebook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.facebook.genericPage.MasterPage;
import com.facebook.page.NewLoginPage;

/**
 * @author srilata
 *
 */
public class TestLoginpage {

@Test
public void logintest() throws Exception
{

NewLoginPage pl= new NewLoginPage();
pl.clickusertextfield();
pl.enteruserdata();
pl.clickpassword();
pl.enterpassword();
pl.siginbutton();
}

@Test
public void validation()
{
	System.out.println("validation");
}



@AfterClass
public void closebrowser()
{
	MasterPage.driver.close();
}
}
