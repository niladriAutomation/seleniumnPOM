package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProfilePage {
	public WebDriver driver;
	By profilename = By.xpath("//a[@title='View my customer account']");
	By profwishlistsection = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]");
	By orderhistoryicon = By.xpath("//i[@class='icon-list-ol']");
	By wishlistname = By.xpath("//a[contains(text(),'My wishlist')]");
	By productnameinwishlist = By.xpath("//p[@id='s_title']");
	By deletwishlist = By.xpath("//i[@class='icon-remove']");
	By orderrefname = By.xpath("//a[@class='color-myaccount']");
	By selectproduct = By.name("id_product");
	By msgtext = By.name("msgText");
	By sendbutton = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[2]/div[1]/button[1]/span[1]/i[1]");
	By successmessage = By.xpath("//p[@class='alert alert-success']");
	By personalinfo = By.xpath("//span[contains(text(),'My personal information')]");
	By oldpass = By.xpath("//input[@name='old_passwd']");
	By newpass = By.xpath("//input[@name='passwd']");
	By passconfirm = By.xpath("//input[@name='confirmation']");
	By passsave = By.name("submitIdentity");
	By profUpdateSuccessMsg = By.xpath("//p[@class='alert alert-success']");
	By profupdateerrormsg = By.xpath("//div[@class='alert alert-danger']");
			
	public ProfilePage(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebElement clickprofilename() {
		return driver.findElement(profilename);
	}
	public WebElement clickprofilewishlistsection() {
		return driver.findElement(profwishlistsection);
	}
	public WebElement clickMywishlistname() {
		return driver.findElement(wishlistname);
	}
	public WebElement checkProductNameInMywishlist() {
		return driver.findElement(productnameinwishlist);
	}
	public WebElement clickdeletwishlistname() {
		return driver.findElement(deletwishlist);
	}
	public WebElement clickmanageorder() {
		return driver.findElement(orderhistoryicon);
	
} 
	public WebElement clickorderrefname() {
		return driver.findElement(orderrefname);
	}
	public Select selectproductname() {
		WebElement element = driver.findElement(selectproduct);
		Select product = new Select(element);
		return product;	
	}
	public WebElement clickmsgarea() {
		return driver.findElement(msgtext);
	
	}
	public WebElement clicksendbutton() {
		return driver.findElement(sendbutton);
	}
	
	public WebElement clickpersonalinfo() {
		return driver.findElement(personalinfo);
	}
	public WebElement Enteroldpass() {
		return driver.findElement(oldpass);
	}
	public WebElement EnternewPass() {
		return driver.findElement(newpass);
	}
	public WebElement Enterconfirmation() {
		return driver.findElement(passconfirm);
	}
	public WebElement clickpassSave() {
		return driver.findElement(passsave);
	}
	public WebElement checkProfUpdateSuccessmessage() {
		return driver.findElement(profUpdateSuccessMsg);
	}
	public WebElement checkSuccessmessage() {
		return driver.findElement(successmessage);
	}
	public WebElement checkProfUpdateErrormessage() {
		return driver.findElement(profupdateerrormsg);
	
	}
	}
