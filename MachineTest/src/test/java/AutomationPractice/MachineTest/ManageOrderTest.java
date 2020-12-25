package AutomationPractice.MachineTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


import pages.HomePage;
import pages.ProfilePage;

public class ManageOrderTest extends BeforeMethodTest {
	@Test(priority = 5)
	public void manageorder() throws IOException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\MachineTest\\config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		HomePage hp = new HomePage(driver);
		hp.signin().click();
		hp.EnterloginEmail().sendKeys(prop.getProperty("mail"));
		hp.Enterloginpwd().sendKeys(prop.getProperty("pass"));
		hp.clicksubmit().click();
		ProfilePage pp = new ProfilePage(driver);
		pp.clickmanageorder().click();
		pp.clickorderrefname().click();
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollTo(0,850)");
		pp.selectproductname().selectByValue("1");
		pp.clickmsgarea().sendKeys("New Message Updated");
		pp.clicksendbutton().click();
		System.out.println(pp.checkSuccessmessage().getText());
		String actual  = pp.checkSuccessmessage().getText(); 
		Assert.assertEquals("Message successfully sent", actual);
		
		
	}
	
	

}
