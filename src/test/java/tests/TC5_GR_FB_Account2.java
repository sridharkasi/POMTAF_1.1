package tests;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import projectFactory.DriverFactory;
import projectFactory.WebDriverThread;
import projectFactory.WrapperMethods;
import pages.FB_Account;
import pages.GooglePage;
import pages.GoogleResultsPage;

public class TC5_GR_FB_Account2 extends DriverFactory {



//public class TC1_Google_Searchname extends DriverFactory{
	
	@BeforeTest
	@Parameters({"browser","Node"})
	  public void remotewebdriver(@Optional String browserval, @Optional String nodeval){
		browser = browserval;
		nodeip = nodeval;	  
		   
	  }
	
	@BeforeClass
	public void startTestCase(){
		
		WrapperMethods.dataSheetName 	= "Facebook";
			
	}
	
	@Test(dataProvider = "getData")
	public static void FB(String Firstname,String Lastname,String emailorph,String newpass,String day,String Mon,String year,String Male) throws Exception{

		DriverFactory.createreprot("TC1_GR_FB_Account");
		driver = DriverFactory.getDriver();
		driver.get("https://www.facebook.com");
		 new FB_Account()
		 .Enterfirstname(Firstname)
		 .Enterlasttname(Lastname)
		 .Enterph(emailorph)
		 .Enterpass(newpass)
		 .Enterday(day)
		 .Entermonth(Mon)
		 .Enteryear(year)
		 .Enterradio(Male)
		 .click();
		 
		
		 
		
		 
		}
	
	
	
}
