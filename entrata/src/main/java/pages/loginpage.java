package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.baseclass;

public class loginpage extends baseclass {
	WebDriver driver;
	
	public loginpage(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
//	homepage home=new homepage();
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[3]/a[2]")
	public WebElement  signinbtn;
	
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div/div/div/div[1]/div/div[3]/a[1]")
	public WebElement managerLogin;
	 
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div/div/div/div[1]/div/div[3]/a[2]")
	public WebElement residentlogin;
	
	@FindBy(xpath = "//*[@id=\"entrata-username\"]")
	public WebElement username;
	
	@FindBy(xpath = "//*[@id=\"entrata-password\"]")
	public WebElement password;
	
	@FindBy(xpath = "//*[@id=\"fsm_request_demo\"]/ul/li[3]/button")
	public WebElement loginbtn;
	
	@FindBy(xpath= "//*[@id=\"statusMessage\"]")
	public WebElement errormsg;
	
	
	
	public void loginfunction()
	{
				
		username.sendKeys("Amruta");
		password.sendKeys("test@2345");
		loginbtn.click();
	
		
	}



	
	

}
