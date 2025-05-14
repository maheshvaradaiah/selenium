package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_7_Invocation_Count {
	WebDriver driver;
	
  @Test(priority=2)
  public void techlearn () {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.id("user_login")).sendKeys("mahesh");
	  driver.findElement(By.name("pwd")).sendKeys("mahesh1432");

    	driver.findElement(By.id("rememberme")).click();
		
		driver.findElement(By.name("wp-submit")).click();
		
		driver.findElement(By.linkText("Lost your password?")).click();
  }	
		 @Test(invocationCount=2,priority=0)
		  public void techlearnlagin() {
			  driver.get("https://www.techlearn.in/admin");
			  driver.findElement(By.id("user_login")).sendKeys("rohith");
			  driver.findElement(By.name("pwd")).sendKeys("rohith1432");

		    	driver.findElement(By.id("rememberme")).click();
				
				driver.findElement(By.name("wp-submit")).click();
				
				driver.findElement(By.linkText("Lost your password?")).click();
  }
		 
  @BeforeTest
  public void beforeTest() {
    driver = new ChromeDriver() ;
	driver .manage().window().maximize();
  }

}
