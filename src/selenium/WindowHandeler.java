package selenium;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class WindowHandeler {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver_win32_77/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");

		//Capture Paraent Window 
		String Parent_Window= driver.getWindowHandle();
		System.out.println(Parent_Window);
		driver.findElement(By.xpath("//*[@id='button1']")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		 for (String Child_Window  : driver.getWindowHandles()) {
			 
	        	System.out.println(Child_Window );

	        	driver.switchTo().window(Child_Window);
	        	
	        	}
		 driver.close();
	}

}
