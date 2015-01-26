package  titel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Smoketest 
{
	
	public static void main (String[] args)
	{   
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http:\\www.blufly.com"); 
		Share sh = new Share(dr);
		sh.verifyTitle("Bluefly");
		dr.findElement(By.xpath(".//*[@id='main-nav-men']/a")).click();
		sh.verifyTitle("Bluefly");
		
		dr.findElement(By.xpath(".//*[@id='main-nav-woman']/a")).click();
		sh.verifyTitle("Bluefiy");
		
	}
	
	
	

}
