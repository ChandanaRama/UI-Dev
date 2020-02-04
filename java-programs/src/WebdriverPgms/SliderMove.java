package WebdriverPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SliderMove {

	
	WebDriver driver;
	
	@BeforeTest
	
	public void open(){
		
		driver = new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
		
	}
	@Test
	public void slidermove(){
		Actions action = new Actions(driver);
		WebElement slider1=driver.findElement(By.xpath(".//*[@id='slider']"));
		int y=slider1.getLocation().y;
		action.dragAndDropBy(slider1,70,y).build().perform();
		
		
		
		
		
	}
}
