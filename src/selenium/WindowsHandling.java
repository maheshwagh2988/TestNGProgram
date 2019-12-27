package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsHandling {
	
	
	
	public void handleWindow(){

		System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver_win32_77/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.naukri.com/");
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();		
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.close();
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		
		//driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		for (String Child_Window : driver.getWindowHandles())
		 {
		 driver.switchTo().window(Child_Window);
		 }
		driver.findElement(By.xpath("//a[@id='uSel']")).click();
		driver.findElement(By.xpath("//input[@id='uLogin']")).sendKeys("swapnil808");;
		driver.findElement(By.xpath("//input[@id='pLogin']")).sendKeys("Safe@2486");
		//driver.close();
		driver.switchTo().window(parentWindow);
		
	}
	
	public static void main (String[] args){
		WindowsHandling win = new WindowsHandling();
		win.handleWindow();
	}

}

