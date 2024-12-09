package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.navigate().to("https://www.flipkart.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));//500
		int count = links.size();
		for(int i=0;i<count;i++)
		{
			WebElement link = links.get(i);//0/1/2/3
			String url = link.getAttribute("href");
			System.out.println(url);
		}
		Thread.sleep(1000);
		driver.quit();
	}

}





