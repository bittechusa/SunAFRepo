import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SmockTest 
{
	public static void main(String[] args) throws Exception
	{
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://www.bluefly.com");
		Share sh = new Share (dr);
		sh.verifyTitle("bluefly");
		Thread.sleep(5000);
		dr.findElement(By.xpath("html/body/div[1]/header/div[2]/div[1]/ul/li[2]/a")).click();
		sh.verifyTitle("Bluefly");
	}

}
