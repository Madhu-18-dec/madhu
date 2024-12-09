package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script12MouseHOver
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.navigate().to("https://www.flipkart.com");
		WebElement Fashion = driver.findElement(By.xpath("//span[.='Fashion']"));//2
		WebElement s = driver.findElement(By.xpath("//input[@name='q']"));
		Actions a = new Actions(driver);
		a.moveToElement(Fashion).perform();
		a.sendKeys(s, "Hello").perform();
		a.keyDown(Keys.LEFT_CONTROL).perform();
		a.keyDown(Keys.SHIFT).perform();
		a.keyUp(Keys.LEFT_CONTROL).perform();
		
		
		
		
		
		
		
		
	}

}
