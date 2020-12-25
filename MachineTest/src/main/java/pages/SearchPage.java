package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	public WebDriver driver;
	
	By searchfield = By.cssSelector("#search_query_top");
	By searchicon = By.xpath("//button[@name='submit_search']");
	By invalidsearchresults = By.cssSelector("body.search.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-9 > p.alert.alert-warning");
	By validSearchResults = By.cssSelector("body.search.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-9 h1.page-heading.product-listing:nth-child(1) > span.lighter");
	By blanksearchResults = By.xpath("//p[contains(text(),'Please enter a search keyword')]");
	By searchproductcartmove= By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]");
	By searchProductcart = By.xpath("//span[contains(text(),'Add to cart')]");
	
	
	
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebElement EnterSearchField() {
		return driver.findElement(searchfield);
		
	}
	public WebElement clickSearchIcon() {
		return driver.findElement(searchicon);
		
	}
	public WebElement CheckInvalidSearchresults() {
		return driver.findElement(invalidsearchresults);
		
	}
	public WebElement CheckValidSearchResults() {
		return driver.findElement(validSearchResults);
		
	}
	public WebElement CheckBlankSearchResults() {
		return driver.findElement(blanksearchResults);
		
	}
	public WebElement MovemousetosearchProduct() {
		return driver.findElement(searchproductcartmove);
		
	}
	public WebElement clicksearchProducttoCart() {
		return driver.findElement(searchProductcart);
		
	}
	
}
