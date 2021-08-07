package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("username"));
		
		if(username.isDisplayed()) {
			System.out.println("Pass:element is dispalyed");
		}
		else
		{
			System.out.println("Fail:element is not dispalyed");
		}
		
		WebElement button = driver.findElement(By.xpath("//div[text()='Login ']"));

		if(button.isEnabled()) {
			System.out.println("Pass:element is enabled");
		}
		else
		{
			System.out.println("Fail:element is not enabled");
		}
		
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		if(checkbox.isSelected()) {
			System.out.println("Pass:element is selected");
		}
		else
		{
			System.out.println("Fail:element is not selected");
		}
		
		driver.close();
	}

}
