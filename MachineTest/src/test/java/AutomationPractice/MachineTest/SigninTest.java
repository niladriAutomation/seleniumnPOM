package AutomationPractice.MachineTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Authentication;
import pages.MyAccount;
import pages.HomePage;

public class SigninTest extends BeforeMethodTest{	
	  @Test(priority = 1) 
	  public void Valid_registration() throws IOException {
	  HomePage rp = new HomePage(driver); 
	  rp.signin().click();
	  File file = new File("C:\\Users\\Admin\\eclipse-workspace\\MachineTest\\config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
	  rp.enterEmail().sendKeys(prop.getProperty("regmail"));
	  rp.clickCreateAccount().click(); 
	  Authentication au= new Authentication(driver); 
	  System.out.println(au.checkheading().getText());
	  Assert.assertEquals(au.checkheading().getText(), "YOUR PERSONAL INFORMATION"); 
	  au.clicktitle().click();
	  au.EnterCfirstname().sendKeys("QA"); au.EnterClastname().sendKeys("check");
	  String str = au.checkmail().getAttribute("Value");
	  System.out.println("value: "+ str);
	  Assert.assertEquals(prop.getProperty("regmail"),str);
	  au.EnterPassword().sendKeys(prop.getProperty("pass")); 
	  au.clickdays().selectByValue("2");
	  au.clickmonths().selectByValue("1"); 
	  au.clickYear().selectByValue("2020");
	  au.clicknewsletter().click(); 
	  au.clickspecialoffer().click(); 
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
	 MyAccount ma= new MyAccount(driver);
	 System.out.println(ma.getpagetitle());
	 Assert.assertEquals(ma.getpagetitle(), "My account - My Store");
	 	  }
	  
	 
	}
	

