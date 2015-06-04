package com.bitt;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Sshort
{
	FirefoxDriver dr =new FirefoxDriver();

	/*@Test
	public void screenshort() throws IOException
	{
		dr.get("http://www.eshopper24.com/");
		dr.manage().window().maximize();
		
		File f =((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\SHAHRIAR\\Desktop\\Screenshort\\shahriar.png"),true);
	}
	@Test
	public void drugable() throws InterruptedException
	{
		dr.get("http://www.jqueryui.com/droppable/");
		dr.manage().window().maximize();
		dr.switchTo().frame(0);
		WebElement dropable =dr.findElement(By.id("draggable"));//source file
		WebElement moga = dr.findElement(By.id("droppable"));//target file
		new Actions(dr).dragAndDropBy(dropable, 200, 10).build().perform();//this for specific place
		new Actions(dr).dragAndDrop(dropable,moga ).build().perform();
		Thread.sleep(4000);
	}*/
	/*@Test
	public void alert()
	{
		dr.get("http://bittechusa.com/alert.html");
		dr.findElement(By.xpath("html/body/input[1]")).click();
		dr.switchTo().alert().accept();
		*/
	//}
	/*@Test
	public void dismiss()
	{
		dr.get("http://bittechusa.com/alert.html");
		dr.findElement(By.xpath("html/body/input[2]")).click();
		dr.switchTo().alert().dismiss();
		
	}
*/ /*  @Test
     public void dismiss()
    {
	dr.get("http://bittechusa.com/alert.html");
	dr.findElement(By.xpath("html/body/input[2]")).click();
	Alert m = dr.switchTo().alert();
	String s = m.getText();
	System.out.println(s);
	if(s.equals("hi,this is confirm box"))
	{
		System.out.println("matches");
	}
	else
	{
		System.out.println("It does not");
	}
	
  }*/
	@Test
	public void dragdropp() throws InterruptedException
	{
		dr.get("http://jqueryui.com/droppable/");
		dr.manage().window().maximize();
		dr.switchTo().frame(0);
		 WebElement drag=dr.findElement(By.id("draggable"));
		 WebElement dro= dr.findElement(By.id("droppable"));
		 new Actions(dr).dragAndDropBy(drag,200,10).build().perform();
		 new Actions(dr).dragAndDrop(drag, dro).build().perform();
		 Thread.sleep(3000);
	}
     
	}
