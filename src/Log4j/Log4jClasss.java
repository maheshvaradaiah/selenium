package Log4j;

import org.testng.annotations.Test;
import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Log4jClasss {
	WebDriver driver;
	@Test
	public void log4jdemo() {
	Logger log= Logger.getLogger("Google Search");
	PropertyConfigurator.configure("Mahesh.properties");
	driver = new ChromeDriver();
	log.info("Chrome Browser Lanch");
	driver.manage().window().maximize();
	log.info("Browser window maximize");
	driver.get("https://www.techlearn.in");
	log.info("Navigate to the techlearn website");
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
