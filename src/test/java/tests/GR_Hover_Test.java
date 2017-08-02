package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.GR_Hover;
import pages.GooglePage;
import pages.GoogleResultsPage;
import projectFactory.DriverFactory;

public class GR_Hover_Test extends DriverFactory {
	
	@BeforeTest
	@Parameters({"browser","Node"})
	  public void remotewebdriver(@Optional String browserval, String nodeval){
		browser = browserval;
		nodeip = nodeval;	  
		   
	  }
	@Test
	public static void hover() throws Exception{

		DriverFactory.createreprot("GR_Hover_Test");
		driver = DriverFactory.getDriver();
		driver.get("https://www.transamerica.com/");
		Thread.sleep(10000);
		
		
		
		
		 new GR_Hover()
		 //.EnterSearch(SearchString)
		 
		 .clickabout(driver);
		
		// new GoogleResultsPage()
		 
		// .verifyresults();
		
		 
		}


}
