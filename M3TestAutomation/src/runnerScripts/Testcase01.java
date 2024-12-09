package runnerScripts;

import org.testng.annotations.Test;

import genericScripts.BasePage;
import pageObjects.LoginPage;

public class Testcase01 extends BasePage
{
	@Test
	public void Login() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.EnterUsn();
		lp.EnterPsw();
		lp.ClickLogin();
		
	}

}
