import org.openqa.selenium.By;  
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice 
{
	public static void main(String[] args) throws Throwable
	{
		Regression x = new Regression();
		x.jaIchaTai();
		
		FirefoxDriver ff = new FirefoxDriver();
		//ff.get("http://www.google.com");
		//ff.findElement(By.name("q")).sendKeys("Selenium");
		
		ff.get("http://www.facebook.com");
		ff.findElement(By.id("email")).sendKeys("asad@yahoo.com");
		ff.findElement(By.xpath("//input[@id='pass']")).sendKeys("Asad12345");
		ff.findElement(By.xpath("//input[@id='u_0_n']")).click();
		Thread.sleep(10000);
		ff.quit();
	
	}

}
