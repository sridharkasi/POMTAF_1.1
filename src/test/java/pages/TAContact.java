package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectFactory.DriverFactory;
import projectFactory.WrapperMethods;

public class TAContact extends WrapperMethods{
	
	@FindBy(name="firstName")
	private WebElement FN;

	@FindBy(name="lastName")
	private WebElement LN;
	
	@FindBy(id="city")
	private WebElement CT;
	
	@FindBy(id="state")
	private WebElement ST;
	
	@FindBy(name="emailAddress")
	private WebElement EM;
	
	@FindBy(id="topics")
	private WebElement TP;
	
	@FindBy(id="'contact-us-submit")
	private WebElement SB;
	
	public  TAContact() throws Exception{
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}
	
	public TAContact Enterfirstname(String firstname) throws IOException, Exception
	{
		entertext(FN, firstname);	
		return this;
	}
	
	public TAContact Enterlastname(String lastname) throws IOException, Exception
	{
		entertext(LN, lastname);	
		return this;
	}
	
	public TAContact Entercity(String city) throws IOException, Exception
	{
		entertext(CT, city);	
		return this;
	}
	
	public TAContact Enterstate(String state) throws IOException, Exception
	{
		entertext(ST, state);	
		return this;
	}
	
	public TAContact Enteremail(String email) throws IOException, Exception
	{
		entertext(EM, email);	
		return this;
	}
	
	public TAContact Entertopics(String topic) throws IOException, Exception
	{
		entertext(TP, topic);	
		return this;
	}
	
    public TAContact clicksubmit() throws IOException, Exception
    {
           click(SB);
           return this;
           
    }}
