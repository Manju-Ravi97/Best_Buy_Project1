package officialPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utils.CommonFunctions;
import base.UrlLauncher;

public class SearchAndAddItem extends UrlLauncher {

	// 6.Write code to search for and add an item to the shopping cart.

	@FindBy(id = "gh-search-input")
	WebElement searchbox;

	@FindBy(xpath = "//span[@class='header-search-icon']")
	WebElement clicksearchicon;

	@FindBy(xpath = "(//a[contains(text(),'iPad')])[2]")
	WebElement serchingipad;

	@FindBy(xpath = "(//a[contains(@href,'/site/apple-10-2-inch-ipad-with-wi-fi-64gb-space-gray/4901809.p?skuId=4901809')])[2]")
	WebElement appleIpadlink;

	// add to card
	@FindBy(xpath = "//div[@class='fulfillment-add-to-cart-button']//button[contains(@class,'add-to-cart-button')][1]")
	WebElement addtocart1;

	@FindBy(xpath = "//button[contains(@class,'add-to-cart-button')][1]")
	WebElement click1;

	@FindBy(xpath = "(//button[@class='c-button-link close-modal-x close-modal-button']//*[name()='svg'])[2]")
	WebElement closeIcon;

	public void search(String sname) {
		searchbox.sendKeys(sname);
	}

	public void icon() {
		clicksearchicon.click();
	}

	public void searchipad() {
		serchingipad.click();
	}

	public void sendappleLink() {
		appleIpadlink.click();
	}

	// scroll into add to card exact point

	public void scrollAddtocart() {
		CommonFunctions.clickingOnWebElement(addtocart1, 20);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", addtocart1);

	}

// clicking add to card
	public void addtoCart() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", click1);

	}

// add to  card confirmation pop icon
	public void popIcon() {
		Actions a = new Actions(driver); 
		a.moveToElement(closeIcon).click().build().perform();
	}

}