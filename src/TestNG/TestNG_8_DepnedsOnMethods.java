package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_8_DepnedsOnMethods{
	WebDriver driver;
	
  @Test(dependsOnMethods ="method2")
  
  public void method1() {
	 
	  driver.findElement(By.id("user_login")).sendKeys("mahesh");
	  driver.findElement(By.name("pwd")).sendKeys("mahesh1432");

    	driver.findElement(By.id("rememberme")).click();
		
		driver.findElement(By.name("wp-submit")).click();
		
		driver.findElement(By.linkText("Lost your password?")).click();
		driver.findElement(By.cssSelector("input#user_login")).sendKeys("mahesh@gmail.com");		

  }	

		 @Test
		  public void method2() throws InterruptedException {
			  driver.get("https://www.techlearn.in/admin");
  }
		 
  @BeforeTest
  public void beforeTest() {
	driver = new ChromeDriver() ;
	driver .manage().window().maximize();
  }

}
