package titel;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Share 
{
	FirefoxDriver dr;

	public Share(FirefoxDriver dr)
	{
		this.dr = dr;
	}
	
	void verifyTitle(String t)
	{
		String pt = dr.getTitle();
		System.out.println(pt);
		if(pt.contains(t))
		{
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("Title didn't match");
		}
	}

}
