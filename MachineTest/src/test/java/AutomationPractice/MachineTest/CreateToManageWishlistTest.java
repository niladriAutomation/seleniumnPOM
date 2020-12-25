package AutomationPractice.MachineTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.DressPage;
import pages.HomePage;
import pages.ProfilePage;

public class CreateToManageWishlistTest extends BeforeMethodTest {
	@Test(priority = 3)
	public void createToManageWishlist() throws IOException {
		//create wishlist
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\MachineTest\\config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		HomePage hp = new HomePage(driver);
		hp.signin().click();
		hp.EnterloginEmail().sendKeys(prop.getProperty("regmail"));
		hp.Enterloginpwd().sendKeys(prop.getProperty("pass"));
		hp.clicksubmit().click();
		hp.clickDress().click();
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollTo(0,650)");
		DressPage dp = new DressPage(driver);
		dp.clickPrintdress().click();
		CartPage cp = new CartPage(driver);
		cp.clickwishlist().click();
		Actions action = new Actions(driver);
		WebElement crosselement = cp.clickcrosswishlist();
		action.moveToElement(crosselement).perform();
		action.click(crosselement).perform();
		ProfilePage pp = new ProfilePage(driver);
		pp.clickprofilename().click();
		pp.clickprofilewishlistsection().click();
		je.executeScript("window.scrollTo(0,600)");
		pp.clickMywishlistname().click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//managewishlisht by deleting name
		pp.clickdeletwishlistname().click();
		driver.switchTo().alert().accept();
		
		
		
		
		
	}

}
