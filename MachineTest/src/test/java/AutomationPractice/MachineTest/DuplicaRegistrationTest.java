package AutomationPractice.MachineTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Authentication;
import pages.HomePage;

public class DuplicaRegistrationTest extends BeforeMethodTest {
	@Test(priority = 8) 
	  public void duplicate_registration() throws IOException {
	  HomePage rp = new HomePage(driver); 
	  rp.signin().click();
	  File file = new File("C:\\Users\\Admin\\eclipse-workspace\\MachineTest\\config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
	  rp.enterEmail().sendKeys(prop.getProperty("regmail"));
	  rp.clickCreateAccount().click(); 
	  Authentication ap = new Authentication(driver); 
	  System.out.println(ap.checkduplicatemsg().getText());
	 Assert.assertEquals(ap.checkduplicatemsg().getText(),"An account using this email address has already been registered. Please enter a valid password or request a new one.");
	  }
}
