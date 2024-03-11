package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BasePackage.baseclass;

public class watchdemopage extends baseclass   {
	
	WebDriver driver;
	public watchdemopage(WebDriver driver) {           
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
//	homepage home=new homepage();
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[3]/a[1]")
	public WebElement watchDemobtn;
	
	@FindBy(id = "FirstName")
	public WebElement firstname;
	
	@FindBy(xpath = "//*[@id='LastName']")
	public WebElement lastname;
	
	@FindBy(xpath = "//*[@id='Email']")
	public WebElement email;
	
	@FindBy(xpath = "//*[@id='Company']")
	public WebElement companyname;
	
	@FindBy(xpath = "//*[@id=\"Phone\"]")
	public WebElement phoneNum;
	
	@FindBy(xpath = "//*[@id=\"Unit_Count__c\"]")
	public WebElement unitcount;
	
	@FindBy(xpath = "//*[@id='Title']")
	public WebElement jobtitle;
	
	@FindBy(xpath = "//*[@id=\"demoRequest\"]")
	public WebElement Iam;
	
	@FindBy(xpath = "//*[@id=\"mktoForm_1108\"]/div[17]/span/button")
	public WebElement submitbtn;
	
	public void VerifyformTowatchdemo()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(firstname.isDisplayed());
		Assert.assertTrue(lastname.isDisplayed());
		Assert.assertTrue(email.isDisplayed());
		Assert.assertTrue(companyname.isDisplayed());
		Assert.assertTrue(phoneNum.isDisplayed());
		Assert.assertTrue(unitcount.isDisplayed());
		Assert.assertTrue(jobtitle.isDisplayed());
		Assert.assertTrue(submitbtn.isDisplayed());
		
	}
	

}
