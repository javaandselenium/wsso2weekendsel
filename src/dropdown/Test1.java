package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.id("gh-cat"));
		
		Select s=new Select(ele);


		s.selectByIndex(11);
        s.selectByValue("11232");
        s.selectByVisibleText("Books");
        


        
        List<WebElement> options = s.getOptions();
        System.out.println(options.size());
        
        for(WebElement b:options) {
        	System.out.println(b.getText());
        }
        
        driver.close();
	}

}
