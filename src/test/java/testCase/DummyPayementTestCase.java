package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utils.CommonFunctions;
import base.UrlLauncher;
import officialPage.DummyPayement;
import officialPage.SearchAndAddItem;
import officialPage.SelectAnyBrand;

public class DummyPayementTestCase extends UrlLauncher {
	@Test
	public void add_to_cart_and_Process() {
		
		SearchAndAddItem item1 = PageFactory.initElements(driver, SearchAndAddItem.class);
		item1.search("Tablet");
		item1.icon();
		item1.searchipad();
		item1.sendappleLink();
		item1.scrollAddtocart();
		item1.addtoCart();
		item1.popIcon();

	}
	
		public void initial_dummy() {
		add_to_cart_and_Process(); 
		
		DummyPayement payement = PageFactory.initElements(driver, DummyPayement.class);
		payement.clickFinalAddtoCard();
		payement.processOfChecout();
		payement.paymentProcess();
		payement.sendEmaildress("manjuravi@YOPmail.com");
		payement.phone("959 751 4715");
		payement.submitpayment();
	}

}
