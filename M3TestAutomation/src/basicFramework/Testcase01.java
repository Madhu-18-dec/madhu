package basicFramework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase01 extends GenericScript
{
	@Test
	public void Usn()
	{
		boolean displayed = driver.findElement(By.id("email")).isDisplayed();
		boolean enabled = driver.findElement(By.id("email")).isEnabled();
		System.out.println(displayed +" "+ enabled);
	}

}