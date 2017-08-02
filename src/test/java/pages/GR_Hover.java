package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import projectFactory.DriverFactory;
import projectFactory.WrapperMethods;

public class GR_Hover extends WrapperMethods{
	
	@FindBy(xpath=".//*[@id='navMenu']/ul[2]/li[2]")
	WebElement about;
	@FindBy(xpath="//a[@tabindex='0']")
	WebElement learnmore;
	@FindBy(xpath="//a[contains(text(),'Got')]")
	WebElement gt;
	public  GR_Hover() throws Exception{
		PageFactory.initElements(DriverFactory.getDriver(), this);
		
	}
	
	public GR_Hover clickabout(WebDriver driver) throws Exception{
		
		
		
		Thread.sleep(10000);
		click(learnmore);
	Thread.sleep(10000);
		click(gt);
		Thread.sleep(10000);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(about).perform();
		Thread.sleep(10000);
		
		
		
		click(about);
		
		return this;
		
		
	}

}
