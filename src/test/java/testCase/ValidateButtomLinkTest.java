package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.UrlLauncher;
import officialPage.ValidateAllMenu;
import officialPage.ValidateButtomLink;

public class ValidateButtomLinkTest extends UrlLauncher {

	@Test
	public void valitingButtomLink() {
		
	  
		ValidateButtomLink link =PageFactory.initElements(driver, ValidateButtomLink.class);
		link.scrollDownAndUp();
	}
	
	
	
}
