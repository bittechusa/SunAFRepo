import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest 
{
	FirefoxDriver dr;
	@Before
	public void m1()
	{
		dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
	}
	@After
	public void m2()
	{
		dr.quit();
	}

}
