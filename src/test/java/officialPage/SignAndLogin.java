package officialPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.UrlLauncher;

public class SignAndLogin extends UrlLauncher {

	@FindBy(xpath = "//button[@type='button']//span[contains(text(),'Account')]")
	WebElement accountButton;

	@FindBy(xpath = "//a[contains(text(),'Create Account') and @role='button']")
	WebElement creataccount;

	@FindBy(id = "firstName")
	WebElement firstNmae;

	@FindBy(id = "lastName")
	WebElement LastName;

	@FindBy(id = "email")
	WebElement emailID;

	@FindBy(id = "fld-p1")
	WebElement password;

	@FindBy(id = "reenterPassword")
	WebElement re_password;

	@FindBy(id = "phone")
	WebElement phoneNumber;

	@FindBy(xpath = "//div[@class='cia-form__controls ']//button")
	WebElement submitButton;

	public void accountbutton() {
		accountButton.click();
	}

	public void creataccount() {
		creataccount.click();
	}

	public void firstName(String name) {
		firstNmae.sendKeys(name);
	}

	public void lastName(String lastname) {
		LastName.sendKeys(lastname);
	}

	public void email(String  eadress) {
		emailID.sendKeys(eadress);
	}
	public void password(String pass) {
		password.sendKeys(pass);
	}
	
public void repassword(String repass) {
	re_password.sendKeys(repass);
}
	
	public void phonenumber(String phone) {
		phoneNumber.sendKeys(phone);
	}
	
	public void submit() {
		submitButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	/*
	 * public SignAndLogin(WebDriver driver) { this.driver = driver; }
	 * 
	 * public void accountButton() {
	 * 
	 * driver.findElement(By.xpath(
	 * "//button[@type='button']//span[contains(text(),'Account')]"));
	 * 
	 * }
	 * 
	 * public void creataccount () { driver.findElement(By.
	 * xpath("//a[contains(text(),'Create Account') and @role='button']")).click();
	 * 
	 * 
	 * }
	 * 
	 * public void firstNmae() {
	 * driver.findElement(By.id("firstName")).sendKeys("manju"); }
	 * 
	 * public void LastName() {
	 * driver.findElement(By.id("lastName")).sendKeys("ravi"); }
	 * 
	 * public void emailID() {
	 * driver.findElement(By.id("email")).sendKeys("manjuravi@YOPmail.com"); }
	 * 
	 * public void password () {
	 * driver.findElement(By.id("fld-p1")).sendKeys("manjuravi@1997");
	 * 
	 * } public void repassword() {
	 * driver.findElement(By.id("reenterPassword")).sendKeys("manjuravi@1997");
	 * 
	 * }
	 * 
	 * public void phoneNumber() {
	 * driver.findElement(By.id("phone")).sendKeys("959 751 4715");
	 * 
	 * 
	 * }
	 * 
	 * 
	 * public void submitButton() {
	 * driver.findElement(By.xpath("//div[@class='cia-form__controls ']//button")).
	 * click(); }
	 */

	/*
	 * WebElement account = driver.findElement(By.xpath(
	 * "//button[@type='button']//span[contains(text(),'Account')]"));
	 * account.click(); Thread.sleep(5000);
	 * 
	 * WebElement creataccount = driver .findElement(By.
	 * xpath("//a[contains(text(),'Create Account') and @role='button']"));
	 * 
	 * if (creataccount.isDisplayed()) {
	 * System.out.println("Element exists on the page."); } else {
	 * System.out.println("Element does not exist on the page."); }
	 * creataccount.click(); WebElement firstName =
	 * driver.findElement(By.id("firstName")); firstName.sendKeys("manju");
	 * 
	 * WebElement LastName = driver.findElement(By.id("lastName"));
	 * LastName.sendKeys("ravi");
	 * 
	 * WebElement emailID = driver.findElement(By.id("email"));
	 * emailID.sendKeys("manjuravi@YOPmail.com");
	 * 
	 * WebElement password = driver.findElement(By.id("fld-p1"));
	 * password.sendKeys("manjuravi@1997");
	 * 
	 * WebElement repassword = driver.findElement(By.id("reenterPassword"));
	 * repassword.sendKeys("manjuravi@1997");
	 * 
	 * WebElement phoneNumber = driver.findElement(By.id("phone"));
	 * phoneNumber.sendKeys("959 751 4715");
	 * 
	 * WebElement submitButton =
	 * driver.findElement(By.xpath("//div[@class='cia-form__controls ']//button"));
	 * submitButton.click();
	 * 
	 * System.out.println("new acc created");
	 * 
	 * driver.navigate().back();// TODO Auto-generated method stub
	 */

}
