
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A 
{
	FirefoxDriver dr;
	
	A(FirefoxDriver moga)
	{
		dr=moga;
		dr.get("http://eshopper24.com");
	}
	
	public void link()
	{
		List<WebElement> ele=dr.findElements(By.tagName("a"));
		System.out.println(ele.size());
		String s=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a")).getText();
	    System.out.println(s);
	    String s1=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a")).getAttribute("class");
	    System.out.println(s1);
	}
	String s=new String("Hi, welcome back, shaha Apu in bittech");
	String s1="hello";
	int a=9;
	void m2()
	{
		System.out.println(s.contains("shaha"));
		System.out.println(s.concat(" corp"));
		System.out.println(s.charAt(0));
		System.out.println(s.replace("shaha", "shahana"));
		System.out.println(s.trim());
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s1.compareTo("hello"));
		System.out.println(s.equals("ghdfhgj xdfk"));
		String a[]=s.split(",");
		System.out.println(a[1]);
		System.out.println(s.endsWith("bittechbnmb"));
		System.out.println(s.indexOf("a"));
		System.out.println(s.substring(4));
		Integer i=90;
		System.out.println(i.compareTo(60));
		
	}
	public void statement()
	{
		if(dr.getPageSource().contains("hi"))
		{
			if(dr.getTitle().contains("hi"))
			{
				System.out.println("true");
			}
			else
				System.out.println("false");
		}
		else
		{
			if(dr.getTitle().contains("hi"))
			{
				System.out.println("true");
			}
		
			else
			{
				System.out.println("false");
			}
	   }
	}
		public void m3()
		{
			int a=8;
			while(a<13)
			{
				if(a==11)
				{
				continue;
				
				}
				System.out.println(a);
				a++;
				
			}
		}
	

	
}
