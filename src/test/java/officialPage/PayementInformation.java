package officialPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Utils.CommonFunctions;
import base.UrlLauncher;

public class PayementInformation extends UrlLauncher{
	
	@FindBy(xpath = "//input[@id='number']")
	WebElement credOrDeptCard;

	@FindBy(xpath = "//input[@id='first-name']")
	WebElement firstName;

	@FindBy(id = "last-name")

	WebElement lastName;

	@FindBy(xpath = "//input[@id='address-input']")
	WebElement adress;

	@FindBy(xpath = "//input[@id='city']")
	WebElement city;

	@FindBy(xpath = "//select[@id='state']")

	WebElement state;
	@FindBy(xpath = "//input[@id='postalCode']")
	WebElement pincode;

	@FindBy(id = "create-account-password-form-show-password")
	WebElement createpass;

	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement placeorder;

	public void enterCreditcardnumber(String cardno) {
		CommonFunctions.clickingOnWebElement(credOrDeptCard, 20);
		credOrDeptCard.sendKeys(cardno);
	}

	public void holderName(String hol_name) {
		firstName.sendKeys(hol_name);

	}

	public void holderLastname(String hol_lastname) {

		lastName.sendKeys(hol_lastname);
	}

	public void holderaddress(String hol_address) {
		adress.sendKeys(hol_address);
	}

	public void holdercity(String hol_city) {
		city.sendKeys(hol_city);
	}

	public void selectingState() {
		Select sel1 = new Select(state);
		sel1.selectByVisibleText("AL");
	}

	public void hol_pincode(String pin) {
		pincode.sendKeys(pin);
	}

	public void hol_creatpass(String finalpass) {
		createpass.sendKeys(finalpass);
	}

public void finalprocess(){
	placeorder.click();

}
}









