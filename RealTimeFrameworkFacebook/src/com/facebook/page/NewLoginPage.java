/**
 * @author Srilatha
 */
package com.facebook.page;

import com.facebook.genericPage.MasterPage;

/**
 * @author srilata
 *
 */
public class NewLoginPage extends MasterPage{
	
	public NewLoginPage() throws Exception {
		super();
	}
	
	public void clickusertextfield() {
		click("Username");
	}

	public void enteruserdata() {
		enterData("Username", "testdata1");

	}

	public void clickpassword() {
		click("Password");
	}

	public void enterpassword() {
		enterData("Password", "testdata2");
	}

	public void siginbutton() {
		click("Siginbutton");
	}
}
