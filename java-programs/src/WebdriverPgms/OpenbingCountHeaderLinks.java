package WebdriverPgms;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenbingCountHeaderLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com/");
		//count the links
		WebElement header = driver.findElement(By.id("sw_tb"));
		WebElement links = header.findElement(By.tagName("a"));
		System.out.println("links.size()");
		//display the text for links
		for(int i=0;i<links.Size();i++){
			System.out.println(((WebDriver) links).get(i).gettext());
			
		}
		
		
		
		
		
		
	}

}
