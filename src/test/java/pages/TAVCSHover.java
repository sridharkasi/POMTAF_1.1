package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectFactory.DriverFactory;
import projectFactory.WrapperMethods;

public class TAVCSHover extends WrapperMethods{
	
	@FindBy(xpath = "//a[@tabindex='0']")
	private WebElement LM;
	
	@FindBy(xpath = "//a[contains(text(),'Got')]")
	private WebElement GI;

	@FindBy(xpath = ".//*[@id='navMenu']/ul[2]/li[2]")
	private WebElement AU;
	
	//@FindBy(id ="navMenu")
	//private WebElement AU;
		
	public TAVCSHover() throws Exception{
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}
	
	public TAVCSHover LearnMore() throws IOException, Exception
	    {
	           click(LM);
	           return this;
	           
	    }
	  
	public TAVCSHover Gotit() throws IOException, Exception
	    {
	           click(GI);
	           return this;
	           
	    }

	@SuppressWarnings("deprecation")
	public TAVCSHover AboutUs() throws IOException, Exception
    {
		mousehover(AU);
		return this;
    }}

