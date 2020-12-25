package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressPage {
	By newaddress = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/p[1]/a[1]/span[1]");
	                        
	By saveaddressbutton = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[2]/button[1]/span[1]");
	By textaddress = By.xpath("//h1[contains(text(),'Your addresses')]");
	By upaddresscheckout = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]");
	By terms = By.xpath("//input[@id='cgv']");
	By termspage = By.xpath("//h1[contains(text(),'Shipping')]");
	By paymentheadline = By.xpath("//h1[contains(text(),'Please choose your payment method')]");
	By shippingcheckout = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]");
	By bankwire = By.xpath("//a[@class='bankwire']");
	By confirmorderbutton = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]");
	By orderconfirmmessage = By.xpath("//strong[contains(text(),'Your order on My Store is complete.')]");
	                           
	public WebDriver driver;
	public AddressPage(WebDriver driver) {
		this.driver=driver;
		
		
	}
	public WebElement clicknewaddressbutton() {
		return driver.findElement(newaddress);
	}
	public WebElement saveaddressbutton() {
		return driver.findElement(saveaddressbutton);
	}
	public WebElement checkaddresstext() {
		return driver.findElement(textaddress);
	}
	public WebElement clickchecoutfromaddresspage() {
		return driver.findElement(upaddresscheckout);
	}
	public WebElement clickTerms() {
		return driver.findElement(terms);
	}
	public WebElement checkShippingheading() {
		return driver.findElement(termspage);
	}
	public WebElement checkpaymentheading() {
		return driver.findElement(paymentheadline);
	
	}
	public WebElement checkpayment() {
		return driver.findElement(bankwire);
	}
	
	public WebElement Clickconfirmorder() {
		return driver.findElement(confirmorderbutton);
	}
	public WebElement Checkconfirmorder() {
		return driver.findElement(orderconfirmmessage);
	}
	public WebElement ClickShippingProceed() {
		return driver.findElement(shippingcheckout);
}
}