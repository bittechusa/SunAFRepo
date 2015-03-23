
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest 
{
	FirefoxDriver dr; 
	
	@Before
	public void start() throws InterruptedException
	{
		dr = new FirefoxDriver();
		dr.get("http://www.bluefly.com");
		Thread.sleep(5000);
		
		//dr.navigate().refresh();
		
		try
		{
			dr.findElement(By.xpath(".//*[@id='signup-lightbox']/div[1]")).click();
			System.out.println("pop up found and closed");
		}
		catch(Exception e)
		{
			System.out.println("pop up coulnd't be fond");
		}
		
	}
	
	@After
	public void end()
	{
		dr.quit();
	}

} 
