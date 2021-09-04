package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase1 {
	public WebDriver driver;

	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void login() {
		driver.findElement(By.id("email")).sendKeys("hgfhgfhgfg");
		driver.findElement(By.id("pass")).sendKeys("gfgffghfag");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();

		Assert.assertEquals(actual, expected);

		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected);

		Reporter.log(title, true);
		String url = driver.getCurrentUrl();
		Reporter.log(url, true);
		s.assertAll();
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
