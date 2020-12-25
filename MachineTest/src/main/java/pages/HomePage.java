package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	By signin= By.xpath("//a[contains(text(),'Sign in')]");
	By emailaddress= By.xpath("//input[@id='email_create']");
	By createAnAccount = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]");
	By dresslink= By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]");
	By loginmail = By.cssSelector("#email");
	By pwd = By.cssSelector("#passwd");
	By submitButton = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]");
	
	 public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement signin() {
		 return driver.findElement(signin);
		 
	 }
	public WebElement enterEmail() {
		return driver.findElement(emailaddress);
		
	}
	public WebElement clickCreateAccount() {
		return driver.findElement(createAnAccount);

}
	public WebElement clickDress() {
		return driver.findElement(dresslink);
		
	}
	public WebElement EnterloginEmail() {
		return driver.findElement(loginmail);
		
	}
	public WebElement Enterloginpwd() {
		return driver.findElement(pwd);
		
	}
	public WebElement clicksubmit() {
		return driver.findElement(submitButton);
		
	}
	


}
