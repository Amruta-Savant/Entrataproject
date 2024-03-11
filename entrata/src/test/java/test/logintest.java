package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.baseclass;
import pages.loginpage;

import org.testng.annotations.Test;

public class logintest extends baseclass {
	
	@Test
	public void verifylogin() throws InterruptedException
	{
	
		loginpage login=new loginpage(driver);
		login.signinbtn.click();
		scrollpage();
		Thread.sleep(2000);
		Assert.assertTrue(login.managerLogin.isDisplayed());
		Assert.assertTrue(login.residentlogin.isDisplayed());
		login.managerLogin.click();
		login.loginfunction();
		String Errormsgtxt="The username and password provided are not valid. Please try again.";
		Assert.assertEquals(login.errormsg.getText(), Errormsgtxt);
	}

}
