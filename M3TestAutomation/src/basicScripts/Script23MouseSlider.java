package basicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script23MouseSlider
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		WebElement src = driver.findElement(By.xpath("//span[@tabindex='0']"));//2
//		WebElement s = driver.findElement(By.xpath("//input[@name='q']"));
		Actions a = new Actions(driver);
		a.clickAndHold(src).moveByOffset(0, 0).perform();
		
		
		
		
		
		
		
		
	}

}
