package tests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.GoogleSignUpPage;
import projectFactory.DriverFactory;
import projectFactory.WrapperMethods;

public class TC1_Google_SignUp extends DriverFactory {
	
    @BeforeTest
    @Parameters({"browser","Node"})
      public void remotewebdriver(@Optional String browserval, String nodeval){
           browser = browserval;
           nodeip = nodeval;     
              
      }
    
    @BeforeClass
    public void startTestCase(){
           
           WrapperMethods.dataSheetName     = "GoogleSignupData";
                  
    }
    
    @Test(dataProvider = "getData")
    public static void google_signup(String FirstName, String LastName, String email, String CreatePassword, String ConfirmPassword, String BirthMonth, String BirthDay, String Birthyear, String Gender, String Moblienumber, String currentemail, String location ) throws Exception
    {

           DriverFactory.createreprot("TC1_Google_SignUp");
           driver = DriverFactory.getDriver();
           driver.get("https://accounts.google.com/SignUp?");
           
           new GoogleSignUpPage()
           .enterfirstname(FirstName)
           .enterlastname(LastName)
           .enteremailaddress(email)
           .enterpassword(CreatePassword)
           .enterconfirmpassword(ConfirmPassword)
           .enterbirthmonth(BirthMonth)
           .enterbirthday(BirthDay)
           .enterbirthyear(Birthyear)
           .entergender(Gender)
           .entermoblienumber(Moblienumber)
           .enterrecoveryemail(currentemail)
           .enterlocation(location)
           .clicknext();

    }
}
