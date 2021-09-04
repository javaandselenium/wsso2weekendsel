package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

driver.findElement(By.name("username")).sendKeys("fjhfghfghfsghfghgh");


	}

}
