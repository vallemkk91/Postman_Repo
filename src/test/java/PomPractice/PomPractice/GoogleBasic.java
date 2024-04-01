package PomPractice.PomPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class GoogleBasic 
{
	
	  @Test()
	  public void setUp( ) {
		   WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	        driver.get("www.google.com");
		  
	  }
}
