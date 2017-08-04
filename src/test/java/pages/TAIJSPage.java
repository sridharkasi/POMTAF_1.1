package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectFactory.DriverFactory;
import projectFactory.WrapperMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TAIJSPage extends WrapperMethods{
		
	@FindBy(xpath = "//a[@tabindex='0']")
	private WebElement LM;
	
	@FindBy(xpath = "//a[contains(text(),'Got')]")
	private WebElement GI;

	@FindBy(xpath = ".//*[@id='90_53356_53368_1']/div/div/div[2]")
	private WebElement IS;
	
	//@FindBy(id ="navMenu")
	//private WebElement AU;
		
	public TAIJSPage() throws Exception{
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}
	
	public TAIJSPage LearnMore() throws IOException, Exception
	    {
	           click(LM);
	           return this;
	           
	    }
	  
	public TAIJSPage Gotit() throws IOException, Exception
	    {
	           click(GI);
	           return this;
	           
	    }

	@SuppressWarnings("deprecation")
	public TAIJSPage Ins() throws IOException, Exception
    {
		jsexecutor(IS);
		//mousehover(IS);
		click(IS);
		WrapperMethods.Screencapture(DriverFactory.getDriver());
		return this;
    }}


