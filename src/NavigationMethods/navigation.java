package NavigationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {
	static WebDriver driver;
	 

	public static void main(String[] args) throws InterruptedException {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2100);
	driver.navigate().forward();
	Thread.sleep(1500);
	driver.navigate().refresh();
	// driver.close();
		driver.quit();
		
	}

}
