package com.ykss.automation.appModules;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ykss.automation.bookingFlow.IndexPage;

public class CouponPage {

	
	public static void openCouponPage()
	{  
		
		  System.out.println("Coupon Page started here...."); 
		  System.setProperty("webdriver.chrome.driver", "D:\\selenium-libraries\\chromedriver.exe");
		  IndexPage.driver = new ChromeDriver();
		  IndexPage.driver .manage().window().maximize();
		  IndexPage.driver .get("http://localhost:8080/bus/coupon.htm");
		  
		  
   }
		
@Test	
	public static void couponPage() throws IOException
	 {
		try {
			   CouponPage.openCouponPage();
			   System.out.println("AboutEtravelsmart functionality starts here....");
			   System.out.println(IndexPage.driver.getCurrentUrl().toString());
			   String actualTitle = IndexPage.driver.getTitle();
			   System.out.println("title is "+actualTitle);
			   IndexPage.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   IndexPage.searchBusesCommon();

			   IndexPage.driver.navigate().to("http://localhost:8080/bus/coupon.htm");		   
			   
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[1]/td[1]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[3]/td[1]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[1]/td[3]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[1]/td[5]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[1]/td[7]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[1]/td[9]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[1]/td[11]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[1]/td[13]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[3]/td[3]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[3]/td[5]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[3]/td[7]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[3]/td[9]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[3]/td[11]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[3]/td[13]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[5]/td[1]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[5]/td[1]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[5]/td[3]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[5]/td[5]/a/img")).click(); 
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[5]/td[7]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[5]/td[9]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[5]/td[11]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[5]/td[13]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[8]/td[1]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[8]/td[3]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[8]/td[5]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[8]/td[7]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[8]/td[9]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[8]/td[11]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[8]/td[13]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[10]/td[1]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[10]/td[3]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[10]/td[5]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[10]/td[7]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[10]/td[9]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[10]/td[11]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[10]/td[13]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[12]/td[1]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[12]/td[3]/a/img")).click(); 
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[12]/td[5]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[12]/td[7]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[12]/td[9]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[12]/td[11]/a/img")).click();
			   IndexPage.driver.findElement(By.xpath("//*[@id='contentBox']/table/tbody/tr[12]/td[13]/a/img")).click();

		}
        catch(Exception CouponPage)
        {
        	File scr=((TakesScreenshot)IndexPage.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scr,new File("D:\\error screenshots\\PassedResults\\CouponPagescreenshot_"+timestamp()+".png"));
			CouponPage.printStackTrace();
			System.out.println(CouponPage);
        }
	}


	private static String timestamp() {
		
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
