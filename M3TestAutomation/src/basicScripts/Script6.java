package basicScripts;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script6 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		Point p  = new Point(400,500);
		driver.manage().window().setPosition(p);
		
		
		
		
		
		
		
//		Thread.sleep(2000);
//		driver.quit();
//	
	
	
	
	
	
	
	
	
	
	
	}

}





