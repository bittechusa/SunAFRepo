import org.junit.Test;


public class ATest 
{
	int b=8;
	int c[]=new int[3];
	int a[]={9,6,8,17,8};
	String color[]={"red","ggh","gh","tt","ter"};
	@Test
	public void m1()
	{/*
		c[0]=5;
		c[1]=7;
		c[2]=8;
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}*/
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
	}

}
