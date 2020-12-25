package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	By proceedbutton = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]");
	By wishlistbutton = By.cssSelector("#wishlist_button");
	By crosswishlistbutton = By.xpath("//a[@title='Close']");
	
	
	public WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebElement ClickProceedtoCart() {
		return driver.findElement(proceedbutton);
		
	}
	public WebElement clickwishlist() {
		return driver.findElement(wishlistbutton);
	}
	public WebElement clickcrosswishlist() {
		return driver.findElement(crosswishlistbutton);
	}
}
