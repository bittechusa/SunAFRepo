import org.openqa.selenium.firefox.FirefoxDriver;


public class ProductDetailPage 
{
	FirefoxDriver dr;
	
	ProductDetailPage(FirefoxDriver dr)
	{
		this.dr = dr;
	}
	
	void myName()
	{
		System.out.println("I am in women product page");
	}

}
