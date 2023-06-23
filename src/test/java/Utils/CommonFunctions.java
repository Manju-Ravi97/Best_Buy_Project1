package Utils;

import java.time.Duration;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.UrlLauncher;

public class CommonFunctions extends UrlLauncher {
	
	WebElement element = null;


	
	
   public static void clickingOnWebElement(WebElement element,long waitTimeinSeconds) {
	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(waitTimeinSeconds));
	element= wait1.until(ExpectedConditions.elementToBeClickable(element));
    element.click();
}


}
