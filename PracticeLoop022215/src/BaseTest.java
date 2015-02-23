import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest 
{
  FirefoxDriver dr;
  @Before
  public void m1()
  {
	  dr=new FirefoxDriver();
	  dr.get("http://www.eshopper24.com");
	  dr.manage().window().maximize();
	  dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
  
  @After
  public void m2() throws InterruptedException
  {
	  Thread.sleep(2000);
	  dr.quit();
  }
}
