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

public class AddItemMenuDept extends UrlLauncher {

	// 7.Write a code to select and add an item from (Menu à Shop by Department).

	@FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")
	WebElement clickingmenubar;

	@FindBy(xpath = "//button[text()='TV & Home Theater']")
	WebElement clickTvandHomeTheater;

	@FindBy(xpath = "//button[text()='TVs by Size']")
	WebElement clickTvBySize;

	@FindBy(linkText = "85-Inch or Larger TVs")
	WebElement clickLinkLargeTv;

	@FindBy(xpath = "(//a[contains(@href,'/site/samsung-85-class-cu7000-crystal-uhd-4k-uhd-smart-tizen-tv/6537371.p?skuId=6537371')])[2]")
	WebElement exactLinkofTv;

	@FindBy(xpath = "(//div[@class='fulfillment-add-to-cart-button']//button[contains(@class,'c-button-icon-leading add-to-cart-button')])[1]")
	WebElement scrollintoaddtocard;

	@FindBy(xpath = "(//button[contains(@class,'add-to-cart-button')])[1]")

	WebElement clickadddtocard;

	@FindBy(xpath = "(//*[name()='svg'][contains(@role,'img')])[76]")
	WebElement clickpop;

	public void clickingallmenu() {
		clickingmenubar.click();
	}

	public void clickingTvlink() {
		clickTvandHomeTheater.click();

	}

	public void clickinglinkofTvandsize() {
		clickTvBySize.click();
	}

	public void sizeofTv() {
		clickLinkLargeTv.click();

	}

	public void linkOfSonyTv() {
		exactLinkofTv.click();
	}

	// scroll into add to card

	public void scrollintoExactaddtocard() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scrollintoaddtocard);

	}

	public void clickingAddToCard() {
	//	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
	//	wait1.until(ExpectedConditions.elementToBeClickable(clickadddtocard));


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", clickadddtocard);
	}

	public void addToCartPop() {

		Actions a1 = new Actions(driver);
		a1.moveToElement(clickpop).click().build().perform();

	}

}