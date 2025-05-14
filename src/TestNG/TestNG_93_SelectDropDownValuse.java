package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class  TestNG_93_SelectDropDownValuse {
	WebDriver driver;
  @Test
  public void dropDownvaluse() throws InterruptedException {
	  driver.get("https://www.redmine.org/account/register");
	  Thread.sleep(2000);
	  driver.findElement(By.id("user_mail")).sendKeys("maheshrohith143@gmail.com");
	  Select I =new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
	  I.selectByContainsVisibleText("Ukrainian");
	  I.selectByIndex(2);
	   I.selectByValue("ar");
	   I.selectByVisibleText("Macedonian (Македонски)");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
