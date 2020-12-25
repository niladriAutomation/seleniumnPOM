package AutomationPractice.MachineTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeforeMethodTest extends Base{

	@BeforeMethod()
	public void launchbrowser() throws IOException {
		driver =initializebrowser();
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\MachineTest\\config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		driver.get(prop.getProperty("URL"));		
	}
	 @AfterMethod() 
	  public void teardown() { 
		  driver.close(); 
		  }  

}
