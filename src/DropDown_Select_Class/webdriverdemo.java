package DropDown_Select_Class;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class webdriverdemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:/Automation/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		//Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Launch website
		driver.get("http://www.calculator.net/");
		//Maximize the browser
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='hhmat']")).click();
		driver.findElement(By.xpath("//*[@id='hl3']/li[3]/a")).click();
		driver.findElement(By.xpath("//input[@id='cpar1']")).click();
		driver.findElement(By.xpath("//input[@id='cpar2']")).click();
		driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]")).click();
		
		String result =driver.findElement(By.xpath("//*[@id='content']/h2[1]")).getText();
		System.out.println("The Result" +result);
		

		
		

	}

}
