
public class Support 
{
	int a=6;
	int m1()
	
	{
		int b=6;
		System.out.println(a);
		return 9;
	
	}
	int m2()
	{
		System.out.println(9);
		return a;
			
	}
	int m3()
	{
		System.out.println(a);
		return m2();
			
	}
	String m4()
	{
		String name="shahidul";
		System.out.println(name);
		return "hi";
	}
	String m5()
	{
		String name1="shahidul islam";
		System.out.println(name1);
		return name1;
	}
	String m6()
	{
		String name2="shahid";
		System.out.println(name2);
		return m5();
	}
	void m7()
	{
		System.out.println(5);
	}
	void m8()
	{
		System.out.println(5);
	}
	boolean m9()
	{
		if(a>3)
		{
			return true;
		}
		else
			return false;
	}
	public Regression m10()
	{
		System.out.println("click");
		return new Regression();
	}
}
