package basicScripts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Script19_DisabledElements 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//h3[.='b. Premium Materials']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("document.body.style.zoom='60%'");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.get("file:///C:/Users/QSPR/Desktop/TEST_AUTOMATION/Html/Dummy_page.html");
//		WebElement usn = driver.findElement(By.xpath("//input[@class='c1']"));	
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].value=' '",usn);
		
		
		
		
		
		
		
		
		
//		driver.quit();
}

}
