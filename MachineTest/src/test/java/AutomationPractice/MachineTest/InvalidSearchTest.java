package AutomationPractice.MachineTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchPage;

public class InvalidSearchTest  extends BeforeMethodTest{
	 @Test(priority = 7) 
	  public void invalidSearch() {
	  SearchPage sp = new SearchPage(driver);
	  sp.EnterSearchField().sendKeys("iphone");
	  sp.clickSearchIcon().click(); 
	  String text = (sp.CheckInvalidSearchresults().getText());
	  Assert.assertEquals("No results were found for your search \"iphone\"",text);
	  
	 
	  }

}
