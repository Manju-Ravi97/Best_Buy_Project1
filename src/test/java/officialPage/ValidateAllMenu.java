package officialPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import base.UrlLauncher;

public class ValidateAllMenu extends UrlLauncher {
	
	
	
		// 4. Write a code for navigation of all Menu and validation of title in each.
	   @FindBy(xpath = "//a[text()='Top Deals']")
	   WebElement topDeal;
		
	   @FindBy(xpath = "//a[text()='Deal of the Day']")
	   WebElement Dealoftheday;
	   
	   @FindBy(xpath ="//a[text()='Totaltech Membership']" )
	   WebElement TotaltechMembership;
	   
	   @FindBy(xpath = "//a[text()='Credit Cards']")
	   WebElement CreditCards;
	   
	   @FindBy(xpath  ="//a[text()='Gift Cards']")
	   WebElement GiftCards;
	
	   @FindBy(xpath = "//a[text()='Gift Ideas']")
	   WebElement GiftIdeas;
	   
	   @FindBy(xpath = "//span[text()='More']")
	   WebElement More;
	   
	   
	   
	   public void clickontopdeals() {
		   topDeal.click();
		   driver.navigate().back();
	    
	   }
	   
	   public void clickondealoftheday() {
		   Dealoftheday.click();
		   driver.navigate().back();
		    
	   }
	
	   public void clickontotaltech() {
		   TotaltechMembership.click();
		   driver.navigate().back();
		    
	   }
	   
	   public void creditcard() {
		   CreditCards.click();
		   driver.navigate().back();
		    
	   }
	   
	   public void clickongiftcard() {
		   GiftCards.click();
		   driver.navigate().back();
		    
	   }
	   
	   public void clickongiftideas() {
		   GiftIdeas.click();
		   driver.navigate().back();
		    
	   }
	   
	   public void clickonmore() {
		   
		   More.click();
		   driver.navigate().back();
		    
	   }
	   
	   
	   
	   
	   
	   
	/*driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		driver.navigate().back();

		driver.findElement(By.xpath("//a[text()='Deal of the Day']")).click();
		driver.navigate().back();

		driver.findElement(By.xpath("//a[text()='Totaltech Membership']")).click();
		driver.navigate().back();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Credit Cards']")).click();
		driver.navigate().back();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
		driver.navigate().back();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()='Gift Ideas']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='More']")).click();
		driver.navigate().back();*/

	}


