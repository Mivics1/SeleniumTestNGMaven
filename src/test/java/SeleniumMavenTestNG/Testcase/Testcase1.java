package SeleniumMavenTestNG.Testcase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Testcase1 {
	public static WebDriver driver;
	@BeforeTest
	public void LaunchBrowser() {
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--headless");
		System.setProperty("webdriver.edge.driver","C:\\\\Selenium-drivers\\\\msedgedriver.exe");
		driver = new EdgeDriver(option);
	}
	
	@Test (priority = 1)
	public void checkGoogle() {
		driver.get("https://google.com");
		Assert.assertEquals("Google", driver.getTitle());
	}
	@Test (priority = 2)
	public void checkYahoo() {
		driver.get("https://yahoo.com");
		Assert.assertEquals("https://www.yahoo.com/",driver.getCurrentUrl());
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}

}
