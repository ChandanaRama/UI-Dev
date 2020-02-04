package WebdriverPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//click on gmail link
		driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		//verify gmail link title
		String expected = "gmail- free storage space";
		String actual = driver.getTitle();
		if(expected.equals(actual)){
			
			System.out.println("link working");
			
		}
		else{
			System.out.println("link not working");
		}

	}

}
