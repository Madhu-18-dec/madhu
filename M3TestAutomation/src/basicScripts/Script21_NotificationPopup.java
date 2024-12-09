package basicScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script21_NotificationPopup 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSPR/Desktop/Dummy_page.html");
		WebElement fup = driver.findElement(By.id("f"));
		fup.sendKeys("C:\\Users\\QSPR\\Downloads\\QRA-SJECJD-A10.xlsx");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
