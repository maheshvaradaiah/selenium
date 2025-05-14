package Selectescreenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectedWebelementscreenshot {
	
	WebDriver driver;
  @Test
  public void Takescreenshot() throws Exception {
	  driver.get("https://www.techlearn.in/");
	  Thread.sleep(3000);
	  
	  WebElement jobs = driver.findElement(By.xpath("//*[@id=\"mega-menu-item-20\"]/a"));

	  File f = jobs.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f,new File("D:\\Mahesh\\screenshot\\J.png"));
	   
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
