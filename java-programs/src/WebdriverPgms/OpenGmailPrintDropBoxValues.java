package WebdriverPgms;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGmailPrintDropBoxValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?tab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#");
		// select drop box
		WebElement dropbox = driver.findElement(By.id("lang-chooser"));
		//list no .of values in the listbox
		List <WebElement> values = driver.findElement(By.tagName("option"));
		System.out.println(values.size());
		// name of the values in the listbox
		for(int i=0;i<values.size();i++){
			System.out.println(values.get(i).gettext());
			//clicking on each value in listbox and checking txt displayed or not
			values.get(i).click();
			if(values.get(i).isdisplayed()){
				System.out.println(values.get(i).gettext()+"Active");
			}
			else{
				System.out.println(values.get(i).gettext()+"Inactive");
			}
			
		}
		
		
		
		
		 
		
	}

}
