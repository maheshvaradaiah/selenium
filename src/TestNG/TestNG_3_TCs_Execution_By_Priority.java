package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class  TestNG_3_TCs_Execution_By_Priority  {
	WebDriver driver;
	@Test(priority=1)
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test(priority=4)
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test(priority=2)
	public void twitter() {
		driver.get("https://www.twitter.com");
	}
	@Test(priority=3)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test(priority=0)
	public void redmine() {
		driver.get("https://www.redmine.org");
	}
	@Test(priority=6)
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}
	@Test(priority=5)
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	 driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
