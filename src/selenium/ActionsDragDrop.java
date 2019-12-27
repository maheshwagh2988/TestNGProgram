package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragDrop {
	
	WebDriver driver = new FirefoxDriver();
	
	public void dragAndDrop(){
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement iFrame = driver.findElement(By.tagName("iframe"));
		System.out.println(iFrame.getSize());
		driver.switchTo().frame(iFrame);
		
		WebElement Source = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement Target = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions builder = new Actions(driver);
		
		// One way is using below dragAndDrop(source,target) method
		
		builder.dragAndDrop(Source, Target).build().perform();
		
		// Second way is using below options of clickAndHold , moveToElement and then release methods.
		
		/*builder.clickAndHold(Source).build().perform();
		builder.moveToElement(Target).build().perform();
		builder.release(Target).build().perform();*/
	}
	
	
	public static void main(String args[]){
		ActionsDragDrop ref = new ActionsDragDrop();
		ref.dragAndDrop();
	}

}
