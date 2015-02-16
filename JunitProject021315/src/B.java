import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;


public class B extends A
{
	
	@Test
	public void m1()
	{
		String title="online shopping in Bangladesh for men and women : tangail saree | Brand watch | Brand Shoes";
		if(dr.getTitle().equals(title))
		{
			System.out.println("title matched");
		}
		else
			System.out.println("not matched");
	}
	@Test
	public void m2() throws InterruptedException
	{
		//System.out.println(dr.getCurrentUrl());
		int a=3;
		/*while(a<7)
		{
			System.out.println("hi");
			a++;
		}*/
		/*do{
			System.out.println("hi");
			a++;
		}
		while(a<7);*/
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/a")).click();
		int s=dr.findElements(By.xpath("//section[contains(@class, 'category_grid')]/div")).size();
	    for(int i=1;i<=s;i++)
	    {
	    	dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/section/section/div["+i+"]/figure/a/img")).click();
	    	Thread.sleep(2000);
	    	dr.navigate().back();
	    	Thread.sleep(2000);
	    }
	}
	

}
