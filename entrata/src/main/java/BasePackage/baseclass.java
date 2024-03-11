package BasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public  WebDriver driver;
    
    @BeforeClass
	public void OpenBrowser()
	{
//    	WebDriverManager.chromedriver().setup();;
//    	driver=new  ChromeDriver();
    	
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\required jars\\chromedriver_win32\\chromedriver.exe");
   driver=new ChromeDriver();
	driver.manage().window().maximize();
     driver.get("https://www.entrata.com/");
     acceptcookie();
	}
	
	@AfterClass
	public void Browserclose()
	{
		driver.quit();
	}
	
	public void acceptcookie()
	{
		WebElement cookie=driver.findElement(By.xpath("//*[@id='rcc-confirm-button']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rcc-confirm-button']")));
		cookie.click();
	}
	
	public void scrollpage()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;  
	    js.executeScript("window.scrollBy(0,1000)");
	}
	

}
