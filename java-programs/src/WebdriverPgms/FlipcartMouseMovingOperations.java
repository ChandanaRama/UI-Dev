package WebdriverPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipcartMouseMovingOperations {

	
WebDriver driver;
	
	@BeforeTest
	
	public void open(){
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	}
	
	@Test
	
	public void mousemoving(){
		
		Actions action=new Actions(driver);
		WebElement event1=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[3]/a/span"));
		WebElement event2=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[3]/ul/li/ul/li[1]/ul/li[4]/a/span"));
		action.moveToElement(event1).moveToElement(event2).build().perform();
	}
}
