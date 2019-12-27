package selenium;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetText;


public class No_of_link {

	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		java.util.List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total count of link and it's size is "+links.size());
		driver.close();
		
	}
	public void No_of_Iframe(){
		
	}

}
