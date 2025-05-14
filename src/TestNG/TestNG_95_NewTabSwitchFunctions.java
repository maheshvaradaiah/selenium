package TestNG;
import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_95_NewTabSwitchFunctions {
	WebDriver driver;
  @Test
  public void newtab() throws InterruptedException {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(1000);
	
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(1000);

		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
		Thread.sleep(1000);
		
	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='PYTHON']")).click();
		Thread.sleep(1000);
		
		//driver.switchTo().window(tabs.get(0));
		driver.close();
  }
		@Test
		public void techlearn() throws InterruptedException {
			driver.get("https://www.techlearn.in/admin");
			Thread.sleep(1000);
			driver.switchTo().newWindow(WindowType.TAB);
			Thread.sleep(1000);
			driver.get("https://www.seleniumlearn.com/admin");
		
		}

  @BeforeTest
  public void beforeTest() {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
  }

}
