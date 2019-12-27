package DropDown_Select_Class;
import org.openqa.selenium.By;

public class Dropdown {
	
		void drop(String a , String b){
		 Globalvariable.Globaldriver.findElement(By.id(a));
		 Globalvariable.Globaldriver.findElement(By.id(b));
		}
}
