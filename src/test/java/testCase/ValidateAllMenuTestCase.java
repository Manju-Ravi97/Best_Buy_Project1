package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.UrlLauncher;
import officialPage.ValidateAllMenu;

public class ValidateAllMenuTestCase extends UrlLauncher {
	@Test
	public void clickAllMenu() {

		ValidateAllMenu menu = PageFactory.initElements(driver, ValidateAllMenu.class);
		
		menu.clickontopdeals();
		menu.clickondealoftheday();
		menu.clickontotaltech();
		menu.creditcard();
		menu.clickongiftcard();
		menu.clickongiftideas();
		menu.clickonmore();

	}

}
