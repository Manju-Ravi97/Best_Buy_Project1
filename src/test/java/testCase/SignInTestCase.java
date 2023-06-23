package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.UrlLauncher;
import officialPage.SignIn;

public class SignInTestCase extends UrlLauncher {
	
	@Test
	public void initialSignIn() {
		
		SignIn login  = PageFactory.initElements(driver, SignIn.class);
		
		login.accountbutton();
		login.sign();
	    login.firstemailsign("manjuravi@YOPmail.com");
		login.firstemailpass("manjuravi@1997");
		login.submit();
		driver.navigate().back();
		
	
	}
   

}
