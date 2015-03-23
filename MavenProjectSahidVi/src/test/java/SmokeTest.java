import java.util.Arrays;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SmokeTest extends BaseTest
{
	
	@Test
	public void sta()
	{
		int a[]={5,7,8,34,9};//array value assign
		int a1[]=new int[4];//array declare
		/*Arrays.sort(a);
		System.out.println(a[a.length-1]);*/
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}*/
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==8)
			{
				continue;
			}
			System.out.println(a[i]);
		}
		
	}
	@Test
		public void getValueFromDropDownMenu()
		{
			dr.get("http://www.facebook.com");
			WebElement ele=dr.findElement(By.id("year"));
			Select s=new Select(ele);
			//s.selectByVisibleText("1975");
			int ins=s.getOptions().size();
			System.out.println(s.getOptions().size());
			//s.getOptions().indexOf(ins-1);
			//s.selectByIndex(ins-1);
			for(int i=ins-1;i<ins;i--)
			{
				s.selectByIndex(ins-i);
			}
			
	}
	
	
	
	
	


}
