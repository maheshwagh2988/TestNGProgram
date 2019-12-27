package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindHandle {
	
	
	String Child_Window;
	
	public void handleWindow(){

		System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver_win32_77/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://registeronce.autodesk.com/prodreg/beginRegistration.action");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String parentwindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[@id='vAgentBtn']")).click();
		
		for(String childWindow : driver.getWindowHandles()){
			this.Child_Window = childWindow;
		}
		
		driver.switchTo().window(Child_Window);
		
		driver.findElement(By.linkText("click here")).click();
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//input[@id='userID']")).sendKeys("asdfhfhf");
		driver.findElement(By.xpath("//input[@id='new_password']")).sendKeys("afafaf");
		
		driver.switchTo().window(Child_Window);
		driver.close();
		
	}
	
	public static void main (String[] args){
		WindHandle win = new WindHandle();
		win.handleWindow();
	}

}


