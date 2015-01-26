package parameterizedMethod;

public class Demo 
{

	public static void main(String[] args) 
	{
	Support sp= new Support();
	sp.	m1(10, 10);
	sp.m2(7,"gi",10);
	sp.m3(10,10,"hi");
	sp.m4("nice",5,"hi");

	}
}
/*}
static void m1(int x,int y)
{
	
	System.out.println(x+y);
}
static void m2(int x,String y)
{
	
	System.out.println(x+y);
}
static void m3(int x,int y,String z)
{
	System.out.println(x+y+z);
}
static void m4(String a,int b,String c)
{
	System.out.println(a+b+c);
}
			
	
	}
	*/