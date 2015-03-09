import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest 
{
	FirefoxDriver dr;
	@Before
	public void start()
	{
		dr= new FirefoxDriver();
	}

}
