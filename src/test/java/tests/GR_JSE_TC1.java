package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.GR_Hover;
import pages.GR_JSE;
import projectFactory.DriverFactory;
import projectFactory.WrapperMethods;

public class GR_JSE_TC1 extends DriverFactory{
	
	
	

	

	@BeforeTest
	@Parameters({"browser","Node"})
	  public void remotewebdriver(@Optional String browserval, String nodeval){
		browser = browserval;
		nodeip = nodeval;	  
		   
	  }
	
	@Test
	public static void scroll() throws Exception{

		
		DriverFactory.createreprot("GR_JSE_TC1");
		driver = DriverFactory.getDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.transamerica.com/");
		Thread.sleep(10000);
		
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(10000);
		// fp = Screencapture(DriverFactory.getDriver());
		 //String b = a.filepath;
		WrapperMethods.filepath = WrapperMethods.Screencapture(DriverFactory.getDriver());
		 DriverFactory.test.addScreenCaptureFromPath(WrapperMethods.filepath);
		 Thread.sleep(10000);
		
		
		
		
		
		 new GR_JSE()
		 //.EnterSearch(SearchString)
		 
		 .clicklink(driver);
		
		// new GoogleResultsPage()
		 
		// .verifyresults();
		
		 
		}


}
