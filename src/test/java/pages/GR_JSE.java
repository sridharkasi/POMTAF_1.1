package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import projectFactory.DriverFactory;
import projectFactory.WrapperMethods;

public class GR_JSE extends WrapperMethods {
	@FindBy(xpath=".//*[@id='90_53359_53369_1']/span")
	WebElement annuity;
	
	@FindBy(xpath="//a[@tabindex='0']")
	WebElement learnmore;
	@FindBy(xpath="//a[contains(text(),'Got')]")
	WebElement gt;
	@FindBy(xpath=".//*[@id='90_53359_53369_1']/span")
	WebElement hoverannuity;
	
	public  GR_JSE() throws Exception{
		PageFactory.initElements(DriverFactory.getDriver(), this);
		
	}
	public GR_JSE clicklink(WebDriver driver) throws Exception{
		
		
		
		click(learnmore);
		Thread.sleep(10000);
			click(gt);
			Thread.sleep(10000);
			mousehover(hoverannuity);
		//click(annuity);
		
		return this;
	}

}
