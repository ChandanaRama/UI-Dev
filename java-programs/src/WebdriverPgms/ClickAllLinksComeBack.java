package WebdriverPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAllLinksComeBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com/");
		WebElement link=driver.findElement(By.tagName("a"));
		for(int i=0;i<link.size();i++){
			if(link.get(i).isdisplayed()){
				System.out.println(link.get(i).gettext());
				link.get(i).click();
				System.out.println(driver.getCurrentUrl());
				driver.navigate().back();
				link=driver.findElement(By.tagName("a"));
				
			}
		}
	}

}
