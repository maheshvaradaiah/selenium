package PageScrollDownandUp;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PageDownUP{
	WebDriver driver;
  @Test
  public void scrollDownan() throws InterruptedException {driver.get("https://www.selenium.dev");
	driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("scroll(0,3500)");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[normalize-space()='releases']")).click();

  }
  @Test
  public void scrollUp() throws InterruptedException {driver.get("https://www.selenium.dev");
	//driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("scroll(3500,0)");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='releases']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
