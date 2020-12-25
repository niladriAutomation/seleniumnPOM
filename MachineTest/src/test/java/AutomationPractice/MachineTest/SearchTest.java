package AutomationPractice.MachineTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchPage;

	public class SearchTest extends BeforeMethodTest {

	  @Test(priority = 6) 
	  public void validsearch() throws IOException { 
	  SearchPage sp = new SearchPage(driver);
	  sp.EnterSearchField().sendKeys("Faded Short Sleeve T-shirts");
	  sp.clickSearchIcon().click(); 
	  String messagetext=(sp.CheckValidSearchResults().getText());
	  Assert.assertEquals("\"FADED SHORT SLEEVE T-SHIRTS\"", messagetext);
	  sp.MovemousetosearchProduct().click();
	  
	  
	 }
	 
	 
	  
	 
	
}
