package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import projectFactory.DriverFactory;
import projectFactory.WrapperMethods;

public class Transamerica_mouseaction extends WrapperMethods{
	
	@FindBy(how=How.XPATH,using="//li[@data-menu='about-us']")
	WebElement aboutus;
	@FindBy(xpath = "//a[@tabindex='0']")
	private WebElement Learn;
	
	@FindBy(xpath = "//a[contains(text(),'Got')]")
	private WebElement Got;
	
	public  Transamerica_mouseaction() throws Exception{
		PageFactory.initElements(DriverFactory.getDriver(), this);
		
	}
	
public Transamerica_mouseaction clickabout(WebDriver driver) throws Exception{
		Actions actions = new Actions(driver);
		actions.moveToElement(aboutus).perform();
		Thread.sleep(10000);
		mousehover(aboutus);
		return this;
	}

public Transamerica_mouseaction learnmore() throws Exception{
      click(Learn);
	return this;
}
public Transamerica_mouseaction Gotit() throws Exception{
    click(Got);
	return this;
}
}
