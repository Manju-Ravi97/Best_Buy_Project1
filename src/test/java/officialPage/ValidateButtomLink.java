package officialPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import base.UrlLauncher;

public class ValidateButtomLink extends UrlLauncher  {
	
	public void scrollDownAndUp() {
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");

		executor.executeScript("window.scroll(0,0)", "");
	}
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void validate_bottomlinks() {
		// 5.Write a code to validate the bottom links on the home page.

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");

		executor.executeScript("window.scroll(0,0)", "");*/


	
	


