
public class Smoke 
{

	public static void main(String[] args) 
	{
		Support x=new Support();
		int z=x.a;//when u call any variable you have to assign another variable or in a method
		
		System.out.println(x.m1()+x.m2());//adding 2 return type methods
		//x.m7()+x.m8(); we can't add any method which return type is void
		
		System.out.println(x.a+x.m3());
		//x.a+x.m7(); variable and void type method can't be added
		
		x.m9();
		System.out.println(x.m9());
		
		
		Regression r=x.m10();//means new Regression();
		r.jaIchaTai();
	}

}
