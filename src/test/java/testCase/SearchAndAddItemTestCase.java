package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.UrlLauncher;
import officialPage.SearchAndAddItem;

public class SearchAndAddItemTestCase extends UrlLauncher {
	@Test

	public void firstSearchItem() {
		SearchAndAddItem item1 = PageFactory.initElements(driver, SearchAndAddItem.class);
		item1.search("Tablet");
		item1.icon();
		item1.searchipad();
		item1.sendappleLink();
		item1.scrollAddtocart();
		item1.addtoCart();
		item1.popIcon();

	}

}
