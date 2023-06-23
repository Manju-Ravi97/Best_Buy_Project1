package officialPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.UrlLauncher;

public class SignIn extends UrlLauncher {
	
	@FindBy(xpath = "//button[@type='button']//span[contains(text(),'Account')]")
	WebElement accountButton;
	 
	@FindBy(xpath = "//a[normalize-space()='Sign In']")
	WebElement signin;
	
	@FindBy(id="fld-e")
	WebElement signinemail;
	
	@FindBy(xpath  = "//input[@type='password']")
	WebElement signinpassword;
	
	
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement submit;
	
	
	public void accountbutton() {
		accountButton.click();
	}

	public void sign() {
		signin.click();
	}
	
	public void  firstemailsign(String signInemailID) {
		signinemail.sendKeys(signInemailID);
		
	}
	public void firstemailpass(String spass ) {
		
		signinpassword.sendKeys(spass);
	}
	
	public void submit() {
		submit.click();
	}
	
	
}




