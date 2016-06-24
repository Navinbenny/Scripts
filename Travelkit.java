package com.ykss.automation.appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ykss.automation.bookingFlow.IndexPage;




//Go to Indexpage class if we want to run Travelkit page individually..

public class Travelkit {
	 
	public static void OpenTravelKit()
	{
		
		  System.out.println("Travelkit page opened....");   	
		  IndexPage.driver .manage().window().maximize();
		  IndexPage.driver .get("http://localhost:8080/bus/travelkit-order.htm"); 
		  
   }

	
	public static void TravelAccessories() {
		try {
			//*[@id="TK05"]/button
		       Travelkit.OpenTravelKit();
		       /*WebDriverWait wait = new WebDriverWait(IndexPage.driver, 10);
      		   wait.until(ExpectedConditions.alertIsPresent());
      		   Alert alert = IndexPage.driver.switchTo().alert();
      		   alert.accept(); //if yes to navigate
*/		       IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		       WebElement sleepingkit = IndexPage.driver.findElement(By.xpath("//img[@src='ui/images/sleepingkit.png']"));
		       sleepingkit.click();
		       
		       IndexPage.driver.findElement(By.xpath("//*[@id='TK05']/div[2]/img")).click();
               
		       WebElement slpkit_num = IndexPage.driver.findElement(By.xpath("//*[@id='TK05']/p[3]/input"));
		       slpkit_num.clear();
			   slpkit_num.sendKeys("2");
			   IndexPage.driver.findElement(By.xpath("//*[@id='TK05']/button")).click();
			   
		       WebElement NeckPillow = IndexPage.driver.findElement(By.xpath("//img[@src='http://cdn.shopify.com/s/files/1/0822/8055/products/NECK_PILLOW_1024x1024.png?v=1431089002']"));
		       NeckPillow.click();
		      
		       IndexPage.driver.findElement(By.xpath("//*[@id='TK06']/div[2]/img")).click();
		       WebElement nkpilow_num = IndexPage.driver.findElement(By.xpath("//*[@id='TK06']/p[3]/input"));
		       nkpilow_num.clear();
			   nkpilow_num.sendKeys("3");
			   IndexPage.driver.findElement(By.xpath("//*[@id='TK06']/button")).click();
		       WebElement DisposableKit = IndexPage.driver.findElement(By.xpath("//img[@src='http://cdn.shopify.com/s/files/1/0822/8055/products/DSC01515__1433741439_38760_1024x1024.jpg?v=1433741581']"));
		       DisposableKit.click();
		      
		       IndexPage.driver.findElement(By.xpath("//*[@id='TK08']/div[2]/img")).click();
		       WebElement dispkit_num = IndexPage.driver.findElement(By.xpath("//*[@id='TK08']/p[3]/input"));
		       dispkit_num.clear();
			   dispkit_num.sendKeys("4");
			   IndexPage.driver.findElement(By.xpath("//*[@id='TK08']/button")).click();
		       WebElement WomensToiletryKit = IndexPage.driver.findElement(By.xpath("//img[@src='http://cdn.shopify.com/s/files/1/0822/8055/products/DSC01500__1433740830_78228_1024x1024.jpg?v=1433740868']"));
		       WomensToiletryKit.click();
		     
		       IndexPage.driver.findElement(By.xpath("//*[@id='TK09']/div[2]/img")).click();
		       WebElement wmentkit_num = IndexPage.driver.findElement(By.xpath("//*[@id='TK09']/p[3]/input"));
		       wmentkit_num.clear();
			   wmentkit_num.sendKeys("5");
			   IndexPage.driver.findElement(By.xpath("//*[@id='TK09']/button")).click();
		       WebElement AntiRadiationChip = IndexPage.driver.findElement(By.xpath("//img[@src='http://www.radblok.in/Content/images/phonepatch.png']"));
		       AntiRadiationChip.click();
		       
		       IndexPage.driver.findElement(By.xpath("//*[@id='TK12']/div[2]/img")).click();
		       WebElement antichip_num = IndexPage.driver.findElement(By.xpath("//*[@id='TK12']/p[3]/input"));
		       antichip_num.clear();
			   antichip_num.sendKeys("6");
			   IndexPage.driver.findElement(By.xpath("//*[@id='TK12']/button")).click();
		       WebElement Travelkits = IndexPage.driver.findElement(By.xpath("//img[@src='ui/images/wellnesskit1.jpg']"));
		       Travelkits.click();
		      
		       IndexPage.driver.findElement(By.xpath("//*[@id='TK13']/div[2]/img")).click();
		       WebElement tkit_num = IndexPage.driver.findElement(By.xpath("//*[@id='TK13']/p[3]/input"));
		       tkit_num.clear();
		       tkit_num.sendKeys("7");
		       IndexPage.driver.findElement(By.xpath("//*[@id='TK13']/button")).click();
				//*[@id="TK05"]/p[3]/input
		       //IndexPage.driver.findElement(By.xpath("//*[@id='yourOrderstable']/tbody/tr[5]/td[5]/a")).click();
		     //*[@id="yourOrderstable"]/tbody/tr[1]/td[5]/a
		     //*[@id="yourOrderstable"]/tbody/tr[2]/td[5]/a
		     //*[@id="yourOrderstable"]/tbody/tr[3]/td[5]/a
		       IndexPage.driver.findElement(By.className("travelbagdone")).click();
		       IndexPage.driver.findElement(By.name("userName")).sendKeys("Naveen reddy");
		       IndexPage.driver.findElement(By.name("emailId")).sendKeys("reddynaveen19@gmail.com");
		       IndexPage.driver.findElement(By.name("phoneNumber")).sendKeys("9963367842");
		       IndexPage.driver.findElement(By.name("address")).sendKeys("Botanical gardens Kondapur ");
		       IndexPage.driver.findElement(By.name("city")).sendKeys("Hyderabad",Keys.ARROW_DOWN);    
		      /* WebElement element=IndexPage.driver.findElement(By.name("city"));
			   Select se=new Select(element);
			   se.selectByVisibleText("Hyderabad");*/
		       IndexPage.driver.findElement(By.name("state")).sendKeys("Telangana",Keys.ARROW_DOWN);       
		       IndexPage.driver.findElement(By.name("pinCode")).sendKeys("500084");
		       IndexPage.driver.findElement(By.id("validate")).click();   
		       
		       WebElement travelkittandc = IndexPage.driver.findElement(By.cssSelector("a[href*='travel-kit-terms.htm']"));
		       travelkittandc.click();
		       
		   }   
		     catch (Exception e) 
		     {
		    	 e.printStackTrace();
			 
		 }
		
		
	}

}

