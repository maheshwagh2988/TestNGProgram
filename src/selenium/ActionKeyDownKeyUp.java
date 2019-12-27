package selenium;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeyDownKeyUp {
	
	WebDriver driver = new FirefoxDriver();
	
	public void KeyDownKeyUp(){
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement EmailBox = driver.findElement(By.xpath("//*[@id='email']"));
		WebElement PasswordBox = driver.findElement(By.xpath("//input[@id='pass']"));
		
		Actions builder = new Actions(driver);
		EmailBox.sendKeys("");
		builder.keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("wapnil").build().perform();
	}
	
	
	public static void main (String args[]){
		ActionKeyDownKeyUp akdku = new ActionKeyDownKeyUp();
		akdku.KeyDownKeyUp();
	}

}
