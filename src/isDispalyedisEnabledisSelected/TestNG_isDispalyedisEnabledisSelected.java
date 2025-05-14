package isDispalyedisEnabledisSelected;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_isDispalyedisEnabledisSelected {
	WebDriver driver;
  @Test
  public void isdisplayedmethod() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		boolean lyp = driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).isDisplayed();
		
		if(lyp==true)
		{
			System.out.println("Lost your password link is presented to click on forgot password page");
			driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).click();
		}
		
		else
		{
			System.out.println("Lost your password link is Not presented to click on forgot password page");		
		}
  }
  @Test
	public void isEnabledmethod() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		boolean username = driver.findElement(By.xpath("//input[@id='user_login']")).isEnabled();
		
		if(username==true)
		{
			System.out.println("Username or email text box is enabled to the enter username");
			driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("mahesh");
		}
		
		else
		{
			System.out.println("Username or emaill text box is Not enabled to the enter username");
		}
	}
	
  @Test
	public void isSelectedmethod() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
		
		boolean checkbox =  driver.findElement(By.xpath("//input[@id='rememberme']")).isSelected();
		
		if(checkbox==true)
		{
			System.out.println("Remember Me check box is selected");
		}
		
		else
		{
			System.out.println("Remember Me check box is Not selected");
		
		}
	}

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
