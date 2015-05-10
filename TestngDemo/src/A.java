import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class A 
{
	WebDriver dr;
	@BeforeMethod
	//@BeforeTest
	public void start()
	{
		dr= new FirefoxDriver();
		dr.get("http://www.facebook.com");
	}
	//@Test()
	public void login()
	{
		System.out.println("now at t1");
	}
    @Test(dataProvider="auth")
	public void logout(String s,String y)
	{
		dr.findElement(By.id("email")).sendKeys(s);
		dr.findElement(By.id("pass")).sendKeys(y);
	}
    @DataProvider(name="auth")
    public Object[][] m1()
    {
    	return new Object[][] {{"testuser1","1234"},{"testuser2","234"}};
    }
    
    @Test
	 
	  @Parameters({ "sUsername", "sPassword" })
	 
	  public void test(String sUsername, String sPassword) {
	   //FirefoxDriver dr;
	     // dr = new FirefoxDriver();
	     // dr.manage().window().maximize();
	 
	      //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	     // dr.get("http://www.facebook.com");
	 
	      dr.findElement(By.id("email")).sendKeys(sUsername);
	 
	      dr.findElement(By.id("pass")).sendKeys(sPassword);
	 
	      dr.findElement(By.id("u_0_n")).click();
	      dr.quit();

    }
    
    
	@AfterMethod
	//@AfterTest
	public void end()
	{
		dr.quit();
	}
	
	

}
