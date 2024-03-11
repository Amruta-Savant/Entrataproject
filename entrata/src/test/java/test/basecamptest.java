package test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import BasePackage.baseclass;
import pages.basecamppage;

public class basecamptest extends baseclass {
	

	
	@Test
	public void verifyCampRegistration() throws InterruptedException
	{
		basecamppage BC=new basecamppage(driver);
		BC.basecampbtn.click();
		Set<String> ID=	driver.getWindowHandles();
		System.out.println(ID);
		Iterator<String> it = ID.iterator();
		String parentWindowID = it.next();
		String childWindowID = it.next();
		driver.switchTo().window(childWindowID);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Register Now']")));
		BC.registornowbtn.click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		scrollpage();
		BC.RegisterTocamp();
		Assert.assertTrue(BC.next.isDisplayed());
		Assert.assertTrue(BC.cancel.isDisplayed());
		BC.cancel.click();
	}

}
