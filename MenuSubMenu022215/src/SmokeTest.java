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
		/*WebElement ele=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a"));
		Actions a=new Actions(dr);
		a.moveToElement(ele).perform();*/
		int s1=dr.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[1]/ul/li")).size();
		for(int i=1;i<=s;i++)
		{
			WebElement ele1=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li["+i+"]/a"));
			Actions a=new Actions(dr);
			a.moveToElement(ele1).perform();
			for(int j=1;j<=s1;j++)
			{
				Thread.sleep(3000);
				dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[1]/ul/li["+j+"]/a")).click();
				Thread.sleep(2000);
				WebElement ele2=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li["+i+"]/a"));
				Actions a1=new Actions(dr);
				a1.moveToElement(ele2).perform();
			}
		}
	}
	@Test
	public void m4()
	  {
		List<WebElement> el= dr.findElements(By.tagName("a"));
		for(WebElement moga:el)//for(expected variable:actual variable)
		{
			
			System.out.println(moga.getText());
		}
	  }

}
