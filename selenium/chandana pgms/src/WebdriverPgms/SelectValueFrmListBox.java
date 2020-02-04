package WebdriverPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectValueFrmListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/ontramercury/faces/jsp/flightSearch.jsp");
		// select a value from listbox
		
		driver.findElement(By.id("frm:searchForm:departTime0")).sendKeys("Morning");
		
		driver.findElement(By.id("frm:searchForm:returnTime0")).sendKeys("Evening");
		
		

	}

}
