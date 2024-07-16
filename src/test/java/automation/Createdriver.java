package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createdriver {

	WebDriver driver;
	
	@BeforeTest
	public void create() {
		
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.navigate().to("http://18.175.106.18:4200/");
	
	}
	
	@Test
	public void testcase() throws InterruptedException
	{
		Pageobjects page=new Pageobjects(driver);
		page.loginApplication();
		Thread.sleep(2000);
		page.togo();
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		//driver.close();
	}
	
}
