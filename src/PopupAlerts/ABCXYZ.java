package PopupAlerts;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ABCXYZ {
	WebDriver driver;
  @Test
  public void techlearnhomepage() {
	  driver.get("https://www.techlearn.in/");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  }

}
