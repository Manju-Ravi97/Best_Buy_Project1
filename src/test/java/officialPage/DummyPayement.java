package officialPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.CommonFunctions;
import base.UrlLauncher;

public class DummyPayement extends UrlLauncher {

	// 9.Finally addtocard and dummy payement
   
	@FindBy(xpath = "//span[@class='cart-label']")
	WebElement addtocard;

	@FindBy(xpath = "//div[@class='checkout-buttons__checkout']//button[contains(text(),'Checkout')]")
	WebElement checkout;

	@FindBy(xpath = "//div[@class='button-wrap ']//button[contains(text(),'Continue as Guest')]")
	WebElement continuetopay;

	@FindBy(xpath = "//input[@id='user.emailAddress']")
	WebElement emailAdress;

	@FindBy(xpath = "//input[@id='user.phone']")
	WebElement phonenumber;

	@FindBy(xpath = "//div[@class='button--continue']//button")
	WebElement paymentinfo;

	public void clickFinalAddtoCard() {
		CommonFunctions.clickingOnWebElement(addtocard, 20);
		addtocard.click();

	}

	public void processOfChecout() {
		checkout.click();
	}

	public void paymentProcess() {
		continuetopay.click();
	}

	public void sendEmaildress(String email2) {
		emailAdress.sendKeys(email2);
	}

	public void phone(String number) {
		phonenumber.sendKeys(number);
	}

	public void submitpayment() {
		paymentinfo.click();

	}

}
