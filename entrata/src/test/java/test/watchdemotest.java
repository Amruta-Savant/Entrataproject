package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BasePackage.baseclass;
import pages.watchdemopage;

public class watchdemotest extends baseclass {
	
	@Test
	public void fillForm()
	{
		watchdemopage wd=new watchdemopage(driver);
		wd.watchDemobtn.click();
		wd.VerifyformTowatchdemo();
		wd.firstname.sendKeys("Amruta");
		wd.lastname.sendKeys("savant");
		wd.email.sendKeys("amrutasj16@gmail.com");
		wd.companyname.sendKeys("entrata");
		scrollpage();
		wd.phoneNum.sendKeys("9380828735");
	    Select se=new Select(wd.unitcount);
	    se.selectByIndex(1);
	    wd.jobtitle.sendKeys("tester");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select=new Select(wd.Iam);
	    select.selectByIndex(2);
		
	}

}
