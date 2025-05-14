package Junitframework;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class demoone2 {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	driver.quit();
	}

	@Test
	void test1() {
		driver.get("https://www.selenium.dev");
	}

	@Test
	void test2() {
		driver.get("https://www.x.com");

	}

	@Test
	void test3() {
		driver.get("https://www.redmine.com");

	}

	@Test
	void test4() {
		driver.get("https://www.facebook.com");

	}

	@Test
	void test5() {
		driver.get("https://www.instagram.com");

	}
}
