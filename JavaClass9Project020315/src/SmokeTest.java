import org.junit.Test;
import org.openqa.selenium.By;


public class SmokeTest extends BaseTest
{
	Common cm;
	@Test
	public void test1()
	{
		cm=new Common(dr);
		cm.clickanyProduct(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/a"));
	}
	@Test
	public void test2()
	{
		
		cm=new Common(dr);
		cm.verifyUrl("women");
		cm.clickanyProduct(By.xpath("html/body/div[4]/div[2]/div/div/section/section/div[1]/figure/a/img"));
		
	}

}
