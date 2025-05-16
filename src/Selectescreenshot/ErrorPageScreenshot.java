package Selectescreenshot;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ErrorPageScreenshot{
	WebDriver driver;
	public ErrorPageScreenshot() throws Exception   {
        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("D:\\New folder\\demo\\ErrorScreenshot.png"));
	  }
	@Test
	public void techlearnlogin() throws Exception {
		driver.get("https://www.techlearn.in/admin");
		
		try
		{
			driver.findElement(By.id("user_login")).sendKeys("mahesh");
			Thread.sleep(1000);
			
			driver.findElement(By.name("pwd")).sendKeys("Hello@123");
			Thread.sleep(1000);
			
			driver.findElement(By.id("rememberme")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id='wp-submitabc']")).click();
			Thread.sleep(1000);
		
			driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).click();
			
		}
		
		catch(Exception e)
		{
			System.out.println("Error Page: "+e);
		}
		
	}

	
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
