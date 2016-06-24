package com.ykss.automation.appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ykss.automation.bookingFlow.IndexPage;

public class ArtistBooking {

	public static void OpenArtist()
	{
		  //IndexPage.driver=new FirefoxDriver();
		  
		  System.out.println("Artist page opened....");   	
		  IndexPage.driver .manage().window().maximize();
		  IndexPage.driver .get("http://localhost:8080/bus/Artist_booking.htm");
		  
    }
	public static void artistBooking()
	{
		 try {
			 
				 ArtistBooking.OpenArtist();
				 IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//TO HANDLE THE CONFIRM NAVIGATION POP-UPS 
				 Alert alert = IndexPage.driver.switchTo().alert();
				 alert.accept(); //If yes to navigate
				/* alert.dismiss();// If no to submit
			//ACTIONS TO SUBSCRIBE *
			  
				 IndexPage.driver.findElement(By.name("email")).sendKeys("reddynaveen19@gmail.com");
				 IndexPage.driver.findElement(By.name("PhNum")).sendKeys("9963367842");
				 IndexPage.driver.findElement(By.id("createSubcriptions")).click(); 
				 IndexPage.driver.findElement(By.className("ui-button-text")).click();*/
				 
				 WebElement menu = IndexPage.driver.findElement(By.name("artistbooking"));
				 IndexPage.driver.findElement(By.name("artistbooking")).sendKeys("Pavan");
				 Actions actions = new Actions(IndexPage.driver);
				 actions.moveToElement(menu);
				 actions.build();
				 actions.perform();
				 IndexPage.driver.findElement(By.partialLinkText("Pavan ")).click();
				 IndexPage.driver.findElement(By.className("bookArtistBtn")).click();
				 
				
			 
			 
			
			 //WebElement table = IndexPage.driver.findElement(By.name("ui-corner-all"));
			 //List<WebElement> rows = table.findElements(By.tagName("span")); 
			 //System.out.println("Total no. of rows: "+ rows.size());
			 //Iterator<WebElement> i = rows.iterator(); 
			 //while(i.hasNext()) { 
			 //WebElement row = i.next(); 
			// System.out.println(row.getText());
			 
			 //}
			 //ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all	 
			 
			// WebElement element = IndexPage.driver.findElement(By.name("artistbooking"));
			    //element.sendKeys("Pavan kumar"); // send also a "\n"
			    //element.submit();
			    //ui-id-13952
			    //IndexPage.driver.findElement(By.xpath("//*[@id='ui-id-12624']")).click();
			    //IndexPage.driver.findElement(By.id("ui-id-13952")).click();

			    // wait until the google page shows the result
			    //WebElement myDynamicElement = (new WebDriverWait(IndexPage.driver, 10))
			             // .until(ExpectedConditions.presenceOfElementLocated(By.name("artistbooking")));

			   // List<WebElement> findlist = IndexPage.driver.findElements(By.xpath("//*[@id='ui-id-6648']"));
			    
			    
			 //IndexPage.driver.findElement(By.name("artistbooking")).sendKeys("Kartheek");
			 //IndexPage.driver.findElement(By.className("mainHeading")).click();
			 //WebElement dropdown=IndexPage.driver.findElement(By.xpath("html/body/div[3]/div/div/div/a"));
			// IndexPage.driver.findElement(By.xpath("html/body/div[3]/div/div/div/a")).get(2).click();
			 //dropdown.click();
			 
			 //IndexPage.driver.findElement(By.xpath("//*[@id="ui-id-12624"]")).click();
			
			 
			 //IndexPage.driver.findElement(By.className("mainHeading")).click();
			 //WebElement dropdown = IndexPage.driver.findElement(By.name("artistbooking"));
			 //new Select(IndexPage.driver.findElement(By.name("artistbooking"))).selectByVisibleText("Gayatri");
			 //IndexPage.driver.findElement(By.name("artistbooking")).sendKeys("anchor",Keys.ARROW_DOWN);
			 //dropdown.click();
			// IndexPage.driver.findElement(By.linkText("SEARCH")).click();
			 
		

		 }
		 catch (Exception e) 
		     {
		    	 e.printStackTrace();
			 
		 }

}
}
