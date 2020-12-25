package AutomationPractice.MachineTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchPage;

public class BlankSearchTest extends BeforeMethodTest {
	 @Test(priority = 10)
	  public void blanksearch() {
	  SearchPage sp = new SearchPage(driver);
	  sp.clickSearchIcon().click(); 
	  String blankmessage =(sp.CheckBlankSearchResults().getText());
	  Assert.assertEquals("Please enter a search keyword", blankmessage);
	  
	  }
	 

}
