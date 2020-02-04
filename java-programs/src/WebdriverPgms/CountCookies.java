package WebdriverPgms;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CountCookies {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void open(){
		
		driver = new ChromeDriver();
		driver.get("http://www.mirror.co.uk/");
		
	}
	
	@Test
	
	public void countcookies(){
		
		Set<Cookie> mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
		
		//delete cookies
		
		driver.manage().deleteAllCookies();
		mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
		
		
		
	}
	
	

}
