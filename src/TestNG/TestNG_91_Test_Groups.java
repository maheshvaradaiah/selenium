package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_91_Test_Groups {
	WebDriver driver;
	@Test
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test(groups="food")
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test(groups="socil")
	public void twitter() {
		driver.get("https://www.twitter.com");
	}
	@Test(groups={"socil","food"})
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test(groups="bugtool")
	public void redmine() {
		driver.get("https://www.redmine.org");
	}
	@Test(groups="food")
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}
	@Test(groups="bugtool")
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}

  @BeforeTest(groups={"socil","food"})
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
