package AutomationPractice.MachineTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.Authentication;
import pages.HomePage;

public class BlankRegisterTest  extends BeforeMethodTest{
	  
	  @Test(priority = 11) 
	  public void blankregister() throws IOException {
	  HomePage rp = new HomePage(driver); 
	  rp.signin().click();
	  File file = new File("C:\\Users\\Admin\\eclipse-workspace\\MachineTest\\config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
	  rp.enterEmail().sendKeys(prop.getProperty("blankmail"));	 
	  rp.clickCreateAccount().click();
	  Authentication ap = new Authentication(driver); 
	  ap.clickRegisterButton().click(); 
	  WebElement errormessages= ap.checkblankregister(); 
	  String text = errormessages.getText(); System.out.println(text); 
	 
	  }

}
