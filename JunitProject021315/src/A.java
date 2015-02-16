import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class A 
{
	 FirefoxDriver dr;
	@Before
	public void start()
	{
		 dr=new FirefoxDriver();
		 dr.get("http://www.eshopper24.com");
		//System.out.println("before");
	}
	@After
	public void end()
	{
		dr.quit();
		//System.out.println("After");
	}

	/*static FirefoxDriver dr;
	@BeforeClass
	public static void start()
	{
		 dr=new FirefoxDriver();
		 dr.get("http://www.eshopper24.com");
		System.out.println("before");
	}
	@AfterClass
	public static void end()
	{
		dr.quit();
		System.out.println("After");
	}
*/

}
