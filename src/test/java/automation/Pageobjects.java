package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobjects {

	
	WebDriver driver;
	   public Pageobjects(WebDriver driver) {
		
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		//Page Factory
		
		
	    @FindBy(id="mat-input-0")
		WebElement useremail;
		
		@FindBy(id="mat-input-1")
		WebElement password;
		
		@FindBy(xpath="//button/span[2]")
		WebElement loginbtn;
		
		@FindBy(linkText="Embedded Dashboard")
		WebElement embeddedlink;
		
		@FindBy(linkText="Got it!")
		WebElement got;
		
		@FindBy(xpath="//span[@class='ant-select-selection-item']")
		WebElement role;
		
		public void loginApplication()
		{
			useremail.sendKeys("madihatasneem222@gmail.com");
			password.sendKeys("Ashwini@123");
			loginbtn.click();
		}
		public void togo() throws InterruptedException
		{
			got.click();
			Thread.sleep(2000);
			embeddedlink.click();
			Thread.sleep(3000);
			role.click();
			
		}

}
