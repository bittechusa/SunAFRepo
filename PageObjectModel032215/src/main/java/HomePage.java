import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HomePage 
{
	FirefoxDriver dr;
	
	HomePage(FirefoxDriver dr)
	{
		this.dr = dr;
	}
	
	
	void verifyTitle()
	{
		if(dr.getTitle().contains("Designer Clothing"))
		{
			System.out.println("Title found correct");
		}
		else
		{
			System.out.println("Title is iccorrect");
		}
	}
	
	ProductDetailPage clickWomenLink()
	{
		dr.findElement(By.xpath(".//*[@id='main-nav-woman']/a"));
		
		return new ProductDetailPage(dr);
	}
	
	
	

}
