package PopupAlerts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

      
class demo {
	 static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


	/*@Test
	void AlertOkORcancelbutton() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
		//driver.switchTo().alert().accept();
	    driver.switchTo().alert().dismiss();
	}*/

	@Test
	void AlertoORkbutton() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
		Thread.sleep(3000);
		/*driver.switchTo().alert().sendKeys("mahesh");
		driver.switchTo().alert().accept();*/
		 
		Alert a = driver.switchTo().alert();
		a.sendKeys("mahesh");
		a.accept();
		
	}
}
