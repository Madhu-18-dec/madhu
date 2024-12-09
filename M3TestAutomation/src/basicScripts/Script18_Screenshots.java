package basicScripts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Script18_Screenshots 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		List<WebElement> links = driver.findElements(By.xpath("//img"));
		int count = links.size();
		for(int i =0;i<count;i++)
		{
			WebElement link = links.get(i);
			File temp = link.getScreenshotAs(OutputType.FILE);
			File perm = new File("./Screenshots/Link"+i+".png");
			FileHandler.copy(temp, perm);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Date d = new Date();
//		String d1 = d.toString().replace(":","-");
//		System.out.println(d1);
//		WebElement usn = driver.findElement(By.xpath("//div[@class='_6luv _52jv']"));
//		File temp = usn.getScreenshotAs(OutputType.FILE);
//		File perm = new File("./Screenshots/Section.png");
//		FileHandler.copy(temp, perm);
		
		
		
		
		
		
		
		driver.quit();
}

}
