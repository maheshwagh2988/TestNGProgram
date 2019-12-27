package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTable {

	
	
	public void table(){
		System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver_win32_77/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://css-tricks.com/how-nth-child-works/");
		driver.manage().window().maximize();
		
		//Step 1: First get the entire html table and store this in a variable ‘htmltable’ of type web element.
		WebElement htmltable=driver.findElement(By.id("nthtable"));
		
		//Step 2: Get all the rows with tag name ‘tr’ and store all the elements in a list of web elements. Now all the elements with tag ‘tr’ are stored in ‘rows’ list.
		List<WebElement> rows=htmltable.findElements(By.tagName("tr"));
		System.out.println("Row size :"+rows.size());
		
		//Step 3: Loop through each row and get the list of elements with tag ‘th’. ‘rows.get(0)’ will give first row and ‘findElements(By.tagName(“th”))’ will give list of columns for the row.
		for(int rnum=0;rnum<rows.size();rnum++)
		{
			List<WebElement> columns=rows.get(rnum).findElements(By.tagName("td"));
			//List<WebElement> columns=rows.get(6).findElements(By.tagName("td"));
			System.out.println("Number of columns:"+columns.size());
			for(int cnum=0;cnum<columns.size();cnum++)
			{
				System.out.println(columns.get(cnum).getText());
				//System.out.println(columns.get(4).getText());
				//columns.get(4).click();
			}
		}
	}
	
	public static void main (String args[]){
		DynamicTable tb = new DynamicTable();
		tb.table();		
	}

}
