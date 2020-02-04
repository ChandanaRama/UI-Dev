package WebdriverPgms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class methodsInWebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Sleeper.sleepTightInSeconds(30);
        driver.get("https://www.yahoo.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        String val=driver.getTitle();
        String value=driver.getCurrentUrl();
        String va=driver.getPageSource();
        driver.close();
        
        
        
	}


}
