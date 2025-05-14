package Selectescreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TimeformateScreenshot {
	WebDriver driver;

	public void Screenshot() throws IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = dateFormat.format(date);
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Screenshots\\Techlearn_" + time + ".png"));
	}


@Test
	public void techlearserch() throws Exception {
	  driver.get("https://www.techlearn.in/admin");
	  Screenshot();
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("mahesh");
	  Screenshot();
	  driver.findElement(By.xpath("//*[@name=\"pwd\"]")).sendKeys("HEllomahesh1432");
	  Screenshot();
	  

  
  
  }

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
