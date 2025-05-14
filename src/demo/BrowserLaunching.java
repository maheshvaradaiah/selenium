package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserLaunching {
	
 public static void main(String[] args) throws InterruptedException {
	
	 WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver()
		//WebDriver driver = new OpperaDriver();
		//driver =new ChromeDriver();
 driver.manage().window().maximize();
 Thread.sleep(3000);
 driver.quit();

	
	}

}
