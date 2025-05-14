package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeTest;

public class TestNG_93_ActionsClassPrograms {
	WebDriver driver;
 /** @Test
  public void Regithclick() {
	driver.get("https://www.techlearn.in/");
	Actions act = new Actions(driver);
	act .contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-2555\"]/a"))).build().perform();
  }*/
	
	
 /**@Test
  public void Doubleclick() throws Exception {
	driver.get("https://www.techlearn.in/code/double-tap/");
	 Thread.sleep(3000);
	Actions act = new Actions(driver);
	
	//act.doubleClick(driver.findElement(By.xpath("//*[@ondblclick=\"handleDoubleTap()\"]"))).build().perform();
    act.moveToElement(driver.findElement(By.xpath("//*[@ondblclick=\"handleDoubleTap()\"]"))).doubleClick().build().perform();
 }*/
	

	/**@Test
	  public void drganddroup() throws Exception {
		driver.get("https://www.techlearn.in/code/drag-and-drop/");
	 
	org.openqa.selenium.WebElement source = driver.findElement(By.xpath("//img[@height=\"69\"]"));
	org.openqa.selenium.WebElement  target = driver.findElement(By.xpath("//div[@id=\"div1\"]"));
	 Actions act = new Actions(driver);
	 act.dragAndDrop(source, target).build().perform();
	}*/
	/**@Test
	  public void Mouseover() throws Exception {
		driver.get("https://www.techlearn.in/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
	    act.moveToElement(driver.findElement( By.xpath("//*[@id=\"mega-menu-item-46\"]"))).click().build().perform();
	
	}*/
	
	
	@Test
	  public void nkeyboardfunctions() throws Exception {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(3000);
       Actions act  = new Actions(driver);
       //act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
