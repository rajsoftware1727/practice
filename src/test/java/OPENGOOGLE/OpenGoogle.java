package OPENGOOGLE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle {
	
	@Test
	public static void openGoogle()
 	{
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://www.google.com");
		  System.out.println(driver.getTitle());
		  driver.quit();
;	}

}
