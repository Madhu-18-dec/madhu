package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script5 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSPR/Desktop/Classic_Selenium/Locator.html");
		WebElement usn = driver.findElement(By.cssSelector("input[type='text']"));
		Thread.sleep(2000);
		usn.sendKeys("admin");
		WebElement cb = driver.findElement(By.cssSelector("input[type='checkbox']"));
		Thread.sleep(2000);    //-->Qsp#9980
		cb.click();
		WebElement rb = driver.findElement(By.cssSelector("input[type='radio']"));
		Thread.sleep(2000);
		rb.click();
		WebElement link = driver.findElement(By.cssSelector("a[href='https://www.youtube.com']"));
		Thread.sleep(2000);
		link.click();
		Thread.sleep(2000);
		driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	}

}





