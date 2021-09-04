package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	public WebDriver driver;
	
	@Parameters({"selenium"})
	@Test
	public void demo(String browser) {
		if(browser.equals("chrome")) {
			 driver=new ChromeDriver();
		}
		else
		{
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("hgfhgfhgfg");
		driver.findElement(By.id("pass")).sendKeys("gfgffghfag");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
	}
	}


