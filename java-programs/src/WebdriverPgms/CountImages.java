package WebdriverPgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ae.com/");
		List WebElement images = driver.findElement(By.tagName("img"));
		System.out.println(images.size());
		for(int i=0;i<images.size();i++){
			System.out.println(images.get(i).getAttribute("scr"));
		}
		
	}

}
