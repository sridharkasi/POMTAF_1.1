package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import projectFactory.DriverFactory;
import projectFactory.WrapperMethods;



public class GooglePage extends WrapperMethods{

	
	@FindBy(name="q")
	private WebElement searchtext;
	
	

	public  GooglePage() throws Exception{
		PageFactory.initElements(DriverFactory.getDriver(), this);
		
	}
	
	public GooglePage entertext(String searchvalue) throws IOException, Exception
	{
		entertext(searchtext,  searchvalue);
		return this;
		
	}
	
	
	public GooglePage clicksearch() throws Exception
	{
		
		submit(searchtext);
		return this;
		
	}
	
	
}
