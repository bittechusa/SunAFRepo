import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;


public class LoopRun 
{
	WebDriver dr = new FirefoxDriver();
	
	
	
		@Test
		public void moge() throws InterruptedException
		{
	
			dr.get("https://www.eshopper24.com/");
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
			WebElement	ele = dr.findElement(By.xpath("html/body/div[4]/div[2]/div/section/div[11]/figure/a/img"));

			//For scroll down;
			Coordinates co =((Locatable)ele).getCoordinates();
			co.inViewPort();
		
			Thread.sleep(4000);
			Actions ac=new Actions(dr);
			ac.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		//Multiple window handle;
		String mainWindow = dr.getWindowHandle();
		Set<String> cwin =dr.getWindowHandles();
		System.out.println(cwin.size());
		//string handle = driver.getWindowhandle();
		//all window handle;
		//Set<String> handles = driver.getWindowhandles();
		//loop for each handle
		
		for(String h:cwin)
		{
			if(!h.equals(mainWindow))
			{
				Thread.sleep(4000);
				dr.switchTo().window(h);
				Thread.sleep(3000);
				dr.findElement(By.xpath(".//*[@id='ui-id-2']")).click();
				System.out.println("clicked");
			}
			
		}
		
	
	}

}
