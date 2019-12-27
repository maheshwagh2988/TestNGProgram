package DropDown_Select_Class;
import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class WindowHandeler {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:/Automation/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");	
        //Capture Paraent Window 
		String Parent_Window= driver.getWindowHandle();
		System.out.println(Parent_Window);
		driver.findElement(By.xpath("//*[@id='button1']")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
/*	 Using 	Iterator
		Iterator<String>it= handles.iterator();
		while(it.hasNext());
		{
			String childNewWindow=it.next();
			// Compare whether the main windows is not equal to child window. If not equal, we will close.
			if(!Parent_Window.equals(childNewWindow)){
				driver.switchTo().window(childNewWindow);
				System.out.println(driver.switchTo().window(childNewWindow).getTitle());

			}

		}
		driver.switchTo().window(Parent_Window);

*/		
		for (String Child_Window  : driver.getWindowHandles()) {
			 
	        	System.out.println(Child_Window );

	        	driver.switchTo().window(Child_Window);
	        	
	        	}
		 driver.close();
	}

}
