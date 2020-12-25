package AutomationPractice.MachineTest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.JavascriptExecutor ;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddressPage;
import pages.Authentication;
import pages.CartPage;
import pages.DressPage;
import pages.HomePage;
import pages.SearchPage;

public class SearchProdToMangOrdToRegisToUpdateAddrsToPlacOrderTest extends BeforeMethodTest {
	@Test(priority = 4) 
	public void SearchToOrderPlaceUpdateAddress() throws IOException {
		//product added to cart
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\MachineTest\\config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		SearchPage sp = new SearchPage(driver);
		 sp.EnterSearchField().sendKeys("Faded Short Sleeve T-shirts");
		 sp.clickSearchIcon().click(); 
		 String messagetext=(sp.CheckValidSearchResults().getText());
		 Assert.assertEquals("\"FADED SHORT SLEEVE T-SHIRTS\"", messagetext);
		 sp.MovemousetosearchProduct().click();
		 sp.clicksearchProducttoCart().click();
		 JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollTo(0,650)");
		DressPage dp = new DressPage(driver);
		dp.ClickProceedtoCheckOut().click();
		je.executeScript("window.scrollTo(0,650)");
		String amt = dp.singleProductcartmessage().getText();
		System.out.println(amt);
		Assert.assertEquals("$18.51", amt);
		CartPage cp = new CartPage(driver);
		cp.ClickProceedtoCart().click();
		// sign in 
		  HomePage rp = new HomePage(driver);
		  rp.enterEmail().sendKeys(prop.getProperty("mail"));
		  rp.clickCreateAccount().click(); 
		  Authentication au= new Authentication(driver); 
		  System.out.println(au.checkheading().getText());
		  Assert.assertEquals(au.checkheading().getText(), "YOUR PERSONAL INFORMATION"); 
		  au.clicktitle().click();
		  au.EnterCfirstname().sendKeys("QA"); 
		  au.EnterClastname().sendKeys("check");
		  String str = au.checkmail().getAttribute("Value");
		  System.out.println("value: "+ str);
		  Assert.assertEquals(prop.getProperty("mail"),str);
		  au.EnterPassword().sendKeys(prop.getProperty("pass")); au.clickdays().selectByValue("2");
		  au.clickmonths().selectByValue("1"); au.clickYear().selectByValue("2020");
		  au.clicknewsletter().click(); au.clickspecialoffer().click(); 
		  String fname = au.checkfname().getAttribute("value"); 
		  System.out.println("value: "+ fname);
		  Assert.assertEquals("QA",fname); 
		  String lname = au.checklname().getAttribute("value");
		  System.out.println("value: "+ lname);
		  Assert.assertEquals("check",lname);
		  au.Entercompany().sendKeys("testCompany");
		  au.EnterAddress().sendKeys("123/4 e.g road"); au.Entercity().sendKeys("LA");
		  au.statename().selectByValue("21"); au.EnterZip().sendKeys("66543");
		  au.countryName().selectByValue("21");
		  au.EnterAdditionalinfo().sendKeys("demo");
		  au.EnterHomeNo().sendKeys("9876543210");
		  au.EnterMobileNO().sendKeys("9876543210");
		  au.EnterAssignaddress().sendKeys("14/3 road");
		  au.clickRegisterButton().click(); 
		  //check landing on addresspage or not 
		  AddressPage ap = new AddressPage(driver);
		  je.executeScript("window.scrollTo(0,750)");
		  ap.clicknewaddressbutton().click();
		  Assert.assertEquals("YOUR ADDRESSES", ap.checkaddresstext().getText());
		  System.out.println("AddressMatched");
		  //updating address
		  au.EnterAddress().sendKeys("Updated");
		  au.EnterAddress2().sendKeys("updated address 2");
		  au.Entercity().sendKeys("updated city");
		  au.statename().selectByValue("2");
		  au.EnterZip().sendKeys("00000");
		  au.countryName().selectByValue("21");
		  au.EnterHomeNo().sendKeys("9876543210");
		  au.EnterMobileNO().sendKeys("9876543210");
		  au.EnterAdditionalinfo().sendKeys("Updated additional info");
		  au.EnterAssignaddress().clear();
		  au.EnterAssignaddress().sendKeys("updated new alias address");
		  ap.saveaddressbutton().click();
		  ap.clickchecoutfromaddresspage().click();
		  Assert.assertEquals("SHIPPING", ap.checkShippingheading().getText());
		  ap.clickTerms().click();
		  ap.ClickShippingProceed().click();
		  Assert.assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD",ap.checkpaymentheading().getText());
		  ap.checkpayment().click();
		  ap.Clickconfirmorder().click();
		  Assert.assertEquals("Your order on My Store is complete.",ap.Checkconfirmorder().getText());		  
		  
		}
		
		}

	
	


