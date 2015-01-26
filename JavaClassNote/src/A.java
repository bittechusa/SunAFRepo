public class A 
{
	static int p = 3;

	public static void main(String[] args) 
	{
		B x = new B();
		x.m1();
		abc();

	}
	
	public static void abc()
	{
		int z = 1;
		System.out.println("Addition of " + p + " and " + z + " is = " + (p+z));
	}
	
}