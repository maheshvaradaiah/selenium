package SelenniumLocarors;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class selenniumlocarors1 {
   static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	/**@Test
	void techlearnlogin() throws InterruptedException {
		
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(1000);
		driver.findElement(By.id("user_login")).sendKeys("mahesh");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("TechLearn@2025");
		Thread.sleep(2000);
	    driver.findElement(By.id("wp-submit")).click();*/
		/**@Test
		void classnamecssSelector() throws InterruptedException {
			
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(1000);*/
		
	//driver.findElement(By.className("wp-login-lost-password")).click();
		
		//driver.findElement(By.cssSelector(".wp-login-lost-password")).click();
		
	    //driver.findElement(By.cssSelector("a.wp-login-lost-password")).click();
		
		//driver.findElement(By.cssSelector("#user_ldogin")).sendKeys("mahesh@gmail.com");
		/**@Test
		void linktextpartiallinktext() throws InterruptedException {
			
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(1000);
    driver.findElement(By.linkText("Lost your password?")).click();
	driver.findElement(By.partialLinkText("Lost")).click();*/
	
	//findElemt retuntypes
	/**@Test
	void techlearnlogin() throws InterruptedException {		
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
	WebElement user = driver.findElement(By.id("user_login"));
	user.sendKeys("mahesh");
    driver.findElement(By.name("pwd")).sendKeys("TechLearn@2025");
    
    WebElement login = driver.findElement(By.name("wp-submit"));
    }*/

	
	//FindElements.retarnTypes
	//totallinks
	/**@Test	
	void techlearnlogin() throws InterruptedException {	
		driver.get("https://www.ndtv.com/");
		Thread.sleep(2000);
		List<WebElement>Totallinks = driver.findElements(By.tagName("a"));
		System.out.println(Totallinks.size());
		
		System.out.println("Totalinkon ndtvwebsite:"+Totallinks.size());
		
	}*/
	
	@Test	
	void Redmine() throws InterruptedException {	
		driver.get("https://www.redmine.org/");
		Thread.sleep(2000);
		List<WebElement>totalimges= driver.findElements(By.tagName("img"));
		System.out.println(totalimges.size());
		
		
	}
}


