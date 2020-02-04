package WebdriverPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseRightClickOperation {

	
	WebDriver driver;
	
	@BeforeTest
	
	public void open(){
		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	
	public void rightclick(){
		
		Actions action=new Actions(driver);
		WebElement event=driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		action.contextClick(event).build().perform();
		
		
	}
	
	
}
