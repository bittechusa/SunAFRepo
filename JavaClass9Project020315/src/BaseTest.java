import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest 
{
	static FirefoxDriver dr;
	@BeforeClass
	public static void start()
	{
		dr=new FirefoxDriver();
		dr.get("http://www.eshopper24.com");
	}
	@AfterClass
	public static void end()
	{
		dr.quit();
	}

}
