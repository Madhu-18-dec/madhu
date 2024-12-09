package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script11
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("file:///C:/Users/QSPR/Desktop/Classic_Selenium/CheckBox.html");
		List<WebElement> box = driver.findElements(By.xpath("//input"));
		int count = box.size();
		for(int i=0;i<count;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			WebElement ele = box.get(i);
			ele.click();
			}
		}
		
		for(int i=count-1;i>=0;i--)
		{
			if(i%2==0)
			{
				System.out.println(i);
			WebElement ele = box.get(i);
			ele.click();
			}
		}

	}

}
