package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class  TestNG_5_Description_Feature {
	WebDriver driver;
 
	 @Test(description ="Google Application")
	  public void testone () {
		 driver.get("https://www.google.com");
	 }
	 @Test(description = "instagaram appliction")
	  public void testtwo(){
		 driver.get("https://www.instagram.com");
	  }
	 @Test(description = "zomate appliction")
	  public void testthree  (){
		
		driver.get("https://www.zomato.com");
	  }
	 @Test(description = "facebook appliction")
	  public void testfour () {
		 driver.get("https://www.facebook.com");
	  }
	 @Test(description = "twitter appliction")
	  public void testfive() {
		 driver.get("https://www.Twitter.com ");
	  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
