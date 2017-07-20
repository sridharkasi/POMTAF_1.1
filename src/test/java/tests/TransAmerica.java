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
import pages.TAContact;

public class TransAmerica extends DriverFactory{
	
	@BeforeTest
	@Parameters({"browser","Node"})
	  public void remotewebdriver(@Optional String browserval, String nodeval){
		browser = browserval;
		nodeip = nodeval;	  
		   
	  }
	
	@BeforeClass
	public void startTestCase(){
		
		WrapperMethods.dataSheetName 	= "TA";
			
	}
	
	@Test(dataProvider = "getData")
	public static void namesearch(String firstname, String lastname, String city, String state, String email, String topic) throws Exception{

		DriverFactory.createreprot("TransAmerica");
		driver = DriverFactory.getDriver();
		driver.get("https://www.transamerica.com/individual/contact-us/insurance/");
		 new TAContact()
		 .Enterfirstname(firstname)	
		 .Enterlastname(lastname)
		 .Entercity(city)
		 .Enterstate(state)
		 .Enteremail(email)
		 .Entertopics(topic)
		 .clicksubmit();	
		 
		}
	}
