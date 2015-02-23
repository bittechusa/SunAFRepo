import org.junit.Test;
import org.openqa.selenium.By;


public class SmokeTest extends Base
{
	@Test
	public void m1()
	{
		dr.findElement(By.id("email")).sendKeys("nice13mayma28@yahoo.com");
		dr.findElement(By.id("pass")).sendKeys("jcsbci35164");
	}
	@Test
	public void m2()
	{
		dr.findElement(By.id("email")).sendKeys("nice13mayma@yahoo.com");
		dr.findElement(By.id("pass")).sendKeys("jcsbci35164849484");
	}
	@Test
	public void m3()
	{
		dr.findElement(By.id("email")).sendKeys("nice3mayma@yahoo.com");
		dr.findElement(By.id("pass")).sendKeys("jcsbhggci35164849484");
	}
	@Test
	public void m4()
	{
		dr.findElement(By.id("email")).sendKeys("nicemayma@yahoo.com");
		dr.findElement(By.id("pass")).sendKeys("jcsbci35165554849484");
	}
	@Test
	public void m5()
	{
		dr.findElement(By.id("email")).sendKeys("nice22mayma@yahoo.com");
		dr.findElement(By.id("pass")).sendKeys("jcsbcifhgh35164849484");
	}
}


