package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Authentication {
public WebDriver driver;
By heading = By.xpath("//h3[contains(text(),'Your personal information')]");
By title = By.xpath("//input[@id='id_gender1']");
By Cfirstname = By.xpath("//input[@id='customer_firstname']");
By Clastname = By.cssSelector("#customer_lastname");
By email = By.xpath("//input[@id='email']");
By password = By.cssSelector("#passwd");
By dob_days = By.xpath("//select[@id='days']");
By dob_month = By.xpath("//select[@id='months']");
By dob_years = By.xpath("//select[@id='years']");
By newswletter = By.xpath("//input[@id='newsletter']");
By specialoffer = By.xpath("//input[@id='optin']");
By fname = By.xpath("//input[@id='firstname']");
By lname = By.xpath("//input[@id='lastname']");
By company = By.xpath("//input[@id='company']");
By Addres = By.xpath("//input[@id='address1']");
By Addres2 = By.xpath("//input[@id='address2']");
By city = By.xpath("//input[@id='city']"); 
By state = By.xpath("//select[@id='id_state']");
By Zip = By.xpath("//input[@id='postcode']");
By country = By.xpath("//select[@id='id_country']");
By Additionalinfo = By.xpath("//textarea[@id='other']");
By HomePhNo = By.xpath("//input[@id='phone']");
By MobileNO = By.xpath("//input[@id='phone_mobile']");
By AddressAssign = By.xpath("//input[@id='alias']");
By registerbutton =By.cssSelector("body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 form.std.box div.submit.clearfix:nth-child(4) button.btn.btn-default.button.button-medium:nth-child(4) > span:nth-child(1)");
By duplicatemessage = By.xpath("//li[contains(text(),'An account using this email address has already be')]");
By blankregisterbutton = By.xpath("//p[contains(text(),'There are 8 errors')]");




public Authentication(WebDriver driver) {
	this.driver=driver;
}
public WebElement checkheading() {
	return driver.findElement(heading);
	
}
public WebElement clicktitle() {
	return driver.findElement(title);
}
public WebElement EnterCfirstname() {
	return driver.findElement(Cfirstname);
}
public WebElement EnterClastname() {
	return driver.findElement(Clastname);
	
}
public WebElement checkmail() {
	return driver.findElement(email);
}
public WebElement EnterPassword() {
	return driver.findElement(password);
	
}
public Select clickdays() {
	WebElement dayobj= driver.findElement(dob_days);
	Select day = new Select(dayobj);
	return day;
		
}
public Select clickmonths() {
	WebElement Monthobj = driver.findElement(dob_month);
	Select month = new Select(Monthobj); 
	return month;
}
public Select clickYear() {
	WebElement yearobj = driver.findElement(dob_years);
	Select year = new Select (yearobj);	
	return year;
}
public WebElement clicknewsletter() {
	return driver.findElement(newswletter);
	
}
public WebElement clickspecialoffer() {
	return driver.findElement(specialoffer);
	
}
public WebElement checkfname() {
	return driver.findElement(fname);
	
	
}
public WebElement checklname() {
	return driver.findElement(lname);
	
}
public WebElement Entercompany() {
	return driver.findElement(company);
	
}
public WebElement EnterAddress() {
	return driver.findElement(Addres);
	
}
public WebElement EnterAddress2() {
	return driver.findElement(Addres2);
}
public WebElement Entercity() {
	return driver.findElement(city);
	
}
public Select statename() {
	WebElement stateobj = driver.findElement(state);
	Select st= new Select(stateobj);
	return st;
	
}
public WebElement EnterZip() {
	return driver.findElement(Zip);
	
}
public Select countryName() {
	WebElement cnameobj = driver.findElement(country);
	Select cn= new Select(cnameobj);
	return cn;
	
}
public WebElement EnterAdditionalinfo() {
	return driver.findElement(Additionalinfo);
	
}
public WebElement EnterHomeNo() {
	return driver.findElement(HomePhNo);
	
}
public WebElement EnterMobileNO() {
	return driver.findElement(MobileNO);
	
}
public WebElement EnterAssignaddress() {
	return driver.findElement(AddressAssign);
	
}
public WebElement clickRegisterButton() {
	return driver.findElement(registerbutton);
	
}
public WebElement checkduplicatemsg() {
	return driver.findElement(duplicatemessage);
}
public WebElement checkblankregister() {
	return driver.findElement(blankregisterbutton);
}

}
