package com.ykss.automation.appModules;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ykss.automation.bookingFlow.IndexPage;

public class CorporatePage {
	
	 static Calendar calendar = Calendar.getInstance();
	 static String directory = "D:\\error screenshots\\PassedResults\\";
	 static int hour = calendar.get(Calendar.HOUR_OF_DAY);
	 static int minute = calendar.get(Calendar.MINUTE);
	 static String fileName = "snapshot_"+ hour + "_"+ minute +".png";
@BeforeMethod	
	public static void Openuserpage()
	{
		  System.out.println("CorporatePage started here...."); 
		  System.setProperty("webdriver.chrome.driver", "D:\\selenium-libraries\\chromedriver.exe");
		  IndexPage.driver = new ChromeDriver();
		  IndexPage.driver .manage().window().maximize();
		  IndexPage.driver .get("http://localhost:8080/bus/corporateemployeeregistration.htm");

	}
//Common class for login as corporarte
    public static void corporateLogin() throws InterruptedException
     {
	 	System.out.println("CorporateLogin functionality starts here....");  
	 	IndexPage.driver.findElement(By.name("loginEmail")).sendKeys("reddynaveen19@gmail.com");
		IndexPage.driver.findElement(By.name("password1")).sendKeys("12345678");
		IndexPage.driver.findElement(By.className("corporateEmpLoginBtn")).click();
	 	Thread.sleep(10000);

  }
//---------------------------------------------------------------------------------------
													//TO TEST CORPORATE REGISTRATION SIGNUP 
//@Test(enabled=false)
//@Test(groups = "CorporatePage")//Execution start from here
//Test	
		public static void corporateRegsignup()
		{
			try {
				 System.out.println("corporateRegsignup functionality starts here....");  
				 IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				 IndexPage.driver.findElement(By.id("bt_2")).click();
				 String Details_error=IndexPage.driver.findElement(By.xpath("//*[@id='pop']")).getText().toString();
				 System.out.println(Details_error);
				 IndexPage.driver.findElement(By.className("ui-button-text")).click();
				 IndexPage.driver.findElement(By.name("empname")).sendKeys("Naveen reddy");
				 IndexPage.driver.findElement(By.name("emp_email")).sendKeys("reddynaveen18@gmail.com");
				 IndexPage.driver.findElement(By.name("corpoateEmpMobile")).sendKeys("9963367842");
				 IndexPage.driver.findElement(By.name("empcmpname")).sendKeys("ykss");
				 Thread.sleep(2000);
				 Robot dropdown = new Robot();
				 dropdown.keyPress(KeyEvent.VK_DOWN);dropdown.keyRelease(KeyEvent.VK_DOWN);
				 dropdown.keyPress(KeyEvent.VK_ENTER); dropdown.keyRelease(KeyEvent.VK_ENTER);
				 Thread.sleep(3000);
				 IndexPage.driver.findElement(By.id("bt_2")).click();
				 Thread.sleep(3000);
				 String Click_status = IndexPage.driver.findElement(By.xpath("//*[@id='pop']")).getText().toString();
				 System.out.println(Click_status);
				 IndexPage.driver.findElement(By.className("ui-button-text")).click();
				 System.out.println("corporateRegsignup functionality ends here...."); 
				
			}
			catch(Exception corporateRegsignup)
			{
				System.out.println(corporateRegsignup);
				corporateRegsignup.printStackTrace();
		      
			}

}

//---------------------------------------------------------------------------------------
 												 //TO TEST CORPORATE REGISTRATION LOGIN
//@Test	    
//@Test(enabled=false)
//@Test(dependsOnGroups="CorporatePage")

					public static void corporateReglogin() 
					{
						try {
							 System.out.println("corporateReglogin functionality starts here...."); 
							 IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
							 IndexPage.driver.findElement(By.className("corporateEmpLoginBtn")).click();
							 String email_error=IndexPage.driver.findElement(By.xpath("//*[@id='corporateEmpLogInForm']/li[1]/div[2]")).getText().toString();
							 System.out.println(email_error);
							 String pwd_error=IndexPage.driver.findElement(By.xpath("//*[@id='corporateEmpLogInForm']/li[2]/div[2]")).getText().toString();
							 System.out.println(pwd_error);
							 IndexPage.driver.findElement(By.name("loginEmail")).sendKeys("reddynaveen19@gmail.com");
							 IndexPage.driver.findElement(By.name("password1")).sendKeys("12345678");
							 IndexPage.driver.findElement(By.className("corporateEmpLoginBtn")).click();
							 IndexPage.driver.findElement(By.xpath("//*[@id='topTotopMenu']/li[3]/span")).click();
							 System.out.println("corporateReglogin functionality ends here....");  

						}
						catch(Exception corporateReglogin)
						{
							System.out.println(corporateReglogin);
							corporateReglogin.printStackTrace();
							
						}
}
//---------------------------------------------------------------------------------------
 													             //TO TEST FORGOT PASSWORD
//@Test	    
//@Test(enabled=false)
//@Test(dependsOnGroups="CorporatePage")

							public static void corporateForgotPwd() 
							{
								try {
									 System.out.println("corporateForgotPwd functionality starts here....");  
									 IndexPage.driver.findElement(By.id("forgot_pwd")).click();
									 IndexPage.driver.findElement(By.name("ForgotEmail")).sendKeys("reddynveen19@gmail.com");
									 IndexPage.driver.findElement(By.id("Forgotpassworddone")).click();		
									 Thread.sleep(2000);
									 String frgtpwd_status=IndexPage.driver.findElement(By.xpath("//*[@id='Forgot_Pwd_div']/li[2]/span")).getText().toString();
									 System.out.println(frgtpwd_status);
									 System.out.println("corporateForgotPwd functionality ends here....");  

								}
									
								catch(Exception corporateForgotPwd)
								{
									System.out.println(corporateForgotPwd);
									corporateForgotPwd.printStackTrace();
									
								}


							}
//---------------------------------------------------------------------------------------
 														//TO TEST CORPORATE PROFILE PAGE
//@Test	    
//@Test(enabled=false)
//@Test(dependsOnGroups="CorporatePage")
				public static void corporateProfile() 
				{

					try {
							 System.out.println("corporateProfile functionality starts here....");  
							 IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							 CorporatePage.corporateLogin();
							 Thread.sleep(5000);
							 IndexPage.driver.findElement(By.id("mp-title")).click();
							 IndexPage.driver.findElement(By.id("mp-title")).click();
							 IndexPage.driver.findElement(By.xpath("//*[@id='mp-infobox-1']/a[2]/img")).click();
							 WebElement name = IndexPage.driver.findElement(By.name("name"));
							 name.clear();
							 name.sendKeys("Naveen reddy");
							 Thread.sleep(5000);
							 String useremailid_text=IndexPage.driver.findElement(By.id("emailLabel")).getText();
							 System.out.println("Displayed :" +useremailid_text);
							 IndexPage.driver.findElement(By.id("dob")).click();
							 IndexPage.driver.findElement(By.linkText("19")).click();
							 IndexPage.driver.findElement(By.xpath("//*[@id='ib2-list1']/li[4]/div/div[1]")).click();
							 WebElement secureMobile = IndexPage.driver.findElement(By.name("secureMobile"));
							 secureMobile.clear();
							 secureMobile.sendKeys("9963367844"); 
							 Thread.sleep(5000);
							 String availbal_text=IndexPage.driver.findElement(By.xpath("//*[@id='lmyBalance']")).getText();
							 System.out.println("Displayed :" +availbal_text);
							 //IndexPage.driver.findElement(By.id("btnForRechargeAtMyprofile")).click();
							 //IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[1]")).click();
							 IndexPage.driver.findElement(By.xpath("//*[@id='mp-infobox-1']/a[2]/img")).click();
							 IndexPage.driver .findElement(By.xpath("//*[@id='mp-infobox-2']/a[2]/img")).click();
							 WebElement phoneNumber = IndexPage.driver.findElement(By.name("phoneNumber"));
							 phoneNumber.clear();
							 phoneNumber.sendKeys("9963367843");
							 WebElement emergencyPhNumber = IndexPage.driver.findElement(By.name("emergencyPhNumber"));
							 emergencyPhNumber.clear();
							 emergencyPhNumber.sendKeys("9963367843");
							 WebElement address = IndexPage.driver.findElement(By.name("address"));
							 address.clear();
							 address.sendKeys("Kphb sathavhana nagar kriti mansion");
							 WebElement city = IndexPage.driver.findElement(By.name("city"));
							 city.clear();
							 city.sendKeys("Hyderabad");
							 WebElement state = IndexPage.driver.findElement(By.name("state"));
							 state.clear();
							 state.sendKeys("Andhra Pradesh");
							 WebElement pinCode = IndexPage.driver.findElement(By.name("pinCode"));
							 pinCode.clear();
							 pinCode.sendKeys("500078");
							 IndexPage.driver.findElement(By.xpath("//*[@id='mp-infobox-2']/a[2]/img")).click();
							 Thread.sleep(6000);
							 String Updatedprofile_status=IndexPage.driver.findElement(By.xpath("//*[@id='addi-status-box']")).getText();
							 System.out.println("Displayed :" +Updatedprofile_status);
							 System.out.println("corporateProfile functionality ends here...."); 			 

		}
		catch (Exception corporateProfile) 
		{
			System.out.println(corporateProfile);
			corporateProfile.printStackTrace();

		}

}	
//-------------------------------------------------------------------------------------
													//TO TEST CORPORATE PAYMENT REPORT
//@Test	    
//@Test(enabled=false)
//@Test(dependsOnGroups="CorporatePage")
		public static void CorpPaymentReport() 
		{

			try {

						System.out.println("CorpPaymentReport functionality starts here....");  
						IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						CorporatePage.corporateLogin();
						Thread.sleep(5000);
						IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[2]")).click();
						IndexPage.driver.findElement(By.name("paymentFromDate")).click();
						WebElement dateWidget = IndexPage.driver.findElement(By.id("ui-datepicker-div"));  
						dateWidget.findElement(By.linkText("Prev")).click();
						
						List<WebElement> dates = dateWidget.findElements(By.tagName("td"));  
						for (WebElement date : dates){ 
						//Select 1st Date   
						if (date.getText().equals("1")){  
						date.findElement(By.linkText("1")).click();  
						break;  
						}  
						}
						
						IndexPage.driver.findElement(By.name("paymentToDate")).click();
						WebElement dateWidget1 = IndexPage.driver.findElement(By.id("ui-datepicker-div"));  
						dateWidget1.findElement(By.linkText("Prev")).click();
						
						List<WebElement> dates1 = dateWidget1.findElements(By.tagName("td"));  
						for (WebElement date : dates1){ 
						//Select 10th Date   
						if (date.getText().equals("10")){  
						date.findElement(By.linkText("10")).click();  
						break;  
						}  
						}
						IndexPage.driver.findElement(By.xpath("//*[@id='pymtReport']/div[3]/div/input[1]")).click();
						Thread.sleep(5000);
						//To print the page
						IndexPage.driver.findElement(By.className("print-icon-sp")).click();
						Robot r = new Robot();
						r.keyPress(KeyEvent.VK_ESCAPE);
						r.keyRelease(KeyEvent.VK_ESCAPE);
						System.out.println("CorpPaymentReport functionality ends here....");  
						//To reset the payment report
						//IndexPage.driver.findElement(By.className("resetPaymtReport")).click();
						// To print the status of the report 
						//String Reportsdata_success= IndexPage.driver.findElement(By.xpath("//*[@id='paymentDetails']/div")).getText();
						//System.out.println("Displayed :" +Reportsdata_success);


						}
						catch (Exception CorpPaymentReport) 
					{
							  System.out.println(CorpPaymentReport);
							  CorpPaymentReport.printStackTrace();

                    }



}
//-------------------------------------------------------------------------------------
													//TO TEST CORPORATE BOOKING REPORT
//@Test	    
//@Test(enabled=false)
//@Test(dependsOnGroups="CorporatePage")
					public static void corpBookingReport() 
						{

							try {
									System.out.println("Corporate BookingReport functionality starts here....");  
									IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
									CorporatePage.corporateLogin();
									Thread.sleep(5000);
									IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[3]")).click();
									IndexPage.driver.findElement(By.name("fromDate")).click();
										WebElement bookingfromdateWidget = IndexPage.driver.findElement(By.id("ui-datepicker-div"));  
										bookingfromdateWidget.findElement(By.linkText("Prev")).click();
										
										List<WebElement> dates = bookingfromdateWidget.findElements(By.tagName("td"));  
										for (WebElement date : dates){ 
										//Select 1st Date   
										if (date.getText().equals("1")){  
										date.findElement(By.linkText("1")).click();  
										break;  
										}  
										}
										
										IndexPage.driver.findElement(By.name("toDate")).click();
										WebElement bookingtodateWidget = IndexPage.driver.findElement(By.id("ui-datepicker-div"));  
										bookingtodateWidget.findElement(By.linkText("Prev")).click();
										
										List<WebElement> dates1 = bookingtodateWidget.findElements(By.tagName("td"));  
										for (WebElement date : dates1){ 
										//Select 10th Date   
										if (date.getText().equals("10")){  
										date.findElement(By.linkText("10")).click();  
										break;  
										}  
										}
										IndexPage.driver.findElement(By.className("bokingReport")).click();
										IndexPage.driver.findElement(By.xpath("//*[@id='link-hr1']/li[2]")).click();
										IndexPage.driver.findElement(By.xpath("//*[@id='link-hr1']/li[1]")).click();
										IndexPage.driver.findElement(By.xpath("//*[@id='tktNo-ETS235B0T154757']/td[1]")).click();
										IndexPage.driver.findElement(By.name("dojRebooking")).click();
										IndexPage.driver.findElement(By.linkText("19")).click();
										//IndexPage.driver.findElement(By.id("rebookingbutton")).click();// To re-booking 
										IndexPage.driver.findElement(By.className("sendEmail")).click();
										WebElement Emailchange = IndexPage.driver.findElement(By.name("sendEmailInput"));
										Emailchange.clear();
										Emailchange.sendKeys("reddynaveen1@gmail.com");
										IndexPage.driver.findElement(By.className("sendEmailNow")).click();
										Thread.sleep(5000);
										String Emailsent_status=IndexPage.driver.findElement(By.className("sendEmailSmsStatus")).getText();
										System.out.println("Displayed :" +Emailsent_status);
										IndexPage.driver.findElement(By.className("smpCloseBtn")).click();	
										IndexPage.driver.findElement(By.className("sendSMS")).click();
										WebElement smschange = IndexPage.driver.findElement(By.name("sendSmsInput"));
										smschange.clear();
										smschange.sendKeys("9963367842");
										IndexPage.driver.findElement(By.className("sendSmsNow")).click();
										Thread.sleep(5000);
										String smssent_status=IndexPage.driver.findElement(By.className("yesError")).getText();
										System.out.println("Displayed :" +smssent_status);
										IndexPage.driver.findElement(By.className("smpCloseBtn")).click();
										//IndexPage.driver.findElement(By.xpath("/html/body/div[10]/img")).click();
										IndexPage.driver.findElement(By.className("cancelBtn")).click();
										Thread.sleep(8000);
										IndexPage.driver.findElement(By.className("myCoupons")).click();
										Thread.sleep(2000);
										IndexPage.driver.findElement(By.xpath("//*[@id='closeCTB']")).click();
										
										IndexPage.driver.findElement(By.className("cancelBtn")).click();
										Thread.sleep(2000);
										//IndexPage.driver.findElement(By.className("smpButton-0")).click();// Yes to click cancel
										IndexPage.driver.findElement(By.className("smpButton-1")).click();// No to cancel 
										Thread.sleep(3000);
										IndexPage.driver.findElement(By.xpath("//*[@id='tktDt-ETS235B0T154757']/td/ul/li[1]/a")).click();
										Robot r = new Robot();
										r.keyPress(KeyEvent.VK_ESCAPE);
										r.keyRelease(KeyEvent.VK_ESCAPE);
										//IndexPage.driver.findElement(By.className("cancel")).click();
										System.out.println("Corporate Booking report functionality ends here....");  


							}

							catch (Exception corpBookingReport) 
							{
								 System.out.println(corpBookingReport);
								 corpBookingReport.printStackTrace();

							}


}
//-------------------------------------------------------------------------------------
														//TO TEST CORPORATE SEARCH/CANCEL
//@Test	    
//@Test(enabled=false)
//@Test(dependsOnGroups="CorporatePage")

			public static void corpSearchcancel() 
				{

					try {
							System.out.println("corpSearchcancel functionality starts here....");  
							IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							CorporatePage.corporateLogin();
							IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[4]")).click();
							IndexPage.driver.findElement(By.name("operatorPNR")).sendKeys("ABRS978389");
							IndexPage.driver.findElement(By.name("etsNumber")).sendKeys("ETS235B0T154757");
							IndexPage.driver.findElement(By.className("searchCancel")).click();
							Thread.sleep(3000);
							WebElement element = IndexPage.driver.findElement(By.id("ticketListBox"));
							Actions actions = new Actions(IndexPage.driver);
							actions.moveToElement(element).click().perform();
							Thread.sleep(7000);
							IndexPage.driver.findElement(By.className("sendEmail")).click();
							WebElement Emailchange = IndexPage.driver.findElement(By.name("sendEmailInput"));
							Emailchange.clear();
							Emailchange.sendKeys("reddynaveen1@gmail.com");
							IndexPage.driver.findElement(By.className("sendEmailNow")).click();
							
							String Emailsent_status=IndexPage.driver.findElement(By.className("sendEmailSmsStatus")).getText();
							System.out.println("Displayed :" +Emailsent_status);
							IndexPage.driver.findElement(By.className("smpCloseBtn")).click();	
							IndexPage.driver.findElement(By.className("sendSMS")).click();
							WebElement smschange = IndexPage.driver.findElement(By.name("sendSmsInput"));
							smschange.clear();
							smschange.sendKeys("9963367842");
							IndexPage.driver.findElement(By.className("sendSmsNow")).click();
							
							String smssent_status=IndexPage.driver.findElement(By.className("yesError")).getText();
							System.out.println("Displayed :" +smssent_status);
							IndexPage.driver.findElement(By.className("smpCloseBtn")).click();
							IndexPage.driver.findElement(By.className("cancelBtn")).click();
							Thread.sleep(5000);
							IndexPage.driver.findElement(By.className("myCoupons")).click();
							IndexPage.driver.findElement(By.xpath("//*[@id='closeCTB']")).click();						
							IndexPage.driver.findElement(By.className("cancelBtn")).click();
							Thread.sleep(3000);
							IndexPage.driver.findElement(By.className("smpButton-1")).click();// No to cancel   
							IndexPage.driver.findElement(By.xpath("//*[@id='tktDt-ETS235B0T154757']/td/ul/li[1]/a")).click();
							Thread.sleep(3000);
							//To press the keyboard keys manually
							Robot r = new Robot();
							r.keyPress(KeyEvent.VK_ESCAPE);
							r.keyRelease(KeyEvent.VK_ESCAPE);
							Thread.sleep(3000);
							IndexPage.driver.findElement(By.className("resetSearchCancel")).click();
							System.out.println("corpSearchcancel functionality ended here...."); 
		}

					catch (Exception corpSearchcancel) 
					{
						 System.out.println(corpSearchcancel);
 						corpSearchcancel.printStackTrace();

					}      	


}
//---------------------------------------------------------------------------------------
														//TO TEST CORPORATE RECHARGE BALANCE
//@Test	    
//@Test(enabled=false)
//@Test(dependsOnGroups="CorporatePage")
				public static void corpRechargebalance() 
				{

					try {
							System.out.println("corpRechargebalance functionality starts here....");  
							IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							CorporatePage.corporateLogin();
							Thread.sleep(2000);
							IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[5]")).click();  
							String OldBal_amount=IndexPage.driver.findElement(By.xpath("//*[@id='tab-ct']/li[5]/div/ul/div/h3")).getText();
							System.out.println("Before recharge amount:" +OldBal_amount);
							new Select(IndexPage.driver.findElement(By.name("paymentGateWayType"))).selectByVisibleText("Netbanking/Credit/Debit Card");
							IndexPage.driver.findElement(By.id("rechargeAmt")).sendKeys("300");
							IndexPage.driver.findElement(By.id("payRecharge")).click();
							IndexPage.driver.findElement(By.name("name_on_card")).sendKeys("Naveen");
							IndexPage.driver.findElement(By.name("card_number_1")).sendKeys("4111");
							IndexPage.driver.findElement(By.name("card_number_2")).sendKeys("1111");
							IndexPage.driver.findElement(By.name("card_number_3")).sendKeys("1111");
							IndexPage.driver.findElement(By.name("card_number_4")).sendKeys("1111");
							Thread.sleep(2000);
							new Select(IndexPage.driver.findElement(By.name("card_expiry_month"))).selectByIndex(7);
							Thread.sleep(2000);
							new Select(IndexPage.driver.findElement(By.name("card_expiry_year"))).selectByIndex(1);   
							IndexPage.driver.findElement(By.name("card_cvv")).sendKeys("123");
							IndexPage.driver.findElement(By.id("submitbtn")).click();
							Thread.sleep(7000);	
							IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[5]")).click();  
							String NewBal_amount=IndexPage.driver.findElement(By.xpath("//*[@id='tab-ct']/li[5]/div/ul/div/h3")).getText();
							System.out.println("After recharge amount:" +NewBal_amount);
							System.out.println("corpRechargebalance functionality ended here...."); 

					}

					catch (Exception corpRechargebalance) 
					{
						System.out.println(corpRechargebalance);
						corpRechargebalance.printStackTrace();

					}      


}
//---------------------------------------------------------------------------------------
														//TO TEST CORPORATE CHANGE PASSWORD
//@Test	    
//@Test(enabled=false)
//@Test(dependsOnGroups="CorporatePage")
				public static void corpChangepassword() 
					{

						try {

								System.out.println("corpChangepassword functionality starts here....");  
								IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
								CorporatePage.corporateLogin();
								IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[6]")).click();  
								IndexPage.driver.findElement(By.name("oldPw")).sendKeys("123456789");
								IndexPage.driver.findElement(By.name("newPw")).sendKeys("12345678");
								IndexPage.driver.findElement(By.name("confNewPw")).sendKeys("12345678");
								IndexPage.driver.findElement(By.id("changePW")).click();
								Thread.sleep(3000);
								String New_pwdstatus=IndexPage.driver.findElement(By.xpath("//*[@id='pw-status-box']")).getText().toString();
								String wrngold_pwdstatus=IndexPage.driver.findElement(By.xpath("//*[@id='ib2-list1']/li[3]/div")).getText().toString();
								String wrngnew_pwdstatus=IndexPage.driver.findElement(By.xpath("//*[@id='ib2-list1']/li[5]/div")).getText().toString();
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
								Thread.sleep(3000);
								IndexPage.driver.findElement(By.xpath("//*[@id='topTotopMenu']/li[3]/span")).click();
								Thread.sleep(4000);
								IndexPage.driver .get("http://localhost:8080/bus/corporateemployeeregistration.htm");
								CorporatePage.corporateLogin();
								IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[6]")).click(); 
								System.out.println("corpChangepassword functionality ended here....");

						}

						catch (Exception corpChangepassword) 
						{
							System.out.println(corpChangepassword);
							corpChangepassword.printStackTrace();

						}      


}
//---------------------------------------------------------------------------------------
															  //TO TEST CORPORATE MY TREE
@Test	    
//@Test(enabled=false)
//@Test(dependsOnGroups="CorporatePage")

				public static void corpMytree() 
				 {

						try {
								System.out.println("corpMytree functionality starts here....");  
								IndexPage.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
								CorporatePage.corporateLogin();
								IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[7]")).click();  
								String Nooftrees=IndexPage.driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[2]/td[1]/p")).getText().toString();
								System.out.println(Nooftrees);
								String Tree_count=IndexPage.driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[2]/td[3]/span")).getText().toString();
								System.out.println(Tree_count);
								System.out.println("corpMytree functionality ended here....");

						}

						catch (Exception corpMytree) 
						{
							System.out.println(corpMytree);
							corpMytree.printStackTrace();

						}      


}
//---------------------------------------------------------------------------------------
														//TO TEST CORPORATE MY REWARDS
@Test	    
//@Test(enabled=false)
//@Test(dependsOnGroups="CorporatePage")
					public static void Rewards() 
					{

						try {
								System.out.println("Rewards functionality starts here....");  
								IndexPage.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
								CorporatePage.corporateLogin();
								IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[8]")).click();  
								String Curr_rewards=IndexPage.driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[1]/td[1]/label/p")).getText().toString();
								System.out.println(Curr_rewards);
								String No_Currrewards=IndexPage.driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[1]/td[2]/span")).getText().toString();
								System.out.println(No_Currrewards);
								String Refcode_clicks=IndexPage.driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[2]/td[1]/label/p")).getText().toString();
								System.out.println(Refcode_clicks);
								String No_Refcodeclicks=IndexPage.driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[2]/td[2]/span")).getText().toString();
								System.out.println(No_Refcodeclicks);
								String Refcode_books=IndexPage.driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[3]/td[1]/label/p")).getText().toString();
								System.out.println(Refcode_books);
								String No_Refcodebooks=IndexPage.driver.findElement(By.xpath("//*[@id='contentdiv']/table/tbody/tr[3]/td[2]/span")).getText().toString();
								System.out.println(No_Refcodebooks);
								System.out.println("Rewards functionality ended here....");

						}

						catch (Exception corpMytree) 
						{
							System.out.println(corpMytree);
							corpMytree.printStackTrace();

						}      


}
//---------------------------------------------------------------------------------------
													//TO TEST CORPORATE MY CHARITY
@Test	    
//@Test(enabled=false)
//@Test(dependsOnGroups="CorporatePage")
						public static void corpCharity() 
						{

							try {
									System.out.println("corpCharity functionality starts here....");  
									IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
									CorporatePage.corporateLogin();
									IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[9]")).click(); 
									Thread.sleep(3000);
									String Charity_Amt=IndexPage.driver.findElement(By.xpath("//*[@id='contentdiv']/p[1]/span[2]")).getText().toString();
									System.out.println("Charity amount contributed : "+Charity_Amt);
									System.out.println("corpCharity functionality ended here....");

							}

							catch (Exception corpCharity) 
							{
								System.out.println(corpCharity);
								corpCharity.printStackTrace();

							}      


}
//---------------------------------------------------------------------------------------
															 //TO TEST CORPORATE COUPONS
@Test	    
//@Test(enabled=false)
//@Test(dependsOnGroups="CorporatePage")
							public static void corpCoupons() 
							{
								
								try {
										System.out.println("corpCoupons functionality starts here....");  
										IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
										CorporatePage.corporateLogin();
										IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[10]")).click(); 
										Thread.sleep(2000);
										String Noof_Coupons=IndexPage.driver.findElement(By.xpath("//*[@id='coupon-table']/div")).getText().toString();
										System.out.println(Noof_Coupons); 
										System.out.println("corpCoupons functionality ended here....");
										Thread.sleep(2000);
										IndexPage.driver.findElement(By.xpath("//*[@id='topTotopMenu']/li[3]/span")).click();

								}

								catch (Exception corpCoupons) 
								{
									System.out.println(corpCoupons);
									corpCoupons.printStackTrace();

								}      


}
							

//@AfterTest
	public static void afterTest() throws InterruptedException, IOException
	{
		
		
		File scr=((TakesScreenshot)IndexPage.driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scr,new File("D:\\error screenshots\\PassedResults\\screenshot_"+timestamp()+".png"));
		Thread.sleep(8000);
		IndexPage.driver.quit();
		
	}

    public static String timestamp() {
	
	 return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
     }
@AfterMethod
	public static void afterMethod() throws Exception
	{
			
			/*File scrFile = ((TakesScreenshot)IndexPage.driver).getScreenshotAs(OutputType.FILE);
			File dest= new File(directory,fileName);
			FileUtils.copyFile(scrFile, dest);*/
			File scr=((TakesScreenshot)IndexPage.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scr,new File("D:\\error screenshots\\PassedResults\\Corporatescreenshot_"+timestamp()+".png"));
			Thread.sleep(8000);
			IndexPage.driver.quit();
	} 
	
		

}















					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
