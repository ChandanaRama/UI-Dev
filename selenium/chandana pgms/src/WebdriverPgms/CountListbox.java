package WebdriverPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountListbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.mercurytravels.co.in/");
		list<webelement> dropdowns = driver.findElement(By.tagName("select"));
		System.out.println(dropdowns.size());
		//display names from dropbox
		for(int i=0;i<dropdowns.size();i++){
			System.out.println(dropdowns.get(i).gettext());
		}
			
		
	}

}
