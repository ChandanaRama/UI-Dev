package WebdriverPgms;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		File srcfile = ((TakeScreenShot).driver).getScreenShotAs(OutputType.FILE);
		FileUtils.copyFile(Src.file, new c://Users//anvesh86//Desktop//imag.png);
		
		
	}

}
