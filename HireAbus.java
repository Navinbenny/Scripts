package com.ykss.automation.appModules;

import java.io.File;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;

import com.ykss.automation.bookingFlow.IndexPage;

//Go to Indexpage class if we want to run HireAbus page individually.. 


public class HireAbus {
	  static String path;

	public static void Openhireabuspage()
	{
		
		  System.out.println("Hire a bus page opened....");   	
		  IndexPage.driver .manage().window().maximize();
		  IndexPage.driver .get("http://localhost:8080/bus/hireBus.htm"); 
		  
    }
	
	public static void hireABuspage() {
		  
			try{
				HireAbus.Openhireabuspage();
				IndexPage.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				/*WebDriverWait wait = new WebDriverWait(IndexPage.driver, 10);
	      		wait.until(ExpectedConditions.alertIsPresent());*/
	      		//Alert alert = IndexPage.driver.switchTo().alert();
	      		//alert.accept(); //if yes to navigate	      		
	      		IndexPage.driver.findElement(By.name("customerName")).sendKeys("Naveen reddy");
				IndexPage.driver.findElement(By.name("mobileNumber")).sendKeys("9963367842");
				IndexPage.driver.findElement(By.name("emailID")).sendKeys("reddynaveen19@gmail.com");
				IndexPage.driver.findElement(By.name("custAddress")).sendKeys("Madhapur hyderabad");
				IndexPage.driver.findElement(By.name("srcCity")).sendKeys("hyderabad",Keys.ARROW_DOWN);
				IndexPage.driver.findElement(By.name("destCity")).sendKeys("kurnool",Keys.ARROW_DOWN);
				IndexPage.driver.findElement(By.id("doj")).click();
				IndexPage.driver.findElement(By.linkText("27")).click();
				IndexPage.driver.findElement(By.id("dor")).click();
				WebElement dateWidget = IndexPage.driver.findElement(By.id("ui-datepicker-div"));  
				dateWidget.findElement(By.linkText("Next")).click();
				
				List<WebElement> dates = dateWidget.findElements(By.tagName("td"));  
				for (WebElement date : dates){ 
					//Select 13th Date   
					if (date.getText().equals("13")){  
						date.findElement(By.linkText("13")).click();  
						break;  
					}  
				}
				WebElement element=IndexPage.driver.findElement(By.className("busType"));
				Select se=new Select(element);
				se.selectByVisibleText("Multiaxle");
				//new Select(IndexPage.driver.findElement(By.name("Norooms"))).selectByValue("3");
				//IndexPage.driver.findElement(By.className("busType")).sendKeys("Naveen reddy");
				IndexPage.driver.findElement(By.name("psgrCount")).sendKeys("42");
				IndexPage.driver.findElement(By.id("hireabusSubmit")).click();
				Thread.sleep(10000);
				String HABSuccess_msg=IndexPage.driver.findElement(By.className("status")).getText();
				System.out.println("Printing :" +HABSuccess_msg);	
							File scrFile = ((TakesScreenshot)IndexPage.driver).getScreenshotAs(OutputType.FILE);
							// Now you can do whatever you need to do with it, for example copy somewhere
							path = ".D:\\error screenshots\\" + scrFile.getName();
							FileUtils.copyFile(scrFile, new File("path"));
					       	      		      		
			}
			catch (Exception e2)
			{
				
			  e2.printStackTrace();
			}
			
			    
			    
				

}
	
}
