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

public class SelectAnyBrand extends UrlLauncher {

	// 8.Write a code to select and add an item from (Menu à Brands à Select Any

	@FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")
	WebElement clickmenubar;

	@FindBy(xpath = "//button[text()='Brands']")
	WebElement clickbrandmenubar;

	@FindBy(linkText = "Apple")
	WebElement clickthelinkapple;

	@FindBy(xpath = "//a[@role='button'][contains(text(),'iPad')]")
	WebElement clickthelinkipad;

	@FindBy(xpath = "//a[contains(text(),'iPad Pro 12.9-inch')]")
	WebElement clickthelinkipadurl;

	@FindBy(xpath = "(//div[@class='fulfillment-add-to-cart-button']//button[contains(@class,'c-button-icon-leading add-to-cart-button')])[1]")
	WebElement addtocart;

	@FindBy(xpath = "(//button[contains(@class,'add-to-cart-button')])[1]")
	WebElement clickingaddtocart;

	@FindBy(xpath = "(//*[name()='svg'][contains(@role,'img')])[80]")
	WebElement closingpop;

	public void allmenu() {
		clickmenubar.click();
	}

	public void brands() {
		clickbrandmenubar.click();

	}

	public void apple() {

		clickthelinkapple.click();

	}

	public void secondIpad() {
		CommonFunctions.clickingOnWebElement(clickthelinkipad, 10);
		clickthelinkipad.click();
	}

	public void ipadInch() {
		CommonFunctions.clickingOnWebElement(clickthelinkipad, 20);

		clickthelinkipadurl.click();
	}

	// Scroll into addto card
	public void addtocardscroll() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", addtocart);

	}

	// click add to card
	public void Exactclickaddtocard() {

		// WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		// wait1.until(ExpectedConditions.elementToBeClickable(clickingaddtocart));
		
		CommonFunctions.clickingOnWebElement(clickingaddtocart, 20);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", clickingaddtocart);
	}

	// Close pop menu
	public void clossepop() {
		
		CommonFunctions.clickingOnWebElement(closingpop, 20);
		Actions pop = new Actions(driver);
		pop.moveToElement(closingpop).click().build().perform();

	}

}