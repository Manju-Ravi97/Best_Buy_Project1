package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.UrlLauncher;
import officialPage.AddItemMenuDept;

public class AddItemMenuDeptTestCase extends UrlLauncher {

	@Test

	public void MenuShopByDept()  {

		AddItemMenuDept item2 = PageFactory.initElements(driver, AddItemMenuDept.class);

		item2.clickingallmenu();
		item2.clickingTvlink();
		item2.clickinglinkofTvandsize();
		item2.sizeofTv();
		item2.linkOfSonyTv();
		item2.scrollintoExactaddtocard();
		item2.clickingAddToCard();
		item2.addToCartPop();

	}

}
