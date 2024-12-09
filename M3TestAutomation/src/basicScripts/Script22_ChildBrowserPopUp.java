package basicScripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script22_ChildBrowserPopUp 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(3000);
		driver.findElement(By.id("browserButton2")).click();
		String p_Browser = driver.getWindowHandle();
		Set<String> wins = driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<String>(wins);
		int count = arr.size();
//		arr.remove(p_Browser);
		for(int i = 0;i<count;i++)
		{
			String win = arr.get(i);
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			if(title.equals("DemoApps | Qspiders | Browser Windows"))
			{
			driver.close();
			}
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--disable-notifications");
//		WebDriver driver = new ChromeDriver(opt);
//		driver.manage().window().maximize();
//		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
//		Thread.sleep(2000);
//		WebElement ele = driver.findElement(By.id("browNotButton"));
//		ele.click();
////		driver.quit();
}

}
