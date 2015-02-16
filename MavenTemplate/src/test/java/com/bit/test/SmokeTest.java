package com.bit.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest
{
	private static Logger log = Logger.getLogger(SmokeTest.class.getName());
	
	@SuppressWarnings("deprecation")
	@Test
	public void teachwise() throws Exception
	{
		driver.get("http://www.teachwise.com");
		
		Thread.sleep(4000);
		
		List<WebElement> books =driver.findElements(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[3]/ul/li/div/div[3]/form[2]/button"));

		//books.get(1).getText();
		
		// Open the Excel file
        //FileInputStream fis = new FileInputStream("src/test/testdata/testdata.xls");
        FileInputStream fis = new FileInputStream("src/test/testdata/affiliateLogin.xlsx");
        // Access the required test data sheet
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet = wb.getSheet("QA");
        
        int count;
        
        for (count = 0; count <= sheet.getLastRowNum(); count++) 
        {
            HSSFRow row = sheet.getRow(count);
            HSSFCell cell = row.getCell(4, row.RETURN_BLANK_AS_NULL);
            String book = row.getCell(0).toString();
            //log.info("Total row : " + sheet.getLastRowNum());
            log.info("Book name : " + book);
            
            try 
            {
                if (cell == null) 
                {
                	
                    cell = row.getCell(0);
                    cell.setCellValue(books.get(count).getText());
                    //Assert.assertFalse(book.equals(books.get(count).getText()));
                    log.info("Test result typed :" + books.get(count).getAttribute("data-id"));
                    if(books.get(count).getAttribute("data-id").equals(book))
                	{
                    	log.error("Product matched for position["+(count+1)+"]");
                		
                	}

                } 
                else 
                {
                	cell = row.getCell(0);
                    cell.setCellValue("Pass");
                    log.info("Test result typed : ===== Pass =====");

                }

                FileOutputStream fos = new FileOutputStream("src/test/testdata/affiliateLogin.xls");
                wb.write(fos);
            } 
            catch (Exception e) 
            {
                log.error("Exception found while writing on excel file");
            }
           
        }
		
		
		
		for(WebElement ele : books)
		{
			log.info(ele.getAttribute("data-id"));
		}
		
		//String book = driver.findElement(By.xpath("//div[@class='category-products'][1]//ul[contains(@class,'products-grid')][1]//li[contains(@class,'grid-item')][1]//h4//a")).getText();
		//System.out.println(book);
	}

}
