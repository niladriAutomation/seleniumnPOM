package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DressPage {
	public WebDriver driver;
	By printeddress = 	By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]");
	By printeddressaddcart = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[1]/span[1]");
	By totalcartmessage= By.xpath("//span[@id='total_price']");
	By Proceedtocheckout = By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]");
	                               
	
	public DressPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebElement clickPrintdress() {
		return driver.findElement(printeddress);
		
	}
	
	public WebElement clickprintdresscart() {
		return driver.findElement(printeddressaddcart);
		
	}
	
	public WebElement ClickProceedtoCheckOut() {
		return driver.findElement(Proceedtocheckout);
		
	}
	public WebElement singleProductcartmessage() {
		return driver.findElement(totalcartmessage);
		
	}
	
	
	

}
