package logintest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	@BeforeMethod
	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/comet/Selenium/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=login/");
		}
	
	@Test
	public void test1() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
	}
}
