package Junitframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class demooneTest {
       static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	

	@Ignore//(onlly sikep the junit 3&4 versions)
	@Test
	void test1() {
		driver.get("https://www.x.com");

	}
     @Disabled//(only sikep the junit 5 version)
	@Test
	void test2() {
		driver.get("https://www.redmine.com");

	}
     @Disabled//(only sikep the junit 5 version)
	@Test
	void test3() {
		driver.get("https://www.facebook.com");

	}

	@Test
	void test4() {
		driver.get("https://www.instagram.com");

	}
	
	@Test
	void test5() {
		driver.get("https://www.whatsapp.com");

	}
}