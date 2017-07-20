package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import projectFactory.DriverFactory;
import projectFactory.WrapperMethods;

public class GoogleSignUpPage extends WrapperMethods{
	
	@FindBy(how=How.ID,using="FirstName")
	WebElement firstname;
	
	@FindBy(name="LastName")
	WebElement lastname;
	
	@FindBy(id="GmailAddress")
	WebElement gmailaddress;
	
	@FindBy(how=How.NAME,using="Passwd")
	WebElement createpassword;
	
	@FindBy(id="PasswdAgain")
	WebElement confirmpassword;
	
	@FindBy(id="BirthMonth")
	WebElement birthmonth;
	
	@FindBy(id="BirthDay")
	WebElement birthday;
	
	@FindBy(id="BirthYear")
	WebElement birthyear;
	
	@FindBy(id="Gender")
	WebElement gender;
	
	@FindBy(id="RecoveryPhoneNumber")
	WebElement phonenumber;
	
	@FindBy(id="RecoveryEmailAddress")
	WebElement currentemail;
	
	@FindBy(id="CountryCode")
	WebElement country;
	
	@FindBy(id="submitbutton")
	WebElement next_button;
	
	public  GoogleSignUpPage() throws Exception{
		PageFactory.initElements(DriverFactory.getDriver(), this);
		
	}
    public GoogleSignUpPage enterfirstname(String firstname1) throws IOException, Exception
    {
           entertext(firstname,  firstname1);
           return this;           
    }
    public GoogleSignUpPage enterlastname(String lastname1) throws IOException, Exception
    {
           entertext(lastname,  lastname1);
           return this;          
    }
    public GoogleSignUpPage enteremailaddress(String emailaddress) throws IOException, Exception
    {
           entertext(gmailaddress,  emailaddress);
           return this;          
    }
    public GoogleSignUpPage enterpassword(String pass) throws IOException, Exception
    {
           entertext(createpassword,  pass);
           return this;          
    }
    public GoogleSignUpPage enterconfirmpassword(String confirmpass) throws IOException, Exception
    {
           entertext(confirmpassword,  confirmpass);
           return this;          
    }
    public GoogleSignUpPage enterbirthmonth(String birth_month) throws IOException, Exception
    {
           entertext(birthmonth,  birth_month);
           return this;          
    }
    public GoogleSignUpPage enterbirthday(String birthday) throws IOException, Exception
    {
           entertext(birthmonth,  birthday);
           return this;          
    }
    public GoogleSignUpPage enterbirthyear(String birth_year) throws IOException, Exception
    {
           entertext(birthyear,  birth_year);
           return this;          
    }
    public GoogleSignUpPage entergender(String Gender) throws IOException, Exception
    {
           entertext(gender,  Gender);
           return this;          
    }
    public GoogleSignUpPage entermoblienumber(String number) throws IOException, Exception
    {
           entertext(phonenumber,  number);
           return this;          
    }
    public GoogleSignUpPage enterrecoveryemail(String remail) throws IOException, Exception
    {
           entertext(currentemail,  remail);
           return this;          
    }
    public GoogleSignUpPage enterlocation(String location) throws IOException, Exception
    {
           entertext(country,  location);
           return this;          
    }
    public GoogleSignUpPage clicknext() throws IOException, Exception
    {
           click(next_button);
           return this;     
    }
    

}
