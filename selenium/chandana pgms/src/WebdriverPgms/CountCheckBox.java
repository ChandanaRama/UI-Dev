package WebdriverPgms;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class CountCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://book2.spicejet.com/");
		
		// count no of check boxes
		
		//List webelement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		WebElement checkbox =driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.size());
		// names of the checkboxs
		
		for ( int i=0; i<checkbox.size();i++){
			System.out.println(checkbox.get(i).getAttribute("name")+"  "+checkbox.get(i).getAttribute("checked"));
		}
		
	}

}
