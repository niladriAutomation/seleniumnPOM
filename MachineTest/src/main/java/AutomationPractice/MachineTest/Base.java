package AutomationPractice.MachineTest;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Base {
		public WebDriver driver;

		public WebDriver initializebrowser() throws IOException {
			Properties prop = new Properties();
			FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\MachineTest\\config.properties");
			prop.load(file);
			String browsername=prop.getProperty("browser");
			if(browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browsername.equals("firefox")){
				System.setProperty("webdriver.gecko.driver", "D:\\softwares\\geckodriver.exe");
				driver= new FirefoxDriver();
				
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			return driver;
		}
	}


