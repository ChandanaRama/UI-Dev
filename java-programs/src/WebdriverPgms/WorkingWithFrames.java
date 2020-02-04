package WebdriverPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		@BeforeTest
		
		public void open(){
			
		    driver = new ChromeDriver();
			driver.get("http://www.angelfire.com/super/badwebs/");
			
			}
		@Test
		public void frames(){
			
			WebElement frames=driver.findElement(By.tagName("frame"));
			System.out.println(frames.getSize());
	}

}
}