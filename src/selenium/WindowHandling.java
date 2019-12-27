package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowHandling {
	String wing,wind;
	
	
	
	public void handle(){

		System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver_win32_77/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		Set<String> window = driver.getWindowHandles();
		
		Object[] array = window.toArray();
		System.out.println(array.length);
		for(int i=0;i<array.length;i++){
			wing= (String) array[0];	
			wind= (String) array[1];
		//driver.switchTo().window(wing);
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		System.out.println(wing);
		}
		driver.switchTo().window(wind);
		System.out.println(driver.getCurrentUrl());
		driver.get("http://gmail.com");
		driver.switchTo().window(wing);
		System.out.println(driver.getCurrentUrl());
	}
	
	public static void main(String[] args) {
		WindowHandling wd = new WindowHandling();
		wd.handle();
	}
}