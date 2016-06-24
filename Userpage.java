package com.ykss.automation.appModules;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class Userpage {

	public static WebDriver driver = null;
	
@BeforeMethod	
	public static void Open()
	{
		  System.out.println(" started here...."); 
		  System.setProperty("webdriver.chromedriver", "D:\\selenium-libraries\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver .manage().window().maximize();
		  driver .get("http://localhost:8080/bus/");

	}
//Common class for login as user
	private static void userLogin() throws InterruptedException
	{
	 	System.out.println("UserLogin functionality starts here....");  
	 	driver.findElement(By.xpath("//*[@id='topTotopMenu']/li[4]/span")).click();
	 	driver.findElement(By.xpath("//*[@id='loginEmail']")).sendKeys("reddynaveen19@gmail.com");
	 	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("12345678");
	 	driver.findElement(By.xpath("//*[@id='login']")).click(); 
	 	Thread.sleep(10000);

	}

//-------------------------------------------------------------------------------------
																		//TO TEST SIGN UP 
//@Test(enabled=false)
@Test(groups = "Userpage")//Execution start from here
//@Test	
    public static void signUp() {
	
	    try {
	    	 System.out.println("signUp functionality starts here...."); 	  	
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//*[@id="topTotopMenu"]/li[4]/span
			 driver.findElement(By.xpath("//*[@id='topTotopMenu']/li[4]/span")).click(); 
			 driver.findElement(By.cssSelector("a[href*='newLogin.htm']")).click();
			 Alert alert = driver.switchTo().alert();
    		 alert.accept(); //if yes to navigate
    		 Thread.sleep(4000);
    		 driver.findElement(By.xpath("//*[@id='user-signupform']/h3[2]/a[1]")).click(); 
    		 driver.findElement(By.xpath("//*[@id='user-signupform']/h3[2]/a[2]")).click();
			 driver.findElement(By.xpath("//*[@id='tab-hr']/li[2]")).click(); 
			 driver.findElement(By.xpath("//*[@id='tab-hr']/li[3]")).click(); 
			 driver.findElement(By.xpath("//*[@id='tab-hr']/li[4]")).click(); 
			 driver.findElement(By.xpath("//*[@id='tab-hr']/li[5]")).click(); 
			 driver.findElement(By.xpath("//*[@id='my-menu']/li[1]")).click(); 
			 driver.findElement(By.xpath("//*[@id='my-menu']/li[2]")).click(); 
			 driver.findElement(By.xpath("//*[@id='my-menu']/li[3]")).click(); 
			 driver.findElement(By.xpath("//*[@id='my-menu']/li[4]")).click(); 
			 driver.findElement(By.cssSelector("a[href*='travelrecharge.htm']")).click();
			 driver.navigate().back();
			 driver.findElement(By.cssSelector("a[href*='blockseat.htm']")).click();
			 driver.navigate().back();
			 driver.findElement(By.cssSelector("a[href*='index.htm']")).click();
			 driver.navigate().back();
			 driver.findElement(By.cssSelector("a[href*='travelinsurance.htm']")).click();
			 driver.navigate().back();
			 driver.findElement(By.name("name")).sendKeys("Naveen");
    		 driver.findElement(By.name("emailId")).sendKeys("reddynaveen18@gmail.com");
    		 Thread.sleep(5000);
    		 driver.findElement(By.xpath("//*[@id='signUp']")).click(); 
    		 Thread.sleep(5000);
    		 String Signupstatus_msg=driver.findElement(By.xpath("//*[@id='user-signupform']/li[3]/span")).getText();
			 System.out.println("Displayed :" +Signupstatus_msg);		 
			 System.out.println("signUp functionality ends here...."); 
		  }
			catch (Exception signUp) 
		     {
				
				signUp.printStackTrace();
			 
		   }
		
		
	}
//-------------------------------------------------------------------------------------
															  //TO TEST FORGOT PASSWORD 
//@Test	    
//@Test(enabled=false)
@Test(dependsOnGroups="Userpage")
		public static void forgotPwd() {
	
			try {
				 System.out.println("forgotPwd functionality starts here...."); 
				 driver.findElement(By.xpath("//*[@id='topTotopMenu']/li[4]/span")).click();
				 driver.findElement(By.xpath("//*[@id='lb-loginform']/p/a[1]")).click();
				 driver.findElement(By.xpath("//*[@id='lb-loginform']/p/a[2]")).click();
				 driver.findElement(By.id("goToFypassd")).click();
				 Thread.sleep(3000);
				 driver.findElement(By.id("fypEmail")).sendKeys("reddynaveen@gmail.com");
				 driver.findElement(By.id("fypassd")).click();
				 Thread.sleep(3000);
				 String forgotpwdstatus_msg=driver.findElement(By.xpath("//*[@id='lb-fypform']/li[2]/span")).getText();
				 System.out.println("Displayed :" +forgotpwdstatus_msg);
				 System.out.println("forgotPwd functionality ends here...."); 
			 }

				catch (Exception forgotPwd) 
				{
	
					forgotPwd.printStackTrace();
 
				}
    	
    }	
//-------------------------------------------------------------------------------------
																//TO TEST LOGIN USER
//@Test	    
@Test(enabled=false)
//@Test(dependsOnGroups="Userpage")

			public static void userProfile() 
			{
	
					try {
						 System.out.println("userProfile functionality starts here....");  
						 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						 Userpage.userLogin();
						 Thread.sleep(5000);
						 driver.findElement(By.id("mp-title")).click();
						 driver.findElement(By.id("mp-title")).click();
						 //driver.findElement(By.xpath("//*[@id='mp-title']")).click();
						 //driver.findElement(By.xpath("//*[@id='mp-title']")).click();
						 driver.findElement(By.xpath("//*[@id='mp-infobox-1']/a[2]/img")).click();
						 WebElement name = driver.findElement(By.name("name"));
						 name.clear();
						 name.sendKeys("Naveen reddy");
						 Thread.sleep(5000);
						 String useremailid_text=driver.findElement(By.id("emailLabel")).getText();
						 System.out.println("Displayed :" +useremailid_text);
						 driver.findElement(By.id("dob")).click();
						 driver.findElement(By.linkText("19")).click();
						 driver.findElement(By.xpath("//*[@id='ib2-list1']/li[4]/div/div[1]")).click();
						 WebElement secureMobile = driver.findElement(By.name("secureMobile"));
						 secureMobile.clear();
						 secureMobile.sendKeys("9963367844"); 
						 Thread.sleep(5000);
						 String availbal_text=driver.findElement(By.xpath("//*[@id='lmyBalance']")).getText();
						 System.out.println("Displayed :" +availbal_text);
						 //driver.findElement(By.id("btnForRechargeAtMyprofile")).click();
						 //driver.findElement(By.xpath("//*[@id='tab-hr']/li[1]")).click();
						 driver.findElement(By.xpath("//*[@id='mp-infobox-1']/a[2]/img")).click();
						 driver .findElement(By.xpath("//*[@id='mp-infobox-2']/a[2]/img")).click();
						 WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
						 phoneNumber.clear();
						 phoneNumber.sendKeys("9963367843");
						 WebElement emergencyPhNumber = driver.findElement(By.name("emergencyPhNumber"));
						 emergencyPhNumber.clear();
						 emergencyPhNumber.sendKeys("9963367843");
						 WebElement address = driver.findElement(By.name("address"));
						 address.clear();
						 address.sendKeys("Kphb sathavhana nagar kriti mansion");
						 WebElement city = driver.findElement(By.name("city"));
						 city.clear();
						 city.sendKeys("Hyderabad");
						 WebElement state = driver.findElement(By.name("state"));
						 state.clear();
						 state.sendKeys("Andhra Pradesh");
						 WebElement pinCode = driver.findElement(By.name("pinCode"));
						 pinCode.clear();
						 pinCode.sendKeys("500078");
						 driver.findElement(By.xpath("//*[@id='mp-infobox-2']/a[2]/img")).click();
						 Thread.sleep(6000);
						 String Updatedprofile_status=driver.findElement(By.xpath("//*[@id='addi-status-box']")).getText();
						 System.out.println("Displayed :" +Updatedprofile_status);
						 System.out.println("userProfile functionality ends here...."); 			 
			
					}
					catch (Exception userProfile) 
					{
		
						userProfile.printStackTrace();
	 
					}
	    	
	        }	
//-------------------------------------------------------------------------------------
																//TO TEST PAYMENT REPORT
//@Test	    
//@Test(enabled=false)
@Test(dependsOnGroups="Userpage")
			public static void userPaymentReport() 
			{

				try {
					
					 System.out.println("userPaymentReport functionality starts here....");  
					 Userpage.userLogin();
					 Thread.sleep(25000);
					 driver.findElement(By.xpath("//*[@id='tab-hr']/li[2]")).click();
					 driver.findElement(By.name("paymentFromDate")).click();
					 WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));  
						dateWidget.findElement(By.linkText("Prev")).click();
						
						List<WebElement> dates = dateWidget.findElements(By.tagName("td"));  
						for (WebElement date : dates){ 
							//Select 1st Date   
							if (date.getText().equals("1")){  
								date.findElement(By.linkText("1")).click();  
								break;  
							}  
						}
					 
					 driver.findElement(By.name("paymentToDate")).click();
						WebElement dateWidget1 = driver.findElement(By.id("ui-datepicker-div"));  
						dateWidget1.findElement(By.linkText("Prev")).click();
						
						List<WebElement> dates1 = dateWidget1.findElements(By.tagName("td"));  
						for (WebElement date : dates1){ 
							//Select 10th Date   
							if (date.getText().equals("10")){  
								date.findElement(By.linkText("10")).click();  
								break;  
							}  
						}
						driver.findElement(By.xpath("//*[@id='pymtReport']/div[3]/div/input[1]")).click();
						Thread.sleep(15000);
						//To print the page
						driver.findElement(By.className("print-icon-sp")).click();
						Robot r = new Robot();
						r.keyPress(KeyEvent.VK_ESCAPE);
						r.keyRelease(KeyEvent.VK_ESCAPE);
						System.out.println("userPaymentReport functionality ends here....");  
						//To reset the payment report
						//driver.findElement(By.className("resetPaymtReport")).click();
						// To print the status of the report 
						//String Reportsdata_success= driver.findElement(By.xpath("//*[@id='paymentDetails']/div")).getText();
						//System.out.println("Displayed :" +Reportsdata_success);
	
					
				}
				catch (Exception userPaymentReport) 
				{
	
					userPaymentReport.printStackTrace();
 
				}



			}
//-------------------------------------------------------------------------------------
																//TO TEST BOOKING REPORT
//@Test	    
//@Test(enabled=false)
@Test(dependsOnGroups="Userpage")
			public static void userBookingReport() 
				{

				    try {
				    	 System.out.println("userBookingReport functionality starts here....");  
				    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    	 Userpage.userLogin();
						 Thread.sleep(8000);
						 driver.findElement(By.xpath("//*[@id='tab-hr']/li[3]")).click();
						 driver.findElement(By.name("fromDate")).click();
						 WebElement bookingfromdateWidget = driver.findElement(By.id("ui-datepicker-div"));  
						 bookingfromdateWidget.findElement(By.linkText("Prev")).click();
							
							List<WebElement> dates = bookingfromdateWidget.findElements(By.tagName("td"));  
							for (WebElement date : dates){ 
								//Select 1st Date   
								if (date.getText().equals("1")){  
									date.findElement(By.linkText("1")).click();  
									break;  
								}  
							}
						 
						    driver.findElement(By.name("toDate")).click();
							WebElement bookingtodateWidget = driver.findElement(By.id("ui-datepicker-div"));  
							bookingtodateWidget.findElement(By.linkText("Prev")).click();
							
							List<WebElement> dates1 = bookingtodateWidget.findElements(By.tagName("td"));  
							for (WebElement date : dates1){ 
								//Select 10th Date   
								if (date.getText().equals("10")){  
									date.findElement(By.linkText("10")).click();  
									break;  
								}  
							}
							driver.findElement(By.className("bokingReport")).click();
							driver.findElement(By.xpath("//*[@id='link-hr1']/li[2]")).click();
							driver.findElement(By.xpath("//*[@id='link-hr1']/li[1]")).click();
							driver.findElement(By.xpath("//*[@id='tktNo-ETS235B0T154757']/td[1]")).click();
							driver.findElement(By.name("dojRebooking")).click();
							driver.findElement(By.linkText("19")).click();
							//driver.findElement(By.id("rebookingbutton")).click();// To re-booking 
							driver.findElement(By.className("sendEmail")).click();
							WebElement Emailchange = driver.findElement(By.name("sendEmailInput"));
							Emailchange.clear();
							Emailchange.sendKeys("reddynaveen1@gmail.com");
							driver.findElement(By.className("sendEmailNow")).click();
							Thread.sleep(5000);
							String Emailsent_status=driver.findElement(By.className("sendEmailSmsStatus")).getText();
							System.out.println("Displayed :" +Emailsent_status);
						    driver.findElement(By.className("smpCloseBtn")).click();	
							driver.findElement(By.className("sendSMS")).click();
							WebElement smschange = driver.findElement(By.name("sendSmsInput"));
							smschange.clear();
							smschange.sendKeys("9963367842");
							driver.findElement(By.className("sendSmsNow")).click();
							Thread.sleep(5000);
							String smssent_status=driver.findElement(By.className("yesError")).getText();
							System.out.println("Displayed :" +smssent_status);
							driver.findElement(By.className("smpCloseBtn")).click();
							//driver.findElement(By.xpath("/html/body/div[10]/img")).click();
							driver.findElement(By.className("cancelBtn")).click();
							Thread.sleep(8000);
							driver.findElement(By.className("myCoupons")).click();
							Thread.sleep(2000);
							driver.findElement(By.xpath("//*[@id='closeCTB']")).click();
							
							driver.findElement(By.className("cancelBtn")).click();
							Thread.sleep(2000);
							//driver.findElement(By.className("smpButton-0")).click();// Yes to click cancel
							driver.findElement(By.className("smpButton-1")).click();// No to cancel 
							Thread.sleep(3000);
							driver.findElement(By.xpath("//*[@id='tktDt-ETS235B0T154757']/td/ul/li[1]/a")).click();
							Robot r = new Robot();
							r.keyPress(KeyEvent.VK_ESCAPE);
							r.keyRelease(KeyEvent.VK_ESCAPE);
							//driver.findElement(By.className("cancel")).click();
							System.out.println("userBookingReport functionality ends here....");  
							
						
					}
				
			catch (Exception userBookingReport) 
			{

				userBookingReport.printStackTrace();

			}


}
//-------------------------------------------------------------------------------------
																//TO TEST SEARCH/CANCEL
//@Test	    
//@Test(enabled=false)
@Test(dependsOnGroups="Userpage")

            public static void Searchcancel() 
             {

                 try {
                	  System.out.println("Search/cancel functionality starts here....");  
			    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    	  Userpage.userLogin();
					  driver.findElement(By.xpath("//*[@id='tab-hr']/li[4]")).click();
					  driver.findElement(By.name("operatorPNR")).sendKeys("ABRS978389");
					  driver.findElement(By.name("etsNumber")).sendKeys("ETS235B0T154757");
                	  driver.findElement(By.className("searchCancel")).click();
                	  Thread.sleep(3000);
                	  WebElement element = driver.findElement(By.id("ticketListBox"));
                	  Actions actions = new Actions(driver);
                	  actions.moveToElement(element).click().perform();
               	      Thread.sleep(7000);
                	  driver.findElement(By.className("sendEmail")).click();
					  WebElement Emailchange = driver.findElement(By.name("sendEmailInput"));
					  Emailchange.clear();
					  Emailchange.sendKeys("reddynaveen1@gmail.com");
					  driver.findElement(By.className("sendEmailNow")).click();
				      
					  String Emailsent_status=driver.findElement(By.className("sendEmailSmsStatus")).getText();
					  System.out.println("Displayed :" +Emailsent_status);
					  driver.findElement(By.className("smpCloseBtn")).click();	
					  driver.findElement(By.className("sendSMS")).click();
					  WebElement smschange = driver.findElement(By.name("sendSmsInput"));
					  smschange.clear();
					  smschange.sendKeys("9963367842");
					  driver.findElement(By.className("sendSmsNow")).click();
					
					  String smssent_status=driver.findElement(By.className("yesError")).getText();
					  System.out.println("Displayed :" +smssent_status);
					  driver.findElement(By.className("smpCloseBtn")).click();
					  driver.findElement(By.className("cancelBtn")).click();
					  Thread.sleep(5000);
					  driver.findElement(By.className("myCoupons")).click();
					  driver.findElement(By.xpath("//*[@id='closeCTB']")).click();						
					  driver.findElement(By.className("cancelBtn")).click();
					  Thread.sleep(3000);
					  driver.findElement(By.className("smpButton-1")).click();// No to cancel   
					  driver.findElement(By.xpath("//*[@id='tktDt-ETS235B0T154757']/td/ul/li[1]/a")).click();
					  Thread.sleep(3000);
					  //To press the keyboard keys manually
					  Robot r = new Robot();
					  r.keyPress(KeyEvent.VK_ESCAPE);
					  r.keyRelease(KeyEvent.VK_ESCAPE);
					  Thread.sleep(3000);
					  driver.findElement(By.className("resetSearchCancel")).click();
					  System.out.println("Search/cancel functionality ended here...."); 
                 	}

					catch (Exception Searchcancel) 
					{

						Searchcancel.printStackTrace();

					}      
                

}
//---------------------------------------------------------------------------------------
																//TO TEST RECHARGE BALANCE
//@Test	    
//@Test(enabled=false)
@Test(dependsOnGroups="Userpage")
			public static void Rechargebalance() 
			{

    			try {
    				  System.out.println("Rechargebalance functionality starts here....");  
			    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    	  Userpage.userLogin();
					  Thread.sleep(2000);
					  driver.findElement(By.xpath("//*[@id='tab-hr']/li[5]")).click();  
					  String OldBal_amount=driver.findElement(By.xpath("//*[@id='tab-ct']/li[5]/div/ul/div/h3")).getText();
					  System.out.println("Before recharge amount :" +OldBal_amount);
					  new Select(driver.findElement(By.name("paymentGateWayType"))).selectByVisibleText("Netbanking/Credit/Debit Card");
					  driver.findElement(By.id("rechargeAmt")).sendKeys("300");
					  driver.findElement(By.id("payRecharge")).click();
					  driver.findElement(By.name("name_on_card")).sendKeys("Naveen");
					  driver.findElement(By.name("card_number_1")).sendKeys("4111");
					  driver.findElement(By.name("card_number_2")).sendKeys("1111");
					  driver.findElement(By.name("card_number_3")).sendKeys("1111");
					  driver.findElement(By.name("card_number_4")).sendKeys("1111");
					  Thread.sleep(2000);
					  new Select(driver.findElement(By.name("card_expiry_month"))).selectByIndex(7);
					  Thread.sleep(2000);
					  new Select(driver.findElement(By.name("card_expiry_year"))).selectByIndex(1);   
					  driver.findElement(By.name("card_cvv")).sendKeys("123");
					  driver.findElement(By.id("submitbtn")).click();
					  Thread.sleep(7000);	
					  driver.findElement(By.xpath("//*[@id='tab-hr']/li[5]")).click();  
					  String NewBal_amount=driver.findElement(By.xpath("//*[@id='tab-ct']/li[5]/div/ul/div/h3")).getText();
					  System.out.println("After recharge amount:" +NewBal_amount);
					  System.out.println("Rechargebalance functionality ended here...."); 

    			}

    			catch (Exception Rechargebalance) 
    			{

    				Rechargebalance.printStackTrace();

    			}      
   

}
//---------------------------------------------------------------------------------------
																//TO TEST CHANGE PASSWORD
//@Test	    
//@Test(enabled=false)
@Test(dependsOnGroups="Userpage")
				public static void Changepassword() 
				 {

						try {
							
								  System.out.println("Changepassword functionality starts here....");  
						    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						    	  Userpage.userLogin();
								  driver.findElement(By.xpath("//*[@id='tab-hr']/li[6]")).click();  
								  driver.findElement(By.name("oldPw")).sendKeys("123456789");
								  driver.findElement(By.name("newPw")).sendKeys("12345678");
								  driver.findElement(By.name("confNewPw")).sendKeys("12345678");
								  driver.findElement(By.id("changePW")).click();
								  Thread.sleep(3000);
								  String New_pwdstatus=driver.findElement(By.xpath("//*[@id='pw-status-box']")).getText().toString();
								  String wrngold_pwdstatus=driver.findElement(By.xpath("//*[@id='ib2-list1']/li[3]/div")).getText().toString();
								  String wrngnew_pwdstatus=driver.findElement(By.xpath("//*[@id='ib2-list1']/li[5]/div")).getText().toString();
								  if(New_pwdstatus != null)
								  {
									  System.out.println(New_pwdstatus);
									  
								  }else if(wrngold_pwdstatus !=null)					
								  {
									  System.out.println(wrngold_pwdstatus);
										
									}
								  else
								  {
									  System.out.println(wrngnew_pwdstatus);
								  }
								  //Your password has been changed successfully,Please ReLogin.. !
								  //The new password and confirm new password should be the same.
								  
								 /* String New_pwdstatus1=driver.findElement(By.xpath("//*[@id='pw-status-box']")).getText();
								  System.out.println("Changed stastus Displayed :" +New_pwdstatus1);*/
								  //For wrong ngew and old password
								  /*String old_pwdstatus=driver.findElement(By.xpath("//*[@id='pw-status-box']")).getText();
								  System.out.println("Failed status Displayed :" +old_pwdstatus);*/
								  //For wrong new and confirm password
								  Thread.sleep(3000);
								  driver.findElement(By.xpath("//*[@id='topTotopMenu']/li[3]/span")).click();
								  Thread.sleep(4000);
								  Userpage.userLogin();
								  driver.findElement(By.xpath("//*[@id='tab-hr']/li[6]")).click(); 
								  System.out.println("Changepassword functionality ended here....");

	     }

					catch (Exception Changepassword) 
					{
                         System.out.println(Changepassword);
						Changepassword.printStackTrace();

					}      


}
//---------------------------------------------------------------------------------------
																        //TO TEST MY TREE
//@Test	    
@Test(enabled=false)
//@Test(dependsOnGroups="Userpage")

			public static void Mytree() 
			{

				try {
					
					  System.out.println("Mytree functionality starts here....");  
			    	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			    	  Userpage.userLogin();
					  driver.findElement(By.xpath("//*[@id='tab-hr']/li[7]")).click();  
					  String Nooftrees=driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[2]/td[1]/p")).getText().toString();
					  System.out.println(Nooftrees);
					  String Tree_count=driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[2]/td[3]/span")).getText().toString();
					  System.out.println(Tree_count);
					  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					  FileUtils.copyFile(scrFile, new File("D:\\error screenshots\\PassedResults\\screenshot.png")); 
					  System.out.println("Mytree functionality ended here....");

				}
					
				catch (Exception Mytree) 
				{
					System.out.println(Mytree);
					Mytree.printStackTrace();

				}      


			}
//---------------------------------------------------------------------------------------
																	 //TO TEST MY REWARDS
//@Test	    
@Test(enabled=false)
//@Test(dependsOnGroups="")
				public static void Rewards() 
				{

					try {
						  System.out.println("Rewards functionality starts here....");  
				    	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				    	  Userpage.userLogin();
						  driver.findElement(By.xpath("//*[@id='tab-hr']/li[8]")).click();  
						  String Curr_rewards=driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[1]/td[1]/label/p")).getText().toString();
						  System.out.println(Curr_rewards);
						  String No_Currrewards=driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[1]/td[2]/span")).getText().toString();
						  System.out.println(No_Currrewards);
						  String Refcode_clicks=driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[2]/td[1]/label/p")).getText().toString();
						  System.out.println(Refcode_clicks);
						  String No_Refcodeclicks=driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[2]/td[2]/span")).getText().toString();
						  System.out.println(No_Refcodeclicks);
						  String Refcode_books=driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[3]/td[1]/label/p")).getText().toString();
						  System.out.println(Refcode_books);
						  String No_Refcodebooks=driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[3]/td[2]/span")).getText().toString();
						  System.out.println(No_Refcodebooks);
						  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						  FileUtils.copyFile(scrFile, new File("D:\\error screenshots\\PassedResults\\screenshot.png")); 
						  System.out.println("Rewards functionality ended here....");

	            }
		
					catch (Exception Rewards) 
					{
						System.out.println(Rewards);
						Rewards.printStackTrace();

					}      


}
//---------------------------------------------------------------------------------------
																	//TO TEST MY CHARITY
//@Test	    
@Test(enabled=false)
//@Test(dependsOnGroups="Userpage")
			public static void Charity() 
			{

				try {
					  System.out.println("Charity functionality starts here....");  
			    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    	  Userpage.userLogin();
					  driver.findElement(By.xpath("//*[@id='tab-hr']/li[9]")).click(); 
					  Thread.sleep(3000);
					  String Charity_Amt=driver.findElement(By.xpath("//*[@id='contentdiv']/p[1]/span[2]")).getText().toString();
					  System.out.println("Charity amount contributed : "+Charity_Amt);
					  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					  FileUtils.copyFile(scrFile, new File("D:\\error screenshots\\PassedResults\\screenshot.png")); 
					  System.out.println("Charity functionality ended here....");

				}
		
				catch (Exception Charity) 
				{
					System.out.println(Charity);
					Charity.printStackTrace();

				}      


}
//---------------------------------------------------------------------------------------
																		//TO TEST COUPONS
//@Test	    
@Test(enabled=false)
//@Test(dependsOnGroups="Userpage")
					public static void Coupons() 
					{
					
					try {
						System.out.println("Coupons functionality starts here....");  
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						Userpage.userLogin();
						driver.findElement(By.xpath("//*[@id='tab-hr']/li[10]")).click(); 
						Thread.sleep(2000);
						String Noof_Coupons=driver.findElement(By.xpath("//*[@id='coupon-table']/div")).getText().toString();
						System.out.println(Noof_Coupons);
						File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						FileUtils.copyFile(scrFile, new File("D:\\error screenshots\\PassedResults\\screenshot.png")); 
						System.out.println("Coupons functionality ended here....");
						Thread.sleep(2000);
						driver.findElement(By.xpath("//*[@id='topTotopMenu']/li[3]/span")).click();
					
					}
					
					catch (Exception Coupons) 
					{
						System.out.println(Coupons);
						Coupons.printStackTrace();
					
					}      


}




@AfterTest
	public static void afterTest() throws InterruptedException, IOException
	{
	  Thread.sleep(8000);
	   //Screenshot screenshot = new AShot().shootingStrategy(new ViewportPastingStrategy(1000)).takeScreenshot(driver);
	   //ImageIO.write(screenshot.getImage(), "PNG", new File("c:\\temp\\home.png"));
	   driver.quit();
}

@AfterMethod
	public static void afterMethod() throws Exception
	{
	     File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(scr,new File("D:\\error screenshots\\PassedResults\\Userloginscreenshot_"+timestamp()+".png"));
		 Thread.sleep(8000);
		 driver.quit();
	}
    private static String timestamp() {
	
	  return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
   } 
		
			
}


