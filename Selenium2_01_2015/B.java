import org.openqa.selenium.firefox.FirefoxDriver;

public class B 
{
	static FirefoxDriver dr= new FirefoxDriver();
	
	public static void main(String[] args)
	{
		A x = new A(dr);
		//A x1 = new A();
		//x.link();
		//x1.m2();
		//x.statement();
		x.m3();
		
	}

}
