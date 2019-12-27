package XpathExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_PopUps_In_Selenium_Alert_Interface {

	public static void main(String[] args) throws Exception {
		//WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver_win32_77/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='content']//button[text()='Try it']")).click();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		Alert alert = driver.switchTo().alert();
		
		String print = alert.getText();
		
		System.out.println(print);
		
		alert.accept();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='content']//button[text()='Try it']")).click();
		Thread.sleep(3000);
		
		alert.dismiss();
		
		driver.close();

	}

}
