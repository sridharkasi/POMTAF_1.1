package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Transamerica_mouseaction;
import projectFactory.DriverFactory;

public class Balamouse extends DriverFactory {
	@BeforeTest
	@Parameters({"browser","Node"})
	  public void remotewebdriver(@Optional String browserval, String nodeval){
		browser = browserval;
		nodeip = nodeval;	  
		   
	  }
	@Test
	public static void hover() throws Exception{

		DriverFactory.createreprot("Balamouse");
		driver = DriverFactory.getDriver();
		driver.get("https://www.transamerica.com/");
		
		new Transamerica_mouseaction()
		.learnmore()
		.Gotit()
		.clickabout(driver);
		
	
	
	
	}
	

}
