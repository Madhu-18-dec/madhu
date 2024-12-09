package basicFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript 
{
	WebDriver driver;
	@BeforeMethod
	public void BrowserSetup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	@AfterMethod
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(5000);		driver.quit();
	}

}
