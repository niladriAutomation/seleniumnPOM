package AutomationPractice.MachineTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProfilePage;

public class CheckUpdateinvalidPersonalInfoTest extends BeforeMethodTest{
	@Test(priority = 9)
	public void checkblankupdatepersonalinfo() throws IOException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\MachineTest\\config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		HomePage hp = new HomePage(driver);
		hp.signin().click();
		hp.EnterloginEmail().sendKeys(prop.getProperty("regmail"));
		hp.Enterloginpwd().sendKeys(prop.getProperty("pass"));
		hp.clicksubmit().click();
		ProfilePage pp = new ProfilePage(driver);
		pp.clickpersonalinfo().click();
		pp.clickpassSave().click();
		System.out.println(pp.checkProfUpdateErrormessage().getText());
		Assert.assertEquals("There is 1 error %n The password you entered is incorrect.",pp.checkProfUpdateErrormessage().getText());
	}
	

}
