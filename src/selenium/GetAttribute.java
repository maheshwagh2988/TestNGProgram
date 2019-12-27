package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttribute {
	
	WebDriver driver = new FirefoxDriver();
		
	public void getElementAtt(){
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement Password = driver.findElement(By.xpath("//input[@id='Passwd']"));
		
		
		System.out.println("Email attribute name : "+Email.getAttribute("name"));
		System.out.println("Email attribute type : "+Email.getAttribute("type"));
		System.out.println("Password attribute name : "+Password.getAttribute("name"));
		System.out.println("Password attribute type : "+Password.getAttribute("type"));		
	}
	
	public void getElementCSSvalue(){
		WebElement SignInBtn = driver.findElement(By.xpath("//input[@id='signIn' and @type='submit']"));
		System.out.println("SignInBtn CSS Value : "+SignInBtn.getCssValue("font-family"));
	}
	
	
	public static void main (String args[]){
		GetAttribute ga = new GetAttribute();
		ga.getElementAtt();
		ga.getElementCSSvalue();
	}

}
