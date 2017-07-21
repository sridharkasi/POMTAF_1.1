package pages;

import java.io.IOException;
import java.util.List;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import projectFactory.DriverFactory;
import projectFactory.WrapperMethods;

public class FB_Account extends WrapperMethods {
 

// @Test
	//@FindBy(id="email") 
	//WebElement Username;
	
	//@FindBy(id="pass") 
	//WebElement Password;
	
	@FindBy(name="firstname") 
	WebElement Fname;
	
	@FindBy(name="lastname") 
	WebElement Lname;
	
	@FindBy(name="reg_email__") 
	WebElement phRem;
	@FindBy(name="reg_passwd__") 
	WebElement Npassword;
	
	@FindAll(@FindBy(xpath=".//*[@id='day']"))
	WebElement d;
	
	
	@FindBy(id="month") 
	WebElement m;
	
	
	@FindBy(id="year") 
	WebElement y;
	
	@FindBy(xpath=".//*[@id='birthday-help']")
	WebElement why;
	
	@FindBy(xpath=".//*[@id='u_0_k']")
	WebElement radio;
	
	@FindBy(name="websubmit") 
	WebElement Caccount;
	

  


public  FB_Account() throws Exception{
	PageFactory.initElements(DriverFactory.getDriver(), this);
}

/*public void entervalue(String First,String Sur,String Mobile,String NP,String d,String m,String y,String Male,String submit){
	//Username.sendKeys(uname);
	//Password.sendKeys(pass);
	Fname.sendKeys(First);
	Lname.sendKeys(Sur);
	phRem.sendKeys(Mobile);
	
	Npassword.sendKeys(NP);
	Select a=new Select(d);
}*/

public FB_Account Enterfirstname(String Fvalue) throws IOException, Exception
{
	entertext(Fname,  Fvalue);
	return this;
	
}

public FB_Account Enterlasttname(String Lvalue) throws IOException, Exception
{
	entertext(Lname,  Lvalue);
	return this;
	
}

public FB_Account Enterph(String ph) throws IOException, Exception
{
	entertext(phRem,  ph);
	return this;
	
}

public FB_Account Enterpass(String np) throws IOException, Exception
{
	entertext(Npassword,  np);
	return this;
	
}

public FB_Account Enterday(String day) throws IOException, Exception
{
	entertext(d,  day);
	return this;
	
}

public FB_Account Entermonth(String month) throws IOException, Exception
{
	entertext(m,  month);
	return this;
	
}

public FB_Account Enteryear(String year) throws IOException, Exception
{
	entertext(y,  year);
	return this;
	
}

public FB_Account Enterradio(String male) throws IOException, Exception
{
	entertext(radio,  male);
	return this;
	
}

public FB_Account click(String male) throws IOException, Exception
{
	entertext(radio,  male);
	return this;
	
}

public FB_Account click() throws Exception
{
	
	submit(Caccount);
	return this;
	
}
	
	
	
	
	
	
	
	


}
