package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.navigate().to("https://www.flipkart.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(WebElement link:links)
		{
			String txt = link.getText();
			System.out.println(txt);
		}
	Thread.sleep(1000);
	driver.quit();
	
	
	
	
	
	}

}
