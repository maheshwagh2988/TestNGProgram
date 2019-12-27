package selenium;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMultipleRowTable {
	
	WebDriver driver = new FirefoxDriver();
	
	public void getMultipleRowsActions(){
		
		driver.get("https://css-tricks.com/how-nth-child-works/");
		driver.manage().window().maximize();
		//WebElement table = driver.findElement(By.id("nthtable"));
		List<WebElement> tr = driver.findElements(By.xpath("//table[@id='nthtable']/tbody/tr"));
		for(WebElement webelement : tr){
			System.out.println(webelement.getText());
		}
		
		Actions builder = new Actions(driver);
		//builder.click(tr.get(0)).keyDown(Keys.CONTROL).click(tr.get(2)).keyUp(Keys.CONTROL).build().perform();
		builder.click(driver.findElement(By.xpath("//*[@id='nthtable']/tbody/tr[2]/td[1]")))
		.keyDown(Keys.CONTROL)
		.click(driver.findElement(By.xpath("//*[@id='nthtable']/tbody/tr[2]/td[3]")))
		.keyUp(Keys.CONTROL).build().perform();
		
	}
	
	
	public static void main (String args[]){
		ActionsMultipleRowTable amrt = new ActionsMultipleRowTable();
		amrt.getMultipleRowsActions();
	}

}
