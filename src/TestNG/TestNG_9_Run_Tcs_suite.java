package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_9_Run_Tcs_suite {
	WebDriver driver;
	@Test
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test
	public void twitter() {
		driver.get("https://www.twitter.com");
	}
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test
	public void redmine() {
		driver.get("https://www.redmine.org");
	}
	@Test
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}
	@Test
	public void jira() {
		driver.get("https://www.jira.com");
	}

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
