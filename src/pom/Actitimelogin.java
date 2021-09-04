package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitimelogin {
	
	@FindBy(id="username")
	private WebElement usernametb;
	
	
	public Actitimelogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void username(String name) {
		usernametb.sendKeys(name);
	}
	

}
