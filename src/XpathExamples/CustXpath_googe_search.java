package XpathExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustXpath_googe_search {

	public static void main(String[] args) {
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver_win32_75/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");	
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
		
		List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		List<WebElement> list2= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[contains(@class,'testing')]"));
		List<WebElement> list1= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div/div/div/span[contains(text(),'testing')]"));
		
		//
		
		//System.out.println("Total Number of Suggestion:: ==>"+list.size());
		//System.out.println("Total Number of Suggestion:: ==>"+list2.size());
		System.out.println("Total Number of Suggestion:: ==>"+list1.size());
		
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i).getText());
			if(list1.get(i).getText().contains("testing techniques")){
				list1.get(i).click();
				break;
				
			}
		}
		

	}

}
