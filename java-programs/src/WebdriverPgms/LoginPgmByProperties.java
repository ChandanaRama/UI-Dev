package WebdriverPgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginPgmByProperties {
	
	WebDriver driver;
@BeforeTest 
	public void open(){
	driver = new ChromeDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	
	
	
	
	
}

}
