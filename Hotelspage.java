package com.ykss.automation.appModules;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ykss.automation.bookingFlow.IndexPage;


//Go to Indexpage class if we want to run Hotelspage individually.. 


public class Hotelspage {
	//public WebDriver driver;
//CALL WEB BROWSER AND OPEN WEBSITE	
	public static void OpenHotel()
	{
		
		  System.out.println("Hotel page opened....");   	
		  IndexPage.driver .manage().window().maximize();
		  IndexPage.driver .get("http://localhost:8080/bus/hotels_rooms_booking.htm"); 
		  
   }
//HOTEL BOOKING REQUEST 	
        public static void hotelBooking()
        {
              try {
            	     
	        		 Hotelspage.OpenHotel();
	        	//TO HANDLE THE CONFIRM NAVIGATION POP-UPS    
	        		 /*WebDriverWait wait = new WebDriverWait(IndexPage.driver, 2);
	        		 wait.until(ExpectedConditions.alertIsPresent());
	        		 Alert alert = IndexPage.driver.switchTo().alert();
	        		 alert.accept(); //if yes to navigate
*/	            	 IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        	     //alert.dismiss();// If no to navigate	
					 System.out.println("hotelBooking opened...."); 
					 IndexPage.driver.findElement(By.name("goingCity")).sendKeys("Hyderabad",Keys.ARROW_DOWN);	
					 IndexPage.driver.findElement(By.id("locationTextField")).sendKeys("Madhapur, Hyderabad, Telangana, India");	 
					//WebElement dropdown = IndexPage.driver.findElement(By.id("locationTextField"));
					//IndexPage.driver.findElement(By.id("locationTextField")).sendKeys("Madhapur, Hyderabad, Telangana, India",Keys.LEFT_CONTROL);
				    //dropdown.click();
				//To SELECT THE SELECTED OPTION FROM LIST   
				    WebElement element=IndexPage.driver.findElement(By.name("guestCount"));
					Select se=new Select(element);
					se.selectByIndex(3);
					new Select(IndexPage.driver.findElement(By.name("Norooms"))).selectByValue("3");
				//TO SELECT THE DATES	
					IndexPage.driver.findElement(By.name("doj")).click();
					IndexPage.driver.findElement(By.linkText("23")).click();
				//TO SELECT THE DATES IN NEXT MONTH
					IndexPage.driver.findElement(By.name("dor")).click();
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
					IndexPage.driver.findElement(By.name("emailID")).sendKeys("reddynaveen19@gmail.com");
					IndexPage.driver.findElement(By.name("mobileNumber")).sendKeys("9963367842");
					IndexPage.driver.findElement(By.id("hotelbookSubmit")).click();
					Thread.sleep(10000);
					String HotelSuccess_msg=IndexPage.driver.findElement(By.className("status")).getText();
					System.out.println("Printing :" +HotelSuccess_msg);
					
				   	/*List<WebElement> options = dropdown.findElements(By.tagName("input"));
				   	IndexPage.driver.findElement(By.id("locationTextField")).sendKeys("Ameer    ",Keys.ARROW_DOWN,Keys.ENTER);
				    for(WebElement option : options)
				    {	    	
				        String optTxt = option.getText();
				        if(optTxt.equals("Ameer   ")){
				        	option.click();
				            break;
				        }
				    
				}
					*/					
				
        	}
   		     catch (Exception e) 
   		     {
   		    	 e.printStackTrace();
   			 
   		 }
	
  }

		/*private static void select_Option_In_DropDown_ByVisibleText(
				WebElement element, String string) {
			// TODO Auto-generated method stub
			
		}

		private static String getSelectedOption(WebElement element) {
			// TODO Auto-generated method stub
			return null;
		}*/

}