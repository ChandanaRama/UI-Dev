package WebdriverPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://sqlzoo.net/wiki/SQL_Tutorial");
		driver.findElement(By.xpath(".//*[@id='mw-content-text']/div[2]/dl/dt[2]/a")).click();
		driver.findElement(By.id("txtar_1")).sendKeys("select * from country");
		driver.findElement(By.xpath(".//*[@id='frm__1']/div/button")).click();
		
		
	}

}
