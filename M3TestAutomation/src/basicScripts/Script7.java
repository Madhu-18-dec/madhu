package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.navigate().to("file:///C:/Users/QSPR/Desktop/Classic_Selenium/WEBELEMENT.html");
//		WebElement usn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		if(usn.isDisplayed())
//		{
//			if(usn.isEnabled())
//			{
//				usn.sendKeys("ad,min");
//			}
//			else
//			{
//				System.out.println("USN is disabled");
//			}
//		}
//		else 
//		{
//			System.out.println("USN is not displayed");
//			
//		}
		
		
		WebElement cb = driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(cb.isDisplayed())
		{
			if(cb.isEnabled())
			{
				if(cb.isSelected())
				{
					System.out.println("It is selected");
					cb.click();
				}
				else 
				{
					System.out.println("It is not selected");
				}
			}
			else 
			{
				System.out.println("It is disabled");	
			}
		}
		else 
		{
			System.out.println("It is not displayed");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(2000);
//		driver.quit();
//	
	
	
	
	
	
	
	
	
	
	
	}

}





