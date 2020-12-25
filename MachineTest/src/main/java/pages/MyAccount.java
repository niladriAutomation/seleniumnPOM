package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount {
public WebDriver driver;

public MyAccount(WebDriver driver) {
	this.driver=driver;
}



	
public String getpagetitle() {
	return driver.getTitle();
}
}
