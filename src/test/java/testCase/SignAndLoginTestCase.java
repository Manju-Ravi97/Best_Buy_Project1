package testCase;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import base.UrlLauncher;
import officialPage.SignAndLogin;

public class SignAndLoginTestCase extends UrlLauncher {

	@Test
	public void SignEcommerce() throws Exception {

		SignAndLogin signup=  PageFactory.initElements(driver, SignAndLogin.class);
		
		signup.accountbutton();
        signup.creataccount();
		signup.firstName("manju");
		signup.lastName("ravi");
		signup.email("manjuravi@YOPmail.com");
		signup.password("manjuravi@1997");
		signup.repassword("manjuravi@1997");
		signup.phonenumber("959 751 4715");
		signup.submit();
		
		
		
		
	}
}



