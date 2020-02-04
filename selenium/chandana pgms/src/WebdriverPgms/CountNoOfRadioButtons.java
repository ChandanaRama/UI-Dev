package WebdriverPgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNoOfRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/ontramercury/faces/jsp/flightSearch.jsp");
		// count no of radio buttons
		WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
		System.out.println(radio.size());
		// get the values of radio button
		for(int i=0;i<radio.size();i++){
			System.out.println(radio.get(i).getattribute("value"));
			// radio button is checked or not
			System.out.println(radio.get(i).getattribute("value")+" "+radio.get(i).getattribute("checked"));
		}
		
	}

}
