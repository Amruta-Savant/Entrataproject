package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.baseclass;

public class basecamppage  extends baseclass{
	WebDriver driver;
	
	public basecamppage(WebDriver driver) {           
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[2]/div[4]/a")
	public WebElement basecampbtn;
	
	@FindBy(xpath = "//*[text()='Register Now']")
	public WebElement registornowbtn;
	
	@FindBy(xpath = "//*[@id=\"56aeaca6-a0ad-4548-8afc-94d8d4361ba1\"]")
	public WebElement name;

	
	@FindBy(xpath = "//*[@id=\"cfc98829-80b7-41b6-82b5-b968d43ef1c1\"]")
	public WebElement lastname;

	
	@FindBy(xpath = "//*[@id=\"227f50d0-f65b-4a72-9a4f-5060ea05f6ab\"]")
	public WebElement company;
	
	@FindBy(xpath = "//*[@id=\"228cc308-a4d9-4212-8454-8407dd578c3d\"]")
	public WebElement title;
	

	
	@FindBy(xpath = "//*[@id=\"ff919d05-4281-4d9c-aa0d-82e3722d580d\"]")
	public WebElement Email;
	

	@FindBy(xpath = "//*[@id=\"032e80c1-f29f-44e6-af13-a89e53906422\"]")
	public WebElement phoneno;
	

	@FindBy(xpath = "//*[@id=\"exit\"]")
	public WebElement cancel;
	
	@FindBy(xpath = "//*[@id=\"forward\"]")
	public WebElement next;
	
	
	public void RegisterTocamp() throws InterruptedException
	{ 
		Thread.sleep(3000);
		name.sendKeys("vivek");
		lastname.sendKeys("Savant");
		company.sendKeys("Doshaheen solutions");
		title.sendKeys("test");
		Email.sendKeys("amrutasj16@gmail.com");
		phoneno.sendKeys("9380828735");
	}
	
	


}
