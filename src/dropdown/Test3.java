package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("MTR"));
		
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("c");
		s.selectByVisibleText("Milk");
		
		
		List<WebElement> op = s.getOptions();
		System.out.println(op.size());
		
		for(WebElement b:op) {
			System.out.println(b.getText());
		}
		
		System.out.println(s.isMultiple());
		
		if(s.isMultiple()) {
			s.deselectAll();
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
