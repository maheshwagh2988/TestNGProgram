package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableElement {
	
	WebDriver driver = new FirefoxDriver();
	
	public void elementSelect(){
		driver.get("http://css-tricks.com/how-nth-child-works/");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("nthtable"));
		List<WebElement> tr = table.findElements(By.tagName("tr"));
		List<WebElement> td = table.findElements(By.tagName("td"));
		System.out.println(tr.size());
		System.out.println(td.size());
		for(WebElement webelement : td){
			System.out.println(webelement.getText());
		}
		/*for (int i = 0; i < td.size(); i++) {
			for (int j = 0; j < td.size(); j++) {
				System.out.println(((WebElement)td).getText());
			}
		}*/
	}
	
	
	public static void main (String args[]){
		TableElement te = new TableElement();
		te.elementSelect();		
	}

}
