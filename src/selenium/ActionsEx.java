package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx {
	
	public void actiondemo(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com/");
		WebElement home= driver.findElement(By.xpath("//*[@id='fk-mainhead-id']/div[2]/div/div[1]/ul/li[2]/a/span"));
		WebElement pc = driver.findElement(By.xpath("//*[@id='menu-home-kitchen-tab-0-content']/ul[1]/li[3]/a"));
		WebElement srchbox = driver.findElement(By.xpath("//*[@id='fk-top-search-box']"));
		Actions act = new Actions(driver);
		
		//act.moveToElement(home);
		//act.moveToElement(pc).click();
		//act.build().perform();
		//act.click(pc).build().perform();
		
		act.keyDown(Keys.SHIFT).moveToElement(srchbox).sendKeys("xolo q").build().perform();
		//act.contextClick(srchbox).build().perform();
		
		//act.moveToElement(home).build().perform();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionsEx ae= new ActionsEx();
		ae.actiondemo();
	}
}
