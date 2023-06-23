package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.UrlLauncher;
import officialPage.SelectAnyBrand;

public class SelectAnyBrandTestCase extends UrlLauncher {

	@Test

	public void Menu_Select_Any_Brand() throws InterruptedException {
		SelectAnyBrand brand = PageFactory.initElements(driver, SelectAnyBrand.class);

		brand.allmenu();
		brand.brands();
		brand.apple();
        brand.secondIpad();
		brand.ipadInch();
		brand.addtocardscroll();
		brand.Exactclickaddtocard();
		brand.clossepop();

	}

}
