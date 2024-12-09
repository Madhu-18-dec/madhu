package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCript4 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSPR/Desktop/Classic_Selenium/DummyLink.html");
		WebElement el = driver.findElement(By.id("l1"));
		el.click();
		
		
		
		
		
		
		
		
	}

}
