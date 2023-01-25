package logintest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	@BeforeMethod
	public void initDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/comet/Selenium/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=login/");
		Thread.sleep(2000);
		}
	
	@Test
	public void test1() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
