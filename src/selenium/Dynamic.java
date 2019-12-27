package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic {
	
	WebDriver driver = new FirefoxDriver();
	boolean flag = false;
	int i;
	
	
	public void dyanmicTxtBox(){
		driver.get("https://in.edit.yahoo.com/registration");
		driver.manage().window().maximize();
		List<WebElement> textBox = driver.findElements(By.xpath("//input[contains(@type,'text')]"));
		System.out.println("Number of Text Boxes: "+textBox.size());
		
		for(i=0;i<textBox.size();i++){
			if(textBox.get(i).equals(textBox.get(4))){
				flag=true;
				break;
			}
			
		}
		if(flag){
			textBox.get(i).sendKeys("ABC");
		}
		else{
			System.out.println("Not found");
		}
		
	}
		
	
	public static void main (String args[]){
		Dynamic dy = new Dynamic();
		dy.dyanmicTxtBox();
	}

}
