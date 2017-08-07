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
import pages.TAIJSPage;

public class TAIJSTest extends DriverFactory{
	
	@BeforeTest
	@Parameters({"browser","Node"})
	  public void remotewebdriver(@Optional String browserval, String nodeval){
		browser = browserval;
		nodeip = nodeval;	  
		   
	  }
	
	/*@BeforeClass
	public void startTestCase(){
	WrapperMethods.dataSheetName 	= "TA";
	}*/
	
	@Test
	public static void Ins() throws Exception{

		DriverFactory.createreprot("TAVMouseTest");
		driver = DriverFactory.getDriver();
		driver.get("https://www.transamerica.com/");
		 new TAIJSPage()
		 .LearnMore()
		 .Gotit()
		 .Ins();
	}
	}