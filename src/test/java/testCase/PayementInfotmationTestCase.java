package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.UrlLauncher;
import officialPage.DummyPayement;
import officialPage.PayementInformation;
import officialPage.SearchAndAddItem;

public class PayementInfotmationTestCase extends UrlLauncher {
	@Test
	public void finalProcess() {

		SearchAndAddItem item1 = PageFactory.initElements(driver, SearchAndAddItem.class);
		item1.search("Tablet");
		item1.icon();
		item1.searchipad();
		item1.sendappleLink();
		item1.scrollAddtocart();
		item1.addtoCart();
		item1.popIcon();
	}

	public void dummy() {
		finalProcess();
		DummyPayement payement = PageFactory.initElements(driver, DummyPayement.class);
		payement.clickFinalAddtoCard();
		payement.processOfChecout();
		payement.paymentProcess();
		payement.sendEmaildress("manjuravi@YOPmail.com");
		payement.phone("959 751 4715");
		payement.submitpayment();

	}

	public void payement_Process() {
		dummy();

		PayementInformation pay = PageFactory.initElements(driver, PayementInformation.class);
		pay.enterCreditcardnumber("1234 4567 7896 0000");
		pay.holderName("manju");
		pay.holderLastname("ravi");
		pay.holderaddress("xyz");
		pay.holdercity("Aaa");
		pay.selectingState();
		pay.hol_pincode("12345");
		pay.hol_creatpass("automate@@@123456789");
		pay.finalprocess();
	}
}
