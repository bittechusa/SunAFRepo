import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Common 
{
	FirefoxDriver dr;
	Common(FirefoxDriver moga)
	{
		dr=moga;
	}
	public void clickanyProduct(By by)
	{
		dr.findElement(by).click();
	}
	public void verifyUrl(String url)
	{
		if(dr.getCurrentUrl().contains(url))
		{
			System.out.println("url matched");
		}
		else
			System.out.println("url not matched");
	}
	

}
