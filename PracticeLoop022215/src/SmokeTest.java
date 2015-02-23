import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class SmokeTest extends BaseTest
{
  @Test
  public void m3() throws InterruptedException
  {
	int s=dr.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li")).size();
	WebElement ele=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/a/b"));
	Actions a=new Actions(dr);
	a.moveToElement(ele).perform();
	dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/div/div[1]/ul/li[1]/a")).click();
	int s1=dr.findElements(By.xpath("html/body/div[4]/div[2]/div/div/section/section/div")).size();
  for(int i=1;i<=s1;i++)
  {
	  dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/section/section/div["+i+"]/figure/a/img")).click();
	  dr.navigate().back();
	  Thread.sleep(2000);
  }
  }
  
}
