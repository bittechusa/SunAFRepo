import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseTest 
{
	WebDriver dr;
	@Before
	public void m1()
	{
		//dr=new FirefoxDriver();
		/*System.setProperty("webdriver.ie.driver", "C:/Users/bittech/Downloads/IEDriverServer_x64_2.44.0/IEDriverServer.exe");
		dr=new InternetExplorerDriver();*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bittech\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("http://www.eshopper24.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@After
	public void m2() throws InterruptedException
	{
		Thread.sleep(3000);
		dr.quit();
	}

}
