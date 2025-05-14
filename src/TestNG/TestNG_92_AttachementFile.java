package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_92_AttachementFile {
	WebDriver driver;
  @Test
  public void Attachementfiletechlearnpage() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/registration/");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='file")).sendKeys("");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
