import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base 
{
	FirefoxDriver dr;
	@Before
	public void start() throws Throwable
	{
		dr = new FirefoxDriver();
		dr.get("http:/www.facebook.com");
		Thread.sleep(3000);
	}
	
	
	@After
	public void finish() throws Throwable
	{
		
	Thread.sleep(3000);
	dr.quit();
	}


}
