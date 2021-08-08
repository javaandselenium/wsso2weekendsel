package autosuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.myntra.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

WebElement ele = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
ele.sendKeys("dres");

Thread.sleep(3000);

List<WebElement> suggestion = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
System.out.println(suggestion.size());

for(WebElement b:suggestion) {
	System.out.println(b.getText());
}


driver.close();
	}

}
