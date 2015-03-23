import org.junit.Test;


public class SmokeTest extends BaseTest
{
	HomePage homePage;
	ProductDetailPage productDetailPage;
	
	@Test
	public void test01()
	{
		homePage = new HomePage(dr);
		homePage.verifyTitle();
		productDetailPage = homePage.clickWomenLink();
		productDetailPage.myName();
		
	}

}
