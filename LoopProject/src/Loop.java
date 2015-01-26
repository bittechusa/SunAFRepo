import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Loop {
    static FirefoxDriver dr= new FirefoxDriver();
	public static void main(String[] args) throws InterruptedException 
	{
		
		dr.get("http://www.bluefly.com");
		Thread.sleep(2000);
		dr.findElement(By.xpath(".//*[@id='main-nav-woman']/a")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath(".//*[@id='slotMcolMain1']/div/div[2]/ul/li[1]/a/div/img")).click();
		Thread.sleep(2000);
		int s= dr.findElements(By.xpath("//div[@id='productGridContainer']/div/div/a/img")).size();
		for(int a=1; a<s; a++)
		{
			dr.findElement(By.xpath("//div[@id='productGridContainer']/div["+a+"]/div/a/img")).click();
			Thread.sleep(2000);
			dr.navigate().back();
			Thread.sleep(2000);
		}
	}

}
