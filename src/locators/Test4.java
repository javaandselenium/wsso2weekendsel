package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.instagram.com/accounts/login/");
       
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


       
       driver.findElement(By.name("username")).sendKeys("ghgrhggggfg");
       driver.findElement(By.name("password")).sendKeys("fhghgfhg");
       driver.findElement(By.xpath("//div[text()='Log In']")).click();
       
       String title = driver.getTitle();
       System.out.println(title);
       
      String url = driver.getCurrentUrl();
      System.out.println(url);
       
       if(title.equals("Login • Instagram")) {
    	   System.out.println("pass:home page is dispalyed");
       }
       else
       {
    	   System.out.println("Fail:home page is not dispalayed");
       }
       
       driver.close();
	}

}
