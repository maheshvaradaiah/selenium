package SelenniumLocarors;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Xparth {
	WebDriver driver;
	 @Test
  public void xparth() {
	  driver.get("https://www.techlearn.in/");
	  //1.Absolutse or full xparth
	   driver.findElement(By.xpath("//*[@id=\"mega-menu-item-2555\"]/a")).click();
  }
 /** @Test
  public class xparth {
	 // driver.findElement(By.xpath("//*[@class=\"login\"]")).click();
	  //Indox method//
	//  driver.findElement(By.xpath("(//*[@href=\"/projects/redmine/wiki/Download\"])[1]")).click();
  }*/
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 
  }

 

}
