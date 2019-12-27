package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetElementText {
	
	WebDriver driver = new FirefoxDriver();
	
	public void getText(){
		driver.get("https://gmail.com/");
		driver.manage().window().maximize();
		
		WebElement HeaderMsg = driver.findElement(By.xpath("//div[@class='banner']"));
		WebElement NeedHelp = driver.findElement(By.xpath("//a[@id='link-forgot-passwd']"));
		
		
		System.out.println(HeaderMsg.getText());
		System.out.println(NeedHelp.getText());
	}
	
	
	public static void main (String args[]){
		GetElementText get = new GetElementText();
		get.getText();
	}

}
