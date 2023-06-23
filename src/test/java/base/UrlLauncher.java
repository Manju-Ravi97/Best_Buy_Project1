package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class UrlLauncher {
	public static Properties properties;
	public static WebDriver driver;

	@BeforeMethod

	public void readProperties() throws IOException {

		FileInputStream file = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(file);

		String browser = properties.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(properties.getProperty("url"));

		String title = driver.getTitle();
		System.out.println(title);
		String expectedTitle = "Best Buy International: Select your Country - Best Buy";
		if (title.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Expected url");
		} else {
			System.out.println("Expected url is not working.");

		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement image = driver.findElement(By.xpath("//a[@class='us-link']"));
		image.click();

	}

	@AfterMethod
	private void Tear_down() {
		driver.quit();
	}

}
